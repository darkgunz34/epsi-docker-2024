package fr.epsi.docker.service;

import fr.epsi.docker.entities.User;

import java.util.List;

public interface IUserService {

    List<User> getUser();

    User getUserById(Long id);

    User createUser(User user);

    User updateUser(User user);

    void deleteUser(Long id);
}
