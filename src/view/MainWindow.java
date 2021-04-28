
package view;

import controller.Controller;
import javax.swing.JOptionPane;


public class MainWindow extends javax.swing.JFrame {
 
    private static Controller controller = new Controller();
    public MainWindow() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        bt_name_user = new javax.swing.JButton();
        nombre_user = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        bt_resumen_user = new javax.swing.JButton();
        resumen_md5_user = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        firma_user = new javax.swing.JTextField();
        bt_firmar_user = new javax.swing.JButton();
        bt_solicitar_user = new javax.swing.JButton();
        nombre_encriptado_user = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        encripted_user_grade = new javax.swing.JTextField();
        grade_user = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        nombre_server = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        nombre_decryp_server = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        firma_server = new javax.swing.JTextField();
        firma_decryp_server = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        resumen_nombre_server = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        resumen_firma_server = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cal_server = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        encrypted_grade = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(980, 650));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(450, 540));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/programmer(1).png"))); // NOI18N
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 140, -1));

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Siguiente");
        jPanel9.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, -1, -1));

        jLabel23.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Firma");
        jPanel9.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 60, 40));

        bt_name_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/colorButton(1).png"))); // NOI18N
        bt_name_user.setToolTipText("");
        bt_name_user.setBorderPainted(false);
        bt_name_user.setContentAreaFilled(false);
        bt_name_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_name_userActionPerformed(evt);
            }
        });
        jPanel9.add(bt_name_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 120, -1));
        jPanel9.add(nombre_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 43, 300, -1));

        jLabel1.setText("Nombre Completo");
        jPanel9.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 22, 154, -1));

        bt_resumen_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/colorButton(1).png"))); // NOI18N
        bt_resumen_user.setBorderPainted(false);
        bt_resumen_user.setContentAreaFilled(false);
        bt_resumen_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_resumen_userActionPerformed(evt);
            }
        });
        jPanel9.add(bt_resumen_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 106, 106, -1));
        jPanel9.add(resumen_md5_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 107, 300, -1));

        jLabel2.setText("Resumen(MD5)");
        jPanel9.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 86, -1, -1));

        jLabel3.setText("Firma");
        jPanel9.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 140, -1, -1));

        jLabel24.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Encriptar");
        jPanel9.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, 20));

        jLabel25.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Solicitar");
        jPanel9.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, -1, -1));
        jPanel9.add(firma_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 166, 300, -1));

        bt_firmar_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/colorButton(1).png"))); // NOI18N
        bt_firmar_user.setBorderPainted(false);
        bt_firmar_user.setContentAreaFilled(false);
        bt_firmar_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_firmar_userActionPerformed(evt);
            }
        });
        jPanel9.add(bt_firmar_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 165, 106, -1));

        bt_solicitar_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/colorButton(1).png"))); // NOI18N
        bt_solicitar_user.setBorderPainted(false);
        bt_solicitar_user.setContentAreaFilled(false);
        bt_solicitar_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_solicitar_userActionPerformed(evt);
            }
        });
        jPanel9.add(bt_solicitar_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 221, 106, -1));
        jPanel9.add(nombre_encriptado_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 222, 300, -1));

        jLabel4.setText("Nombre encriptado");
        jPanel9.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 201, -1, -1));

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Calificacion encriptada");
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 43, -1, -1));

        jLabel6.setText("Calificacion del alumno");
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 81, -1, -1));
        jPanel7.add(encripted_user_grade, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 260, -1));
        jPanel7.add(grade_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 260, -1));

        jLabel7.setText("Calificacion del alumno");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 12, -1, -1));

        jLabel26.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Descencriptar");
        jPanel7.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, 20));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/colorButton(1).png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 104, -1, -1));

        jPanel9.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 424, 150));

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 450, 440));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/gr.jpg"))); // NOI18N
        jLabel18.setText("jLabel18");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 510, 640));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 12, 490, 630));

        jPanel2.setPreferredSize(new java.awt.Dimension(450, 540));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/profile(1).png"))); // NOI18N
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("Nombre Recibido");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 28, -1, -1));

        jLabel28.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Resumen");
        jPanel6.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, -1, -1));

        jLabel30.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Comprobar");
        jPanel6.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, -1, -1));

        jLabel29.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Descifrar");
        jPanel6.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, -1, -1));

        jLabel27.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Descifrar");
        jPanel6.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, -1));
        jPanel6.add(nombre_server, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 49, 150, -1));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/colorButton(1).png"))); // NOI18N
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 100, -1));
        jPanel6.add(nombre_decryp_server, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 167, -1));

        jLabel9.setText("Nombre descencriptado");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 28, -1, -1));

        jLabel10.setText("Firma recibida");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 87, -1, -1));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/colorButton(1).png"))); // NOI18N
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 100, -1));
        jPanel6.add(firma_server, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 113, 150, -1));
        jPanel6.add(firma_decryp_server, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 170, -1));

        jLabel11.setText("Firma descencriptada");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 87, -1, -1));

        jLabel12.setText("Resumen del nombre");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 163, -1, -1));
        jPanel6.add(resumen_nombre_server, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 184, 150, -1));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/colorButton(1).png"))); // NOI18N
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 100, -1));
        jPanel6.add(resumen_firma_server, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 165, -1));

        jLabel13.setText("Resumen de la firma");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 163, -1, -1));

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/colorButton(1).png"))); // NOI18N
        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, -1, -1));

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setText("Envio de calificacion ");
        jPanel8.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 12, -1, -1));

        jLabel32.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Enviar");
        jPanel8.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, -1));

        jLabel31.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Encriptar");
        jPanel8.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        jLabel15.setText("Calificacion del alumno");
        jPanel8.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 47, -1, -1));
        jPanel8.add(cal_server, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 44, 172, -1));

        jLabel16.setText("Calificacion encriptada");
        jPanel8.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 85, -1, -1));
        jPanel8.add(encrypted_grade, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 82, 172, -1));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/colorButton(1).png"))); // NOI18N
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/colorButton(1).png"))); // NOI18N
        jButton9.setMnemonic('E');
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, -1));

        jPanel6.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 430, -1));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 460, 440));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/gr2.jpg"))); // NOI18N
        jLabel19.setText("jLabel19");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 630));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 13, 500, 630));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/bk.jpg"))); // NOI18N
        jLabel17.setText("jLabel17");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1060, 650));

        jMenu1.setText("Autoservicios 2.0");
        jMenu1.setToolTipText("");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Equipo 2");

        jMenuItem2.setText("Fuentes Gallardo Roberto ");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem5.setText("Diaz Romero Ignacio    ");
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Giovanny Contreras Hernández ");
        jMenu2.add(jMenuItem6);

        jMenuItem4.setText("Ayala Lozano Jean Paul ");
        jMenu2.add(jMenuItem4);

        jMenuItem3.setText("Galindo Reyna Julio Daniel   ");
        jMenu2.add(jMenuItem3);

        jMenuItem1.setText("Bustamante Bonfil Melquiades     ");
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void bt_name_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_name_userActionPerformed
        if(nombre_user.getText().isEmpty()){
             JOptionPane.showMessageDialog(null, "Ingrese primero un nombre");
        }else{
            System.out.println("Boton accionado y con respuesta de\n");
            String temp = nombre_user.getText();
            System.out.println(temp);
            String temp1 = controller.agetNameHash(temp);
            resumen_md5_user.setText(temp1);
        }
    }//GEN-LAST:event_bt_name_userActionPerformed

    private void bt_resumen_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_resumen_userActionPerformed
        if(resumen_md5_user.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese primero un nombre");
        }else{
            System.out.println("Botton accionoado");
            String temp = resumen_md5_user.getText();
            String temp1 = controller.encryptNameHash();
            firma_user.setText(temp1);
        }
    }//GEN-LAST:event_bt_resumen_userActionPerformed

    private void bt_firmar_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_firmar_userActionPerformed
        if(firma_user.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese primero un nombre");
        }else{
            System.out.println("Bottonaccionado");
            String temp = nombre_user.getText();
            String temp1 = controller.encryptName();
            System.out.println(temp1+" \nEsto genero\n");
            nombre_encriptado_user.setText(temp1);
        }
    }//GEN-LAST:event_bt_firmar_userActionPerformed

    private void bt_solicitar_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_solicitar_userActionPerformed
        // TODO add your handling code here:
        if(firma_user.getText().isEmpty()&&nombre_encriptado_user.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Verifique que tenga la firma y el nombre encriptado");
        }else{
            String temp=nombre_encriptado_user.getText();
            nombre_server.setText(temp);
            String temp1=firma_user.getText();
            firma_server.setText(temp1);
            /**AQUI ESTOY*/
            controller.sendData();
            
        }
    }//GEN-LAST:event_bt_solicitar_userActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if(firma_user.getText().isEmpty()&&nombre_encriptado_user.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Verifique que tenga la firma y el nombre encriptado");
        }else{
            String temp = controller.decryptName();
            nombre_decryp_server.setText(temp);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(firma_user.getText().isEmpty()&&nombre_encriptado_user.getText().isEmpty()){
               JOptionPane.showMessageDialog(null, "Verifique que tenga la firma y el nombre encriptado");
        }else{
            String temp = controller.decryptHashName();
            firma_decryp_server.setText(temp);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        if(firma_user.getText().isEmpty()&&nombre_encriptado_user.getText().isEmpty()){
               JOptionPane.showMessageDialog(null, "Verifique que tenga la firma y el nombre encriptado");
        }else{
            resumen_nombre_server.setText(controller.renderHash2());
            resumen_firma_server.setText(controller.renderHashs1());
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        if(firma_user.getText().isEmpty()&&nombre_encriptado_user.getText().isEmpty()){
               JOptionPane.showMessageDialog(null, "Faltan valores");
        }else{
            cal_server.setText(controller.checkMessage());
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        if(nombre_user.getText().isEmpty()){
               JOptionPane.showMessageDialog(null, "FALTAN VALORES");
        }else{
            encrypted_grade.setText(controller.encryptGrade());
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        if(nombre_user.getText().isEmpty()){
               JOptionPane.showMessageDialog(null, "FALTAN VALORES");
        }else{
            encripted_user_grade.setText(controller.sendGrade());
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(nombre_user.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Faltan valores");
        }else{
            grade_user.setText(controller.decryptGrade());
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_firmar_user;
    private javax.swing.JButton bt_name_user;
    private javax.swing.JButton bt_resumen_user;
    private javax.swing.JButton bt_solicitar_user;
    private javax.swing.JTextField cal_server;
    private javax.swing.JTextField encripted_user_grade;
    private javax.swing.JTextField encrypted_grade;
    private javax.swing.JTextField firma_decryp_server;
    private javax.swing.JTextField firma_server;
    private javax.swing.JTextField firma_user;
    private javax.swing.JTextField grade_user;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField nombre_decryp_server;
    private javax.swing.JTextField nombre_encriptado_user;
    private javax.swing.JTextField nombre_server;
    private javax.swing.JTextField nombre_user;
    private javax.swing.JTextField resumen_firma_server;
    private javax.swing.JTextField resumen_md5_user;
    private javax.swing.JTextField resumen_nombre_server;
    // End of variables declaration//GEN-END:variables
}
