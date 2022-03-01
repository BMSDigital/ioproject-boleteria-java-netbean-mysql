
package Logica;

import Datos.vtrenes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ftrenes {
    private conexion mysql = new conexion();
    private Connection cn = mysql.conectar();
    private String sSQL="";
    public Integer totalregistros;
    
   public void mostrarHoraSalida(JComboBox aux){
         sSQL="SELECT idtrenes,tiempo_salida FROM trenes ORDER BY idtrenes desc LIMIT 1";
         aux.removeAllItems();
         
        try{
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            
            while(rs.next()){
                aux.addItem(rs.getString("tiempo_salida"));
            }
        }catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
        }
    
    }
    
    public void mostrarAsientos(JLabel aux){
         sSQL="SELECT asientos_normal+asientos_prefe as suma FROM trenes ORDER BY idtrenes desc LIMIT 1";
        
        try{
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            
            while(rs.next()){
                aux.setText(rs.getString("suma"));
            }
        }catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
        }
    
    }

    public void mostrarTren(JComboBox aux){
         sSQL="SELECT idtrenes,cod_tren FROM trenes ORDER BY idtrenes";
         aux.removeAllItems();
         
        try{
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            
            while(rs.next()){
                aux.addItem(rs.getString("cod_tren"));
            }
        }catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
        }
    
    }
    public DefaultTableModel mostrar(String buscar){
        DefaultTableModel modelo;
        
        String[] titulos = {"ID","Conductor","Tren","Turno","Tiempo salida"};
        
        String[] registro = new String[5];
        
        totalregistros = 0;
        
        modelo = new DefaultTableModel(null,titulos);
        
        sSQL = "select *from trenes where conductores like '%" + buscar + "%' order by idtrenes desc";
        
        try{
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            
            while(rs.next()){
                registro[0] = rs.getString("idtrenes");
                registro[1] = rs.getString("conductores");
                registro[2] = rs.getString("cod_tren");
                registro[3] = rs.getString("tiempo");
                registro[4] = rs.getString("tiempo_salida");
            }
            
            totalregistros = totalregistros +1;
                modelo.addRow(registro);
            
            
        }catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
        return modelo;
    }
    
    public boolean insertar(vtrenes dts){
        sSQL = "insert into trenes(conductores,cod_tren,tiempo_salida,asientos_normal,asientos_prefe)"
                + "values(?,?,?,?,?)";
        
        try{
            PreparedStatement pst = cn.prepareStatement(sSQL);
            
            pst.setString(1, dts.getConductores() );
            pst.setString(2, dts.getCod_tren());
            pst.setString(3, dts.getTiempo_salida());
            pst.setString(4, dts.getAsientos_normal());
            pst.setString(5, dts.getAsientos_prefe());
            
            int n = pst.executeUpdate();
            
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
