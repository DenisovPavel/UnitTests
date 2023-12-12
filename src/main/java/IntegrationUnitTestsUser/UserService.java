package IntegrationUnitTestsUser;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String getUserFullName(int userId) {
        User user = userRepository.getUserById(userId);
        if (user != null) {
            return User.getFirstName() + " " + User.getLastName();
        } else {
            return "User not found";
        }
    }
}