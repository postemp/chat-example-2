import java.sql.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
/*
 user(id, login, password)
 roles(id, roles_name)
 user_to_roles(user_id, role_id))
 */

public class Main {

    public static void main(String[] args) {


        Server server = new Server(8080, new InMemoryAuthenticationProvider());
        server.start();
    }
}