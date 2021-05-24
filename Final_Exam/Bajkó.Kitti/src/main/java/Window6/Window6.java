package Window6;

import ColorFinal.ColorScheme;
import ColorFinal.Guessing;
import FinalWindow.FinalWindow;
import Window7.Window7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window6 extends JFrame implements ActionListener {
    Guessing g = new Guessing();
    ColorScheme cs = new ColorScheme();
    JLabel Project;
    JButton Yes, No;

    public Window6() {
        setTitle("Akinator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1500, 980);
        setVisible(true);
        setLayout(null);
        getContentPane().setBackground(cs.getLightBlue());
        Project = new JLabel("Did we presented a project already for that person?");
        Project.setBounds(0, 70, 20000, 70);
        Project.setFont(new Font("Serif", Font.BOLD, 50));
        add(Project);
        Yes = new JButton("Yes");
        Yes.setBackground(cs.getLightGreen());
        Yes.setBounds(400, 300, 200, 200);
        add(Yes);
        Yes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                g.iul();
                if (g.i == 3 && g.o == 2 && g.w == 1) {
                    FinalWindow finalWindow = new FinalWindow();
                } else {
                    Window7 window7 = new Window7();
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
                Window7 window7 = new Window7();


            }
        });
    }

    public void Window6() {
        Window6 window6 = new Window6();
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
