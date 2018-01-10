package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class SubmitSwingProgram extends JFrame {


    JLabel jLabel;

    public SubmitSwingProgram() throws HeadlessException {
        super("hello swing");
        jLabel = new JLabel("a label");
        add(jLabel);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
    }

    static SubmitSwingProgram ssp;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ssp = new SubmitSwingProgram();
            }
        });
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    ssp.jLabel.setText("hey,this is a different！");
                }
            });
        }

    }
}
