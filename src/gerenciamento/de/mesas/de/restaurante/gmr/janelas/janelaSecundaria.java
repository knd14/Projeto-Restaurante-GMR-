/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciamento.de.mesas.de.restaurante.gmr.janelas;
import gerenciamento.de.mesas.de.restaurante.gmr.Cliente;
import gerenciamento.de.mesas.de.restaurante.gmr.GerenciamentoDeMesasDeRestauranteGMR;
import static gerenciamento.de.mesas.de.restaurante.gmr.GerenciamentoDeMesasDeRestauranteGMR.distanciamentoMesa;
import static gerenciamento.de.mesas.de.restaurante.gmr.GerenciamentoDeMesasDeRestauranteGMR.mesaLivre;
import gerenciamento.de.mesas.de.restaurante.gmr.Mesa;
import javax.swing.JOptionPane;
import visao.MapaMesas;
/**
 *
 * @author luanl
 */


public class janelaSecundaria extends javax.swing.JFrame {

    //public static Mesa.estados OCUPADA;

    public Mesa[][] matMesa;

    /**
     * Creates new form janelaSecundaria
     */
    public janelaSecundaria(Mesa matMesa[][]) {
        initComponents();
        this.matMesa = matMesa;
    }

    private janelaSecundaria() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        btnVerEstadoAtual = new javax.swing.JButton();
        btnOcuparMesa = new javax.swing.JButton();
        btnDesinfectar = new javax.swing.JButton();
        btnReservar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Opções:");

        btnVerEstadoAtual.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnVerEstadoAtual.setText("Ver estado atual");
        btnVerEstadoAtual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerEstadoAtualActionPerformed(evt);
            }
        });

        btnOcuparMesa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnOcuparMesa.setText("Ocupar Mesa");
        btnOcuparMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOcuparMesaActionPerformed(evt);
            }
        });

        btnDesinfectar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDesinfectar.setText("Desinfectar");

        btnReservar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnReservar.setText("Reservar");

        btnVoltar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 0, 0));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnVoltar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnVerEstadoAtual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnOcuparMesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDesinfectar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnReservar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 126, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnVerEstadoAtual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOcuparMesa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDesinfectar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReservar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btnVoltar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.setVisible(false); //fecha a tela de operações
        MapaMesas mesas = new MapaMesas(matMesa);
        mesas.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnVerEstadoAtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerEstadoAtualActionPerformed
        JOptionPane.showMessageDialog(null, "O estado atual da Mesa " + this.matMesa[0][0].getNumeroMesa() + " é: " + this.matMesa[0][0].getEstadoAtual());
    }//GEN-LAST:event_btnVerEstadoAtualActionPerformed

    private void btnOcuparMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOcuparMesaActionPerformed
        //this.matMesa
    }//GEN-LAST:event_btnOcuparMesaActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(janelaSecundaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(janelaSecundaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(janelaSecundaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(janelaSecundaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new janelaSecundaria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDesinfectar;
    private javax.swing.JButton btnOcuparMesa;
    private javax.swing.JButton btnReservar;
    private javax.swing.JButton btnVerEstadoAtual;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
