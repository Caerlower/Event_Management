package src;
import java.util.Scanner;

public class UserProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("User Profile Creation");

        System.out.print("First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Bio (Short Description): ");
        String bio = scanner.nextLine();

        System.out.print("Twitter Handle: ");
        String twitterHandle = scanner.nextLine();

        System.out.print("LinkedIn Profile URL: ");
        String linkedInUrl = scanner.nextLine();

        System.out.print("Instagram Handle: ");
        String instagramHandle = scanner.nextLine();

        // ... Further processing: store data, actual file uploads, etc.
        scanner.close();

        System.out.println("Profile creation process started. Further steps are required.");
    }
}

