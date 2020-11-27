package modelo;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    Connection con=null;

    public  Conexion() {
        try{
            
            con=DriverManager.getConnection("jdbc:ucanaccess://Base de datos\\Database1.accdb");
            Statement atStatement=con.createStatement();
            
            
        }catch(HeadlessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, "conexión errónea"+e); 
        }  
    }
    public Connection getConnection()
    {
        return con;
    }

    public Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
    
 
