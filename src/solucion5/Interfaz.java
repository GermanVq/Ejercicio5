/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucion5;

import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
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
        txtpolitica = new javax.swing.JTextField();
        txtsocial = new javax.swing.JTextField();
        txtforzoso = new javax.swing.JTextField();
        txtahorro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtsueldo = new javax.swing.JTextField();
        cmdcalcular = new javax.swing.JButton();
        cmdborrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("DESCUENTO SUELDO BASE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 180, -1));

        jLabel2.setText("Politica pública");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 80, -1));

        jLabel3.setText("Seguro social");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 80, -1));

        jLabel4.setText("Seguro forzoso");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 90, -1));

        jLabel5.setText("Caja de ahorro");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 90, -1));

        txtpolitica.setEditable(false);
        getContentPane().add(txtpolitica, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 70, -1));

        txtsocial.setEditable(false);
        getContentPane().add(txtsocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 70, -1));

        txtforzoso.setEditable(false);
        getContentPane().add(txtforzoso, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 70, -1));

        txtahorro.setEditable(false);
        getContentPane().add(txtahorro, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 70, -1));

        jLabel6.setText("Monto Total a pagar");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        txttotal.setEditable(false);
        getContentPane().add(txttotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 90, -1));

        jLabel7.setText("SUELDO BASE");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 80, -1));

        txtsueldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsueldoKeyTyped(evt);
            }
        });
        getContentPane().add(txtsueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 100, -1));

        cmdcalcular.setText("CALCULAR");
        cmdcalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdcalcularActionPerformed(evt);
            }
        });
        getContentPane().add(cmdcalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        cmdborrar.setText("BORRAR");
        cmdborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdborrarActionPerformed(evt);
            }
        });
        getContentPane().add(cmdborrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdcalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdcalcularActionPerformed
    double sb,pp,sc,sf,ca,mt,mp;
    String res1,res2,res3,res4,res5;
    
     if(txtsueldo.getText().trim().isEmpty()){
         JOptionPane.showMessageDialog(this,"Digite sueldo","Error", JOptionPane.ERROR_MESSAGE);
         txtsueldo.requestFocusInWindow();
     }else{
    
    sb=Double.parseDouble(txtsueldo.getText());
    
    pp=sb*0.01;
    sc=sb*0.04;
    sf=sb*0.005;
    ca=sb*0.05;
    mp=pp+sc+sf+ca;
    
    mt=sb-mp;
    
     res1= String.valueOf(pp);
     txtpolitica.setText(res1);
     res2 = String.valueOf(sc);
     txtsocial.setText(res2);
     res3 = String.valueOf(sf);
     txtforzoso.setText(res3);
     res4 = String.valueOf(ca);
     txtahorro.setText(res4);
     res5 = String.valueOf(mt);
     txttotal.setText(res5);
    

  }  // TODO add your handling code here:
    }//GEN-LAST:event_cmdcalcularActionPerformed

    private void txtsueldoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsueldoKeyTyped
     char c=evt.getKeyChar(); 
          if(!Character.isDigit(c)) { 
              getToolkit().beep(); 
              
              evt.consume(); 
                      
          } 
    }//GEN-LAST:event_txtsueldoKeyTyped

    private void cmdborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdborrarActionPerformed
      txtsueldo.setText("");
     txtpolitica.setText("");
     txtsocial.setText("");
     txtforzoso.setText("");
     txtahorro.setText("");
     txttotal.setText("");
     
     
     
     txtsueldo.requestFocusInWindow();
        
    }//GEN-LAST:event_cmdborrarActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdborrar;
    private javax.swing.JButton cmdcalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtahorro;
    private javax.swing.JTextField txtforzoso;
    private javax.swing.JTextField txtpolitica;
    private javax.swing.JTextField txtsocial;
    private javax.swing.JTextField txtsueldo;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
