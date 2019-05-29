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
public abstract class partes {
    circulo c;
    
    public abstract  int getRadio() ;
    public abstract  void setRadio(int radio);
    public abstract  int getX();

    public abstract  void setX(int x);
    public abstract  int getY();
    public abstract  void setY(int y) ;
    public abstract  Color getColor();
    public abstract  void setColor(Color color);
    public abstract  void dibujar(Graphics g);
    public abstract circulo setCirculo(circulo c,Graphics g);
    
}
