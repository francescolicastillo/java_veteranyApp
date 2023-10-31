/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main.java.application.GUI;

/**
 *
 * @author fcastillo
 */
public class Dashboard extends javax.swing.JFrame {

    private LandingPanel landingPanel;
    private ListClient listClient;
    private NewClient newClient;
    /**
     * Creates new form ToolGUI
     */
    public Dashboard() {
        initComponents();

        landingPanel = new LandingPanel(this);
        landingPanel.setSize(600,500);
        landingPanel.setLocation(0,0);
        getContentPane().removeAll();
        getContentPane().add(landingPanel);

        listClient = new ListClient(this);
        listClient.setSize(600,500);
        listClient.setLocation(0,0);
        listClient.setVisible(false);
        getContentPane().add(listClient);

        newClient = new NewClient(this);
        newClient.setSize(600,500);
        newClient.setLocation(0,0);
        newClient.setVisible(false);
        getContentPane().add(newClient);
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

    public void setTrueListClient(){
        landingPanel.setVisible(false);
        listClient.setVisible(true);
    }

    public void setFalseListClient(){
        listClient.setVisible(false);
        landingPanel.setVisible(true);
    }

    public void setTrueNewClient() {
        listClient.setVisible(false);
        newClient.setVisible(true);
    }

    public void setFalseNewClient() {
        listClient.setVisible(true);
        newClient.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
