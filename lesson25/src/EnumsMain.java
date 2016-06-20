public class EnumsMain {
    public static void main(String[] args) {
        int fruitType = Fruit.APPLE_RED;
        int wrongFruitType = 5;

        Apple redApple = Apple.RED;
        Orange whiteOrange = Orange.WHITE;

        Cat felix = new Cat("Felix", 5, Color.WHITE);
        Cat tom = new Cat("Tom", 3, Color.GREY);

        switch(tom.getColor()){
            case BLACK:{
                System.out.println(tom.getName()+" "+tom.getColor());
                break;
            }
            case WHITE:
                System.out.println(tom.getName()+" "+tom.getColor());
                break;
            default:
                System.out.println("cat has no color");
                break;
        }

        for(Color color : Color.values()){
            System.out.println(color+" "+color.ordinal());
        }

        CatExt cat = new CatExt("Fat Cat", 8, ColorExt.RED);
        String catColor = cat.getColor().getColorValue();
        System.out.println(catColor);

        EnumSingleton singleton = EnumSingleton.INSTANCE;
        singleton.someAction();
    }
}
