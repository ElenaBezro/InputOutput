package class1_inputOutput;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class InputOutputStreams {
    //Exercise 1: Counting Words in a File
    public int getWordsCount(File file) {
        StringBuilder text = new StringBuilder();

        try (FileReader fileReader = new FileReader(file)) {
            int c;
            while ((c = fileReader.read()) != -1) {
                text.append((char) c);
            }
            List<String> words = Arrays.asList(text.toString().split("\\s+|\\p{Punct}+"));
            words.stream()
                    .collect(Collectors.groupingBy(word -> word.toLowerCase(), Collectors.counting()))
                    .entrySet()
                    .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
            return words.size();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

    //Exercise 2: Reading User Input until 'Exit'
    public void readInputUntilExitCommand(Scanner sc) {
        List<String> inputArray = new ArrayList<>();

        String input = sc.nextLine();
        while (!input.equalsIgnoreCase("Exit")) {
            System.out.println(input);
            inputArray.add(input);
            input = sc.nextLine();
        }

        try (FileOutputStream fos = new FileOutputStream("userInputs.txt")) {
            for (String string : inputArray) {
                fos.write((string + ", ").getBytes());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    //Exercise 3: Appending to a File
    public void appendToFile(Scanner sc) {
        try (FileWriter fw = new FileWriter("userInputs.txt", true)) {
            fw.write(sc.nextLine() + ", ");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void appendToFileBonus(Scanner sc) {
        if (new File("userInputs.txt").exists()) {
            System.out.println("File \"userInputs.txt\" already exists");
        } else {
            try (FileWriter fw = new FileWriter("userInputs.txt", true)) {
                fw.write(sc.nextLine() + ", ");
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    //Exercise 4: Reading a Properties File
    //TODO: find the right .properties path
    public void printPropertiesFileContent() {
        String filePath = ".properties";
        Properties properties = new Properties();

        try (InputStream is = new FileInputStream(filePath)) {
            properties.load(is);

            for(String key: properties.stringPropertyNames()) {
                String value = properties.getProperty(key);
                System.out.printf("%s: %s", key, value);
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public void printPropertiesFileContentBonus(String search) {
        String filePath = ".properties";
        Properties properties = new Properties();

        try (InputStream is = new FileInputStream(filePath)) {
            properties.load(is);
            boolean hasProperty = false;
            for(String key: properties.stringPropertyNames()) {
                if (key.equals(search)) {
                    hasProperty = true;
                    String value = properties.getProperty(key);
                    System.out.printf("%s: %s", key, value);
                }
            }
            if (!hasProperty) {
                System.out.println("Key doesn't exist");
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    //Exercise 5: Creating Directories
    //TODO: methods don't create folders
    public void createDirectory() {
        try {
            Files.createDirectory(Paths.get("newFolder"));
        }
        catch (IOException e) {
            System.out.println(e.getMessage());        }
    }
    public void createDirectories() {
        try {
            Files.createDirectories(Paths.get("/Users/elenabezrodnova/IdeaProjects/InputOutput/newFolder/newFolder1/newFolder2"));
        }
        catch (IOException e) {
            System.out.println(e.getMessage());        }
    }
}
