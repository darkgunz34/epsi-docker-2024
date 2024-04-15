package fr.epsi.docker.services;

import fr.epsi.docker.entities.User;

import java.util.List;

public interface IUserService {

    List<User> getAllUserList();

    User getUserById(Long id);

    User createUser(User User);

    User updateUser(User User);

    void deleteUser(Long id);
}
