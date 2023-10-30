package class5_deserialization.eveningSession;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise9 {
    public static void main(String[] args) {
        List<Student> students = (List<Student>) SerializeObject.deserialize();

        Map<String, List<Student>> studentsByGradeRange = getStudentsByGradeRange(students);

        System.out.println(studentsByGradeRange);
    }

    public static Map<String, List<Student>>getStudentsByGradeRange(List<Student> students) {
        return students.stream()
                .collect(Collectors
                        .groupingBy(student -> Math.floor(student.getGPA()) + "-" + Math.ceil(student.getGPA())));
    }
}
