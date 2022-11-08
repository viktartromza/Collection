import java.awt.*;
import java.util.LinkedList;

public class AnimalCollection<String> extends LinkedList {
    String animalName;

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public void addAnimal(Object o) {
        super.addLast(o);
    }

    public Object removeAnimal() {
        return super.removeFirst();
    }
}
