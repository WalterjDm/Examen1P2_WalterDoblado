/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package examen1p2_walterdoblado;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author walter
 */
public class Fifa30 extends javax.swing.JFrame {

    /**
     * Creates new form Fifa30
     */
    public Fifa30() {
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

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jug_nombre1 = new javax.swing.JTextField();
        jug_edad = new javax.swing.JTextField();
        jug_nacio = new javax.swing.JTextField();
        jug_piehabil = new javax.swing.JTextField();
        jug_rating = new javax.swing.JTextField();
        jug_agregar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        equi_nombre = new javax.swing.JTextField();
        equi_pais = new javax.swing.JTextField();
        equi_agregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        esta_pais = new javax.swing.JTextField();
        esta_nombre = new javax.swing.JTextField();
        esta_capacidad = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/examen1p2_walterdoblado/imagen/fifa20-grid-tile-volta-16x9.png.adapt.crop191x100.628p.png"))); // NOI18N
        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 134, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("INICIO", jPanel2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 786, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 458, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab2", jPanel4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 786, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 458, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Eliminar Equipo", jPanel5);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jug_nombre1.setText("Nombre");
        jug_nombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jug_nombre1ActionPerformed(evt);
            }
        });

        jug_edad.setText("edad");

        jug_nacio.setText("Nacionalidad");

        jug_piehabil.setText("Pie habil");

        jug_rating.setText("Rating");

        jug_agregar.setBackground(new java.awt.Color(0, 0, 0));
        jug_agregar.setForeground(new java.awt.Color(153, 255, 255));
        jug_agregar.setText("Agregar");
        jug_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jug_agregarMouseClicked(evt);
            }
        });
        jug_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jug_agregarActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/examen1p2_walterdoblado/imagen/messiver.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jug_rating, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jug_nacio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                    .addComponent(jug_edad, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jug_nombre1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jug_piehabil))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jug_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jug_nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel4))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jug_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jug_nacio, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jug_piehabil, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jug_rating, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jug_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Agregar jugador", jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        equi_nombre.setBackground(new java.awt.Color(0, 0, 0));
        equi_nombre.setForeground(new java.awt.Color(204, 255, 255));
        equi_nombre.setText("Nombre");
        equi_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equi_nombreActionPerformed(evt);
            }
        });

        equi_pais.setBackground(new java.awt.Color(0, 0, 0));
        equi_pais.setForeground(new java.awt.Color(204, 255, 255));
        equi_pais.setText("Pais");
        equi_pais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equi_paisActionPerformed(evt);
            }
        });

        equi_agregar.setBackground(new java.awt.Color(0, 0, 153));
        equi_agregar.setForeground(new java.awt.Color(255, 255, 255));
        equi_agregar.setText("Agregar");
        equi_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                equi_agregarMouseClicked(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Nombre del equipo--->");

        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("Pais del equipo --->");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/examen1p2_walterdoblado/imagen/logo.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(equi_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(equi_pais, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(equi_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(equi_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(equi_pais, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 62, 62)
                .addComponent(equi_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Agregar equipo", jPanel8);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        esta_pais.setText("Pais");

        esta_nombre.setText("Nombre");

        esta_capacidad.setText("Capacidad");
        esta_capacidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esta_capacidadActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(51, 255, 255));
        jButton1.setText("Agregar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(esta_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(esta_pais, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(esta_capacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(554, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(esta_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(esta_pais, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(esta_capacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jTabbedPane1.addTab("Agregar Estadio", jPanel6);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void equi_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equi_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_equi_nombreActionPerformed

    private void equi_paisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equi_paisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_equi_paisActionPerformed

    private void jug_nombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jug_nombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jug_nombre1ActionPerformed

    private void equi_agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equi_agregarMouseClicked

        try {

            equipos.add(
                    new Equipo(equi_nombre.getText(), equi_pais.getText(), 0)
            );
            equi_nombre.setText("");
            equi_pais.setText("");

            JOptionPane.showMessageDialog(this, "equipo agregado exitosamente");

        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }//GEN-LAST:event_equi_agregarMouseClicked

    private void jug_agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jug_agregarMouseClicked

        if (!(equipos.isEmpty())) {
            int pos = Integer.parseInt(JOptionPane.showInputDialog("ingrese el equipo del jugador" + equipos));

            int pos1 = Integer.parseInt(JOptionPane.showInputDialog("1. portero"
                    + "\n2. mediocampista"
                    + "\n3. defensa"
                    + "\n4. delantero"));
            if (equipos.get(pos).getPlantilla().size() > 4) {

                JOptionPane.showMessageDialog(this, "en esta plantilla ya alcanzo el maximo de jugadores");
            } else if (pos1 == 1) {

                int edad = Integer.parseInt(jug_edad.getText());
                int rating1 = Integer.parseInt(jug_rating.getText());
                Portero p = new Portero(jug_nombre1.getText(), edad, jug_nacio.getText(), jug_piehabil.getText(), rating1);

                p.setEquipo(equipos.get(pos));
                p.rating();
                equipos.get(pos).getPlantilla().add(p);

                jug_nombre1.setText("");
                jug_edad.setText("");
                jug_nacio.setText("");
                jug_piehabil.setText("");
                jug_rating.setText("");

            } else if (pos1 == 2) {
                int edad = Integer.parseInt(jug_edad.getText());
                int rating1 = Integer.parseInt(jug_rating.getText());
                Mediocampista m = new Mediocampista(jug_nombre1.getText(), edad, jug_nacio.getText(), jug_piehabil.getText(), rating1);
                m.setEquipo(equipos.get(pos));
                m.rating();
                equipos.get(pos).getPlantilla().add(m);
                jug_nombre1.setText("");
                jug_edad.setText("");
                jug_nacio.setText("");
                jug_piehabil.setText("");
                jug_rating.setText("");
            } else if (pos1 == 3) {
                int edad = Integer.parseInt(jug_edad.getText());
                int rating1 = Integer.parseInt(jug_rating.getText());
                Defensa dd = new Defensa(jug_nombre1.getText(), edad, jug_nacio.getText(), jug_piehabil.getText(), rating1);
                dd.setEquipo(equipos.get(pos));
                dd.rating();
                equipos.get(pos).getPlantilla().add(dd);
                jug_nombre1.setText("");
                jug_edad.setText("");
                jug_nacio.setText("");
                jug_piehabil.setText("");
                jug_rating.setText("");
            } else if (pos1 == 4) {
                int edad = Integer.parseInt(jug_edad.getText());
                int rating1 = Integer.parseInt(jug_rating.getText());
                Delantero d = new Delantero(jug_nombre1.getText(), edad, jug_nacio.getText(), jug_piehabil.getText(), rating1);
                d.setEquipo(equipos.get(pos));
                d.rating();
                equipos.get(pos).getPlantilla().add(d);
                jug_nombre1.setText("");
                jug_edad.setText("");
                jug_nacio.setText("");
                jug_piehabil.setText("");
                jug_rating.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "fuera de rango");

            }

        } else if (equipos.isEmpty()) {
            JOptionPane.showMessageDialog(this, "no hay equipos disponibles");
        }


    }//GEN-LAST:event_jug_agregarMouseClicked

    private void jug_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jug_agregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jug_agregarActionPerformed

    private void esta_capacidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esta_capacidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_esta_capacidadActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        
        
          if (!(equipos.isEmpty())) {
        
        int cap = Integer.parseInt(esta_capacidad.getText());
        
        Estadio es = new Estadio(esta_nombre.getText(), esta_pais.getText(),cap);
        int pos = Integer.parseInt(JOptionPane.showInputDialog("ingrese el equipo del jugador" + equipos));
        es.setEquipo(equipos.get(pos));
        esta_nombre.setText("");
        esta_pais.setText("");
        esta_capacidad.setText("");
        
        
          }else if (equipos.isEmpty()) {
            JOptionPane.showMessageDialog(this, "no hay equipos disponibles");
        }
        
        

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:


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
            java.util.logging.Logger.getLogger(Fifa30.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fifa30.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fifa30.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fifa30.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fifa30().setVisible(true);
            }
        });
    }

    ArrayList<Equipo> equipos = new ArrayList();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton equi_agregar;
    private javax.swing.JTextField equi_nombre;
    private javax.swing.JTextField equi_pais;
    private javax.swing.JTextField esta_capacidad;
    private javax.swing.JTextField esta_nombre;
    private javax.swing.JTextField esta_pais;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jug_agregar;
    private javax.swing.JTextField jug_edad;
    private javax.swing.JTextField jug_nacio;
    private javax.swing.JTextField jug_nombre1;
    private javax.swing.JTextField jug_piehabil;
    private javax.swing.JTextField jug_rating;
    // End of variables declaration//GEN-END:variables
}
