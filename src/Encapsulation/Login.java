package Encapsulation;
//Validate username and password using encapsulated fields.
public class Login {
    private String username = "admin";
    private String password = "1234";

    public boolean validateLogin(String uname, String pwd) {
        return uname.equals(username) && pwd.equals(password);
    }

    public static void main(String[] args) {
        Login login = new Login();
        boolean status = login.validateLogin("admin", "1234");

        if (status) {
            System.out.println("Login successful");
        } else {
            System.out.println("Invalid credentials");
        }
    }
}

