package Logica;

import Datos.vprecio_rutas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class fprecio_rutas {
    private conexion mysql = new conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    public Integer totalregistros;
    
    public DefaultTableModel mostrar(String buscar){
        
        DefaultTableModel modelo;
        
        String[] titulos = {"ID","Rutas","Destino","Tipo Pasaje","Precio","Desde","Hasta"};
        
        String[] registro = new String[7];
        
        totalregistros = 0;
        
        modelo = new DefaultTableModel(null, titulos);
        
        sSQL = "select * from precio_rutas where precio like '%" + buscar + "%' order by idprecio_rutas desc";
        
        try{
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            
            while(rs.next()){
                registro[0] = rs.getString("idprecio_rutas");
                registro[1] = rs.getString("rutas");
                registro[2] = rs.getString("destino");
                registro[3] = rs.getString("tipo_pasaje");
                registro[4] = rs.getString("precio");
                registro[5] = rs.getString("desde");
                registro[6] = rs.getString("hasta");
            }
            totalregistros = totalregistros +1;
            modelo.addRow(registro);
            
        }catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
        return modelo;
    }
    
    public boolean insertar(vprecio_rutas dts1){
        sSQL = "insert into precio_rutas(rutas,destino,tipo_pasaje,precio,desde,hasta)"
                + "values(?,?,?,?,?,?)";
        
        try{
            PreparedStatement pst = cn.prepareCall(sSQL);
            
            pst.setString(1, dts1.getRutas());
            pst.setString(2, dts1.getDestino());
            pst.setString(3, dts1.getTipo_pasaje());
            pst.setDouble(4, dts1.getPrecio());
            pst.setDate(5, dts1.getDesde());
            pst.setDate(6, dts1.getHasta());
            
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
