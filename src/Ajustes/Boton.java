/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ajustes;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author FRAIBERT-BRACHO
 */
public class Boton extends JButton implements ActionListener{
    
    //constructor con parametros para posicionar a los botones
    public Boton(int pos_x, int pos_Y, int ancho, int alto){
    //se coloca el boton en un lugar y se le da un tamanio
    setBounds(pos_x,pos_Y,ancho,alto);
    //se agrega el action listener en este caso la misma clase
    addActionListener(this);
    }
    
    public void setNombre(int f, int c){
        setText( (f+1) + "," + (c+1) );
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        setBackground(Color.ORANGE);
    }
    
}
