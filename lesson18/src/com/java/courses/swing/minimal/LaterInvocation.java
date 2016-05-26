package com.java.courses.swing.minimal;

import javax.swing.*;

public class LaterInvocation {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new SwingApplication());
    }
}

class SwingApplication implements Runnable{
    @Override
    public void run() {
        JFrame frame = new JFrame("Minimal App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close app on exit btn
        frame.setSize(600, 600); //window size
        frame.setLocationRelativeTo(null); //center of screen
        frame.setVisible(true);
    }
}