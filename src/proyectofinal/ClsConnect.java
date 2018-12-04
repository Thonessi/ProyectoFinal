/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

/**
 *
 * @author Thonessi
 */
class ClsConnect {
    private int piId;
    private String psNombre;
    private String psApellidos;
    private String psEmail;
    private int piTelefono;
    private String psDireccion;
    private double pdSaldo;
    
    public void ConstruConnect(String tsNombre, String tsApellidos, int tiID, String tsEmail, int tiTelefono, String tsDireccion, double tdSaldo){
        piId=tiID;
        psNombre=tsNombre;
        psApellidos=tsApellidos;
        psEmail=tsEmail;
        piTelefono=tiTelefono;
        psDireccion=tsDireccion;
        pdSaldo=tdSaldo;
    }
    
    public int iID(){
        return piId;
    }
    public String sNombre(){
        return psNombre;
    }
    public String sApellidos(){
        return psApellidos;
    }
    public String sEmai(){
        return psEmail;
    }
    public int iTelefono(){
        return piTelefono;
    }
    public String sDireccion(){
        return psDireccion;
    }
    public double sSaldo(){
        return pdSaldo;
    }    
}
