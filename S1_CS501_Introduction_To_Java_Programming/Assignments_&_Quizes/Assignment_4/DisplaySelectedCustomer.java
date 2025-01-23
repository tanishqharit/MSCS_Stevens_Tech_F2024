package Assignments.Assignment_4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class DisplaySelectedCustomer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Customer ID to search: ");
        String searchId = scanner.nextLine();

        boolean found = false;

        try (BufferedReader reader = new BufferedReader(new FileReader("CustomerRecords.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(searchId)) {
                    System.out.printf("ID: %s, First Name: %s, Last Name: %s, Balance: %.2f%n", 
                                       data[0], data[1], data[2], Double.parseDouble(data[3]));
                    found = true;
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

        if (!found) {
            System.out.println("No customer found with ID: " + searchId);
        }
    scanner.close();
    }
}