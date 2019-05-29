/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oso;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author estudiantes
 */
public class circulo extends partes{
    circulo c;
    int radio;
    int x;
    int y;
    Color color;

    public circulo(int radio, int x, int y, Color color) {
        this.radio = radio;
        this.x = x;
        this.y = y;
        this.color = color;
    }
    
    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    public void dibujar(Graphics g){
        g.setColor(c.color);
        g.fillOval(c.x, c.y, c.radio*2, c.radio*2);
        System.out.println(x);
        System.out.println(y);
    }

    @Override
    public circulo setCirculo(circulo c,Graphics g) {
        this.c=c;
        this.dibujar(g);
        return this.c;
    }
    
}
