package Window4;

import ColorFinal.ColorScheme;
import ColorFinal.Guessing;
import FinalWindow.FinalWindow;
import Window5.Window5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window4 extends JFrame implements ActionListener {
    Guessing g = new Guessing();
    ColorScheme cs = new ColorScheme();
    JLabel PmOrAm;
    JButton PM, AM;

    public Window4() {
        setTitle("Akinator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1500, 980);
        setVisible(true);
        setLayout(null);
        getContentPane().setBackground(cs.getLightBlue());
        PmOrAm = new JLabel("Are we having lessons with the person before or after 12 pm?");
        PmOrAm.setBounds(0, 70, 20000, 70);
        PmOrAm.setFont(new Font("Serif", Font.BOLD, 50));
        add(PmOrAm);
        AM = new JButton("Before");
        AM.setBackground(cs.getLightGreen());
        AM.setBounds(400, 300, 200, 200);
        add(AM);
        AM.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                g.iul();
                if (g.i == 2 && g.o == 1 && g.w == 1 || g.i == 1 && g.o == 2 && g.m == 1) {
                    FinalWindow FinalWindow = new FinalWindow();
                } else {
                    Window5 window5 = new Window5();
                }
            }
        });
        PM = new JButton("After");
        PM.setBackground(cs.getLightGreen());
        PM.setBounds(800, 300, 200, 200);
        add(PM);
        PM.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                g.oul();
                Window5 window5 = new Window5();
            }
        });
    }


    public void fourthWindow() {
        Window4 window4 = new Window4();
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
