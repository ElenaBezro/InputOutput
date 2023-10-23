package class1_inputOutput;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void exercise1() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(input);
    }

    public static void exercise2() {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.printf("Hello, %s!\n", name);
        System.out.println("Hello, " + name + "!");
    }

    public static void exercise3(File textFile) {
        File outputFile = new File("output.txt");

        try (FileReader reader = new FileReader(textFile);
             FileWriter writer = new FileWriter(outputFile)) {

            int c;
            while ((c = reader.read()) != -1) {
                writer.write(c);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void exercise4(File source) {
        File destination = new File("destination.txt");

        try (FileInputStream reader = new FileInputStream(source);
             FileOutputStream writer = new FileOutputStream(destination)) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = reader.read(buffer)) != -1) {
                writer.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void exercise5(File source) {
        try (BufferedReader reader = new BufferedReader(new FileReader(source))) {
            String line = reader.readLine();

            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void fillTextFileWithData(File fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Why do Java developers never get lost? Because they always follow the java.util.Path!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void fillCSVFileWithData(File fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.append("Lena, 35, Berlin");
            writer.append("\n");
            writer.append("Lena, 35, Berlin");
            writer.append("\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


    public static void main(String[] args) {
        File textFile = new File("input.txt");
        File csvFile = new File("data.csv");

        fillTextFileWithData(textFile);
        fillCSVFileWithData(csvFile);

        exercise1();
        exercise2();
        exercise3(textFile);
        exercise4(textFile);
        exercise5(csvFile);
    }
}
