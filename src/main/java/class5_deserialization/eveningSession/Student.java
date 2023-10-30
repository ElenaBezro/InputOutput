package class5_deserialization.eveningSession;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student implements Serializable {
    private String name;
    private String id;
    private String address;
    private double GPA;
    private List<String> courseList = new ArrayList<>();
    private List<String> hobbyList = new ArrayList<>();

    public Student(String address, float GPA) {
        this.address = address;
        this.GPA = GPA;
    }

    public Student(String name, String id, String address, float GPA) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public double getGPA() {
        return GPA;
    }

    public List<String> getCourseList() {
        return courseList;
    }

    public List<String> getHobbyList() {
        return hobbyList;
    }

    public void setGPA(double GPA) {
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
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", address='" + address + '\'' +
                ", GPA=" + GPA +
                ", Hobbies=" + hobbyList +
                ", Courses=" + courseList +
                '}' + "\n";
    }
}