package reviews.data;

public class User {
    public String login;
    protected String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }
    public String getLogin() {
        return login;
    }
    public String getPassword() {
        return password;
    }
}
