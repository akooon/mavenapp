package kz.uib.market.api.services;

import kz.uib.market.api.models.Product;
import kz.uib.market.api.models.User;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    public List<User> getAll(String login) {
        List<User> users = new ArrayList<>();
        users.add(new User(
                        "Akhmarzhan",
                        "123456",
                        "Admin",
                        LocalDateTime.now()

                )
        );

        users.add(new User(
                        "Adina",
                        "12345",
                        "Kassir",
                        LocalDateTime.now()

                )
        );
        return users;

        }
        public User searchByGet(){
            return new User
                    ("Adina",
                    "12345",
                    "Kassir",
                            LocalDateTime.now() );
    }
}
