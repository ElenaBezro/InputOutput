package class5_deserialization;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Exercise2 implements Serializable {
    private final static String SER_FILE = "student.ser";
    private List<Student> students = new ArrayList<>();

    private void addStudent(Student student) {
        students.add(student);
    }

    static class Student implements Serializable {
        private int id;
        private double grade;

        public Student(int id, double grade) {
            this.id = id;
            this.grade = grade;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", grade=" + grade +
                    '}';
        }

    }

    public void serialize() {
        try (FileOutputStream fos = new FileOutputStream(SER_FILE);
             ObjectOutputStream out = new ObjectOutputStream(fos)) {
            out.writeObject(students);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Student> deserialize() {
        List<Student> students = null;

        try (FileInputStream fis = new FileInputStream(SER_FILE);
             ObjectInputStream in = new ObjectInputStream(fis)) {
            students = (List<Student>) in.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("No such file");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return students;
    }

    public static void main(String[] args) {
        Exercise2 exercise2 = new Exercise2();
        Student student1 = new Student(101, 3.5);
        Student student2 = new Student(102, 3.6);
        exercise2.addStudent(student1);
        exercise2.addStudent(student2);

        exercise2.serialize();
        List<Student> students = exercise2.deserialize();
        System.out.println(students);
    }
}
