/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyecto.ejerciciouno;


public class Menu extends javax.swing.JFrame {

    EscenariosBienestar escenarioBienestar = new EscenariosBienestar();
    
    public Menu() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        insertarAsistencia = new javax.swing.JButton();
        funcionalidades = new javax.swing.JButton();
        Escenarios = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        consultar = new javax.swing.JButton();
        llenar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        mostrarDatos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("ESCENARIOS ");

        insertarAsistencia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        insertarAsistencia.setText("Insertar Asistencia");
        insertarAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarAsistenciaActionPerformed(evt);
            }
        });

        funcionalidades.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        funcionalidades.setText("Funcionalidades");
        funcionalidades.setEnabled(false);
        funcionalidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcionalidadesActionPerformed(evt);
            }
        });

        Escenarios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Escenarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GYM", "Teatro Bellas Artes", "Canchas Sinteticas", "Restaurante Escolar" }));
        Escenarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EscenariosActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Escoja el Escenario");

        consultar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        consultar.setText("Consultar");
        consultar.setEnabled(false);
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });

        llenar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        llenar.setText("Llenar");
        llenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llenarActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        mostrarDatos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mostrarDatos.setText("Mostrar Datos");
        mostrarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 28, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(insertarAsistencia)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel2)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(Escenarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(llenar)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(consultar)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(funcionalidades)
                                .addGap(95, 95, 95))))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(mostrarDatos)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertarAsistencia)
                    .addComponent(llenar)
                    .addComponent(funcionalidades))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Escenarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultar))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(mostrarDatos)
                .addContainerGap(213, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertarAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarAsistenciaActionPerformed
        escenarioBienestar.insertarDatos();
        funcionalidades.setEnabled(true);
        consultar.setEnabled(true);
    }//GEN-LAST:event_insertarAsistenciaActionPerformed

    private void funcionalidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcionalidadesActionPerformed
        escenarioBienestar.escenarioMasVisitado();
        escenarioBienestar.escenarioMenosVisitado();
        escenarioBienestar.totalYPromedioDeVisitantes();
        escenarioBienestar.diaMasVisitado();
        escenarioBienestar.diaMenosVisitado();
    }//GEN-LAST:event_funcionalidadesActionPerformed

    private void EscenariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EscenariosActionPerformed
        
    }//GEN-LAST:event_EscenariosActionPerformed

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        String escenario = Escenarios.getSelectedItem().toString();
        escenarioBienestar.diaMasYMenosVisitadoPorEscenario(escenario);
    }//GEN-LAST:event_consultarActionPerformed

    private void llenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llenarActionPerformed
        escenarioBienestar.llenar();
        funcionalidades.setEnabled(true);
        consultar.setEnabled(true);
    }//GEN-LAST:event_llenarActionPerformed

    private void mostrarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarDatosActionPerformed
        String matriz[][] = escenarioBienestar.llenarTabla();
        String array[] = {"","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado"};
        tabla.setModel(new javax.swing.table.DefaultTableModel(matriz, array));
    }//GEN-LAST:event_mostrarDatosActionPerformed

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
    private javax.swing.JComboBox<String> Escenarios;
    private javax.swing.JButton consultar;
    private javax.swing.JButton funcionalidades;
    private javax.swing.JButton insertarAsistencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton llenar;
    private javax.swing.JButton mostrarDatos;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
