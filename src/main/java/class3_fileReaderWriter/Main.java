package class3_fileReaderWriter;

public class Main {
    public static void main(String[] args) {
        FileReaderWriter readerWriter = new FileReaderWriter();
//        readerWriter.displayTextFromFile();
//        readerWriter.writeTextToFile();
//        readerWriter.copyFileContent();
//        readerWriter.appendTextToFile();
//        readerWriter.readNumbersFromFile();
//        readerWriter.printNumbersFromFileSum();

        System.out.println("Second part of the Day3");
        System.out.println("******");
        readerWriter.collectUserInputText();
        System.out.println(readerWriter.countLinesInFile());
        readerWriter.fileContentToUpperCase();
        readerWriter.printDuplicateWords();
    }
}
