package fr.epsi.docker.service;

import fr.epsi.docker.entities.User;
import fr.epsi.docker.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements IUserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        List<User> lstUser = new ArrayList<>();
        lstUser.add(new User(1L, "Doe", "John", "johndoe@gmail.com", "0601020304"));
        lstUser.add(new User(2L, "Doe", "Jane", "janedoe@gmail.com", "0601020305"));
        lstUser.add(new User(3L, "Doe", "Jack", "jackdoe@gmail.com", "0601020306"));
        lstUser.add(new User(4L, "Doe", "Jill", "jilldoe@gmail.com", "0601020307"));
        lstUser.add(new User(5L, "Doe", "Jim", "jimdoe@gmail.com", "0601020308"));

        userRepository.deleteAll();
        userRepository.saveAll(lstUser);

        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUserList() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return this.userRepository.findById(id).orElse(null);
    }

    @Override
    public User createUser(User User) {
        return userRepository.save(User);
    }

    @Override
    public User updateUser(User User) {
        return userRepository.save(User);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
