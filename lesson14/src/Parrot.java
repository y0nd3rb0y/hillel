public class Parrot extends Animal{
    Parrot(String name) {
        this.name = name;
    }
    public void voice(){
        System.out.println("Parrot");
    }
    public String toString(){
        return this.name;
    }

}
