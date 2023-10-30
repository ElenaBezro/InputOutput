package class5_deserialization.eveningSession;

import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {
        List<Student> students = Util.getFilledStudentsList();

        SerializeObject.serialize(students);
        List<Student> loadedStudents = (List<Student>) SerializeObject.deserialize();

        for (Student student : loadedStudents) {
            System.out.println(student);
        }
    }
}
