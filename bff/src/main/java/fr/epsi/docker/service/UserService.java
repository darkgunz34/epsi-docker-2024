package fr.epsi.docker.service;

import fr.epsi.docker.entities.User;
import fr.epsi.docker.feign.UserFeign;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.util.List;

@Service
public class UserService implements IUserService {

    @Value("${epsi.microservice.baseUrl}")
    private String urlGateway;

    private final UserFeign userFeign;

    public UserService(UserFeign userFeign) {
        this.userFeign = userFeign;
    }

    public List<User> getUser() {
        return userFeign.getUser();
    }

    public User getUserById(Long id) {
        return userFeign.getUserById(id);
    }

    public User createUser(User user) {
        return userFeign.createUser(user);
    }

    public User updateUser(User user) {
        return userFeign.updateUser(user);
    }

    public void deleteUser(Long id) {
        userFeign.deleteUser(id);
    }
}
