/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oso;

import javax.swing.JFrame;

/**
 *
 * @author estudiantes
 */
public class frame extends JFrame{
    
    
    public frame(){
        panel p = new panel();
        this.setSize(500, 500);
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        this.add(p);
        
        this.setVisible(true);
    }
    
}
