package class3_fileReaderWriter.eveningPractice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ThirdTask {
    private static final String SCV_FILE = "users.csv";

    public static void main(String[] args) {
        User user = new User("Lena", 25, "lenelena@ya.com", "+348738", "Berlin");

        addUserDataIntoFile(user);
    }

    public static void addUserDataIntoFile(User user) {
        try (FileWriter fw = new FileWriter(SCV_FILE, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(user.toString());
            bw.newLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
