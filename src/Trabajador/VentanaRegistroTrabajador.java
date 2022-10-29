/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Trabajador;
import General.VentanaLogin;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.ButtonModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import static trabajofinal.TrabajoFinal.cn;

/**
 *
 * @author user
 */
public class VentanaRegistroTrabajador extends javax.swing.JFrame {

    /**
     * Creates new form VentanaRegistroTrabajador
     */
    public VentanaRegistroTrabajador() {
        initComponents();
    }
    public void llenarPaises(){
        PreparedStatement st;
        ResultSet rs;
        ArrayList<String> paises = new ArrayList<String>();
        paises.add("Seleccionar");
        try {
            st = cn.con.prepareStatement("select * from pais");
            rs=st.executeQuery();
            while (rs.next())
            {
                paises.add(rs.getString("pais"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        DefaultComboBoxModel modelo = new DefaultComboBoxModel<>(paises.toArray());
        paisField.setModel(modelo);
    }
    
    public void llenarProvincias(int id){
        PreparedStatement st;
        ResultSet rs;
        ArrayList<String> paises = new ArrayList<String>();
        paises.add("Seleccionar");
        try {
            st = cn.con.prepareStatement("select * from departamentos where idPais = ?");
            st.setString(1, Integer.toString(id));
            rs=st.executeQuery();
            while (rs.next())
            {
                paises.add(rs.getString("departamento"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        DefaultComboBoxModel modelo = new DefaultComboBoxModel<>(paises.toArray());
        provinciaField.setModel(modelo);
    }
    
    public void llenarDistritos(int id){
        PreparedStatement st;
        ResultSet rs;
        ArrayList<String> paises = new ArrayList<String>();
        paises.add("Seleccionar");
        try {
            st = cn.con.prepareStatement("select * from distrito where idProvincia = ?");
            st.setString(1, Integer.toString(id));
            rs=st.executeQuery();
            while (rs.next())
            {
                paises.add(rs.getString("distrito"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        DefaultComboBoxModel modelo = new DefaultComboBoxModel<>(paises.toArray());
        distritoField.setModel(modelo);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sexoField = new javax.swing.ButtonGroup();
        masculinoButton = new javax.swing.JRadioButton();
        paisField = new javax.swing.JComboBox<>();
        provinciaField = new javax.swing.JComboBox<>();
        distritoField = new javax.swing.JComboBox<>();
        registroButton = new javax.swing.JButton();
        volverButton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        direccionField = new javax.swing.JTextField();
        dniField = new javax.swing.JTextField();
        nombresField = new javax.swing.JTextField();
        apellidosField = new javax.swing.JTextField();
        correoField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        contrasenaField = new javax.swing.JPasswordField();
        femeninoButton = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        sueldoField = new javax.swing.JTextField();
        hijosField = new javax.swing.JSpinner();
        seguroSaludField = new javax.swing.JComboBox<>();
        sistemaPensionField = new javax.swing.JComboBox<>();
        fechaNacField = new com.toedter.calendar.JDateChooser();
        fechaIngreField = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sexoField.add(masculinoButton);
        masculinoButton.setText("Masculino");
        masculinoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masculinoButtonActionPerformed(evt);
            }
        });

        paisField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paisFieldActionPerformed(evt);
            }
        });

        provinciaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provinciaFieldActionPerformed(evt);
            }
        });

        distritoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                distritoFieldActionPerformed(evt);
            }
        });

        registroButton.setText(" Registrar");
        registroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroButtonActionPerformed(evt);
            }
        });

        volverButton.setText("Volver");
        volverButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverButtonActionPerformed(evt);
            }
        });

        jLabel13.setText("Fecha de nacimiento");

        jLabel9.setText("Contraseña");

        jLabel10.setText("País");

        jLabel11.setText("Provincia");

        jLabel12.setText("Distrito");

        direccionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionFieldActionPerformed(evt);
            }
        });

        dniField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dniFieldActionPerformed(evt);
            }
        });

        nombresField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombresFieldActionPerformed(evt);
            }
        });

        apellidosField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidosFieldActionPerformed(evt);
            }
        });

        correoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Registro Trabajador");

        jLabel3.setText("DNI");

        jLabel4.setText("Nombres");

        jLabel5.setText("Apellidos");

        jLabel6.setText("Sexo");

        jLabel7.setText("Correo");

        jLabel8.setText("Dirección");

        contrasenaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contrasenaFieldActionPerformed(evt);
            }
        });

        sexoField.add(femeninoButton);
        femeninoButton.setText("Femenino");
        femeninoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femeninoButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Sueldo");

        jLabel14.setText("Sistema de pension");

        jLabel15.setText("Fecha de ingreso");

        jLabel16.setText("Seguro de salud");

        jLabel17.setText("Hijos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(femeninoButton)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dniField, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(apellidosField, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(226, 226, 226)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(contrasenaField)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel7)
                                            .addComponent(correoField, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(direccionField, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(409, 409, 409)
                                        .addComponent(jLabel13))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(434, 434, 434)
                                        .addComponent(fechaNacField, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(347, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(paisField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(masculinoButton)
                            .addComponent(nombresField, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(128, 128, 128)
                                        .addComponent(jLabel15))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(sueldoField, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel14)
                                            .addComponent(sistemaPensionField, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(volverButton))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel16)
                                            .addComponent(fechaIngreField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(seguroSaludField, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(registroButton))))
                                .addGap(71, 71, 71)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hijosField, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(143, 143, 143)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(provinciaField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(distritoField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addComponent(jLabel7)
                .addGap(1, 1, 1)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dniField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(correoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombresField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contrasenaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(direccionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(apellidosField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fechaNacField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(masculinoButton)
                    .addComponent(femeninoButton))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paisField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(provinciaField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(distritoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel15)
                    .addComponent(jLabel17))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sueldoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hijosField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fechaIngreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seguroSaludField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sistemaPensionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(volverButton)
                    .addComponent(registroButton))
                .addContainerGap(349, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void masculinoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masculinoButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_masculinoButtonActionPerformed

    private void paisFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paisFieldActionPerformed
        String pais = paisField.getSelectedItem().toString();
        int id = 0;
        PreparedStatement st;
        ResultSet rs;
        try {
            st = cn.con.prepareStatement("select idPais from pais where pais = ?");
            st.setString(1, pais);
            rs=st.executeQuery();
            while(rs.next())
            {
                id = rs.getInt("idPais");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        llenarProvincias(id);
        // TODO add your handling code here:
    }//GEN-LAST:event_paisFieldActionPerformed

    private void provinciaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provinciaFieldActionPerformed
        String provincia = provinciaField.getSelectedItem().toString();
        int id = 0;
        PreparedStatement st;
        ResultSet rs;
        try {
            st = cn.con.prepareStatement("select idDepartamento from departamentos where departamento = ?");
            st.setString(1, provincia);
            rs=st.executeQuery();
            while(rs.next())
            {
                id = rs.getInt("idDepartamento");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        llenarDistritos(id);
    }//GEN-LAST:event_provinciaFieldActionPerformed

    private void distritoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_distritoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_distritoFieldActionPerformed

    private void registroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroButtonActionPerformed
        if (validarRegistro())
        {
            PreparedStatement st;
            ResultSet rs;
            String dni = dniField.getText();
            String nombres = nombresField.getText();
            String apellidos = apellidosField.getText();
            String correo = correoField.getText();
            String contrasena = contrasenaField.getText();
            String direccion = direccionField.getText();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String fechaNac = sdf.format(fechaIngreField.getDate());
            String sexo;
            if (masculinoButton.isSelected())
            {
                sexo = "M";
            }
            else
            {
                sexo = "F";
            }
            String pais = paisField.getSelectedItem().toString();
            String provincia = provinciaField.getSelectedItem().toString();
            String distrito = distritoField.getSelectedItem().toString();
            int idDistrito = 0;
            try {
                st = cn.con.prepareStatement("select idDistrito from distrito where distrito = ?");
                st.setString(1, distrito);
                rs=st.executeQuery();
                while(rs.next())
                {
                    idDistrito = rs.getInt("idDistrito");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
            try {
                cn.con.setAutoCommit(false);
                st = cn.con.prepareStatement("insert into usuario(dni_usuario, contraseña, tipo) values (?,?,?)");
                st.setString(1, dni);
                st.setString(2, contrasena);
                st.setString(3,"Cliente");
                st.executeUpdate();
                cn.con.commit();
                st = cn.con.prepareStatement("insert into cliente(dni_cliente, nombre_cliente,"
                    + "apellido_cliente, fecha_nac_cliente, sexo_cliente, correo_cliente, direccion_cliente,"
                    + "distrito_cliente) values (?,?,?,?,?,?,?,?)");
                st.setString(1, dni);
                st.setString(2, nombres);
                st.setString(3, apellidos);
                st.setString(4, fechaNac);
                st.setString(5, sexo);
                st.setString(6, correo);
                st.setString(7, direccion);
                st.setString(8, Integer.toString(idDistrito));
                st.executeUpdate();
                cn.con.commit();
                setVisible(false);
                JOptionPane.showMessageDialog(null,"Registrado correctamente");
                VentanaLogin ventanaLogin = new VentanaLogin();
                ventanaLogin.setVisible(true);

            } catch (Exception e) {
                System.out.println(e);
            }

        }
        else
        {
            JOptionPane.showMessageDialog(null,"Complete todos los campos");
        }// TODO add your handling code here:
    }//GEN-LAST:event_registroButtonActionPerformed

    private void volverButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverButtonActionPerformed
        setVisible(false);
        VentanaLogin ventanaLogin = new VentanaLogin();
        ventanaLogin.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_volverButtonActionPerformed

    private void direccionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionFieldActionPerformed

    private void dniFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dniFieldActionPerformed

    private void nombresFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombresFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombresFieldActionPerformed

    private void apellidosFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidosFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidosFieldActionPerformed

    private void correoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoFieldActionPerformed

    private void contrasenaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contrasenaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contrasenaFieldActionPerformed

    private void femeninoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femeninoButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femeninoButtonActionPerformed
    public boolean validarRegistro(){
        boolean dniValue = dniField.getText().isEmpty();
        boolean nombresValue = nombresField.getText().isEmpty();
        boolean apellidosValue = apellidosField.getText().isEmpty();
        boolean correoValue = correoField.getText().isEmpty();
        boolean contrasenaValue = contrasenaField.getText().isEmpty();
        boolean direccionValue = direccionField.getText().isEmpty();
        boolean sexoValue = sexoField.getSelection() == null;
        boolean paisValue = paisField.getSelectedItem() == null || paisField.getSelectedItem() == "Seleccionar";
        boolean provinciaValue = provinciaField.getSelectedItem() == null || provinciaField.getSelectedItem() == "Seleccionar";
        boolean distritoValue = distritoField.getSelectedItem() == null || distritoField.getSelectedItem() == "Seleccionar";
        boolean sistemaValue = sistemaPensionField.getSelectedItem() == null || sistemaPensionField.getSelectedItem() == "Seleccionar";
        boolean seguroValue = seguroSaludField.getSelectedItem() == null || seguroSaludField.getSelectedItem() == "Seleccionar";
        boolean sueldoValue = sueldoField.getText().isEmpty();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean dateNac = false;
        try
        {
           String fechaNac = sdf.format(fechaIngreField.getDate());
        }
        catch(Exception e)
        {
            dateNac = true;
        }
        boolean dateIngre = false;
        try
        {
           String fechaIngre = sdf.format(fechaIngreField.getDate());
        }
        catch(Exception e)
        {
            dateIngre = true;
        }
        if (dniValue || nombresValue || apellidosValue ||
            correoValue || contrasenaValue || direccionValue || sexoValue || 
            paisValue || provinciaValue || distritoValue || dateNac || dateIngre
                || sistemaValue || seguroValue || sueldoValue)
        {
            return false;
        }
        return true;
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
            java.util.logging.Logger.getLogger(VentanaRegistroTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaRegistroTrabajador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidosField;
    private javax.swing.JPasswordField contrasenaField;
    private javax.swing.JTextField correoField;
    private javax.swing.JTextField direccionField;
    private javax.swing.JComboBox<String> distritoField;
    private javax.swing.JTextField dniField;
    private com.toedter.calendar.JDateChooser fechaIngreField;
    private com.toedter.calendar.JDateChooser fechaNacField;
    private javax.swing.JRadioButton femeninoButton;
    private javax.swing.JSpinner hijosField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton masculinoButton;
    private javax.swing.JTextField nombresField;
    private javax.swing.JComboBox<String> paisField;
    private javax.swing.JComboBox<String> provinciaField;
    private javax.swing.JButton registroButton;
    private javax.swing.JComboBox<String> seguroSaludField;
    private javax.swing.ButtonGroup sexoField;
    private javax.swing.JComboBox<String> sistemaPensionField;
    private javax.swing.JTextField sueldoField;
    private javax.swing.JButton volverButton;
    // End of variables declaration//GEN-END:variables
}
