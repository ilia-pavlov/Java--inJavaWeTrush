package guiClickButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    private int count = 0;
    private JLabel label;
    private JFrame frame;
    private JButton button;
    private JPanel panel;

    public GUI() {

        frame = new JFrame();
        frame.setSize(30,30);

        button = new JButton("Click me"); //NUmber of counting not visible after counting started
        button.addActionListener(this);
        button.setFont(new Font("", Font.BOLD, 14));



        label = new JLabel("Number of click: 0");


        panel = new JPanel();

        panel.setBorder(BorderFactory.createEmptyBorder(60, 100, 30, 100));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our GUI!");
        frame.pack();
        frame.setVisible(true);
    }


    public static void main(String[] args){
        new GUI();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks:" + count);
    }
}
