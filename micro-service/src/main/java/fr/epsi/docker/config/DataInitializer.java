package fr.epsi.docker.config;

import com.github.javafaker.Faker;
import fr.epsi.docker.entities.User;
import fr.epsi.docker.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class DataInitializer implements CommandLineRunner {

    private final UserRepository userRepository;

    public DataInitializer(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Générer 10 utilisateurs aléatoires
        for (int i = 0; i < 10; i++) {
            User user = generateRandomUser(new Faker());
            userRepository.save(user);
        }
    }

    private User generateRandomUser(Faker faker) {
        User user = new User();
        user.setName(faker.name().lastName());
        user.setFirstName(faker.name().firstName());
        user.setEmail(faker.internet().emailAddress());
        user.setPhone(faker.phoneNumber().cellPhone());
        return user;
    }
}
