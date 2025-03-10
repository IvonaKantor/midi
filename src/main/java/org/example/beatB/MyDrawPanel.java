package org.example.beatB;
import java.awt.*;
import javax.swing.*;

public class MyDrawPanel extends JPanel{
    public void paintComponent(Graphics g){
        g.setColor(Color.orange);
        g.fillRect(20,50,100,100);

        g.fillRect(0,0,this.getWidth(),this.getHeight());

        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);

        Color randomColor  = new Color(red, green, blue);
        g.setColor(randomColor);
        g.fillOval(70, 70, 100, 100);
    }

    
    public static void Graphics2D(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

        GradientPaint gradient = new GradientPaint(70, 70, Color.blue, 150, 150,Color.orange);
        
        g2d.setPaint(gradient);
        g2d.fillOval(70, 70, 100, 100);
    }


    public void Graphics2D_2(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        
        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        Color startcolor = new Color(red, green, blue);
        
        red = (int) (Math.random() * 255);
        green = (int) (Math.random() * 255);
        blue = (int) (Math.random() * 255);
        Color endcolor = new Color(red, green, blue);
        
        GradientPaint gradient = new GradientPaint(70, 70, startcolor, 150, 150, endcolor);
        g2d.setPaint(gradient);
        g2d.fillOval(70, 70, 100, 100);
        
    }


}
