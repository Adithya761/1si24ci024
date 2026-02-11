import java.util.Scanner;

public class LoginApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Login System ---");
        System.out.print("Enter Username: ");
        String username = scanner.nextLine();
        
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();
        
        // Hardcoded credentials: admin / secret123
        if ("admin".equals(username) && "secret123".equals(password)) {
            System.out.println("Login Successful! Welcome.");
        } else {
            System.out.println("Access Denied. Incorrect credentials.");
        }
        scanner.close();
    }
}