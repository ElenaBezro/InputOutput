package class3_fileReaderWriter.eveningPractice;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TenthTask {
    //Create a CSV report file with all user data, including headers.
    private static final String SCV_FILE = "users.csv";
    private static final String REPORT_FILE = "report.csv";
    private static final String SCV_SEPARATOR = ", ";
    private static final String USER_FIELDS = "name, age, email, phoneNumber, address";

    public static void main(String[] args) {
        System.out.println("******");

        putUserListIntoReportFile(getUsersFromFile());
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

    public static void putUserListIntoReportFile(List<User> userList) {
        try (FileWriter fw = new FileWriter(REPORT_FILE);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(USER_FIELDS);
            bw.newLine();

            for (User user : userList) {
                bw.write(user.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}


