package class5_deserialization.eveningSession;

import java.util.ArrayList;
import java.util.List;

public class Util {
    public static List<Student> getFilledStudentsList() {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student("Lena","1000-uuid","Berlin", 3.5f);
        Student student2 = new Student("Nona","1001-uuid","Lapland", 3.6f);
        Student student3 = new Student("Lisa","1002-uuid","Alaska", 3.4f);

        student1.setHobbies("Inline skating");
        student1.addHobbies("cycling");
        student2.setHobbies("Inline skating");
        student2.addHobbies("cycling");
        student3.setHobbies("Inline skating");
        student3.addHobbies("cycling");

        students.add(student1);
        students.add(student2);
        students.add(student3);

        return students;
    }
}
