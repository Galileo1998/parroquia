/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parroquia_cristo_resucitado;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.Date;

/**
 *
 * @author Fabricio
 */
public class personas_BDIUDS 
{
    public void insert(String id,String nombres, String apellidos,Date fecha,int ev, int ea,int parro, int lugar,String correo,
    int sexo, String telefono,String direccion,String image)
    {
            basededatos bd=new basededatos();
            Statement stmt=null;
            ResultSet rs=null;
            bd.conexion();

            try
            {

                CallableStatement call=bd.con.prepareCall("{CALL insertar_personas(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}");
                call.setString(1, id);
                call.setString(2, nombres);
                call.setString(3, apellidos);
                call.setDate(4, fecha);
                call.setInt(5, ev);
                call.setInt(6, ea);
                call.setInt(7, parro);
                call.setInt(8, lugar);
                call.setString(9, correo);
                call.setInt(10, sexo);
                call.setString(11, telefono);
                call.setString(12, direccion);
                call.setString(13, image);
                call.execute();
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            
    }
    
}
