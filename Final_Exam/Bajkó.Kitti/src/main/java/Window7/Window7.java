package Window7;

import ColorFinal.ColorScheme;
import ColorFinal.Guessing;
import FinalWindow.FinalWindow;
import Window8.Window8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window7 extends JFrame implements ActionListener {
    Guessing g = new Guessing();
    ColorScheme cs = new ColorScheme();
    JLabel talking;
    JButton Yes, No;

    public Window7() {
        setTitle("Akinator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1500, 980);
        setVisible(true);
        setLayout(null);
        getContentPane().setBackground(cs.getLightBlue());
        talking = new JLabel("Do this person likes to talk about their life?");
        talking.setBounds(0, 70, 20000, 70);
        talking.setFont(new Font("Serif", Font.BOLD, 50));
        add(talking);
        Yes = new JButton("Yes");
        Yes.setBackground(cs.getLightGreen());
        Yes.setBounds(400, 300, 200, 200);
        add(Yes);
        Yes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                g.oul();
                if (g.i == 0 && g.o == 7 && g.m == 1) {
                    FinalWindow FinalWindow = new FinalWindow();
                } else {
                    Window8 window8 = new Window8();
                }
            }
        });
        No = new JButton("No");
        No.setBackground(cs.getLightGreen());
        No.setBounds(800, 300, 200, 200);
        add(No);
        No.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                g.iul();
                if (g.i == 1 && g.o == 6 && g.m == 1) {
                    FinalWindow FinalWindow = new FinalWindow();
                } else {
                    Window8 window8 = new Window8();
                }


            }
        });
    }

    public void Window7() {
        Window7 window7 = new Window7();
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
