package Window3;

import ColorFinal.ColorScheme;
import ColorFinal.Guessing;
import FinalWindow.FinalWindow;
import Window4.Window4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window3 extends JFrame implements ActionListener {
    Guessing g = new Guessing();
    ColorScheme cs = new ColorScheme();
    JLabel labOrNo;
    JButton Lab, Course;

    public Window3() {
        setTitle("Akinator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1500, 980);
        setVisible(true);
        setLayout(null);
        getContentPane().setBackground(cs.getLightBlue());
        labOrNo = new JLabel("Is that person teaching a lab or a course?");
        labOrNo.setBounds(300, 70, 1000, 70);
        labOrNo.setFont(new Font("Serif", Font.BOLD, 50));
        add(labOrNo);
        Lab = new JButton("Lab");
        Lab.setBackground(cs.getLightGreen());
        Lab.setBounds(400, 300, 200, 200);
        add(Lab);
        Lab.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                g.oul();
                Window4 window4 = new Window4();
            }
        });
        Course = new JButton("Course");
        Course.setBackground(cs.getLightGreen());
        Course.setBounds(800, 300, 200, 200);
        add(Course);
        Course.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                g.iul();
                if (g.i == 2 && g.o == 0 && g.w == 1) {
                    FinalWindow FinalWindow = new FinalWindow();
                } else {
                    Window4 window4 = new Window4();
                }

            }
        });
    }

    public void thirdWindow() {
        Window3 window3 = new Window3();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
