package com.java.patterns.strategy.main;

public class Application {
    public static void main(String[] args) {
        Compiler compiler = new Compiler(new CompilerJava());

/*        CompilerStrategy compilerStrategy = new CompilerJava();

 */
        compiler.compile("some Java code");
        compiler.setStrategy(new CompilerVB());
        compiler.compile("some VB code");

    }
}
