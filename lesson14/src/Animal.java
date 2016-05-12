public class Animal {
    String name;
    int age;
    Animal() {
        this("Default", 5);
        System.out.println("In animal constructor");
    }
    Animal(String name){
        this(name, 5);
        this.name = name;
        System.out.println("In Animal with name");
    }
    Animal(String name, int age){
        this.name = name;
        this.age = age;

    }
    public void voice(){
        System.out.println("moo");
    }
}
