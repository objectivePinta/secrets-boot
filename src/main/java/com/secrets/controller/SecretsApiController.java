package com.secrets.controller;

import com.secrets.domain.Secret;
import com.secrets.domain.SecretsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by myworld on 18/06/16.
 */
@RestController
@RequestMapping("/secrets-api")
public class SecretsApiController {

    @Autowired
    SecretsRepo secretsRepo;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public
    @ResponseBody
    List<Secret> getAllSecrets() {
        System.out.println("this shit works bitch");
        List<Secret> secrets = new ArrayList<>();
        Iterator<Secret> iterator = secretsRepo.findAll().iterator();
        while (iterator.hasNext()) {
            secrets.add(iterator.next());
        }
        return secrets;
    }

    @RequestMapping(value = "/little", method = RequestMethod.POST)
    public void update(@RequestBody Secret secret) {
        System.out.println(secret.getId() + " " + secret.getContent());
        Secret searchSecret = secretsRepo.findById(secret.getId());
        if (searchSecret!=null) {
            System.out.println("searchSecret!=null");
            searchSecret.setContent(secret.getContent());
            secretsRepo.save(searchSecret);
        } else {
            System.out.println("searchSecret==null");
            secretsRepo.save(secret);
        }
        Iterator<Secret> iterator = secretsRepo.findAll().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @RequestMapping(value = "/text", method = RequestMethod.GET)
    public
    @ResponseBody
    String getString() {
        return "Andrei e bun la suflet";
    }
}
