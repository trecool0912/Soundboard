package components;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Soundboard extends JFrame implements KeyListener, ActionListener{

    JFrame UI = new JFrame("Soundboard");
    UI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    UI.addKeyListener(this);
    UI.pack();
    UI.setVisible(true);

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }        
        while(true){
            identifyKey();
        }
    }

    private void identifyKey() {
        key = keyPressed(KeyEvent e);
        switch (key.getKeyCode()) {
            case KeyEvent.VK_Q:
                playkeyQ();
                break;
        
            default:
                break;
        }
    } 

    private void playkeyQ() {
        //Verbindung zum SQL
    }
}
