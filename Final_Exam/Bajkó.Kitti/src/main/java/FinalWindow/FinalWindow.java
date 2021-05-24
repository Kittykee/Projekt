package FinalWindow;

import ColorFinal.ColorScheme;
import ColorFinal.Guessing;
import Window5.Window5;
import Window6.Window6;
import Window7.Window7;
import Window8.Window8;
import Window9.Window9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FinalWindow extends JFrame implements ActionListener {
    Guessing g = new Guessing();
    ColorScheme cs = new ColorScheme();
    JLabel yOrN, Name;
    JButton YES, NO;

    public FinalWindow() {
        setTitle("Akinator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1500, 980);
        setVisible(true);
        setLayout(null);
        getContentPane().setBackground(cs.getLightBlue());
        yOrN = new JLabel("Is this the person you were thinking about?");
        yOrN.setBounds(0, 70, 1000, 70);
        yOrN.setFont(new Font("Serif", Font.BOLD, 50));
        add(yOrN);
        g.Final();
        Name = new JLabel(" " + g.f);
        Name.setBounds(100, 200, 1000, 70);
        Name.setFont(new Font("Serif", Font.BOLD, 50));
        add(Name);
        YES = new JButton("YES");
        YES.setBackground(cs.getLightGreen());
        YES.setBounds(800, 300, 200, 200);
        add(YES);
        YES.addActionListener(e -> System.exit(0));
        NO = new JButton("NO");
        NO.setBackground(cs.getLightRed());
        NO.setBounds(400, 300, 200, 200);
        add(NO);
        NO.addActionListener(e -> {
            if (g.i == 2 && g.o == 1 && g.w == 1 || g.i == 1 && g.o == 2 && g.m == 1) {
                Window5 w5 = new Window5();
            }
            if (g.i == 2 && g.o == 2 && g.m == 1 || g.i == 2 && g.o == 3 && g.m == 1 || g.i == 1 && g.o == 4 && g.m == 1) {
                Window6 window6 = new Window6();
            }
            if (g.i == 3 && g.o == 2 && g.w == 1) {
                Window7 window7 = new Window7();
            }
            if (g.i == 1 && g.o == 6 && g.m == 1 || g.i == 0 && g.o == 7 && g.m == 1) {
                Window8 window8 = new Window8();
            }
            if (g.i == 4 && g.o == 3 && g.w == 1 || g.i == 3 && g.o == 4 && g.w == 1) {
                Window9 window9 = new Window9();
            }
        });

    }

    public void FinalWindow() {
        FinalWindow FinalWindow = new FinalWindow();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
