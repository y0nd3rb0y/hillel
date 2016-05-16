package com.java.patterns.builder;

public class Cheesecake {
    private String name;
    private int weight;
    private int fat;
    private int carbohydrates;
    private int protein;
    private String vitamins;

    public static class Builder {
        private String name;
        private int weight;
        private int fat;
        private int carbohydrates;
        private int protein;
        private String vitamins;

        public Builder(String name, int weight){
            this.name = name;
            this.weight = weight;
        }

        public Builder fat(int fat){
            this.fat = fat;
            return this;
        }

        public Builder carbohydrates(int carbohydrates){
            this.carbohydrates = carbohydrates;
            return this;
        }

        public Builder protein(int protein){
            this.protein = protein;
            return this;
        }

        public Builder vitamins(String vitamins){
            this.vitamins = vitamins;
            return this;
        }

        public Cheesecake build(){
            return new Cheesecake(this);
        }

    }

    private Cheesecake(Builder builder){
        this.name = builder.name;
        this.weight = builder.weight;
        this.fat = builder.fat;
        this.carbohydrates = builder.carbohydrates;
        this.protein = builder.protein;
        this.vitamins = builder.vitamins;

    }
}
