public class CastingTest {
    public static void main(String[] args) {
        Object obj = new Cat();
        Cat cat = (Cat) obj;
        Animal animal = (Animal) obj;
        cat.voice();
        animal.voice();

        Object obj2 = new Animal();
        Cat cat2 = (Cat) obj2;
        cat2.voice();
    }
}
