package class5_deserialization.animalKingdom;

import java.util.ArrayList;
import java.util.List;

public class Zoo implements SerializableInterface {
    //In the main class:
    //        Create a few instances of Mammal and Bird.
    //        Add them to a Zoo.
    //        Serialize the Zoo object to a file.
    //        Deserialize the Zoo object from the file.
    //        Display the names and sounds of the deserialized animals to ensure that they've been loaded correctly.
    //
    //Bonus:
    //Extend the Animal kingdom with more types of animals (e.g., Reptile, Fish).
    //Implement error handling for file operations.
    //Implement a search functionality in the Zoo class to search for an animal by name.
    //Add a serialVersionUID to the Animal, Mammal, Bird, and Zoo classes. Hint: https://www.baeldung.com/java-serial-version-uid
    List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    @Override
    public void serialize(String filename) {

    }

    @Override
    public void deserialize(String filename) {

    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Animal mammal = new Mammal();
        Animal bird = new Bird();
        zoo.addAnimal(mammal);
        zoo.addAnimal(bird);
    }
}
