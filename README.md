Morning session

Exercise 1: Basic Object Deserialization
Objective:
Learn how to deserialize a simple Java object from a file.
Create a class called Person with fields for name (String) and age (int).
Serialize an instance of the Person class to a file.
Deserialize the object from the file and print the name and age.

Exercise 2: Array Deserialization
Objective:
Learn how to deserialize an array of objects from a file.
Create a class called Student with fields for id (int) and grade (double).
Serialize an array of Student objects to a file.
Deserialize the array from the file and print each student's id and grade.

Exercise 3: Handling Exceptions
Objective:
Learn how to handle exceptions during deserialization.
Modify the code from Exercise 1 to introduce a wrong file path intentionally.
Handle the FileNotFoundException and IOException appropriately.
Hints:   Use try-catch blocks to handle exceptions.

Exercise 4: Using transient Keyword
Objective:
Understand the use of the transient keyword in serialization.
Add a transient field named salary to the Person class from Exercise 1.
Serialize and then deserialize an object of the Person class.
Print the value of the salary field after deserialization.
Hints: Observe how the transient field is affected by serialization and deserialization.

Morning session
Part Two
Exercise: Animal Kingdom Serialization

Description:

You are to create a simple system that represents an animal kingdom. The system will have the following entities:

    Animal (Abstract Class)
        name (String)
        age (int)
        Abstract method: sound() (returns String)

    Mammal (Class extending Animal)
        Overrides sound() (e.g., returns "Mammal Sound!")

    Bird (Class extending Animal)
        Overrides sound() (e.g., returns "Bird Sound!")

    Zoo (Class)
        animals (List<Animal>)

    SerializableInterface (Interface)
        Method: void serialize(String filename)
        Method: void deserialize(String filename)

The Zoo class should implement the SerializableInterface. The serialization and deserialization methods will save and load the list of animals respectively.

Tasks:

    Define the abstract class Animal with its properties and abstract method.

    Define the classes Mammal and Bird extending the Animal class.

    Define the SerializableInterface with the mentioned methods.

    Define the Zoo class, implementing the SerializableInterface. Implement the serialization and deserialization methods using Java's ObjectOutputStream and ObjectInputStream respectively.

    In the main class:
        Create a few instances of Mammal and Bird.
        Add them to a Zoo.
        Serialize the Zoo object to a file.
        Deserialize the Zoo object from the file.
        Display the names and sounds of the deserialized animals to ensure that they've been loaded correctly.

Bonus:
Extend the Animal kingdom with more types of animals (e.g., Reptile, Fish).
Implement error handling for file operations.
Implement a search functionality in the Zoo class to search for an animal by name.
Add a serialVersionUID to the Animal, Mammal, Bird, and Zoo classes. Hint: https://www.baeldung.com/java-serial-version-uid

Evening Session

Exercise 1

Extend your program to allow deserialization of multiple Student
objects from the file and display their attributes, including hobbies.

Exercise 2

Implement a search function that allows users to find and display the
details of a specific student by name, student ID, or hobby.

Exercise 3

Handle exceptions related to deserialization and searching, ensuring
the program remains robust.

Exercise 4

Add the ability to delete a student's record from the file if requested
by the user.

Exercise 5

Create a summary report that calculates and displays the average
GPA of all students and lists their hobbies.

Exercise 6

Implement a feature that allows the user to update a student's
information, including their courses taken and grades, in the program.
Serialize the updated data.

Exercise 7

Create a function that lists all students who have taken a specific
course (e.g., "Math") along with their grades.

Exercise 8

Implement a function that displays a summary of the number of
students in each grade range (e.g., A, B, C, etc.) based on their GPAs.

Exercise 9

Add a confirmation step before deleting a student's record from the
file to ensure the user's intent.

Exercise 10

Create a feature that exports a summary report to a text file,
including the average GPA, the number of students, and other
relevant statistics.