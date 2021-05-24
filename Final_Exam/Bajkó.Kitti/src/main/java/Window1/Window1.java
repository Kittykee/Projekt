package Window1;

import ColorFinal.ColorScheme;
import Window2.Window2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window1 extends JFrame implements ActionListener {
    ColorScheme cs = new ColorScheme();
    JLabel welcoming;
    JButton yes, no;

    public Window1() {
        setTitle("Akinator");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(1500, 980);
        setVisible(true);
        setLayout(null);
        getContentPane().setBackground(cs.getLightBlue());
        welcoming = new JLabel("Hello! Do you want to be amazed?");
        welcoming.setBounds(300, 70, 1000, 70);
        welcoming.setFont(new Font("Serif", Font.BOLD, 50));
        add(welcoming);
        yes = new JButton("YES!");
        yes.setBackground(cs.getLightGreen());
        yes.setBounds(400, 300, 200, 200);
        add(yes);
        yes.addActionListener(e -> {
            Window2 w2 = new Window2();
        });

        no = new JButton("NO!");
        no.setBackground(cs.getLightRed());
        no.setBounds(800, 300, 200, 200);
        add(no);
        no.addActionListener(e -> System.exit(0));

    }

    public static void main(String[] args) {
        Window1 window1 = new Window1();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
