package IntegrationUnitTestsUser;

public class User {
    private int userId;
    private static String firstName;
    private static String lastName;

// Конструктор, геттеры и сеттеры

    public User(int userId,String firstName,String lastName) {
        this.userId = userId;
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public int getUserId() {
        return userId;
    }

    public static String getFirstName() {
        return firstName;
    }

    public static String getLastName() {
        return lastName;
    }


}