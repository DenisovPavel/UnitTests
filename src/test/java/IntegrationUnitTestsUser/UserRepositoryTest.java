package IntegrationUnitTestsUser;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {
    // Фиктивная реализация UserRepository для тестов
    UserRepository userRepository = new FakeUserRepository();
    UserService userService = new UserService(userRepository);

    @Test
    @DisplayName("Integration test UserService через нахождение фиктивного обьекта FakeUserRepository")
    public void getUserFullName() {
        String result = userService.getUserFullName(1);
        String expectedUser = "firstName lastName";
        assertEquals(expectedUser, result);
    }

    @Test
    @DisplayName("Integration test UserService через отсутствие фиктивного обьекта FakeUserRepository")
    public void getNotFoundUserFullName() {
        String result = userService.getUserFullName(1);
        String expectedUser = "User not found";
        assertEquals(expectedUser, result);
    }

    private static class FakeUserRepository extends UserRepository {

        public User getUserById(int userId, String firstName, String lastName) {
            User user1 = new User(1, "firstName", "lastName");
            if (userId == 1) {
                return user1;
            } else {
                return null;
            }
        }
    }
}