// The Useless Button; written by Timo Heidutzek (trzyglow)

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.lang.reflect.UndeclaredThrowableException.*;

public class the_useless_button extends JPanel {
    private JLabel headl;
    private JButton mbtn;

    public the_useless_button() {

        headl = new JLabel("The Useless Button");
        mbtn = new JButton("");

        mbtn.setToolTipText("This button is indeed very useless");

        setPreferredSize(new Dimension(256, 256));
        setLayout(null);

        add(headl);
        add(mbtn);

        headl.setBounds(72, 105, 112, 11);
        mbtn.setBounds(57, 125, 142, 25);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("The Useless Button");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(new the_useless_button());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setAlwaysOnTop(true);
    }
}