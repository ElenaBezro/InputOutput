package class5_deserialization.eveningSession;

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
}
