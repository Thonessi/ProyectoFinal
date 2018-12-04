/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.stream.IntStream;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Thonessi
 */
public class PagPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form PagPrincipal
     */
    String lsnombreArchivoInicioSesion = "verificacion_usuario.txt";
    String lsnombreArchivoLOGInicioSesion = "log_ingreso.txt";
    
    public boolean flag_final = false;
    public final JPanel panel = new JPanel();
    
    public PagPrincipal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        registrar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        ingreso_sistema = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        numero_usuario = new javax.swing.JTextField();
        contrasena = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Número de usuario");

        jLabel3.setText("Contraseña");

        jLabel4.setText("¿No está registrado en el sistema? Por favor acceda al siguiente enlace");

        registrar.setText("REGISTRARSE");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        jButton4.setText("Salir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        ingreso_sistema.setText("Ingreso al sistema");
        ingreso_sistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingreso_sistemaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Gadugi", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Bienvenido al sistema TestiCash   ");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        numero_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero_usuarioActionPerformed(evt);
            }
        });

        contrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contrasenaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(registrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(25, 25, 25))))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ingreso_sistema, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numero_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contrasena, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(numero_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ingreso_sistema)
                .addGap(34, 34, 34)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrar)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingreso_sistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingreso_sistemaActionPerformed

        ClsConnectionBL ConnectionBL = new ClsConnectionBL();
        ConnectionBL.QueryPrincipal(numero_usuario.getText().toUpperCase(),contrasena.getText());
        dispose();
        System.out.println(flag_final + " " +numero_usuario.getText());
        if (numero_usuario.getText().equals("")){
            JOptionPane.showMessageDialog(panel, "Digite algún número de usuario correcto \n No olvide agregar la contraseña", "WARNING", JOptionPane.WARNING_MESSAGE);
        }
        else{
            //JOptionPane.showMessageDialog(panel, "El usuario: "+numero_usuario.getText()+" no existe en el sistema\n digite sus credenciales correctamente", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ingreso_sistemaActionPerformed
    
    public void logIngreso(String variable_usuario, String contraseña_usuario,boolean flag_usuario,boolean flag_contraseña) throws IOException{
        Logger logger = Logger.getLogger("MyLog");  
        FileHandler fh;  

        try {  
            // This block configure the logger with handler and formatter  
            fh = new FileHandler("LogIngreso.log",true);  
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();  
            //fh.setFormatter(formatter);  
            // Log de ingreso al sistema
            if (flag_usuario==true && flag_contraseña==true){
                logger.log(Level.INFO, "El usuario {0} ingres\u00f3 al sistema correctamente", variable_usuario.toUpperCase());
            }
            else {
                if (flag_usuario==true && flag_contraseña==false){
                    logger.log(Level.WARNING, "El usuario {0} intent\u00f3 ingresar al sistema, pero su contrase\u00f1a era incorrecta", variable_usuario.toUpperCase());
                }
                else{
                    if (flag_usuario==false&& flag_contraseña==false){
                    logger.log(Level.WARNING, "Existe un usuario utilizando el identificador {0}, pero no se encuentra en nuestros registros", variable_usuario.toUpperCase());
                }
                }
            }
        } 
        catch (SecurityException e) { 
            System.out.println(e);
        } 
    }
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        // TODO add your handling code here:
        new Registrarse().setVisible(rootPaneCheckingEnabled);
        dispose();
    }//GEN-LAST:event_registrarActionPerformed

    private void numero_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numero_usuarioActionPerformed

    private void contrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contrasenaActionPerformed

    public void conexion_oracle_verificacion(String variable_usuario, String contraseña_usuario) {                                           
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","testicash","testicash")) {
                Statement st=con.createStatement();
                String sql_usuario = "select * from verificacion_usuario where idsistema = '"+variable_usuario.toUpperCase()+"'";
                ResultSet rs_usuario=st.executeQuery(sql_usuario);
                boolean flag_usuario=false;
                boolean flag_contraseña=false;
                while (rs_usuario.next()){
                    flag_usuario=true;
                    if (contraseña_usuario.equals(rs_usuario.getString(3))){
                        flag_contraseña=true;
                    }
                }
                if (flag_usuario==false) {
                    JOptionPane.showMessageDialog(panel, "Su usuario no está registrado"+"\n"+"Por favor digite uno correcto o utilice la opción de REGISTRARSE", "Error", JOptionPane.ERROR_MESSAGE);
                    try {
                        logIngreso(variable_usuario, contraseña_usuario,flag_usuario,flag_contraseña);
                    } 
                    catch (IOException ex) {
                        Logger.getLogger(PagPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    }                    
                }
                else{
                    if (flag_contraseña==false) {
                        JOptionPane.showMessageDialog(panel, "Su contraseña no es correcta"+"\n"+"Intente nuevamente", "Error", JOptionPane.ERROR_MESSAGE);
                        try {
                            logIngreso(variable_usuario, contraseña_usuario,flag_usuario,flag_contraseña);
                        } 
                        catch (IOException ex) {
                            Logger.getLogger(PagPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        if (flag_usuario==true && flag_contraseña==true){
                            JOptionPane.showMessageDialog(panel, "Bienvenido", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                            try {
                                logIngreso(variable_usuario, contraseña_usuario,flag_usuario,flag_contraseña);
                            } 
                            catch (IOException ex) {
                                Logger.getLogger(PagPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                            } 
                            flag_final=true;
                        }
                    }
                }
            }
            catch (Exception ex) {
                System.out.println(ex);
            }
        } 
        catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }                                          


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PagPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PagPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PagPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PagPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PagPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField contrasena;
    private javax.swing.JToggleButton ingreso_sistema;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField numero_usuario;
    private javax.swing.JButton registrar;
    // End of variables declaration//GEN-END:variables
}
