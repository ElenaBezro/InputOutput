package class2_inputOutput;

import java.io.*;

public class MusieTask {
    public void characterStreamTask() {
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter(("output.txt")))) {
            String buffer;
            while ((buffer = br.readLine()) != null) {
                buffer = buffer.toUpperCase();
                buffer = buffer.replace("JAVA", "Python");
                bw.write(buffer);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
