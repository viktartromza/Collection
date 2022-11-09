public class Main {
    public static void main(String[] args) {

        AnimalCollection<Object> animalCollection = new AnimalCollection<>();
        animalCollection.addAnimal("rabbit");
        animalCollection.addAnimal("wolf");
        animalCollection.addAnimal("bear");
        animalCollection.addAnimal("tiger");
        System.out.println(animalCollection);
        animalCollection.removeAnimal();
        System.out.println(animalCollection);
    }
}
