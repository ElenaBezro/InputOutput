package class3_fileReaderWriter.eveningPractice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FirstTask {
    private static final String SCV_FILE = "users.csv";

    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        userList.add(new User("Lena", 25, "lenelena@ya.com", "+348738", "Berlin"));
        userList.add(new User("Nona", 25, "lenelena@ya.com", "+348738", "Berlin"));
        userList.add(new User("Mila", 25, "lenelena@ya.com", "+348738", "Berlin"));


        writeUserDataIntoFile(userList);
    }

    public static void writeUserDataIntoFile(List<User> userList) {
        try(FileWriter fw = new FileWriter(SCV_FILE);
            BufferedWriter bw = new BufferedWriter(fw)) {
            for (User user: userList) {
                bw.write(user.toString());
                bw.newLine();
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
