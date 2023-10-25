package class3_fileReaderWriter.eveningPractice;

import java.io.*;
import java.util.List;

public class NinthTask {
    private static final String SCV_FILE = "users.csv";
    private static final String SCV_SEPARATOR = ", ";

    public static void main(String[] args) {
        System.out.println("Users count in file " + SCV_FILE + ": " + getUsersCount());
    }

    public static Integer getUsersCount() {
        int count = 0;

        try (FileReader fr = new FileReader(SCV_FILE);
             BufferedReader br = new BufferedReader(fr)) {

            while (br.readLine() != null) {
                count++;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return count;
    }
}


