package class3_fileReaderWriter.eveningPractice;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static class3_fileReaderWriter.eveningPractice.FourthTask.findUserByInfo;
import static class3_fileReaderWriter.eveningPractice.SeventhTask.removeUserInfo;
import static class3_fileReaderWriter.eveningPractice.SixthTask.updateUserInfo;
import static class3_fileReaderWriter.eveningPractice.ThirdTask.addUserDataIntoFile;

public class EighthTask {
    private static final String SCV_FILE = "users.csv";
    private static final String SCV_SEPARATOR = ", ";
    private static final Map<String, Runnable> commandToMethodMap = new HashMap<>();
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        initCommandHandler();
        while (true) {
            displayCommands();
            handleCommand();
        }
    }

    public static void displayCommands() {
        System.out.println("Enter a command: ");
        System.out.println("Add a new user: \"add\"");
        System.out.println("Search for a user: \"search\"");
        System.out.println("Update user: \"update\"");
        System.out.println("Delete user: \"delete\"");
        System.out.println("Exit: \"exit\"");
    }

    public static void handleCommand() {
        String command = sc.nextLine();
        Runnable handler = commandToMethodMap.get(command);
        if (handler != null) {
            handler.run();
        } else {
            System.out.println("Invalid command");
        }

    }

    public static void initCommandHandler() {
        commandToMethodMap.put("add", EighthTask::addUser);
        commandToMethodMap.put("search", EighthTask::searchUser);
        commandToMethodMap.put("update", EighthTask::updateUserAddress);
        commandToMethodMap.put("delete", EighthTask::deleteUser);
        commandToMethodMap.put("exit", EighthTask::exit);
    }


    public static void addUser() {
        System.out.println("Enter user name: ");
        String name = sc.nextLine();
        System.out.println("Enter user age: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Enter user email: ");
        String email = sc.nextLine();
        System.out.println("Enter user phone number: ");
        String phoneNumber = sc.nextLine();
        System.out.println("Enter user address: ");
        String address = sc.nextLine();
        User user = new User(name, age, email, phoneNumber, address);

        addUserDataIntoFile(user);
    }

    public static void searchUser() {
        System.out.println("Enter user name: ");
        String search = sc.nextLine();

        findUserByInfo(search);
    }

    public static void updateUserAddress() {
        System.out.println("Enter user name: ");
        String name = sc.nextLine();
        System.out.println("Enter new address: ");
        String address = sc.nextLine();

        updateUserInfo(name, address);
    }

    public static void deleteUser() {
        System.out.println("Enter user name to remove: ");
        String name = sc.nextLine();

        removeUserInfo(name);
    }

    public static void exit() {
        System.out.println("Good bye!");
        sc.close();
        System.exit(0);
    }
}


