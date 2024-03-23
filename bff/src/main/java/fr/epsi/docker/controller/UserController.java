package fr.epsi.docker.controller;

import fr.epsi.docker.entities.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

    private final RestTemplate restTemplate;

    @Value("${epsi.microservice.baseUrl}")
    private String url;

    public UserController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/bff/user")
    public User getUser() {
        System.out.println(this.url + "/api/user");
        return restTemplate.getForObject(this.url + "/api/user", User.class);
    }
}
