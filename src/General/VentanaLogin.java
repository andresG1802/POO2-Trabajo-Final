/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package General;

import Administrador.Administrador;
import Cliente.InicioCliente;
import Cliente.VentanaRegistroCliente;
import Administrador.InicioAdmin;
import java.sql.*;
import javax.swing.JOptionPane;
import static trabajofinal.TrabajoFinal.cn;
import static trabajofinal.TrabajoFinal.cliente;
import static trabajofinal.TrabajoFinal.vendedor;
import static trabajofinal.TrabajoFinal.admin;
import static trabajofinal.TrabajoFinal.autenticacion;



import Cliente.Cliente;
import Vendedor.InicioVendedor;
import Vendedor.Vendedor;


/**
 *
 * @author Andres
 */
public class VentanaLogin extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public VentanaLogin() {
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

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usuarioField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        botonRegistrarse = new javax.swing.JButton();
        botonIniciarSesion1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 561, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/city-abstract-photography-pq.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 350, 870));

        jLabel2.setFont(new java.awt.Font("Britannic Bold", 1, 48)); // NOI18N
        jLabel2.setText("INICIAR SESION");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, 60));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText(" Contraseña");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 260, 30));

        usuarioField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        usuarioField.setText("Ingrese su documento");
        usuarioField.setBorder(null);
        usuarioField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usuarioFieldMousePressed(evt);
            }
        });
        usuarioField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioFieldActionPerformed(evt);
            }
        });
        jPanel3.add(usuarioField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 380, -1));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 432, 350, 0));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 330, 30));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, 330, 30));

        botonRegistrarse.setBackground(new java.awt.Color(0, 153, 153));
        botonRegistrarse.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botonRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        botonRegistrarse.setText("Registrarse");
        botonRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarseActionPerformed(evt);
            }
        });
        jPanel3.add(botonRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 540, 160, 50));

        botonIniciarSesion1.setBackground(new java.awt.Color(0, 153, 153));
        botonIniciarSesion1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botonIniciarSesion1.setForeground(new java.awt.Color(255, 255, 255));
        botonIniciarSesion1.setText(" Iniciar Sesion");
        botonIniciarSesion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarSesion1ActionPerformed(evt);
            }
        });
        jPanel3.add(botonIniciarSesion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, 160, 50));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("DNI");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 260, 30));

        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.setBorder(null);
        jPasswordField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPasswordField1MousePressed(evt);
            }
        });
        jPanel3.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 260, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioFieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_usuarioFieldActionPerformed

    private void usuarioFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioFieldMousePressed
        // TODO add your handling code here:
        
        usuarioField.setText("");
        
    }//GEN-LAST:event_usuarioFieldMousePressed

    private void botonRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarseActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        //VentanaRegistroClienteAndres ventanaregistro=new VentanaRegistroClienteAndres();
        //ventanaregistro.setVisible(true);
        VentanaRegistroCliente ventanaRegistroCliente = new VentanaRegistroCliente();
        ventanaRegistroCliente.setVisible(true);
    }//GEN-LAST:event_botonRegistrarseActionPerformed

    private void botonIniciarSesion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarSesion1ActionPerformed
        // TODO add your handling code here:
        String usuario=usuarioField.getText(),
                contrasena=jPasswordField1.getText();
       
        PreparedStatement st;
        ResultSet rs;
        login(usuario, contrasena);
        if("Cliente".equals(autenticacion))
        {
         
            InicioCliente ventanaInicioCliente = new InicioCliente();
            setVisible(false);
            ventanaInicioCliente.setVisible(true);
            
        }
        else if ("Vendedor".equals(autenticacion))
        {
            InicioVendedor ventanaInicioVendedor = new InicioVendedor();
            setVisible(false);
            ventanaInicioVendedor.setVisible(true);
        }
        else if ("Administrador".equals(autenticacion))
        {
            InicioAdmin ventanaInicioTrabajador = new InicioAdmin();
            setVisible(false);
            ventanaInicioTrabajador.setVisible(true);
        }
        else
        {
           JOptionPane.showMessageDialog(null,"Por favor vuelva a digitar sus credenciales"); 
        }
    }//GEN-LAST:event_botonIniciarSesion1ActionPerformed

    private void jPasswordField1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField1MousePressed

        jPasswordField1.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1MousePressed

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
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaLogin().setVisible(true);
            }
        });
    }
    public void login(String usuario,String contrasena)
    {
        
        PreparedStatement st;
        ResultSet rs;
        try {
            st = cn.con.prepareStatement("select * from usuario where dni_usuario=? and "
                    + "contraseña=?");
            st.setString(1,usuario);
            st.setString(2, contrasena);
            rs=st.executeQuery();
            rs.next();
            if ("Cliente".equals(rs.getString("tipo")))
            {
                try {
                st = cn.con.prepareStatement("select * from cliente where dni_cliente=?");
                st.setString(1,usuario);
                rs=st.executeQuery();
                rs.next();
                int id = rs.getInt("id_cliente");
                String nombres = rs.getString("nombre_cliente");
                String apellidos = rs.getString("apellido_cliente");
                String fechaNac = rs.getString("fecha_nac_cliente");
                String sexo = rs.getString("sexo_cliente");
                String correo = rs.getString("correo_cliente");
                String direccion = rs.getString("direccion_cliente");                
                cliente = new Cliente(id, contrasena,  usuario, 
                         nombres,  apellidos,  fechaNac, 
                         sexo,  correo,  direccion);
            } catch (Exception e) {
                System.out.println(e);
            }   
                autenticacion = "Cliente";
            }
            else
            {
                System.out.println("hol");
                System.out.println(usuario);
                 try {
                st = cn.con.prepareStatement("select * from trabajador join sistema_pension on "
                        + "trabajador.sist_pension_trabajador = sistema_pension.id_sistema join seguro_salud on "
                        + "trabajador.seguro_salud_trabajador = seguro_salud.id_seguro join roles on "
                        + "trabajador.rol = roles.id_rol where dni_trabajador=?");
                st.setString(1,usuario);
                rs=st.executeQuery();
                rs.next();
                int id = rs.getInt("id_trabajador");
                String nombres = rs.getString("nombre_trabajador");
                String apellidos = rs.getString("apellido_trabajador");
                String fechaNac = rs.getString("fecha_nac_trabajador");
                String sexo = rs.getString("sexo_trabajador");
                String correo = rs.getString("correo_trabajador");
                String direccion = rs.getString("direccion_trabajador");     
                Double sueldo = rs.getDouble("sueldo_trabajador");
                String sistPension = rs.getString("sistema");
                String seguroSalud = rs.getString("seguro");
                String fechaIngreso = rs.getString("fecha_ingreso_trabajador");
                int hijos = rs.getInt("hijos_trabajador");
                String tipo = rs.getString("roles.rol");
                System.out.println(tipo);
                if ("Vendedor".equals(tipo))
                {
                    vendedor = new Vendedor( hijos, sueldo, sistPension, seguroSalud, 
                    fechaIngreso, id, contrasena, usuario,  nombres, 
                     apellidos,  fechaNac,  sexo,  correo,  direccion);               
                    autenticacion = "Vendedor";

                    
                }
                else if ("Administrador".equals(tipo))
                {
                    admin = new Administrador( hijos, sueldo, sistPension, seguroSalud, 
                    fechaIngreso, id, contrasena, usuario,  nombres, 
                     apellidos,  fechaNac,  sexo,  correo,  direccion);                
                    autenticacion = "Administrador";
                    
                }
            } catch (Exception e) {
                System.out.println(e);
            } 
        }
        } catch (Exception e) {
            System.out.println(e);
        }                
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIniciarSesion1;
    private javax.swing.JButton botonRegistrarse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField usuarioField;
    // End of variables declaration//GEN-END:variables
}
