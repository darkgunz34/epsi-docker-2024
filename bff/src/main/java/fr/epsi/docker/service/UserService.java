package fr.epsi.docker.service;

import fr.epsi.docker.entities.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements IUserService {

    static List<User> lstUser = new ArrayList<>();

    UserService() {
        lstUser.add(new User(1L, "Doe", "John", "johndoe@gmail.com", "0601020304"));
        lstUser.add(new User(2L, "Doe", "Jane", "janedoe@gmail.com", "0601020305"));
        lstUser.add(new User(3L, "Doe", "Jack", "jackdoe@gmail.com", "0601020306"));
        lstUser.add(new User(4L, "Doe", "Jill", "jilldoe@gmail.com", "0601020307"));
        lstUser.add(new User(5L, "Doe", "Jim", "jimdoe@gmail.com", "0601020308"));
    }

    public List<User> getUser() {
        return lstUser;
    }

    public User getUserById(Long id) {
        return lstUser.stream().filter(user -> user.getId().equals(id)).findFirst().orElse(null);
    }

    public User createUser(User user) {
        lstUser.add(user);
        return user;
    }

    public User updateUser(User user) {
        lstUser.removeIf(u -> u.getId().equals(user.getId()));
        lstUser.add(user);
        return user;
    }

    public void deleteUser(Long id) {
        lstUser.removeIf(user -> user.getId().equals(id));
    }
}
