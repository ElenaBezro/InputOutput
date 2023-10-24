package class2_inputOutput;

public class Main {
    public static void main(String[] args) {
//        FileInputStreamDemo f = new FileInputStreamDemo();
//        f.displayFileContent("/Users/elenabezrodnova/IdeaProjects/InputOutput/input.txt");
//        f.readBinaryFile("/Users/elenabezrodnova/Downloads/meElena.jpg");
//        f.copyBinaryFile("/Users/elenabezrodnova/Downloads/meElena.jpg", "/Users/elenabezrodnova/IdeaProjects/InputOutput/copy_meElena.jpg" );
//        System.out.println("\n");
//        f.displayCSVFileContent("/Users/elenabezrodnova/IdeaProjects/InputOutput/data.csv");
        InputOutputStreamsPractice s = new InputOutputStreamsPractice();

        s.readUserPhoneNumberAndAddress("/Users/elenabezrodnova/IdeaProjects/InputOutput/input.txt");
        MusieTask m = new MusieTask();
        m.characterStreamTask();

    }
}
