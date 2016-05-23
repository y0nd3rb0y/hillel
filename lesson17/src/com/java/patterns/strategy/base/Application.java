package com.java.patterns.strategy.base;

import com.sun.org.apache.xalan.internal.xsltc.cmdline.Compile;

public class Application {
    public static void main(String[] args) {
        Compiler compiler = new Compiler("C++");
        compiler.compile("Some text");
    }

}
