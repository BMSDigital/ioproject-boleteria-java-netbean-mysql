package Ajustes;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import java.util.Calendar;
import java.awt.AWTKeyStroke;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.Date;
import javafx.scene.input.KeyCode;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerModel;
import javax.swing.table.TableColumn;


public class Validaciones {
    Calendar calendar = Calendar.getInstance();
    
    public void limpiar1(JButton n){
       n.setBackground( new java.awt.Color( 255, 255, 255, 175 ) );
    }
    public void limpiar2(JButton n){
       n.setBackground( new java.awt.Color( 255, 255, 255, 175 ) );
    }
    
   public void valEsp(JDateChooser  h){
        if (h.getDate() == null) {
            //h.setBorder(BorderFactory.createEtchedBorder(Color.red, Color.red));
        }else{
            h.setBorder(BorderFactory.createEtchedBorder(Color.WHITE, Color.WHITE));
        }
    }
    
    
    public void valEsp(JSpinner h){
        if (h.getValue().equals(0)) {
            h.setBorder(BorderFactory.createEtchedBorder(Color.red, Color.red));
        }else {
            h.setBorder(BorderFactory.createEtchedBorder(Color.gray, Color.gray));
        }
    }
    public void valEsp(JTextField nodo) {
        if (nodo.getText().equals("")) {
            nodo.setBorder(BorderFactory.createEtchedBorder(Color.red, Color.red));
            nodo.requestFocus();
        } else {
            nodo.setBorder(BorderFactory.createEtchedBorder(Color.WHITE, Color.WHITE));
        }
    }

    public void valEsp(JComboBox lista) {
        if (lista.getModel().getSelectedItem().equals("--")) {
            lista.setBorder(BorderFactory.createEtchedBorder(Color.red, Color.red));
            lista.requestFocus();
            return;
        } else {
            lista.setBorder(BorderFactory.createEtchedBorder(Color.gray, Color.gray));
        }
    }
    
    public void valEsp(JTextArea lista) {
        if (lista.getText().length() == 0) {
            lista.setBorder(BorderFactory.createEtchedBorder(Color.red, Color.red));
            lista.requestFocus();
            return;
        } else {
            lista.setBorder(BorderFactory.createEtchedBorder(Color.GRAY, Color.GRAY));
        }
    }
    public void valEsp2(JComboBox lista2) {
        if (lista2.getModel().getSelectedItem().equals("SELECIONAR")) {
            lista2.setBorder(BorderFactory.createEtchedBorder(Color.red, Color.red));
            lista2.requestFocus();
            return;
        } else {
            lista2.setBorder(BorderFactory.createEtchedBorder(Color.GRAY, Color.GRAY));
        }
    }
    public void valEsp3(JComboBox lista2) {
        if (lista2.getModel().getSelectedItem().equals("CANTIDAD")) {
            lista2.setBorder(BorderFactory.createEtchedBorder(Color.red, Color.red));
            lista2.requestFocus();
            return;
        } else {
            lista2.setBorder(BorderFactory.createEtchedBorder(Color.GRAY, Color.GRAY));
        }
    }
    

    public void digitos(KeyEvent e) {
        int k = (int) e.getKeyChar();
        char c = e.getKeyChar();
        if((k >= 97 && k <= 122) || (k >= 65 && k <= 90)){
           e.setKeyChar((char)KeyEvent.VK_CLEAR);
        }
        
        if((k >= 32 && k <= 47) || (k >= 58 && k <= 64) || (k >= 91 && k <= 96) || (k >= 123 && k <= 126)){
           Toolkit.getDefaultToolkit().beep();
           e.setKeyChar((char)KeyEvent.VK_CLEAR);
        }
        //para validar caracteres raros que no se puede validar normalmente
        if((c == '?')||(c == '¡') ||(c == 'ñ')||(c == 'Ñ') || (c == '´')||(c == 'ç') ||  (c == 'º')||(c == 'ª') || (c == '·')||(c == '☺')){
           Toolkit.getDefaultToolkit().beep();
           e.setKeyChar((char)KeyEvent.VK_CLEAR);
        }
     
    }

