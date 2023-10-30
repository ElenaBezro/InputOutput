package class5_deserialization.animalKingdom;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Zoo implements SerializableInterface, Serializable {
    public static final String ZOO_SER = "zoo.ser";
    //Bonus:
    //Extend the Animal kingdom with more types of animals (e.g., Reptile, Fish).
    //Implement error handling for file operations.
    //Implement a search functionality in the Zoo class to search for an animal by name.
    //Add a serialVersionUID to the Animal, Mammal, Bird, and Zoo classes. Hint: https://www.baeldung.com/java-serial-version-uid
    List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    @Override
    public void serialize() {
        try (FileOutputStream fos = new FileOutputStream(ZOO_SER);
             ObjectOutputStream out = new ObjectOutputStream(fos)) {
            out.writeObject(this);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Zoo deserialize() {
        Zoo zoo = null;
        try (FileInputStream fis = new FileInputStream(ZOO_SER);
             ObjectInputStream in = new ObjectInputStream(fis)) {
            zoo = (Zoo) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return zoo;
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Animal mammal = new Mammal();
        Animal bird = new Bird();
        zoo.addAnimal(mammal);
        zoo.addAnimal(bird);
        zoo.serialize();
        Zoo deserialisedZoo = zoo.deserialize();
        deserialisedZoo.getAnimals().forEach(animal -> System.out.println(animal.sound()));
    }
}
