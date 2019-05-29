/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oso;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author estudiantes
 */
public class panel extends JPanel {

    public void panel() {
        this.setSize(500, 500);
    }

    @Override
    public void paintComponent(Graphics gg) {
        Graphics2D g = (Graphics2D) gg;
                g.setStroke(new BasicStroke(3));
              
        int x = 250;
        int y = 250;
        
        circulo p = new circulo(0, 0, 0, Color.yellow);
        p = p.setCirculo(new circulo(100, x - 100, y - 100, Color.black), g);
        System.out.println("1");
        p = p.setCirculo(new circulo(40, x - 40, y, Color.DARK_GRAY), g);
        System.out.println("2");
        p = p.setCirculo(new circulo(25, x - 25, y + 25, Color.black), g);
        System.out.println("3");
        p = p.setCirculo(new circulo(30, x-60, y-55, Color.white), g);
        System.out.println("4");
        p = p.setCirculo(new circulo(30, x, y - 55, Color.white), g);
        System.out.println("5");
        p = p.setCirculo(new circulo(20, x+5, y-35, Color.black), g);
        System.out.println("6");
        p = p.setCirculo(new circulo(20, x-45, y-35, Color.black), g);
        System.out.println("7");
        p = p.setCirculo(new circulo(50, x-155 , y-155 , Color.black), g);
        System.out.println("8");
        p = p.setCirculo(new circulo(30, x - 120, y - 120, Color.pink), g);
        System.out.println("9");
        p = p.setCirculo(new circulo(50, x+55 , y-155 , Color.black), g);
        System.out.println("10");
        p = p.setCirculo(new circulo(30, x + 60, y - 120, Color.pink), g);
        System.out.println("11");
    }

}

