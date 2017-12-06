package Game;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Display extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        g.drawLine(0,0, width, height);
        g.setColor(Color.YELLOW);
        g.fillOval(10,10,200,200);
        g.setColor(Color.red);
        g.fill3DRect(10,10,100,100,true);
    }
}