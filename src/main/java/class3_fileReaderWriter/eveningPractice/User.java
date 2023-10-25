package class3_fileReaderWriter.eveningPractice;

public class User {
    private String name;
    private int age;
    private String email;
    private String phoneNumber;
    private String address;

    public User(String name, int age, String email, String phoneNumber, String address) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return name + ", " +
                age + ", " +
                email + ", " +
                phoneNumber + ", " +
                address;
    }
}
