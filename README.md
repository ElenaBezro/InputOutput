Morning session

Exercise 1: Write a Java class named Person with attributes name, age, and address. Implement the Serializable interface. Design methods to serialize a Person object to a file named person.ser and to deserialize it back. Create a Person instance, serialize it, and then deserialize to ensure the data is accurately restored.
Exercise 2: Modify the Person class from Exercise 1. Add an attribute currentDateTime of type LocalDateTime initialized with the current date and time. Make sure this attribute does not get serialized (Hint: Use the transient keyword). Serialize a Person object and then deserialize it. Check whether the currentDateTime retains its original value or is set to null.
Exercise 3: Implement a Vehicle class that has attributes make, model, and year. Instead of the usual Serializable interface, this time use the Externalizable interface. Implement the necessary methods (writeExternal and readExternal) to manage the serialization process. Serialize a Vehicle instance, then deserialize it, ensuring the data is correctly recovered.
Exercise 4: Refactor the Person class from Exercise 1. Add a twist by introducing potential issues that might cause InvalidClassException during deserialization. Handle this exception in your deserialization method and display a user-friendly message when the error occurs.
Exercise 5: Revisit your Person class from Exercise 1. Add custom serialization logic by overriding the writeObject and readObject methods. As an idea, you might want to encrypt the name attribute during serialization and decrypt during deserialization. Serialize and then deserialize a Person instance to verify that your custom logic works seamlessly. Note: For the encryption/decryption process you can just reverse the string.


Morning session 
Second part




Evening Session
