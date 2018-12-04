/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.security.interfaces.RSAKey;
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
            }    
        }
        catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return null;
    }
    public String QueryPrincipal(String principalid, String principalpassword){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","testicash","testicash");
            Statement st=con.createStatement();
            String sql = "SELECT * FROM verificacion_usuario where idsistema = '"+principalid+"'";
            System.out.println(sql);
            ResultSet rs=st.executeQuery(sql);
            while (rs.next()){
                System.out.println(principalid+" "+rs.getString(2));
                if (principalid.equals(rs.getString(2)) && principalpassword.equals(rs.getString(3)) && (rs.getString(4).equals("1"))) {
                    JOptionPane.showMessageDialog(panel, "Bienvenido usuario: "+principalid, "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                    //System.out.println(PaginaPrincipal.flag_final);
                    if (principalid.matches("[A-Za-z]{1}[0-9]{2}")){
                        new PagAdministrador().setVisible(true);
                    }
                    else{
                        if (principalpassword.matches("[0-9]{3}")){
                            new PagUsuario().setVisible(true);
                        }
                    }
                    break;
                }
                            
                else{
                    if (principalid.equals(rs.getString(2)) && principalpassword.equals(rs.getString(3)) && (rs.getString(4).equals("0"))) {
                        JOptionPane.showMessageDialog(panel, "El usuario: "+principalid+" se encuentra actualmente inhabilitado \n Contacte al administrador para una revisión de su cuenta", "ERROR", JOptionPane.ERROR_MESSAGE);
                        break;
                    }
                    else{
                        if (principalid.equals(rs.getString(2)) && !principalpassword.equals(rs.getString(3))) {
                            JOptionPane.showMessageDialog(panel, "El usuario: "+principalid+" existe en nuestro sistema, pero \n la contraseña utilizada no coincide", "ERROR", JOptionPane.ERROR_MESSAGE);
                            break;
                        }
                    }
                }
            }    
        }
        catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return null;
    }
}
