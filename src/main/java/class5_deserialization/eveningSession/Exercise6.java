package class5_deserialization.eveningSession;

import java.util.List;

public class Exercise6 {
    public static void main(String[] args) {
        List<Student> students = Util.getFilledStudentsList();
        SerializeObject.serialize(students);
        List<Student> loadedStudents = (List<Student>) SerializeObject.deserialize();

        String id = "1001-uuid";
        double grade = 2.6;
        String[] courses = {"AWS", "Node.js"};

        loadedStudents = updateStudentCourses(loadedStudents, id, courses);
        loadedStudents = updateStudentGrade(loadedStudents, id, grade);

        System.out.println(loadedStudents);
        SerializeObject.serialize(loadedStudents);
    }

    public static List<Student> updateStudentCourses(List<Student> students, String id, String[] courses) {
        return students.stream()
                .map(student -> {
                    if (student.getId().equals(id)) {
                        student.setCourses(courses);
                    }
                    return student;
                })
                .toList();
    }

    public static List<Student> updateStudentGrade(List<Student> students, String id, double grade) {
        return students.stream()
                .map(student -> {
                    if (student.getId().equals(id)) {
                        student.setGPA(grade);
                    }
                    return student;
                })
                .toList();
    }
}
