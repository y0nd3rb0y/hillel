package com.java.courses.swing.layouts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm extends JFrame {

    private JTextArea textAreaL;
    private JTextArea textAreaR;
    private JButton button;


    public MainForm() {
        super("Basic Layouts");
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int x = screenSize.width;
        int y = screenSize.height;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize((int) Math.round(x * 0.8), (int) Math.round(y * 0.8));
        setLocationRelativeTo(null);
        setVisible(true);

        LayoutManager layoutManager = new BorderLayout(5, 5);
        setLayout(layoutManager);
        textAreaL = new JTextArea();
        textAreaR = new JTextArea();
        button = new JButton("Click me");

        Dimension textAreaLSize = textAreaL.getPreferredSize();
        textAreaLSize.width = 300;
        textAreaLSize.height = 100;
        textAreaR.setPreferredSize(textAreaLSize);
        textAreaL.setPreferredSize(textAreaLSize);
        //System.out.println(textAreaLSize.width + ":"+textAreaLSize.height);
        //add(textAreaL, BorderLayout.WEST);
        ///add(textAreaR, BorderLayout.EAST);
        add(new GridForm(), BorderLayout.WEST);
        add(new Toolbar(), BorderLayout.NORTH);
        add(button, BorderLayout.SOUTH);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //textAreaL.append("F|F|F|F|\n");
                //String str = textAreaL.getText();
                //JOptionPane.showMessageDialog(null, str);
                String text = textAreaL.getText();
                textAreaR.setText("");
                Integer number;
                try {
                    number = Integer.parseInt(text);
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, "Entered number is not valid");
                    number = 0;
                }
                for (int i = 1; i <= number; i++) {
                    for (int j = 1; j <= i; j++) {
                        textAreaR.append(j + " ");
                    }
                    textAreaR.append("\n");
                }
            }
        });
    }
}
