package Window8;

import ColorFinal.ColorScheme;
import ColorFinal.Guessing;
import FinalWindow.FinalWindow;
import Window9.Window9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window8 extends JFrame implements ActionListener{
    Guessing g = new Guessing();
    ColorScheme cs = new ColorScheme();
    JLabel Voice;
    JButton Yes, No;

    public Window8() {
        setTitle("Akinator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1500, 980);
        setVisible(true);
        setLayout(null);
        getContentPane().setBackground(cs.getLightBlue());
        Voice = new JLabel("Does the person have a thin voice?");
        Voice.setBounds(0, 70, 20000, 70);
        Voice.setFont(new Font("Serif", Font.BOLD, 50));
        add(Voice);
        Yes = new JButton("Yes");
        Yes.setBackground(cs.getLightGreen());
        Yes.setBounds(400, 300, 200, 200);
        add(Yes);
        Yes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                g.iul();
                if (g.i == 4 && g.o == 3 && g.w == 1) {
                    FinalWindow FinalWindow = new FinalWindow();
                } else {
                    Window9 window9 = new Window9();
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
                if (g.i == 3 && g.o == 4 && g.w == 1) {
                    FinalWindow FinalWindow = new FinalWindow();
                } else {
                    Window9 window9 = new Window9();
                }

            }
        });
    }

    public void Window8() {
        Window8 window8 = new Window8();
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
