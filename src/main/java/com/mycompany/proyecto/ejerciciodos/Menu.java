/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyecto.ejerciciodos;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author DELL
 */
public class Menu extends javax.swing.JFrame {

    TeatroBellasArtes teatro = new TeatroBellasArtes();
    
    
    public Menu() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comprarBoletas = new javax.swing.JButton();
        insertarPeliculas = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        peliculaMasMujeres = new javax.swing.JButton();
        AdultosMayores = new javax.swing.JButton();
        imprimir = new javax.swing.JButton();
        totalHombresYMujeres = new javax.swing.JButton();
        cartelera = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Teatro Bellas Artes");

        comprarBoletas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        comprarBoletas.setText("Comprar Boletas");
        comprarBoletas.setEnabled(false);
        comprarBoletas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarBoletasActionPerformed(evt);
            }
        });

        insertarPeliculas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        insertarPeliculas.setText("Insertar Peliculas");
        insertarPeliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarPeliculasActionPerformed(evt);
            }
        });

        buscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buscar.setText("Buscar");
        buscar.setEnabled(false);
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        peliculaMasMujeres.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        peliculaMasMujeres.setText("Pelicula con Mas Mujeres");
        peliculaMasMujeres.setEnabled(false);
        peliculaMasMujeres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peliculaMasMujeresActionPerformed(evt);
            }
        });

        AdultosMayores.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AdultosMayores.setText("Adultos Mayores");
        AdultosMayores.setEnabled(false);
        AdultosMayores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdultosMayoresActionPerformed(evt);
            }
        });

        imprimir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        imprimir.setText("Imprimir");
        imprimir.setEnabled(false);
        imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirActionPerformed(evt);
            }
        });

        totalHombresYMujeres.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        totalHombresYMujeres.setText("Total Hombres y Mujeres");
        totalHombresYMujeres.setEnabled(false);
        totalHombresYMujeres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalHombresYMujeresActionPerformed(evt);
            }
        });

        cartelera.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cartelera.setText("Cartelera ");
        cartelera.setEnabled(false);
        cartelera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carteleraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(145, 145, 145))
            .addGroup(layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(insertarPeliculas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(comprarBoletas))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(peliculaMasMujeres))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AdultosMayores)
                                    .addComponent(totalHombresYMujeres))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cartelera)
                                    .addComponent(imprimir))))))
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertarPeliculas)
                    .addComponent(comprarBoletas))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscar)
                    .addComponent(peliculaMasMujeres))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdultosMayores)
                    .addComponent(imprimir))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalHombresYMujeres)
                    .addComponent(cartelera))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertarPeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarPeliculasActionPerformed
       teatro.insertarPeliculas();
       comprarBoletas.setEnabled(true);
       cartelera.setEnabled(true);
    }//GEN-LAST:event_insertarPeliculasActionPerformed

    private void comprarBoletasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarBoletasActionPerformed
       String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre: ");
       String id = JOptionPane.showInputDialog(null, "Ingrese su id: ");
       String fecha = JOptionPane.showInputDialog(null, "Ingrese su fecha de nacimiento: (formato dd-mm-aaaa)");
       String pelicula = JOptionPane.showInputDialog(null, "Ingrese el nombre de la pelicula: ");
       int numeroDeBoletas = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero de boletas que va a comprar: (Ingrese un numero)"));
       boolean valor = true;
       while(valor){
            String input = JOptionPane.showInputDialog(null,"Ingrese su sexo ((f) si femenino o (m) si es masculino");
            char sexo;
            sexo = input.charAt(0);
            if(sexo == 'F' || sexo == 'f' || sexo == 'M' || sexo == 'm'){
                teatro.atender(id, nombre, fecha, pelicula, sexo, numeroDeBoletas);
                valor = false;
            }
       }

       buscar.setEnabled(true);
       AdultosMayores.setEnabled(true);
       peliculaMasMujeres.setEnabled(true);
       totalHombresYMujeres.setEnabled(true);
       imprimir.setEnabled(true);
    }//GEN-LAST:event_comprarBoletasActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        teatro.buscar(JOptionPane.showInputDialog("Ingrese el documento a buscar: "));
        
    }//GEN-LAST:event_buscarActionPerformed

    private void peliculaMasMujeresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peliculaMasMujeresActionPerformed
        teatro.masMujeres();
    }//GEN-LAST:event_peliculaMasMujeresActionPerformed

    private void AdultosMayoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdultosMayoresActionPerformed
        teatro.adultosMayores();
    }//GEN-LAST:event_AdultosMayoresActionPerformed

    private void imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirActionPerformed
        teatro.imprimir();
    }//GEN-LAST:event_imprimirActionPerformed

    private void totalHombresYMujeresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalHombresYMujeresActionPerformed
        teatro.totalHombresYMujeres();
    }//GEN-LAST:event_totalHombresYMujeresActionPerformed

    private void carteleraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carteleraActionPerformed
        teatro.cartelera();
    }//GEN-LAST:event_carteleraActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdultosMayores;
    private javax.swing.JButton buscar;
    private javax.swing.JButton cartelera;
    private javax.swing.JButton comprarBoletas;
    private javax.swing.JButton imprimir;
    private javax.swing.JButton insertarPeliculas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton peliculaMasMujeres;
    private javax.swing.JButton totalHombresYMujeres;
    // End of variables declaration//GEN-END:variables
}
