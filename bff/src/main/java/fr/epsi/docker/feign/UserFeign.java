package fr.epsi.docker.feign;

import fr.epsi.docker.entities.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "microservice", url = "${epsi.microservice.baseUrl}")
public interface UserFeign {

    @GetMapping("/users")
    List<User> getUser();

    @GetMapping("/user/{id}")
    User getUserById(@PathVariable("id") Long id);

    @PostMapping("/user")
    User createUser(User user);

    @PutMapping("/user")
    User updateUser(User user);

    @DeleteMapping("/user/{id}")
    void deleteUser(@PathVariable("id") Long id);
}
