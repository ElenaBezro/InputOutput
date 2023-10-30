package class4_serialization.eveningPractice;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L; // Version identifier

    private String address;
    private float GPA;
    private List<String> courseList = new ArrayList<>();
    private List<String> hobbyList = new ArrayList<>();

    public Student(String address, float GPA) {
        this.address = address;
        this.GPA = GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    public void addCourses(String... courseList) {
        this.courseList.addAll(Arrays.asList(courseList));
    }

    public void setCourses(String... courseList) {
        this.courseList.addAll(Arrays.asList(courseList));
    }

    public void addHobbies(String... hobbyList) {
        this.hobbyList.addAll(Arrays.asList(hobbyList));
    }

    public void setHobbies(String... hobbyList) {
        this.hobbyList.addAll(Arrays.asList(hobbyList));
    }

    @Override
    public String toString() {
        return "Person{" +
                "address='" + address + '\'' +
                ", GPA=" + GPA +
                ", Hobbies=" + hobbyList +
                ", Courses=" + courseList +
                '}' + "\n";
    }
}