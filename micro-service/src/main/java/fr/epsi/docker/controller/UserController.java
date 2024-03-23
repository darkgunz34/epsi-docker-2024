package fr.epsi.docker.controller;

import fr.epsi.docker.entities.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/api/user")
    public User getUser() {
        // Créez et renvoyez un objet qui sera sérialisé en JSON
        User user = new User();
        user.setName("Parichon");
        user.setFirstName("Stéphan");
        user.setEmail("stephan.parichon.pro@gmail.com");
        user.setPhone("0600000000");
        return user;
    }
}
