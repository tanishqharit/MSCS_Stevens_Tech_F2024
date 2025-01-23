package Assignments.Assignment_4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteCustomerList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (FileWriter writer = new FileWriter("CustomerRecords.txt", true)) {
            while (true) {
                System.out.print("Enter Customer ID (or type 'done' to finish): ");
                String id = scanner.nextLine();
                if (id.equalsIgnoreCase("done")) break;

                System.out.print("Enter First Name: ");
                String firstName = scanner.nextLine();

                System.out.print("Enter Last Name: ");
                String lastName = scanner.nextLine();

                System.out.print("Enter Balance Owed: ");
                double balance = Double.parseDouble(scanner.nextLine());

                writer.write(id + "," + firstName + "," + lastName + "," + balance + "\n");
                System.out.println("Record added successfully!");
            }
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    scanner.close();
    }
}
