package class2_inputOutput;

import java.io.*;

public class InputOutputStreamsPractice {
    //Day 2
// Exercise 1
    public String readUserPhoneNumberAndAddress(String filePath) {
        int phoneNumberIndex = 3;
        int addressIndex = 4;
        try (FileInputStream fis = new FileInputStream(filePath);
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader br = new BufferedReader(isr)){
            String userInfo = br.readLine();
            String[] userInfoArr = userInfo.split(",");
            System.out.println("Phone number " + userInfoArr[phoneNumberIndex]);
            System.out.println("Address " + userInfoArr[addressIndex]);
            return "Phone number " + userInfoArr[phoneNumberIndex] + "\nAddress " + userInfoArr[addressIndex];
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid data in the file");
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        catch (IOException e) {
            System.out.println("I/O operation failed");
        }
        return "";
    }

    //TODO:
    //Exercise 2
    //
    //Allow the user to update their email, phone number, and address in
    //the program, write it to the file, and display the updated information.
//    public void updateUserInfoInFile(String filePath) {
//        try (FileInputStream fis = new FileInputStream(filePath);
//             InputStreamReader isr = new InputStreamReader(fis);
//             BufferedReader br = new BufferedReader(isr)
//        )
//    }
    //Exercise 3
    //Implement the ability to delete a user's information from the file if
    //requested by the user.
    //Exercise 4
    //Create a log file that records all user interactions with your program,
    //including timestamps.
    //Exercise 5
    //Implement a feature that allows the user to specify the name of the
    //file where their data will be stored and read from.
    //Exercise 6
    //Extend your program to read and display the user's favorite color
    //from the file.
    //Exercise 7
    //Add a confirmation step before updating or deleting user data to
    //ensure the user's intent.
    //Exercise 8
    //Create a function that calculates and displays the user's age category
    //(e.g., child, teenager, adult, senior) based on their age.
    //Exercise 9
    //Implement a feature that displays the total number of interactions
    //(e.g., how many times the program has been run) in the log file.
}
