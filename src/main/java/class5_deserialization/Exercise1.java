package class5_deserialization;

import java.io.*;

public class Exercise1 implements Serializable {
    public static final String SER_FILE = "person.ser";
    static class Person implements Serializable {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void serialize() {
            try (FileOutputStream fos = new FileOutputStream(SER_FILE);
                 ObjectOutputStream out = new ObjectOutputStream(fos)) {
                out.writeObject(this);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        public static Person deserialize() {
            Person person = null;

            try (FileInputStream fis = new FileInputStream(SER_FILE);
                 ObjectInputStream in = new ObjectInputStream(fis)) {
                person = (Person) in.readObject();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            } catch (ClassNotFoundException e) {
                System.out.println(e.getMessage());
            }
            return person;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public static void main(String[] args) {
        Person person = new Person("Lena", 35);
        person.serialize();
        Person person1 = Person.deserialize();
        System.out.println(person1);
    }
}
