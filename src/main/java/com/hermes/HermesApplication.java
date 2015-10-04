package com.hermes;
/**
 * Created by Sylvain on 02/10/15.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
public class HermesApplication {

    public static void main(String[] args) {

        SpringApplication.run(HermesApplication.class, args);
    }
}
