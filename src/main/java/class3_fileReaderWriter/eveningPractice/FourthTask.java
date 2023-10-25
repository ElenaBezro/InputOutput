package class3_fileReaderWriter.eveningPractice;

import java.io.*;

public class FourthTask {
    private static final String SCV_FILE = "users.csv";

    public static void main(String[] args) {
        findUserByInfo("Lena");
    }

    public static void findUserByInfo(String search) {
        try(FileReader fr = new FileReader(SCV_FILE);
            BufferedReader br = new BufferedReader(fr)) {

            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains(search)) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
