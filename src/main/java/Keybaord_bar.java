import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.net.ssl.CertPathTrustManagerParameters;
import javax.sound.sampled.*; // for sounds
import java.util.*;
import java.util.Random;
import java.io.*;
import javax.swing.border.*;

class Keyboard_bar {
    private JTextArea typearea;
    private int width, height;

    public Keyboard_bar() {
        typearea = new JTextArea();
        typearea.setBounds(50, 100, 500, 30);
        typearea.setFont(new Font("SanSerif", Font.BOLD, 25));
        // typearea.grabFocus();
        typearea.addKeyListener(new KeyListener() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                    System.out.println("Hello world");
                }
            }

            public void keyTyped(KeyEvent e) {
            }

            public void keyReleased(KeyEvent e) {
            }
        });
    }

    public JTextArea getTypearea() {
        return typearea;
    }

    public void setPane(JLabel x) {
        x.add(typearea);
    }

    public void setposition(int x, int y) {
        typearea.setBounds(x, y, width, height);
    }
}