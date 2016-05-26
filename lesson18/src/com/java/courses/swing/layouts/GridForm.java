package com.java.courses.swing.layouts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridForm extends JPanel {
    private JButton button11;
    private JButton button12;
    private JButton button13;

    private JButton button21;
    private JButton button22;
    private JButton button23;

    private JButton button31;
    private JButton button32;
    private JButton button33;
    static String mark = "X";
    public GridForm() {

        //Toolkit toolkit = Toolkit.getDefaultToolkit();
        //Dimension screenSize = toolkit.getScreenSize();
        ///int x = screenSize.width;
        //int y = screenSize.height;
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setSize((int) Math.round(x * 0.8), (int) Math.round(y * 0.8));
        //setLocationRelativeTo(null);
        LayoutManager layoutManager = new GridBagLayout();
        setLayout(layoutManager);
        //setVisible(true);


        Dimension dimension = new Dimension();
        dimension.height = 100;
        dimension.width = 100;
        button11 = new JButton("");
        button12 = new JButton("");
        button13 = new JButton("");
        button11.setPreferredSize(dimension);
        button12.setPreferredSize(dimension);
        button13.setPreferredSize(dimension);

        button21 = new JButton("");
        button22 = new JButton("");
        button23 = new JButton("");
        button21.setPreferredSize(dimension);
        button22.setPreferredSize(dimension);
        button23.setPreferredSize(dimension);

        button31 = new JButton("");
        button32 = new JButton("");
        button33 = new JButton("");
        button31.setPreferredSize(dimension);
        button32.setPreferredSize(dimension);
        button33.setPreferredSize(dimension);
        GridBagConstraints gc = new GridBagConstraints();
        gc.gridx = 0;
        gc.gridy = 0;
        add(button11, gc);
        gc.gridx = 1;
        gc.gridy = 0;
        add(button12, gc);
        gc.gridx = 2;
        gc.gridy = 0;
        add(button13, gc);
        gc.gridx = 0;
        gc.gridy = 1;
        add(button21, gc);
        gc.gridx = 1;
        gc.gridy = 1;
        add(button22, gc);
        gc.gridx = 2;
        gc.gridy = 1;
        add(button23, gc);
        gc.gridx = 0;
        gc.gridy = 2;
        add(button31, gc);
        gc.gridx = 1;
        gc.gridy = 2;
        add(button32, gc);
        gc.gridx = 2;
        gc.gridy = 2;
        add(button33, gc);
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button11.setText(mark);
                changeMark();
            }
        });
        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button12.setText(mark);
                changeMark();
            }
        });
        button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button13.setText(mark);
                changeMark();
            }
        });

        button21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button21.setText(mark);
                changeMark();
            }
        });
        button22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button22.setText(mark);
                changeMark();
            }
        });
        button23.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button23.setText(mark);
                changeMark();
            }
        });

        button31.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button31.setText(mark);
                changeMark();
            }
        });
        button32.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                button32.setText(mark);
                changeMark();
            }
        });
        button33.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button33.setText(mark);
                changeMark();
            }
        });


    }
    private static void changeMark(){
        if(mark.equals("X")){
            mark = "0";
        } else {
            mark = "X";
        }
    }

}


