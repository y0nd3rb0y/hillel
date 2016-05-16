package com.java.patterns.builder;

public class Main {
    public static void main(String[] args) {
        CheesecakeTelescopic cheesecakeTelescopic = new CheesecakeTelescopic("New York", 1);
        CheesecakeTelescopic cheesecakeTelescopic1 = new CheesecakeTelescopic("Lemon cake", 100, 34, 45, 57, "A D");
        CheesecakeBean cheesecakeBean = new CheesecakeBean();
        cheesecakeBean.setCarbohydrate(5);
        cheesecakeBean.setName("Lemon tart");
        cheesecakeBean.setWeight(1);

        Cheesecake cheesecake = new Cheesecake.Builder("Lemon cheese builder", 100)
                .fat(5)
                .carbohydrates(3)
                .vitamins("A B C D")
                .build();
        //Cheesecake cheese1 = new Cheesecake(); -- can't create from private constructor
    }
}
