package class3_fileReaderWriter.eveningPractice;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SecondTask {
    private static final String SCV_FILE = "users.csv";

    public static void main(String[] args) {
        displayUserDataFromFile();
    }

    public static void displayUserDataFromFile() {
        try(FileReader fr = new FileReader(SCV_FILE);
            BufferedReader br = new BufferedReader(fr)) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
