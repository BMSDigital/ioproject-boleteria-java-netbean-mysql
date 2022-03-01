package Logica;

import Datos.vusuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class fusuario {
    private conexion mysql = new conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    private String sSQL2 = "";
    public Integer totalregistros;

    
    public DefaultTableModel mostrar(String buscar,String filtro){
        
        DefaultTableModel modelo;
        
        String[] titulos={"Id","Nombre","Apellido","Telf","Email","Login","Password","nivel","Previlegio"};
        
        String[] registro=new String[9];
        
        totalregistros = 0;
        
        modelo = new DefaultTableModel(null,titulos);
        
        if(filtro.equalsIgnoreCase("NOMBRE")){
        sSQL = "select u.user,u.pass,u.nivel,u.privilegio,"
                + "p.idpersona,p.nombre,p.apellido,p.telf,p.email from persona p inner join usuario u "
                + "on p.idpersona=u.idpersona where nombre like '%"
                + buscar + "%'";
        }else if(filtro.equalsIgnoreCase("APELLIDO")){
        sSQL = "select u.user,u.pass,u.nivel,u.privilegio,"
                + "p.idpersona,p.nombre,p.apellido,p.telf,p.email from persona p inner join usuario u "
                + "on p.idpersona=u.idpersona where apellido like '%"
                + buscar + "%'";
        }else if(filtro.equalsIgnoreCase("TELEFONO")){
        sSQL = "select u.user,u.pass,u.nivel,u.privilegio,"
                + "p.idpersona,p.nombre,p.apellido,p.telf,p.email from persona p inner join usuario u "
                + "on p.idpersona=u.idpersona where telf like '%"
                + buscar + "%'";
        }else if(filtro.equalsIgnoreCase("EMAIL")){
        sSQL = "select u.user,u.pass,u.nivel,u.privilegio,"
                + "p.idpersona,p.nombre,p.apellido,p.telf,p.email from persona p inner join usuario u "
                + "on p.idpersona=u.idpersona where email like '%"
                + buscar + "%'";
        }else if(filtro.equalsIgnoreCase("USUARIO")){
        sSQL = "select u.user,u.pass,u.nivel,u.privilegio,"
                + "p.idpersona,p.nombre,p.apellido,p.telf,p.email from persona p inner join usuario u "
                + "on p.idpersona=u.idpersona where user like '%"
                + buscar + "%'";
        }else if(filtro.equalsIgnoreCase("NIVEL")){
        sSQL = "select u.user,u.pass,u.nivel,u.privilegio,"
                + "p.idpersona,p.nombre,p.apellido,p.telf,p.email from persona p inner join usuario u "
                + "on p.idpersona=u.idpersona where nivel like '%"
                + buscar + "%'";
        }else if(filtro.equalsIgnoreCase("PREVILEGIO")){
        sSQL = "select u.user,u.pass,u.nivel,u.privilegio,"
                + "p.idpersona,p.nombre,p.apellido,p.telf,p.email from persona p inner join usuario u "
                + "on p.idpersona=u.idpersona where privilegio like '%"
                + buscar + "%'";
        }
        
        try{
            Statement st = cn.createStatement();
            ResultSet rt = st.executeQuery(sSQL);
            
            while(rt.next()){
                registro[0] = rt.getString("idpersona");
                registro[1] = rt.getString("nombre");
                registro[2] = rt.getString("apellido");
                registro[3] = rt.getString("telf");
                registro[4] = rt.getString("email");
                registro[5] = rt.getString("user");
                registro[6] = rt.getString("pass");
                registro[7] = rt.getString("nivel");
                registro[8] = rt.getString("privilegio");
                
                totalregistros = totalregistros + 1;
                modelo.addRow(registro);
            }
            return modelo;
            
        }catch(Exception e){
            
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }  
    }
    
    public boolean insertar(vusuario dts){
        sSQL  = "insert into persona(nombre,apellido,telf,email)"
               +"values (?,?,?,?)";
        
        sSQL2 = "insert into usuario(idpersona,user,pass,nivel,privilegio)"
               +"values ((select idpersona from persona order by idpersona desc limit 1),?,?,?,?)";
        
        try{
            
            PreparedStatement pst  = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);
            
            pst.setString(1, dts.getNombre());
            pst.setString(2, dts.getApellido());
            pst.setString(3, dts.getTelf());
            pst.setString(4, dts.getEmail());
            
            pst2.setString(1, dts.getUser());
            pst2.setString(2, dts.getPass());
            pst2.setString(3, dts.getNivel());
            pst2.setString(4, dts.getPrivilegio());
            
            int n=pst.executeUpdate();
            
            if(n!=0){
                
                int n2 = pst2.executeUpdate();
                
                if(n2!=0){
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
            
        }catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    
    public boolean editar(vusuario dts){
        sSQL = "update persona set nombre=?, apellido=?, telf=?, email=?"
                + "where idpersona";
        
       sSQL2 = "update usuario set user=?, pass=?, nivel=?, privilegio=?"
                + "where idpersona";
       
       try{
       
           PreparedStatement pst = cn.prepareStatement(sSQL);
           PreparedStatement pst2 = cn.prepareStatement(sSQL2);
           
           pst.setString(1, dts.getNombre());
           pst.setString(2, dts.getApellido());
           pst.setString(3, dts.getTelf());
           pst.setString(4, dts.getEmail());
           pst.setInt(5, dts.getIdpersona());
           
           pst2.setString(1, dts.getUser());
           pst2.setString(2, dts.getPass());
           pst2.setString(3, dts.getNivel());
           pst2.setString(4, dts.getPrivilegio());
           pst2.setInt(5, dts.getIdpersona());
           
           int n=pst.executeUpdate();
            
            if(n!=0){
                
                int n2 = pst2.executeUpdate();
                
                if(n2!=0){
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
       }catch(Exception e){
          JOptionPane.showConfirmDialog(null, e);
          return false;
       }
    }

    public boolean eliminar(vusuario dts){
        sSQL = "delete from usuarios where idpersona=?";
       sSQL2 = "delete from persona  where idpersona=?";
       
       try{
           
           PreparedStatement pst  = cn.prepareStatement(sSQL);
           PreparedStatement pst2 = cn.prepareStatement(sSQL2);
           
           pst.setInt(1, dts.getIdpersona());
          pst2.setInt(1, dts.getIdpersona());
          
          int n = pst.executeUpdate();
          
          if(n != 0){
              
              int n2 = pst2.executeUpdate();
              
              if(n2 != 0){
                  
                 return true;
                 
              }else{
                  
                 return false;
                 
              }
          }else{
              
             return false;
             
          }
       }catch(Exception e){
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
    }

     public DefaultTableModel login(String login, String pasword) {
        DefaultTableModel modelo;
        
        String[] titulos = {"ID","Nombre","Login","Password","Nivel","Previlegio"};

        String[] registro = new String[6];

        totalregistros = 0;
        
        modelo = new DefaultTableModel(null, titulos);

         sSQL = "select c.user,c.pass,c.nivel,c.privilegio,"
                + "g.idpersona,g.nombre from persona g inner join usuario c "
                + "on g.idpersona=c.idpersona where c.user='"
                + login + "' and c.pass='" + pasword + "' and c.privilegio='Activado'";
         
         
        try {
            Statement st = cn.createStatement();
            ResultSet rt = st.executeQuery(sSQL);

            while (rt.next()) {
                registro[0] = rt.getString("idpersona");
                registro[1] = rt.getString("nombre");
                registro[2] = rt.getString("user");
                registro[3] = rt.getString("pass");
                registro[4] = rt.getString("nivel");
                registro[5] = rt.getString("privilegio");
                

                ++totalregistros;
                modelo.addRow(registro);
            }

            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }
     
     public void mostrarLogin(JLabel lg){
        sSQL="SELECT idpersona,user FROM usuario ORDER BY idpersona desc LIMIT 1";
        
        try{
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            
            while(rs.next()){
                lg.setText(rs.getString("user"));
            }
        }catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
        }
    }
   
}
