package class5_deserialization.eveningSession;

import java.util.List;

public class Exercise2 {
    public static void main(String[] args) {

        List<Student> students = Util.getFilledStudentsList();

        SerializeObject.serialize(students);
        List<Student> loadedStudents = (List<Student>) SerializeObject.deserialize();
        String searchParameter = "Lena";
        displayStudentInfo(loadedStudents, searchParameter);
    }

    public static void displayStudentInfo(List<Student> students, String searchParameter) {
        students.stream()
                .filter(student ->{
                    return student.getName().equalsIgnoreCase(searchParameter) ||
                            student.getId().equalsIgnoreCase(searchParameter) ||
                            student.getHobbyList().contains(searchParameter);
                }).forEach(student -> System.out.println(student));
    }
}
