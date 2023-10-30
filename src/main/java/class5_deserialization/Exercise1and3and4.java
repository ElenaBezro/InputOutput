package class5_deserialization;

import java.io.*;

public class Exercise1and3and4 implements Serializable {
    public static final String SER_FILE = "person.ser";

    static class Person implements Serializable {
        private String name;
        private int age;

        transient int salary;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Person(String name, int age, int salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
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
            } catch (FileNotFoundException e) {
                System.out.println("No such file");
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
        System.out.println("Exercise 1");
        Person person = new Person("Lena", 35);
        person.serialize();
        Person person1 = Person.deserialize();
        System.out.println(person1);

        System.out.println("******");
        System.out.println("Exercise 4");
        Person person2 = new Person("Nona", 50, 100000);
        person2.serialize();
        Person person3 = Person.deserialize();
        System.out.println(person3);

    }
}
