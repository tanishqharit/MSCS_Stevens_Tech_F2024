package Assignments.Assignment_4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DisplaySavedCustomerList {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("CustomerRecords.txt"))) {
            String line;
            System.out.println("Customer Records:");
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                System.out.printf("ID: %s, First Name: %s, Last Name: %s, Balance: %.2f%n", 
                                   data[0], data[1], data[2], Double.parseDouble(data[3]));
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
