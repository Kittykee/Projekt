package Window9;

import ColorFinal.ColorScheme;
import ColorFinal.Guessing;
import FinalWindow.FinalWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window9 extends JFrame implements ActionListener {
    Guessing g = new Guessing();
    ColorScheme cs = new ColorScheme();
    JLabel Sleep;
    JButton Yes, No;

    public Window9() {
        setTitle("Akinator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1500, 980);
        setVisible(true);
        setLayout(null);
        getContentPane().setBackground(cs.getLightBlue());
        Sleep = new JLabel("Did you fall asleep on his/hers class?");
        Sleep.setBounds(0, 70, 20000, 70);
        Sleep.setFont(new Font("Serif", Font.BOLD, 50));
        add(Sleep);
        Yes = new JButton("Yes");
        Yes.setBackground(cs.getLightGreen());
        Yes.setBounds(400, 300, 200, 200);
        add(Yes);
        Yes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                g.iul();
                if (g.i == 5 && g.o == 3 && g.m == 1) {
                    FinalWindow FinalWindow = new FinalWindow();
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
                g.oul();
                if (g.i == 4 && g.o == 4 && g.m == 1) {
                    FinalWindow FinalWindow = new FinalWindow();
                }

            }
        });
    }

    public void Window9() {
        Window9 window9 = new Window9();
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
