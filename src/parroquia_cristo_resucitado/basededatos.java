/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parroquia_cristo_resucitado;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Fabricio
 */
public class basededatos
{
    public Connection con=null;
    public Connection conexion()
    {
        try 
        {
               Class.forName("com.mysql.jdbc.Driver").newInstance();
        }
        catch (Exception ex) 
        {
               JOptionPane.showMessageDialog(null, "ERROR DE DRIVER");
        }
        try
        {
            String url = "jdbc:mysql://127.0.0.1:3306/parroquia_cristo_resucitado";
            String username = "root";
            String password = "Galileo1998";
            con = DriverManager.getConnection(url, username, password);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        return con;
    }
    

}