    public void letras(KeyEvent e) {
        int k = (int) e.getKeyChar();
        char c = e.getKeyChar();
        if(k >= 48 && k <= 57){
           e.setKeyChar((char)KeyEvent.VK_CLEAR);
        }
        
        if((k >= 33 && k <= 47) || (k >= 58 && k <= 64) || (k >= 91 && k <= 96) || (k >= 123 && k <= 126)){
           Toolkit.getDefaultToolkit().beep();
           e.setKeyChar((char)KeyEvent.VK_CLEAR);  
        }
        //para validar caracteres raros que no se puede validar normalmente
        if((c == '?')||(c == '¡') || (c == '´')||(c == 'ç') ||  (c == 'º')||(c == 'ª') || (c == '·')||(c == '☺')){
           Toolkit.getDefaultToolkit().beep();
           e.setKeyChar((char)KeyEvent.VK_CLEAR);
        }
       
    }
    
    public void teclasEspeciales(KeyEvent e,JTextField n){
        int k = (int) e.getKeyCode();
       if((k >= 1 && k <= 7)||( k>=14 && k <= 19) || ( k>=21 && k <= 31)){
          Toolkit.getDefaultToolkit().beep();
          n.setText(null);
          JOptionPane.showMessageDialog(null, "Error no se acepta caracteres especiales");
       }
       
    }
    public void espacioMaximo(JTextField n,KeyEvent e, int i ){
        if(n.getText().length() >= i){
           e.setKeyChar((char)KeyEvent.VK_CLEAR);
           JOptionPane.showMessageDialog(null,"Ha excedido el numero maximo de caracter ","Validando datos",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void ocultarColumna(JTable tabla) { 
       tabla.getColumnModel().getColumn(0).setMaxWidth(0);
       tabla.getColumnModel().getColumn(0).setMinWidth(0);
       tabla.getColumnModel().getColumn(0).setPreferredWidth(0);   
    }
    
    public void confColumna(JTable tabla){
        for(int i=1; i<=20; i++){
          tabla.getColumnModel().getColumn(0).setMaxWidth(0);
          tabla.getColumnModel().getColumn(0).setMinWidth(0);
          tabla.getColumnModel().getColumn(0).setPreferredWidth(0); 
          
          tabla.getColumnModel().getColumn(3).setMaxWidth(0);
          tabla.getColumnModel().getColumn(3).setMinWidth(0);
          tabla.getColumnModel().getColumn(3).setPreferredWidth(0);
          
          tabla.getColumnModel().getColumn(4).setMaxWidth(0);
          tabla.getColumnModel().getColumn(4).setMinWidth(0);
          tabla.getColumnModel().getColumn(4).setPreferredWidth(0); 
          
          tabla.getColumnModel().getColumn(6).setMaxWidth(0);
          tabla.getColumnModel().getColumn(6).setMinWidth(0);
          tabla.getColumnModel().getColumn(6).setPreferredWidth(0);
          
          tabla.getColumnModel().getColumn(7).setMaxWidth(0);
          tabla.getColumnModel().getColumn(7).setMinWidth(0);
          tabla.getColumnModel().getColumn(7).setPreferredWidth(0); 
          
          tabla.getColumnModel().getColumn(8).setMaxWidth(0);
          tabla.getColumnModel().getColumn(8).setMinWidth(0);
          tabla.getColumnModel().getColumn(8).setPreferredWidth(0); 
       
          tabla.getColumnModel().getColumn(22).setMaxWidth(0);
          tabla.getColumnModel().getColumn(22).setMinWidth(0);
          tabla.getColumnModel().getColumn(22).setPreferredWidth(0); 
          
          tabla.getColumnModel().getColumn(23).setMaxWidth(0);
          tabla.getColumnModel().getColumn(23).setMinWidth(0);
          tabla.getColumnModel().getColumn(23).setPreferredWidth(0);
          
          tabla.getColumnModel().getColumn(24).setMaxWidth(0);
          tabla.getColumnModel().getColumn(24).setMinWidth(0);
          tabla.getColumnModel().getColumn(24).setPreferredWidth(0);

          
          tabla.getColumnModel().getColumn(i).setMaxWidth(55);
          tabla.getColumnModel().getColumn(i).setMinWidth(55);
          tabla.getColumnModel().getColumn(i).setPreferredWidth(55);
          tabla.setRowHeight(20);
        }
         
    }
    
      public void confColumna2(JTable tabla){
        for(int i=1; i<=20; i++){
          tabla.getColumnModel().getColumn(0).setMaxWidth(0);
          tabla.getColumnModel().getColumn(0).setMinWidth(0);
          tabla.getColumnModel().getColumn(0).setPreferredWidth(0); 
          
          tabla.getColumnModel().getColumn(1).setMaxWidth(0);
          tabla.getColumnModel().getColumn(1).setMinWidth(0);
          tabla.getColumnModel().getColumn(1).setPreferredWidth(0);
          
          tabla.getColumnModel().getColumn(2).setMaxWidth(0);
          tabla.getColumnModel().getColumn(2).setMinWidth(0);
          tabla.getColumnModel().getColumn(2).setPreferredWidth(0); 
          
          tabla.getColumnModel().getColumn(3).setMaxWidth(0);
          tabla.getColumnModel().getColumn(3).setMinWidth(0);
          tabla.getColumnModel().getColumn(3).setPreferredWidth(0);
          
          tabla.getColumnModel().getColumn(4).setMaxWidth(0);
          tabla.getColumnModel().getColumn(4).setMinWidth(0);
          tabla.getColumnModel().getColumn(4).setPreferredWidth(0); 
          
          tabla.getColumnModel().getColumn(10).setMaxWidth(0);
          tabla.getColumnModel().getColumn(10).setMinWidth(0);
          tabla.getColumnModel().getColumn(10).setPreferredWidth(0); 
       
          tabla.getColumnModel().getColumn(11).setMaxWidth(0);
          tabla.getColumnModel().getColumn(11).setMinWidth(0);
          tabla.getColumnModel().getColumn(11).setPreferredWidth(0); 
          
          tabla.getColumnModel().getColumn(12).setMaxWidth(0);
          tabla.getColumnModel().getColumn(12).setMinWidth(0);
          tabla.getColumnModel().getColumn(12).setPreferredWidth(0);
          
          tabla.getColumnModel().getColumn(15).setMaxWidth(0);
          tabla.getColumnModel().getColumn(15).setMinWidth(0);
          tabla.getColumnModel().getColumn(15).setPreferredWidth(0);
          
          tabla.getColumnModel().getColumn(16).setMaxWidth(0);
          tabla.getColumnModel().getColumn(16).setMinWidth(0);
          tabla.getColumnModel().getColumn(16).setPreferredWidth(0);
          
          tabla.getColumnModel().getColumn(17).setMaxWidth(0);
          tabla.getColumnModel().getColumn(17).setMinWidth(0);
          tabla.getColumnModel().getColumn(17).setPreferredWidth(0);
          
          tabla.getColumnModel().getColumn(18).setMaxWidth(0);
          tabla.getColumnModel().getColumn(18).setMinWidth(0);
          tabla.getColumnModel().getColumn(18).setPreferredWidth(0);
          
          tabla.getColumnModel().getColumn(19).setMaxWidth(0);
          tabla.getColumnModel().getColumn(19).setMinWidth(0);
          tabla.getColumnModel().getColumn(19).setPreferredWidth(0);
          
          tabla.getColumnModel().getColumn(i).setMaxWidth(55);
          tabla.getColumnModel().getColumn(i).setMinWidth(55);
          tabla.getColumnModel().getColumn(i).setPreferredWidth(55);
          tabla.setRowHeight(20);
        }
         
    }

}
