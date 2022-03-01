
package Logica;

import Datos.vrutas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class frutas {
    private conexion mysql=new conexion();
    private Connection cn=mysql.conectar();
    private String sSQL="";
    public Integer totalregistros;
    
    public void mostrarLimites(JTextField lm){
        lm.setText("");
        
        sSQL="SELECT idrutas,limite FROM rutas ORDER BY idrutas desc LIMIT 1";
        
        try{
           Statement st = cn.createStatement();
           ResultSet rs =st.executeQuery(sSQL);
           
           while(rs.next()){
               lm.setText(rs.getString("limite"));
           }
            
        }catch(Exception e){
           JOptionPane.showConfirmDialog(null, e);
        }
    }
    
    public void mostrarCombobox(JComboBox rutas,JLabel origen){
        rutas.removeAllItems();
        
        sSQL="SELECT idrutas,origen FROM rutas ORDER BY idrutas desc LIMIT 1";
        
        try{
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            
            while(rs.next()){
                rutas.addItem(rs.getString("origen"));
                origen.setText(rs.getString("origen"));
            }
        }catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
        }
        
    }
    
    public void mostrarComboboxPrecio(JComboBox precio){
        precio.removeAllItems();
        
        sSQL="SELECT idprecio_rutas,precio FROM precio_rutas ORDER BY idprecio_rutas LIMIT 4";
        
        try{
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            
            while(rs.next()){
                precio.addItem(rs.getString("precio"));
            }
        }catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
        }
        
    }
    
    public DefaultTableModel mostrar(String buscar){
        
        DefaultTableModel modelo;
        
        String[] titulos ={"ID","Origen","Destino","Limite"};
        
        String[] registro = new String[4];
        
        totalregistros = 0;
        
        modelo = new DefaultTableModel(null,titulos);
        
        sSQL = "select * from rutas where destino like '%" + buscar + "%' order by idrutas desc"; 
        
        try{
            
           Statement st = cn.createStatement();
           ResultSet rs = st.executeQuery(sSQL);
           
           while(rs.next()){
              registro[0] = rs.getString("idpersona");
              registro[1] = rs.getString("origen");
              registro[2] = rs.getString("destino");
              registro[3] = rs.getString("limite");  
           }
           
           
           totalregistros = totalregistros + 1;
           modelo.addRow(registro);
           
        }catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
        return modelo;
    }
    
    public boolean insertar(vrutas dts){
        sSQL="insert into rutas(origen,destino,limite)"
            +"values(?,?,?)";
        
        try{
            PreparedStatement pst = cn.prepareStatement(sSQL);
            
            pst.setString(1, dts.getOrigen());
            pst.setString(2, dts.getDestino() );
            pst.setString(3, dts.getLimite());
            
            int n= pst.executeUpdate();
            
            if(n!=0){
                return true;
            }else{
                return false;
            }
                
        
        }catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    
}
