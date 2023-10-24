package class2_inputOutput;


import java.io.*;

public class FileInputStreamDemo {
    public void displayFileContent(String filePath) {
        try {
            FileInputStream f = new FileInputStream(filePath);
            int x = 0;
            while ((x = f.read()) != -1) {
                System.out.print((char) x);
            }
            f.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readBinaryFile(String filePath) {
        try (FileInputStream fis = new FileInputStream(filePath)) {
            int byteRead;
            while ((byteRead = fis.read()) != -1) {
                System.out.print(byteRead + " ");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void copyBinaryFile(String source, String destination) {
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void displayCSVFileContent(String filePath) {
        try (FileInputStream fis = new FileInputStream(filePath);
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader br = new BufferedReader(isr)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] columns = line.split(",");
                for (String column : columns) {
                    System.out.print(column + "\t");
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //TODO:
    //Exercise 6: Modify the program from Exercise 5 to handle exceptions. Implement error handling to catch and display any IOException that may occur while reading the file.
    //Exercise 7: Create a Java program that reads a large text file (e.g., "large_data.txt") in chunks using a buffer. Display the contents of the file in chunks, and specify the buffer size.
    //Exercise 8: Enhance the program from Exercise 7 to measure and display the time it takes to read the entire large file in milliseconds.
}
