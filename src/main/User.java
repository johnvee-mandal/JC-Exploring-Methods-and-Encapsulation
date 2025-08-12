package main;
public class User {
    private String password;

    public User(String initialPassword) {
        setPassword(initialPassword);
    }

    public String getPassword() {
        if (this.password == null) {
            return "********"; 
        }
        StringBuilder masked = new StringBuilder();
        for (int i = 0; i < this.password.length(); i++) {
            masked.append('*');
        }
        return masked.toString();
    }

    public void setPassword(String password) {
        if (password != null && password.length() >= 8) {
            this.password = password;
        } else {
            System.out.println("Error: Password must be at least 8 characters long.");
        }
    }
    
    public static void runChallenge() {
        System.out.println("Attempting to create user with password 'short'...");
        User user = new User("short");
        System.out.println("Current masked password: " + user.getPassword());

        System.out.println("\nAttempting to set short password 'pass'...");
        user.setPassword("pass");
        System.out.println("Current masked password: " + user.getPassword());

        System.out.println("\nAttempting to set valid password 'secure_password_123'...");
        user.setPassword("secure_password_123");
        System.out.println("Current masked password: " + user.getPassword());
    }
}