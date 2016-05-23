package com.java.patterns.strategy.base;

public class Compiler {
    private String language;
    public Compiler(String language){
        this.language = language;
    }

    public void compile(String code){
        switch (language){
            case "C#":
                compileWithCSharp(code);
                break;
            case "C++":
                compileWithCPlusPlus(code);
                break;
            case "Java":
                compileWithJava(code);
                break;
            default:
                System.out.println("Unknown code!");
                break;
        }
    }

    private void compileWithCSharp(String code){
        System.out.println("compile in C# " + code);
    }
    private void compileWithCPlusPlus(String code){
        System.out.println("compile in C++ " + code);
    }
    private void compileWithJava(String code){
        System.out.println("compile in Java " + code);
    }
}
