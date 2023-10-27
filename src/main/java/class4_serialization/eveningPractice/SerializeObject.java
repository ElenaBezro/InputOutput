package class4_serialization.eveningPractice;

import java.io.*;

public class SerializeObject {
    public static final String SER_FILE = "student.ser";

    public static void serialize(Object object) {
        try (FileOutputStream fos = new FileOutputStream(SER_FILE);
             ObjectOutputStream out = new ObjectOutputStream(fos)) {
            out.writeObject(object);
            out.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Object deserialize() {
        try (FileInputStream fis = new FileInputStream(SER_FILE);
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            return ois.readObject();
        } catch (InvalidClassException e) {
            System.out.println("Class/version mismatch: " + e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

//    public static void main(String[] args) {
//       ExerciseTwo.Student student1 = new ExerciseTwo.Student("Berlin", 3.5f);
//        ExerciseTwo.Student student2 = new ExerciseTwo.Student("Lapland", 3.6f);
//        ExerciseTwo.Student student3 = new ExerciseTwo.Student("Alaska", 3.4f);
//        serialize(student1);
//        serialize(student2);
//        serialize(student3);
//    }
}
