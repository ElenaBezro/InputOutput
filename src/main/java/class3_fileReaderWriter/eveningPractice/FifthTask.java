package class3_fileReaderWriter.eveningPractice;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FifthTask {
    private static final String SCV_FILE = "users.csv";
    private static final String SCV_SEPARATOR = ", ";

    public static void main(String[] args) {
        sortUsersByAgeInCSVFile();
        System.out.println("");
        getUsersFromFile();

        System.out.println("******");

        sortUsersByNameInCSVFile();
        System.out.println("");
        getUsersFromFile();
    }

    public static void sortUsersByAgeInCSVFile() {
        List<User> users = getUsersFromFile();
        putUserListIntoFile(sortUsersByAge(users));
    }

    public static void sortUsersByNameInCSVFile() {
        List<User> users = getUsersFromFile();
        putUserListIntoFile(sortUsersByName(users));
    }

    public static List<User> getUsersFromFile() {
        List<String> usersInfoAsString = new ArrayList<>();

        try (FileReader fr = new FileReader(SCV_FILE);
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            while ((line = br.readLine()) != null) {
                usersInfoAsString.add(line);
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return usersInfoAsString.stream().
                map(userInfo -> {
                    String[] info = userInfo.split(SCV_SEPARATOR);
                    String name = info[0];
                    int age = Integer.parseInt(info[1]);
                    String email = info[2];
                    String phoneNumber = info[3];
                    String address = info[4];
                    return new User(name, age, email, phoneNumber, address);
                }).toList();
    }

    public static void putUserListIntoFile(List<User> userList) {
        try (FileWriter fw = new FileWriter(SCV_FILE);
             BufferedWriter bw = new BufferedWriter(fw)) {

            for (User user : userList) {
                bw.write(user.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static List<User> sortUsersByAge(List<User> userList) {
        return userList.stream()
                .sorted(Comparator.comparing(user -> user.getAge())).toList();
    }

    public static List<User> sortUsersByName(List<User> userList) {
        return userList.stream()
                .sorted(Comparator.comparing(user -> user.getName())).toList();
    }
}


