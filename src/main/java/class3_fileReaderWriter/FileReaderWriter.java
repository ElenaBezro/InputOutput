package class3_fileReaderWriter;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileReaderWriter {
    //Exercise 1: Reading from a File
    public void displayTextFromFile() {
        try (FileReader fr = new FileReader("input.txt")) {
            int c;
            while((c = fr.read()) != -1) {
                System.out.print((char) c);
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    //Exercise 2: Writing to a File
    public void writeTextToFile() {
        String text = "Invest in yourself; learning is the key to endless opportunities.";
        try (FileWriter fw = new FileWriter("output.txt")) {
                fw.write(text);
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    //Exercise 3: Copying a File
    public void copyFileContent() {
        try (FileReader fr = new FileReader("input.txt");
             FileWriter fw = new FileWriter("destination.txt")) {
            int c;
            while((c = fr.read()) != -1) {
                fw.write(c);          }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    //Exercise 4: Appending to a File
    public void appendTextToFile() {
        String text = "Invest in yourself; learning is the key to endless opportunities.";

        try (FileWriter fw = new FileWriter("output.txt", true)) {
            fw.write("\n" + text);
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    //Exercise 5: Reading and Writing Numbers
    public List<Integer> readNumbersFromFile() {
        try (FileReader fr = new FileReader("input_numbers.txt");
             BufferedReader br = new BufferedReader(fr)) {
            String line;
            List<Integer> integers = new ArrayList<>();

            while((line = br.readLine()) != null) {
                String[] temp = line.split(", ");
                for (int i = 0; i < temp.length; i++) {
                    integers.add(Integer.parseInt(temp[i]));
                }
            }
            System.out.println(integers);
            return integers;
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return  null;
    }
    public void printNumbersFromFileSum() {
        List<Integer> numbers = readNumbersFromFile();
        int sum = numbers.stream().reduce(0, (acc, number) -> acc + number);
        try (FileWriter fw = new FileWriter("output_numbers.txt")) {
            fw.write(Integer.toString(sum));
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
