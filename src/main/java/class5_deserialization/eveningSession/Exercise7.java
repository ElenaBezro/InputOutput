package class5_deserialization.eveningSession;

import java.util.List;

public class Exercise7 {
    public static void main(String[] args) {
        List<Student> students = (List<Student>) SerializeObject.deserialize();

        String course = "AWS";
        List<Student> studentsWithCourse = getStudentsWithCourse(students, course);

        System.out.println(studentsWithCourse);
    }

    public static List<Student> getStudentsWithCourse(List<Student> students, String course) {
        return students.stream()
                .filter(student -> student.getCourseList().contains(course))
                .toList();
    }
}
