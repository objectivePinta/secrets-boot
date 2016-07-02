package com.secrets.domain;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by myworld on 18/06/16.
 */
@Component
public interface SecretsRepo extends CrudRepository<Secret, Long> {

    @Override
    Iterable<Secret> findAll();


    Secret findById(long id);


}
