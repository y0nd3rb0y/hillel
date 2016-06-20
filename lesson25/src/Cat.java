public class Cat {
    private String name;
    private int age;
    Color color;

    public Cat(String name, int age, Color color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Color getColor(){
        return color;
    }

    public String getName(){
        return name;
    }

}
