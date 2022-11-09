import java.awt.*;
import java.util.LinkedList;

public class AnimalCollection<String> extends LinkedList {

        public void addAnimal(Object o) {
        super.addLast(o);
    }

    public Object removeAnimal() {
        return super.removeFirst();
    }
}
