package com.kollice.sharpboot;

import com.kollice.sharpboot.Entity.AuthorSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@ImportResource({"classpath:ehcache.xml"}) // 引用xml配置文件
public class SharpBootApplication {
    @Autowired
    private AuthorSettings authorSettings;

    @RequestMapping(value = "/")
    String index() throws Exception {
        return "hello!\nMy name is " + authorSettings.getName() + ".\nMy email is " + authorSettings.getEmail();
    }

    public static void main(String[] args) {
        SpringApplication.run(SharpBootApplication.class, args);
    }
}
