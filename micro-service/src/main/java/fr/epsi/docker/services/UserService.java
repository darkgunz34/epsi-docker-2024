package fr.epsi.docker.services;

import fr.epsi.docker.entities.User;
import fr.epsi.docker.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService{

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
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
