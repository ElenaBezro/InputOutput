package class4_serialization;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import static java.time.LocalDateTime.now;

public class Person implements Serializable {
    //TODO:
   //Exercise 5: Revisit your Person class from Exercise 1.
   // Add custom serialization logic by overriding the writeObject and readObject methods.
   // As an idea, you might want to encrypt the name attribute during serialization and decrypt
   // during deserialization. Serialize and then deserialize a Person instance to verify that
   // your custom logic works seamlessly. Note: For the encryption/decryption process you can just reverse the string.
    private String name;
    private int age;
    private String address;
    transient private LocalDateTime currentDateTime;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.currentDateTime = now();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age  +
                ", address='" + address + '\'' +
                ", currentDataTime='" + currentDateTime + '\'' +
                '}';
    }
}
