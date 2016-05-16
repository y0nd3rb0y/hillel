package com.java.patterns.factory;

public class TeaFactory {
    public Tea makeTea(String type){
        Tea tea;
        switch (type){
            case "green":
                tea = new GreenTea("GreenTea", 100, "bags");
                break;
            case "black":
                tea = new BlackTea("BlackTea", 50, "bags");
                break;
            case "fruit":
                tea = new FruitTea("FruitTea", 100, "powder");
                break;
            default:
                tea = null;
        }
        return tea;
    }
}
