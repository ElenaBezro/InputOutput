package class4_serialization;

import java.io.*;

public class SerializeObject {
    public static final String SER_FILE = "person.ser";

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
            System.out.println("InvalidClassException occurred");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public static void main(String[] args) {
        Person person = new Person("Lena", 30, "berlin");
        serialize(person);
        Person desirialisedPerson = (Person) deserialize();
        System.out.println(desirialisedPerson);

        Vehicle car = new Vehicle("BMW", "X5", 2023);
        serialize(car);
        Vehicle desirialisedVehicle = (Vehicle) deserialize();
        System.out.println(desirialisedVehicle);
    }
}
