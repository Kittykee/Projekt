package Window5;

import ColorFinal.ColorScheme;
import ColorFinal.Guessing;
import FinalWindow.FinalWindow;
import Window6.Window6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window5 extends JFrame implements ActionListener {
    Guessing g = new Guessing();
    ColorScheme cs = new ColorScheme();
    JLabel Camera;
    JButton Yes, No;

    public Window5() {
        setTitle("Akinator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1500, 980);
        setVisible(true);
        setLayout(null);
        getContentPane().setBackground(cs.getLightBlue());
        Camera = new JLabel("The person likes to turn on their camera?");
        Camera.setBounds(0, 70, 20000, 70);
        Camera.setFont(new Font("Serif", Font.BOLD, 50));
        add(Camera);
        Yes = new JButton("Yes");
        Yes.setBackground(cs.getLightGreen());
        Yes.setBounds(400, 300, 200, 200);
        add(Yes);
        Yes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                g.oul();
                g.oul();
                if (g.i == 2 && g.o == 3 && g.m == 1 || g.i == 1 && g.o == 4 && g.m == 1) {
                    FinalWindow FinalWindow = new FinalWindow();
                } else {
                    Window6 window6 = new Window6();

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
                if (g.i == 2 && g.o == 2 && g.m == 1) {
                    FinalWindow FinalWindow = new FinalWindow();
                } else {
                    Window6 window6 = new Window6();
                }

            }
        });
    }

    public void fifthWindow() {
        Window5 window5 = new Window5();
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
