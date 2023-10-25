package class3_fileReaderWriter.eveningPractice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FourthTask {
    private static final String SCV_FILE = "users.csv";

    public static void main(String[] args) {
        findUserByInfo("Lena");
    }

    public static void findUserByInfo(String search) {
        try (FileReader fr = new FileReader(SCV_FILE);
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            Boolean isFound = false;
            while ((line = br.readLine()) != null) {
                if (line.contains(search)) {
                    System.out.println(line);
                    isFound = true;
                }
            }
            if (!isFound) {
                System.out.println("No data matches the provided search parameter");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
