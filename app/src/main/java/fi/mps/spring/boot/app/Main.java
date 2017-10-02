package fi.mps.spring.boot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Main of the spring-boot-web
 * 
 * @author msopanen
 *
 */
@SpringBootApplication
@RestController
public class Main {

    @RequestMapping("/")
    public String home() {
        return "Jou vuan!!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

}
