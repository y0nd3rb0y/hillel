package com.java.courses.swing.layouts;

import javax.swing.*;

public class BasicLayouts {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                //new GridForm();
                new MainForm();
            }
        });
    }
}
