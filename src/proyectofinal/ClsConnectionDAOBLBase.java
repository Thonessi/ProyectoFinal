/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Thonessi
 */
public class ClsConnectionDAOBLBase {
    private String psConnectionDB;
    final JPanel panel = new JPanel();
    
    public String QueryClientes(String registroid, String registrotelefono){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","testicash","testicash");
            Statement st=con.createStatement();
            String sql = "SELECT * FROM informacion_usuario";
            System.out.println(sql);
            ResultSet rs=st.executeQuery(sql);
            while (rs.next()){
                System.out.println(registroid+" "+rs.getString(2));
                if (registroid.equals(rs.getString(2))) {
                    JOptionPane.showMessageDialog(panel, "El número de identificación: "+registroid+" ya existe en el sistema \n Ingrese uno diferente para el registro", "ERROR", JOptionPane.ERROR_MESSAGE);   
                    break;
                }
                else{
                    if (registrotelefono.equals(rs.getString(6))) {
                        JOptionPane.showMessageDialog(panel, "El número de teléfono: "+registrotelefono+" ya existe en el sistema \n Ingrese uno diferente para el registro", "ERROR", JOptionPane.ERROR_MESSAGE);
                        break;
                    }
                    else{
                        JOptionPane.showMessageDialog(panel, "El fue exitosamente registrado en el sistema \n Para ingresar presione SALIR y digite sus credenciales", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    }
                }
                //System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6));
            }    
        }
        catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return null;
    }        
}
