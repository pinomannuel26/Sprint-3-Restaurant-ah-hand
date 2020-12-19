/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.cliente.restaurantathand.presentation;

import co.unicauca.cliente.restaurantathand.access.Factory;
import co.unicauca.cliente.restaurantathand.access.IRestaurantAccess;
import co.unicauca.cliente.restaurantathand.domain.entity.Restaurant;
import co.unicauca.cliente.restaurantathand.domain.service.RestaurantService;
import co.unicauca.cliente.restaurantathand.infra.Messages;
import static co.unicauca.cliente.restaurantathand.infra.Messages.successMessage;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Michelle Vallejo
 */
public class GUIListarRestaurantes extends javax.swing.JInternalFrame {

    /**
     * Creates new form GUIListarRestaurantes
     */
     ImageIcon iconolbl = new ImageIcon("src/main/java/resource/bienvenido.png");
    public GUIListarRestaurantes() {
        initComponents();
        lblLogo.setIcon(iconolbl);
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlNorte = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        pnlCenter = new javax.swing.JPanel();
        lblFiltro = new javax.swing.JLabel();
        cbxFiltrarPor = new javax.swing.JComboBox<>();
        txtFiltro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnBuscarRest = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        pnlSur = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblListarRest = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        pnlNorte.setBackground(new java.awt.Color(255, 255, 255));
        pnlNorte.setLayout(new java.awt.GridLayout(1, 0));

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlNorte.add(lblLogo);

        pnlCenter.setBackground(new java.awt.Color(255, 255, 255));
        pnlCenter.setLayout(new java.awt.GridLayout(4, 3));

        lblFiltro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFiltro.setText("Filtrar por:");
        pnlCenter.add(lblFiltro);

        cbxFiltrarPor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre restaurante", "Ciudad" }));
        pnlCenter.add(cbxFiltrarPor);
        pnlCenter.add(txtFiltro);
        pnlCenter.add(jLabel2);
        pnlCenter.add(jLabel3);
        pnlCenter.add(jLabel5);
        pnlCenter.add(jLabel6);

        btnBuscarRest.setText("Buscar");
        btnBuscarRest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarRestActionPerformed(evt);
            }
        });
        pnlCenter.add(btnBuscarRest);
        pnlCenter.add(jLabel4);

        pnlSur.setBackground(new java.awt.Color(255, 255, 255));
        pnlSur.setLayout(new java.awt.GridLayout(1, 0));

        tblListarRest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nit", "Name", "Address", "Mobile", "Email", "City"
            }
        ));
        jScrollPane2.setViewportView(tblListarRest);

        pnlSur.add(jScrollPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlNorte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlCenter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
            .addComponent(pnlSur, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlNorte, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCenter, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlSur, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarRestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarRestActionPerformed
         IRestaurantAccess service = Factory.getInstance().getRestaurantService();
        // Inyecta la dependencia
        RestaurantService restaurant = new RestaurantService(service);
        
        List<Restaurant> restaurants = null;
        
        String campo = txtFiltro.getText();
        
        if(campo!=null  && !campo.isEmpty()){
            if(cbxFiltrarPor.getSelectedItem().equals("Nombre restaurante")){
                
                restaurants = new ArrayList<Restaurant>() ;
                try {
                    restaurants.add(restaurant.findRestaurantByName(campo));
                } catch (Exception ex) {
                    successMessage(ex.getMessage(), "Atención");
                } 
            }
            else{
                restaurants = new ArrayList<Restaurant>() ;
                List<Restaurant> auxRestaurants = new ArrayList<Restaurant>() ;
                try {
                    auxRestaurants = restaurant.listRestaurants();
                } catch (Exception ex) {
                    successMessage(ex.getMessage(), "Atención");
                } 
                
                for (Restaurant restaurent : auxRestaurants) {
                    if(restaurent.getAtrCityRest().equals(campo)){
                        restaurants.add(restaurent);
                    }
                }
                
            }
        }else{
            Messages.warningMessage("ERROR LISTAR RESTAURANTES : \nCampos vacios", "Warning");
        }
        
        DefaultTableModel model = (DefaultTableModel) tblListarRest.getModel();
        limpiarTabla(model);
        Object rowData[] = new Object[6];
        for (Restaurant restaurent : restaurants) {
            rowData[0] = restaurent.getAtrNitRest();
            rowData[1] = restaurent.getAtrNameRest();
            rowData[2] = restaurent.getAtrAddressRest();
            rowData[3] = restaurent.getAtrCityRest();
            rowData[4] = restaurent.getAtrMobileRest();
            rowData[5] = restaurent.getAtrEmailRest();
            
            model.addRow(rowData);
        }
        
        
    }//GEN-LAST:event_btnBuscarRestActionPerformed


    public void limpiarTabla(DefaultTableModel objTabla) {
        while (objTabla.getRowCount()
                > 0) {
            objTabla.removeRow(0);
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarRest;
    private javax.swing.JComboBox<String> cbxFiltrarPor;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblFiltro;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlNorte;
    private javax.swing.JPanel pnlSur;
    private javax.swing.JTable tblListarRest;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables
}
