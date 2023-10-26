package class4_serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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

    private String encrypt(String string) {
        StringBuilder reversed = new StringBuilder(string);
        reversed.reverse();
        return reversed.toString();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.writeObject(encrypt(name));
        out.writeInt(age);
        out.writeObject(address);
    }
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        this.name =  encrypt(in.readObject().toString());
        this.age = in.readInt();
        this.address = (String) in.readObject();
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
