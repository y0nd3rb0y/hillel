package com.java.patterns.strategy.main;

public class ApplicationAnonymous {
    public static void main(String[] args) {

        Compiler compiler = new Compiler(new CompilerStrategy() {
            @Override
            public void compile(String code) {
                System.out.println("compile in Haskel: "+code);
            }
        });
        compiler.compile("Some code");
    }
}
