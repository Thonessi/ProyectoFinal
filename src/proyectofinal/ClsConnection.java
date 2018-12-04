package proyectofinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class ClsConnection {
    public ResultSet pirs;
    public String piId;
    public String psNombre;
    public String psApellidos;
    public String piTelefono;
    public String psDireccion;
    public double pdSaldo;
    
    public void QueryClientes(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","testicash","testicash");
            Statement st=con.createStatement();
            String sql = "select * from verificacion_usuario2";
            ResultSet rs=st.executeQuery(sql);
            pirs=rs;
//            while (rs.next()){
//                piId=rs.getString(1);
//                psNombre=rs.getString(2);
//                psApellidos=rs.getString(3);
//                piTelefono=rs.getString(4);
//                psDireccion=rs.getString(5);
//                pdSaldo=rs.getInt(6);                
//                System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
//            }    
        }
        catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }
    
//    public void ConstruClientes(int tiID,String tsNombre, String tsApellidos, int tiTelefono, String tsDireccion, double tdSaldo){
//        piId=tiID;
//        psNombre=tsNombre;
//        psApellidos=tsApellidos;
//        piTelefono=tiTelefono;
//        psDireccion=tsDireccion;
//        pdSaldo=tdSaldo;
//    }

    public ResultSet iRs(){
        return pirs;
    }
    public String iID(){
        return piId;
    }
    public String sNombre(){
        return psNombre;
    }
    public String sApellidos(){
        return psApellidos;
    }
    public String iTelefono(){
        return piTelefono;
    }
    public String sDireccion(){
        return psDireccion;
    }
    public double sSaldo(){
        return pdSaldo;
    }
    
}
