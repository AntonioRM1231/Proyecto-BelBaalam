/*
 * COMENTARIO A LAS 10:44 06-05
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * COMENTARIO DE PRUEBA EN PANEL REGISTRO 
 */
package beelbalam1;

import java.awt.event.ItemEvent;
import javax.swing.*;
import java.sql.*;

/**
 *
 * @author Anahi SC
 */
public class PanelRegistro extends javax.swing.JPanel {

    /**
     * Creates new form PanelRegistro
     */
    PanelTarjeta panelTarjeta;
    
    //PARA ALMACENAR LOS DATOS DEL NUEVO USUARIO 
    //public ProcCrearUsuario paCrearUsuario = new ProcCrearUsuario(); 
    public static String nUsuario;
    public static String cont;
    public static String numCel;
    public static String correo; 
    
    public PanelRegistro() {
        initComponents();
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnAgregarTarjeta = new javax.swing.JButton();
        txtNombreUsuario = new javax.swing.JTextField();
        txtContrasenia = new javax.swing.JPasswordField();
        txtCorreo = new javax.swing.JTextField();
        txtNumCelular = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 0, 204));

        jLabel1.setText("NOMBRE DE USUARIO:");

        jLabel2.setText("CONTRASEÑA:");

        jLabel3.setText("CORREO ELECTRÓNICO:");

        jLabel4.setText("REGISTRATE EN BEEL BALAM");

        jLabel5.setText("NÚMERO DE CELULAR:");

        btnAgregarTarjeta.setText("AGREGAR DATOS DE TARJETA");
        btnAgregarTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarTarjetaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(btnAgregarTarjeta)))
                .addContainerGap(202, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNumCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btnAgregarTarjeta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarTarjetaActionPerformed
        //PARA RECUPERAR LOS DATOS DEL NUEVO USUARIO
        boolean test = false;
        if((txtNombreUsuario.getText().length()>25)||
                txtNombreUsuario.getText().isEmpty()||
                (txtCorreo.getText().length()>35)||
                (txtCorreo.getText().isEmpty())||
                (txtNumCelular.getText().length()>14)||
                (txtNumCelular.getText().isEmpty())||
                (txtContrasenia.getText().length()>17)||
                (txtContrasenia.getText().isEmpty())){
            JOptionPane.showMessageDialog(null, "¡Error! Alguno o varios datos son incorrectos (demasiado largo o vacio)");
            txtNombreUsuario.setText("");
            txtCorreo.setText("");
            txtNumCelular.setText("");
            txtContrasenia.setText("");
            test = true;
        }
        if(test == false){
            nUsuario = txtNombreUsuario.getText();
            cont = txtContrasenia.getText();
            numCel = txtNumCelular.getText();
            correo = txtCorreo.getText();
            //PARA VERIFICAR QUE EL USUARIO NO EXISTA
            try{
                try (Connection miConexion = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-KT6L84G:1433;databaseName=BEEL_BALAM", "sa", "2020640576") //2020640576
                ) {
                    CallableStatement resConexion;
                    resConexion = miConexion.prepareCall("{call VERIFICAR_USUARIO(?)}");
                    resConexion.setString(1,nUsuario);
                    ResultSet rs = resConexion.executeQuery();
                    if(rs.next()){
                        System.out.println("Ya existe ese usuario");
                        JOptionPane.showMessageDialog(null, "El usuario que ha ingresado ya existe, por favor intente con uno nuevo");
                        txtNombreUsuario.setText("");
                        txtCorreo.setText("");
                        txtNumCelular.setText("");
                        txtContrasenia.setText("");
                    }else{
                        //System.out.println("No existe ese usuario");
                        //PARA IR AL PANEL DE TARJETA
                        panelTarjeta = new PanelTarjeta();
                        panelTarjeta.setBounds(this.getBounds());
                        this.removeAll();
                        this.add(panelTarjeta);
                        this.updateUI();
                    }   
                    rs.close();
                    resConexion.close();
                    //JOptionPane.showMessageDialog(null, "Se ha agreago correctamente al usuario");
                }
            }catch(Exception e){
                System.out.println("Ha habido un error al crear al usuario 2 ");
                System.out.println(e);
            }
        }      
    }//GEN-LAST:event_btnAgregarTarjetaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarTarjeta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JPasswordField txtContrasenia;
    public javax.swing.JTextField txtCorreo;
    public javax.swing.JTextField txtNombreUsuario;
    public javax.swing.JTextField txtNumCelular;
    // End of variables declaration//GEN-END:variables
}
