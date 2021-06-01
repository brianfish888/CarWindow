package com.brian;

import javax.swing.*;

public class CarDemo {
    private JPanel maimpanel;
    private JTextField textField1;
    private JButton button1;
    private JPanel toppanel;

    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setContentPane(new CarDemo().maimpanel);
        frame.setSize(800,600);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
}
