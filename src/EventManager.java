package src;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class EventManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter event details:");

        System.out.print("Date (YYYY-MM-DD): ");
        LocalDate date = LocalDate.parse(scanner.nextLine());

        System.out.print("Time (HH:mm): ");
        LocalTime time = LocalTime.parse(scanner.nextLine());

        System.out.print("Place: ");
        String place = scanner.nextLine();

        System.out.print("Description: ");
        String description = scanner.nextLine();

        // Event information is collected. Now you can store it
        // in a suitable data structure or proceed with further processing

        System.out.println("\nEvent Information:");
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("Place: " + place);
        System.out.println("Description: " + description);

        scanner.close();
    }
}

