/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yeny.clase2.calcularpromedio;

import com.yeny.Dominio.ClsPromedios;
import com.yeny.Negocio.ClsNegocio;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Sandra
 */
public class frmPromedios extends javax.swing.JFrame {

    /**
     * Creates new form frmPromedios
     */
    public frmPromedios() {
        initComponents();
    }
    
    ClsPromedios Clspro = new ClsPromedios();
    ClsNegocio ClsNeg = new ClsNegocio();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPasswordField1 = new javax.swing.JPasswordField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        txtl1 = new javax.swing.JLabel();
        txtpp = new javax.swing.JLabel();
        txtp1 = new javax.swing.JLabel();
        txtlab1 = new javax.swing.JTextField();
        txtparcial1 = new javax.swing.JTextField();
        txtr1 = new javax.swing.JLabel();
        txtrprimerperiodo = new javax.swing.JTextField();
        btncal1p = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtlab2 = new javax.swing.JTextField();
        txtparcial2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtrsegundoperiodo = new javax.swing.JTextField();
        btncal2p = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtlab3 = new javax.swing.JTextField();
        txtparcial3 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btncal3p = new javax.swing.JButton();
        txtrtercerperiodo = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtpromediofinal = new javax.swing.JTextField();
        btnsalir = new javax.swing.JButton();
        btncalpromediofinal = new javax.swing.JButton();

        jPasswordField1.setText("jPasswordField1");

        jRadioButton1.setText("jRadioButton1");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 153));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 204)));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        txtl1.setText("LABORATORIO 1");

        txtpp.setText("PRIMER PERIODO");

        txtp1.setText("PARCIAL 1 ");

        txtparcial1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtparcial1ActionPerformed(evt);
            }
        });

        txtr1.setText("RESULTADO:");

        txtrprimerperiodo.setEditable(false);

        btncal1p.setText("CALCULAR ");
        btncal1p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncal1pActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(txtpp)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtl1)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtp1)
                        .addGap(45, 45, 45)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtparcial1, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(txtlab1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(txtr1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtrprimerperiodo)
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btncal1p)
                        .addGap(99, 99, 99))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtpp)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtl1)
                            .addComponent(txtlab1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtr1)
                            .addComponent(txtrprimerperiodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtparcial1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtp1)
                            .addComponent(btncal1p, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 204)));

        jLabel5.setText("SEGUNDO PERIODO ");

        jLabel6.setText("LABORATORIO 2");

        jLabel7.setText("PARCIAL 2");

        jLabel8.setText("RESULTADO:");

        txtrsegundoperiodo.setEditable(false);
        txtrsegundoperiodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrsegundoperiodoActionPerformed(evt);
            }
        });

        btncal2p.setText("CALCULAR ");
        btncal2p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncal2pActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtlab2)
                    .addComponent(txtparcial2, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(36, 36, 36)
                        .addComponent(txtrsegundoperiodo, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btncal2p)
                        .addGap(95, 95, 95))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtlab2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtrsegundoperiodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtparcial2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btncal2p)))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 204)));

        jLabel9.setText("TERCER PERIODO");

        jLabel10.setText("LABORATORIO 3");

        jLabel11.setText("PARCIAL 3");

        jLabel12.setText("RESULTADO:");

        btncal3p.setText("CALCULAR");
        btncal3p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncal3pActionPerformed(evt);
            }
        });

        txtrtercerperiodo.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(48, 48, 48)
                        .addComponent(txtparcial3))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(txtlab3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel12)
                        .addGap(26, 26, 26)
                        .addComponent(txtrtercerperiodo, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(37, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btncal3p)
                        .addGap(87, 87, 87))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtlab3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtrtercerperiodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtparcial3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncal3p))
                .addGap(14, 14, 14))
        );

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 204)));

        jLabel13.setText("PROMEDIO FINAL ");

        jLabel14.setText("RESULTADO:");

        txtpromediofinal.setEditable(false);

        btnsalir.setText("SALIR");

        btncalpromediofinal.setText("CALCULAR ");
        btncalpromediofinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalpromediofinalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(btnsalir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btncalpromediofinal)
                .addGap(90, 90, 90))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(42, 42, 42)
                .addComponent(txtpromediofinal, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnsalir)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpromediofinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btncalpromediofinal)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtrsegundoperiodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrsegundoperiodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrsegundoperiodoActionPerformed

    private void btncal1pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncal1pActionPerformed
       
        
        String num1 = txtlab1.getText();
        String num2 = txtparcial1.getText();
        Double r = ClsNeg.funcPromedio1(num1,num2);
        Clspro.setPromedio(r);
        
        
//        JOptionPane.showMessageDialog(null,r.toString());

        txtrprimerperiodo.setText(Clspro.getPromedio().toString());
        
    }//GEN-LAST:event_btncal1pActionPerformed

    private void btncal2pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncal2pActionPerformed
        String num1 = txtlab2.getText();
        String num2 = txtparcial2.getText();
        Double r = ClsNeg.funcPromedio2(num1,num2);
        Clspro.setPromedio2(r);
        

        txtrsegundoperiodo.setText(Clspro.getPromedio2().toString());
// TODO add your handling code here:
    }//GEN-LAST:event_btncal2pActionPerformed

    private void btncal3pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncal3pActionPerformed
        String num1 = txtlab3.getText();
        String num2 = txtparcial3.getText();
        Double r = ClsNeg.funcPromedio3(num1,num2);
        Clspro.setPromedio3(r);
        
        
//        JOptionPane.showMessageDialog(null,r.toString());

        txtrtercerperiodo.setText(Clspro.getPromedio3().toString());
    }//GEN-LAST:event_btncal3pActionPerformed

    private void txtparcial1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtparcial1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtparcial1ActionPerformed

    private void btncalpromediofinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalpromediofinalActionPerformed
        Double Promedio1= Clspro.getPromedio();
        Double Promedio2= Clspro.getPromedio2();
        Double Promedio3= Clspro.getPromedio3();
        
        Double R= ClsNeg.PromedioFinal(Promedio1, Promedio2, Promedio3);
        
        txtpromediofinal.setText(R.toString());
        if (R>=6){
            JOptionPane.showMessageDialog(null, "Aprobado");
        }else {
        JOptionPane.showMessageDialog(null, "Reprobado");
        }
        
    }//GEN-LAST:event_btncalpromediofinalActionPerformed

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
            java.util.logging.Logger.getLogger(frmPromedios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPromedios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPromedios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPromedios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPromedios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncal1p;
    private javax.swing.JButton btncal2p;
    private javax.swing.JButton btncal3p;
    private javax.swing.JButton btncalpromediofinal;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JLabel txtl1;
    private javax.swing.JTextField txtlab1;
    private javax.swing.JTextField txtlab2;
    private javax.swing.JTextField txtlab3;
    private javax.swing.JLabel txtp1;
    private javax.swing.JTextField txtparcial1;
    private javax.swing.JTextField txtparcial2;
    private javax.swing.JTextField txtparcial3;
    private javax.swing.JLabel txtpp;
    private javax.swing.JTextField txtpromediofinal;
    private javax.swing.JLabel txtr1;
    private javax.swing.JTextField txtrprimerperiodo;
    private javax.swing.JTextField txtrsegundoperiodo;
    private javax.swing.JTextField txtrtercerperiodo;
    // End of variables declaration//GEN-END:variables
}
