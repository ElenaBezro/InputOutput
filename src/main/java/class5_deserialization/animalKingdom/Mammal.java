package class5_deserialization.animalKingdom;

import java.io.Serializable;

public class Mammal extends Animal implements Serializable {
    @Override
    public String sound() {
        return "Mammal Sound!";
    }
}
