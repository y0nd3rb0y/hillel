package com.java.courses.swing.layouts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Toolbar extends JPanel {
    private JButton buttonHello = new JButton("Hello");
    private JButton buttonGoodbye = new JButton("Goodbye");
    public Toolbar(){
        LayoutManager layoutManager = new FlowLayout(FlowLayout.LEFT);
        setLayout(layoutManager);

        add(buttonHello, layoutManager);
        add(buttonGoodbye, layoutManager);

        buttonGoodbye.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Goodbye");
            }
        });

        buttonHello.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hello");
            }
        });

    }
}
