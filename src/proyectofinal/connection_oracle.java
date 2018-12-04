/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;
import java.sql.*;
import java.util.concurrent.ThreadLocalRandom;


/**
 *
 * @author Thonessi
 */
public class connection_oracle {
    public static void main(String[] args) {
        int rand = ThreadLocalRandom.current().nextInt(1,100);
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","testicash","testicash")) {
                Statement st=con.createStatement();
                String sql = "select * from verificacion_usuario";
                ResultSet rs=st.executeQuery(sql);
                //System.out.println(rs);
                while (rs.next()){
                    System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
                }
            }
        } 
        catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }
}
