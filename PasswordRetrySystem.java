import java.util.Scanner;
public class PasswordRetrySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Create password: ");
        String pass = sc.nextLine();
        System.out.println("Re-enter the password: ");
        String pass2 = sc.nextLine();
        while(!pass.equals(pass2)) {
            System.out.println("Passwords do not match! Try again:");
            pass2 = sc.nextLine();
        }

        System.out.println("Password created successfully!");
    }
}
