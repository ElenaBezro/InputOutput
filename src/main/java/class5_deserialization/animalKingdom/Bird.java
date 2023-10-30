package class5_deserialization.animalKingdom;

import java.io.Serializable;

public class Bird extends Animal implements Serializable {
    @Override
    public String sound() {
        return "Bird Sound!";
    }
}
