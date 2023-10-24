package class1_inputOutput;

import java.io.*;
import java.lang.reflect.Field;
import java.util.Scanner;

public class InputOutputStreamsPractice {
    public User createUserUsingInputData(Scanner sc) {
        System.out.println("Enter name, age, email and phoneNumber");

        String name = sc.nextLine();
        int age = 0;
        try {
            age = sc.nextInt();
            if (age < 0 || age > 125) {
                throw new Exception("Age should be positive integer less then 125");
            }
            sc.nextLine();
            String email = sc.nextLine();
            String phoneNumber = sc.nextLine();

            return new User(name, age, email, phoneNumber);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public void setUserAddressUsingInput(Scanner sc, User user) {
        System.out.println("Enter your address: ");

        String address = sc.nextLine();
        System.out.println(address);

        try {
            user.setAddress(address);
        } catch (NullPointerException e) {
            System.out.println("User is null");
        }
        sc.close();
    }

    public void writeUserInfoIntoFile(File file, User user) {
        try (FileWriter fileWriter = new FileWriter(file)) {
            for (Field field : user.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                fileWriter.write(field.get(user).toString());
                fileWriter.write(",");
            }
            System.out.println("User info has been written to the file");
        } catch (IOException | IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
    }

    public void printInfoFromFile(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

// TODO:
//Exercise 6
//
//    Implement a feature that calculates and displays the user's birth year
//    based on their age and the current year.
//    Exercise 7
//
//    Create a function that allows the user to input their favorite book
//    title, author, and publication year.
//
//    Display this information alongside their name, age, and other data.
//
//    Q:
//    How do we structure the data about books?
//    Exercise 8
//
//    Create a function that validates the email address entered by the user
//    to ensure it has a valid format (e.g., contains "@" and ".")
//
//    Q:
//    Is the validation implemented good enough? Is there a better way of
//    doing it?
//    Exercise 9
//
//    Implement a feature that asks the user for their favorite color and
//    displays it.
//
//    Q:
//    Could we pre-define colors and ask them to choose by not typing the
//    color itself?
//    Exercise 10
//
//    Create a summary report at the end of the program that displays all
//    the user's entered information, including name, age, email, phone
//    number, birth year, gender, and favorite color.

}
