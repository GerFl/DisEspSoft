package modelo;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class nfactura {
    Conexion con=new Conexion();
   
    Connection conect=null;
    Statement st=null;
    ResultSet rs=null;
    String query;
    
    public void guardar(String tabla, String campos, String valores)
    {
        try {
            query="insert into "+tabla+" ("+campos+") values ("+valores+")";
            conect=con.getConnection();
            st=conect.createStatement();
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Factura guardada");
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR DATOS");  
        }
    }
}
