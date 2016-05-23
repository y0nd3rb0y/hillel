package com.java.patterns.strategy.main;

public class CompilerJava implements CompilerStrategy {
    @Override
    public void compile(String code) {
        System.out.println("compile in Java " + code);
    }
}
