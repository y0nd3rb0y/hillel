package com.java.patterns.factory;

public class Tea {
    private String name;
    private int weight;
    private String packaging;

    public void makeCupOfTea(){
        System.out.println("A cup of tea is ready. Name is "+name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getPackaging() {
        return packaging;
    }

    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }
}
