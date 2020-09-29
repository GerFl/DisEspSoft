package modelo;

import java.sql.*;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class negostock {
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
            JOptionPane.showMessageDialog(null, "Producto guardado en la base de datos");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR DATOS VALIDOS"); 
           
        } 
    }
}
