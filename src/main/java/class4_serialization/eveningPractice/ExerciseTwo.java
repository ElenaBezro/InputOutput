package class4_serialization.eveningPractice;

import java.util.ArrayList;
import java.util.List;

public class ExerciseTwo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student("Berlin", 3.5f);
        Student student2 = new Student("Lapland", 3.6f);
        Student student3 = new Student("Alaska", 3.4f);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        SerializeObject.serialize(students);
        List<Student> loadedStudents = (List<Student>) SerializeObject.deserialize();
        System.out.println(loadedStudents);
    }
}
