/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.application.GUI;

import org.application.logic.Pet;

/**
 *
 * @author fcastillo
 */
public class Dashboard extends javax.swing.JFrame {

    private LandingPanel landingPanel;
    private ClientsList clientList;
    private Client client;
    private AppointmentsList appointmentList;
    /**
     * Creates new form ToolGUI
     */
    public Dashboard() {
        initComponents();
        
        setResizable(false); 
        
        landingPanel = new LandingPanel(this);
        landingPanel.setSize(600,500);
        landingPanel.setLocation(0,0);
        getContentPane().removeAll();
        getContentPane().add(landingPanel);

        clientList = new ClientsList(this);
        clientList.setSize(600,500);
        clientList.setLocation(0,0);
        clientList.setVisible(false);
        getContentPane().add(clientList);

        client = new Client(this);
        client.setSize(600,500);
        client.setLocation(0,0);
        client.setVisible(false);
        getContentPane().add(client);
        
        appointmentList = new AppointmentsList(this);
        appointmentList.setSize(600,500);
        appointmentList.setLocation(0,0);
        appointmentList.setVisible(false);
        getContentPane().add(appointmentList);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    public void setTrueListClient(){
        landingPanel.setVisible(false);
        clientList.loadData();
        clientList.setVisible(true);
    }

    public void setFalseListClient(){
        clientList.setVisible(false);
        landingPanel.setVisible(true);
    }

    public void setTrueNewClient() {
        client.newClient();
        clientList.setVisible(false);
        client.setVisible(true);
    }

    public void setFalseNewClient() {
        clientList.setVisible(true);
        clientList.loadData();
        client.setVisible(false);
    }
    
    public void editClient(Pet editPet) {
        setTrueNewClient();
        client.editClient(editPet);
    }

    void setTrueAppointmentsList() {
        landingPanel.setVisible(false);
        //appointmentList.loadData();
        appointmentList.setVisible(true);
    }
}
