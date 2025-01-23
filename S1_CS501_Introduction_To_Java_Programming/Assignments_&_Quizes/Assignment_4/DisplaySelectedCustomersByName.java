package Assignments.Assignment_4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class DisplaySelectedCustomersByName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Last Name to search: ");
        String searchName = scanner.nextLine();

        boolean found = false;

        try (BufferedReader reader = new BufferedReader(new FileReader("CustomerRecords.txt"))) {
            String line;
            System.out.println("Matching Records:");
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data[2].equalsIgnoreCase(searchName)) {
                    System.out.printf("ID: %s, First Name: %s, Last Name: %s, Balance: %.2f%n", 
                                       data[0], data[1], data[2], Double.parseDouble(data[3]));
                    found = true;
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

        if (!found) {
            System.out.println("No customers found with last name: " + searchName);
        }
    scanner.close();
    }
}