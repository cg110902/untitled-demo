package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        JLabel jLabel = new JLabel("i am a label");


        JFrame jFrame = new JFrame("hello swing");
        jFrame.add(jLabel);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setSize(300, 300);
        jFrame.setVisible(true);
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        SwingUtilities.invokeLater(() -> jLabel.setText("hey! this is a different！"));


    }
}
