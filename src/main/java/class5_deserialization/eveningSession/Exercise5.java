package class5_deserialization.eveningSession;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise5 {
    public static void main(String[] args) {
        List<Student> students = Util.getFilledStudentsList();
        SerializeObject.serialize(students);
        List<Student> loadedStudents = (List<Student>) SerializeObject.deserialize();

        Map<String, List<String>> studentToHobbiesMap = getHobbies(loadedStudents);
        System.out.println(studentToHobbiesMap);
        System.out.println(getAverage(loadedStudents));

    }

    public static Map<String, List<String>> getHobbies(List<Student> students) {
        return students.stream()
                .collect(Collectors.toMap(Student::getName, Student::getHobbyList));
    }
    public static double getAverage(List<Student> students) {
        return students.stream()
                .mapToDouble(Student::getGPA)
                .average().orElse(0);
    }
}
