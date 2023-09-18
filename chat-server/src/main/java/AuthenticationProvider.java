public interface AuthenticationProvider {
    String getUsernameByLoginAndPassword(String login, String password);

    boolean register(String login, String password, String username);
}