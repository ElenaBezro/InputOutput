package class3_fileReaderWriter;

public class Main {
    public static void main(String[] args) {
        FileReaderWriter readerWriter = new FileReaderWriter();
        readerWriter.displayTextFromFile();
        readerWriter.writeTextToFile();
        readerWriter.copyFileContent();
        readerWriter.appendTextToFile();
        readerWriter.readNumbersFromFile();
        readerWriter.printNumbersFromFileSum();
    }
}
