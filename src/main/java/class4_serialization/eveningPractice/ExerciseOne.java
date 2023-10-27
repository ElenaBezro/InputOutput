package class4_serialization.eveningPractice;

public class ExerciseOne {
    public static void main(String[] args) {
        Student student = new Student("berlin", 3.5f);
        SerializeObject.serialize(student);
        Student deserialized =(Student) SerializeObject.deserialize();
        System.out.println(deserialized);
    }
}
