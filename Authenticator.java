public class Authenticator {
    private String validUsername = "admin";
    private String validPassword = "password123";

    public void authenticate(String username, String password) throws AuthenticationException {
        if (username == null || username.trim().isEmpty()) {
            throw new AuthenticationException("Error: Username cannot be empty!");
        }
        if (password == null || password.trim().isEmpty()) {
            throw new AuthenticationException("Error: Password cannot be empty!");
        }
        if (!username.equals(validUsername)) {
            throw new AuthenticationException("Error: Invalid username!");
        }
        if (!password.equals(validPassword)) {
            throw new AuthenticationException("Error: Invalid password!");
        }
    }

    public static void main(String[] args) {
        Authenticator auth = new Authenticator();

        // Test Case 1: Correct credentials
        try {
            System.out.println("Test Case 1: Correct credentials");
            auth.authenticate("admin", "password123");
            System.out.println("✓ Authentication successful!\n");
        } catch (AuthenticationException e) {
            System.out.println("✗ " + e.getMessage() + "\n");
        }

        // Test Case 2: Wrong username
        try {
            System.out.println("Test Case 2: Wrong username");
            auth.authenticate("user", "password123");
            System.out.println("✓ Authentication successful!\n");
        } catch (AuthenticationException e) {
            System.out.println("✗ " + e.getMessage() + "\n");
        }

        // Test Case 3: Wrong password
        try {
            System.out.println("Test Case 3: Wrong password");
            auth.authenticate("admin", "wrongpass");
            System.out.println("✓ Authentication successful!\n");
        } catch (AuthenticationException e) {
            System.out.println("✗ " + e.getMessage() + "\n");
        }

        // Test Case 4: Empty username
        try {
            System.out.println("Test Case 4: Empty username");
            auth.authenticate("", "password123");
            System.out.println("✓ Authentication successful!\n");
        } catch (AuthenticationException e) {
            System.out.println("✗ " + e.getMessage() + "\n");
        }

        // Test Case 5: Empty password
        try {
            System.out.println("Test Case 5: Empty password");
            auth.authenticate("admin", "");
            System.out.println("✓ Authentication successful!\n");
        } catch (AuthenticationException e) {
            System.out.println("✗ " + e.getMessage() + "\n");
        }
    }
}
/*Test Case 1: Correct credentials
? Authentication successful!

Test Case 2: Wrong username
? Error: Invalid username!

Test Case 3: Wrong password
? Error: Invalid password!

Test Case 4: Empty username
? Error: Username cannot be empty!

Test Case 5: Empty password
? Error: Password cannot be empty! */