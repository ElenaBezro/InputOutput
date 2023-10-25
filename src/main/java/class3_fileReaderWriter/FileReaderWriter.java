package class3_fileReaderWriter;

import java.io.*;
import java.util.*;

public class FileReaderWriter {
    //Exercise 1: Reading from a File
    public void displayTextFromFile() {
        try (FileReader fr = new FileReader("input.txt")) {
            int c;
            while ((c = fr.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    //Exercise 2: Writing to a File
    public void writeTextToFile() {
        String text = "Invest in yourself; learning is the key to endless opportunities.";
        try (FileWriter fw = new FileWriter("output.txt")) {
            fw.write(text);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    //Exercise 3: Copying a File
    public void copyFileContent() {
        try (FileReader fr = new FileReader("input.txt");
             FileWriter fw = new FileWriter("destination.txt")) {
            int c;
            while ((c = fr.read()) != -1) {
                fw.write((char) c);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    //Exercise 4: Appending to a File
    public void appendTextToFile() {
        String text = "Invest in yourself; learning is the key to endless opportunities.";

        try (FileWriter fw = new FileWriter("output.txt", true)) {
            fw.write("\n" + text);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    //Exercise 5: Reading and Writing Numbers
    public List<Integer> readNumbersFromFile() {
        try (FileReader fr = new FileReader("input_numbers.txt");
             BufferedReader br = new BufferedReader(fr)) {
            String line;
            List<Integer> integers = new ArrayList<>();

            while ((line = br.readLine()) != null) {
                String[] temp = line.split(", ");
                for (int i = 0; i < temp.length; i++) {
                    integers.add(Integer.parseInt(temp[i]));
                }
            }
            System.out.println(integers);
            return integers;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public void printNumbersFromFileSum() {
        List<Integer> numbers = readNumbersFromFile();
        int sum = numbers.stream().reduce(0, (acc, number) -> acc + number);
        try (FileWriter fw = new FileWriter("output_numbers.txt")) {
            fw.write(Integer.toString(sum));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    //Second part
    //Exercise: Text Collector with Uniqueness

    public void saveUserInputIntoFile(Set<String> userInput) {
        try (FileWriter fw = new FileWriter("output.txt", true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            for (String input : userInput) {
                bw.write(input);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void displayUserInputFromFile() {
        try (FileReader fr = new FileReader("output.txt");
             BufferedReader br = new BufferedReader(fr)) {
            String line;
            boolean isFileEmpty = true;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
                isFileEmpty = false;
            }

            if (isFileEmpty) {
                System.out.println("File is empty");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void collectUserInputText() {
        displayUserInputFromFile();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter something");

        String input = sc.nextLine();
        Set<String> userInput = new HashSet<>();

        while (!input.equalsIgnoreCase("export")) {
            userInput.add(input);
            input = sc.nextLine();
        }

        saveUserInputIntoFile(userInput);
    }

    //Exercise 2: Line Counter
    public Integer countLinesInFile() {
        int count = 0;

        try (FileReader fr = new FileReader("output.txt");
             BufferedReader br = new BufferedReader(fr)) {

            while (br.readLine() != null) {
                count++;
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return count;
    }

    //Exercise 3: Convert to Uppercase
    public void fileContentToUpperCase() {
        try (FileReader fr = new FileReader("output.txt");
             BufferedReader br = new BufferedReader(fr);
             FileWriter fw = new FileWriter("output_ToUpperCase.txt", true);
             BufferedWriter bw = new BufferedWriter(fw)) {

            String line;

            while ((line = br.readLine()) != null) {
                bw.write(line.toUpperCase());
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    //Exercise 4: Duplicate Word Finder

    public void printDuplicateWords() {
        Map<String, Integer> wordsToCountMap = new HashMap<>();
        try (FileReader fr = new FileReader("output.txt");
             BufferedReader br = new BufferedReader(fr)) {

            String line;

            while ((line = br.readLine()) != null) {
                for (String word: line.split("\\s+|\\p{Punct}")) {
                    if (wordsToCountMap.containsKey(word)) {
                        wordsToCountMap.put(word, wordsToCountMap.get(word) + 1);
                    }
                    else {
                        wordsToCountMap.put(word, 0);
                    }
                }
            }
            wordsToCountMap.entrySet().stream()
                    .filter(elem -> elem.getValue() > 1)
                    .forEach(elem -> System.out.println("Duplicate word: " + elem.getKey()));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
