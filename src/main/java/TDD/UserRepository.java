package TDD;

import java.util.ArrayList;
import java.util.List;

public class UserRepository extends User{

    // Тут можно хранить аутентифицированных пользователей
    List<User> data = new ArrayList<>();

    public UserRepository(String name, String password, boolean isAdmin) {
        super(name, password, isAdmin);
    }

    public void addUser(User user) {
       //..
    }

    public boolean findByName(String username) {
        for (User user : data) {
            if (user.name.equals(username)) {
                return true;
            }
        }
        return false;
    }

    public int getUserById(int userId) {
        return userId;
    }
}