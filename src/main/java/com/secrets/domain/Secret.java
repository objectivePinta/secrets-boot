package com.secrets.domain;

import javax.persistence.*;

/**
 * Created by myworld on 18/06/16.
 */

@Entity
public class Secret {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    String content;

    Secret() {
    }

    @Override
    public String toString() {
        return "Secret{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
