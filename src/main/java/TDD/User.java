package TDD;

public class User {
    int userId;
    String name;
    String password;

    boolean isAuthenticate = false;

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;

    }

    public User(int userId, String johnDoe) {
    }

    //3.6.
    public boolean authenticate(String name, String password) {
        return false;
    }


}