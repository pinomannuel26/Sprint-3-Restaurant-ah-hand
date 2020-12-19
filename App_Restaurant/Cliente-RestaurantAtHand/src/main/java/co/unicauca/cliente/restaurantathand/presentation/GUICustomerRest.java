/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.cliente.restaurantathand.presentation;

import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Michelle Vallejo
 */
public class GUICustomerRest extends javax.swing.JFrame {

    /**
     * Creates new form GUICustomerRest
     */
    public GUICustomerRest() {
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

        dskEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuGestRestaurantCust = new javax.swing.JMenu();
        mnuBuscarRest = new javax.swing.JMenuItem();
        mnuRestEscogido = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        dskEscritorio.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout dskEscritorioLayout = new javax.swing.GroupLayout(dskEscritorio);
        dskEscritorio.setLayout(dskEscritorioLayout);
        dskEscritorioLayout.setHorizontalGroup(
            dskEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        dskEscritorioLayout.setVerticalGroup(
            dskEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        getContentPane().add(dskEscritorio);

        mnuGestRestaurantCust.setText("Gestion Restaurante");

        mnuBuscarRest.setText("Buscar Restaurante");
        mnuBuscarRest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBuscarRestActionPerformed(evt);
            }
        });
        mnuGestRestaurantCust.add(mnuBuscarRest);

        mnuRestEscogido.setText("Restaurante Seleccionado");
        mnuRestEscogido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRestEscogidoActionPerformed(evt);
            }
        });
        mnuGestRestaurantCust.add(mnuRestEscogido);

        jMenuBar1.add(mnuGestRestaurantCust);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuBuscarRestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuBuscarRestActionPerformed
        // TODO add your handling code here:
        GUIListarRestaurantes objListarRest  = new GUIListarRestaurantes();
        dskEscritorio.add(objListarRest);
        
        try {
                objListarRest.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(GUICrearRest.class.getName()).log(Level.SEVERE, null, ex);
            }
            objListarRest.show();
    }//GEN-LAST:event_mnuBuscarRestActionPerformed

    private void mnuRestEscogidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRestEscogidoActionPerformed
        // TODO add your handling code here:
        GUIRestauranteEscogido objRestElegido  = new GUIRestauranteEscogido();
        dskEscritorio.add(objRestElegido);
        
        try {
                objRestElegido.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(GUICrearRest.class.getName()).log(Level.SEVERE, null, ex);
            }
            objRestElegido.show();
    }//GEN-LAST:event_mnuRestEscogidoActionPerformed

    /**
     * @param args the command line arguments
     */
    /*public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUICustomerRest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUICustomerRest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUICustomerRest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUICustomerRest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUICustomerRest().setVisible(true);
            }
        });
    }*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dskEscritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnuBuscarRest;
    private javax.swing.JMenu mnuGestRestaurantCust;
    private javax.swing.JMenuItem mnuRestEscogido;
    // End of variables declaration//GEN-END:variables
}
