Morning session

Exercise 1: Write a Java class named Person with attributes name, age, and address. Implement the Serializable interface. Design methods to serialize a Person object to a file named person.ser and to deserialize it back. Create a Person instance, serialize it, and then deserialize to ensure the data is accurately restored.
Exercise 2: Modify the Person class from Exercise 1. Add an attribute currentDateTime of type LocalDateTime initialized with the current date and time. Make sure this attribute does not get serialized (Hint: Use the transient keyword). Serialize a Person object and then deserialize it. Check whether the currentDateTime retains its original value or is set to null.
Exercise 3: Implement a Vehicle class that has attributes make, model, and year. Instead of the usual Serializable interface, this time use the Externalizable interface. Implement the necessary methods (writeExternal and readExternal) to manage the serialization process. Serialize a Vehicle instance, then deserialize it, ensuring the data is correctly recovered.
Exercise 4: Refactor the Person class from Exercise 1. Add a twist by introducing potential issues that might cause InvalidClassException during deserialization. Handle this exception in your deserialization method and display a user-friendly message when the error occurs.
Exercise 5: Revisit your Person class from Exercise 1. Add custom serialization logic by overriding the writeObject and readObject methods. As an idea, you might want to encrypt the name attribute during serialization and decrypt during deserialization. Serialize and then deserialize a Person instance to verify that your custom logic works seamlessly. Note: For the encryption/decryption process you can just reverse the string.

Evening Session

Exercise 1

Create a more complex class (e.g., Student) with additional attributes
like address, GPA, a list of courses taken, and a list of hobbies.
Implement serialization for this class.

Exercise 2

Create multiple instances of the Student class, serialize them to the
same file, and handle any potential conflicts.

Exercise 3

Add error handling for serialization, especially for class/version
mismatches.

Exercise 4

Implement a feature that allows the user to update a student's GPA,
courses taken, and hobbies in the program, serialize it, and display the
updated information.

Exercise 5

Create a backup of the serialized data for disaster recovery purposes.

Exercise 6

Extend the Student class to include additional attributes like a list of
courses taken (e.g., Math, Science) and their corresponding grades.

Exercise 7

Implement serialization and deserialization for the updated Student
class.

Exercise 8

Add error handling for serialization and deserialization, including
handling cases where the class structure has changed.

Exercise 9

Create a function to display a list of all serialized student objects with
their names and GPAs.

Exercise 10

Implement a function that calculates and displays the average GPA of
all serialized student objects.