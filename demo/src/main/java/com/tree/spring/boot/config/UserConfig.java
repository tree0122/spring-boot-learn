package com.tree.spring.boot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


/**
 * Created by tree on 17-8-3.
 */
@Configuration
@ConfigurationProperties(prefix = UserConfig.PREFIX)
public class UserConfig {
    public static final String PREFIX = "prop.user";

    private int id;

    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
