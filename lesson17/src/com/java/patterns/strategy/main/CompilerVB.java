package com.java.patterns.strategy.main;

public class CompilerVB implements CompilerStrategy {
    @Override
    public void compile(String code) {
        System.out.println("compile in VisualBasic " + code);
    }
}
