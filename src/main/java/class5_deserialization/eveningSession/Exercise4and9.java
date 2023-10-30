package class5_deserialization.eveningSession;

import java.util.List;
import java.util.Scanner;

public class Exercise4and9 {
    public static void main(String[] args) {

        List<Student> students = Util.getFilledStudentsList();

        SerializeObject.serialize(students);
        List<Student> loadedStudents = (List<Student>) SerializeObject.deserialize();
        String id = "1001-uuid";

        List<Student> studentsFiltered;

        if (requestConfirmation()) {
            studentsFiltered = deleteStudent(loadedStudents, id) ;
            System.out.println(studentsFiltered);
            SerializeObject.serialize(studentsFiltered);
        }

    }

    public static boolean requestConfirmation() {
        boolean delete = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Delete user? Y/N");
        String answer = sc.nextLine();
        if (answer.equalsIgnoreCase("n")) {
            System.out.println("User was not deleted");
        }
        else {
            delete = true;
        }
        return delete;
    }

    public static List<Student> deleteStudent(List<Student> students, String id) {
        return students.stream()
                .filter(student -> !student.getId().equals(id))
                .toList();
    }
}
