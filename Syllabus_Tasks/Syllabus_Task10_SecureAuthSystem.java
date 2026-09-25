import java.util.*;

public class SecureAuthSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        // Store valid credentials (can be extended)
        Map<String, String> validUsers = new HashMap<>();
        validUsers.put("admin", "admin123");

        for (int i = 0; i < N; i++) {
            try {
                String username = sc.next();
                String password = sc.next();

                // Boundary validation
                if (username.length() < 3 || username.length() > 20 ||
                    password.length() < 6 || password.length() > 20) {
                    System.out.println("FAILURE");
                    continue;
                }

                // Authentication check
                if (validUsers.containsKey(username) &&
                    validUsers.get(username).equals(password)) {
                    System.out.println("SUCCESS");
                } else {
                    System.out.println("FAILURE");
                }

            } catch (Exception e) {
                // Exception handling
                System.out.println("FAILURE");
            }
        }

        sc.close();
    }
}