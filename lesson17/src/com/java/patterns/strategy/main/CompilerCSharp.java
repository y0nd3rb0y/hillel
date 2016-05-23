package com.java.patterns.strategy.main;

public class CompilerCSharp implements CompilerStrategy {

    @Override
    public void compile(String code) {
        System.out.println("compile in C# " + code);
    }
}
