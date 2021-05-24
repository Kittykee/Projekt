package Window2;

import ColorFinal.ColorScheme;
import ColorFinal.Guessing;
import Window3.Window3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window2 extends JFrame implements ActionListener {
    Guessing g = new Guessing();
    ColorScheme cs = new ColorScheme();
    JLabel womanOrman;
    JButton Woman, Man;

    public Window2() {
        setTitle("Akinator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1500, 980);
        setVisible(true);
        setLayout(null);
        getContentPane().setBackground(cs.getLightBlue());
        womanOrman = new JLabel("What is the gender of that person?");
        womanOrman.setBounds(300, 70, 1000, 70);
        womanOrman.setFont(new Font("Serif", Font.BOLD, 50));
        add(womanOrman);
        Woman = new JButton("Woman");
        Woman.setBackground(cs.getLightGreen());
        Woman.setBounds(400, 300, 200, 200);
        add(Woman);
        Woman.addActionListener(e -> {
            g.iul();
            g.wul();
            Window3 window3 = new Window3();

        });
        Man = new JButton("Man");
        Man.setBackground(cs.getLightGreen());
        Man.setBounds(800, 300, 200, 200);
        add(Man);
        Man.addActionListener(e -> {
            g.oul();
            g.mul();
            Window3 window3 = new Window3();

        });
    }

    public void secondWindow() {
        Window2 window2 = new Window2();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
