import java.util.Scanner;
import java.io.File;

public class Organizationprofile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Organization Profile Creation\n");

        System.out.print("Organization Name: ");
        String orgName = scanner.nextLine();

        System.out.print("Description: ");
        String description = scanner.nextLine();

        System.out.print("Path to Document Proof: ");
        String docProofPath = scanner.nextLine();
        File docProof = new File(docProofPath);  // Represents the file (not yet uploaded)

        System.out.print("Profile Picture Path: ");
        String profilePicturePath = scanner.nextLine();
        File profilePicture = new File(profilePicturePath); // Represents the file

        System.out.print("Twitter Handle: ");
        String twitterHandle = scanner.nextLine();

        System.out.print("LinkedIn Profile URL: ");
        String linkedInUrl = scanner.nextLine();

        System.out.print("Instagram Handle: ");
        String instagramHandle = scanner.nextLine();

        System.out.print("Discord Server Link: ");
        String discordLink = scanner.nextLine();

        // ... Further processing: store data, actual file uploads, etc.
        scanner.close();

        System.out.println("Profile creation process started. Further steps are required.");
    }
}

