/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;


import gerenciamento.de.mesas.de.restaurante.gmr.Mesa;
import static gerenciamento.de.mesas.de.restaurante.gmr.Mesa.estados.DISTANCIAMENTO_SOCIAL;
import javax.swing.JOptionPane;


/**
 *
 * @author laram
 */
public class MapaMesas extends javax.swing.JFrame {

    public Mesa[][] matMesa;

    /**
     * Creates new form MapaMesas
     * @param vetMesa
     */
    public MapaMesas(Mesa matMesa[][]) {
        initComponents();
        this.matMesa = matMesa;
    }

    private MapaMesas() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        MESA1 = new javax.swing.JButton();
        MESA2 = new javax.swing.JButton();
        MESA3 = new javax.swing.JButton();
        MESA4 = new javax.swing.JButton();
        MESA5 = new javax.swing.JButton();
        mesa9 = new javax.swing.JButton();
        mesa10 = new javax.swing.JButton();
        mesa14 = new javax.swing.JButton();
        mesa15 = new javax.swing.JButton();
        MESA6 = new javax.swing.JButton();
        MESA7 = new javax.swing.JButton();
        mesa8 = new javax.swing.JButton();
        mesa11 = new javax.swing.JButton();
        mesa12 = new javax.swing.JButton();
        mesa13 = new javax.swing.JButton();
        mesa16 = new javax.swing.JButton();
        mesa17 = new javax.swing.JButton();
        mesa18 = new javax.swing.JButton();
        mesa19 = new javax.swing.JButton();
        mesa20 = new javax.swing.JButton();
        mesa21 = new javax.swing.JButton();
        mesa22 = new javax.swing.JButton();
        mesa23 = new javax.swing.JButton();
        mesa24 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        mesa25 = new javax.swing.JButton();
        mesa26 = new javax.swing.JButton();
        mesa27 = new javax.swing.JButton();
        mesa28 = new javax.swing.JButton();
        mesa29 = new javax.swing.JButton();
        mesa30 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel1.setText("GERENCIAMENTO DE MESAS DE RESTAURANTE (GMR) ");

        MESA1.setText("MESA 01");
        MESA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MESA1ActionPerformed(evt);
            }
        });

        MESA2.setText("MESA 02");
        MESA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MESA2ActionPerformed(evt);
            }
        });

        MESA3.setText("MESA 03");

        MESA4.setText("MESA 04");

        MESA5.setText("MESA 05");

        mesa9.setText("MESA 09");

        mesa10.setText("MESA 10");

        mesa14.setText("MESA 14");

        mesa15.setText("MESA 15");

        MESA6.setText("MESA 06");

        MESA7.setText("MESA 07");

        mesa8.setText("MESA 08");

        mesa11.setText("MESA 11");
        mesa11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesa11ActionPerformed(evt);
            }
        });

        mesa12.setText("MESA 12");
        mesa12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesa12ActionPerformed(evt);
            }
        });

        mesa13.setText("MESA 13");

        mesa16.setText("MESA 16");
        mesa16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesa16ActionPerformed(evt);
            }
        });

        mesa17.setText("MESA 17");

        mesa18.setText("MESA 18");

        mesa19.setText("MESA 19");
        mesa19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesa19ActionPerformed(evt);
            }
        });

        mesa20.setText("MESA 20");

        mesa21.setText("MESA 21");
        mesa21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesa21ActionPerformed(evt);
            }
        });

        mesa22.setText("MESA 22");
        mesa22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesa22ActionPerformed(evt);
            }
        });

        mesa23.setText("MESA 23");

        mesa24.setText("MESA 24");

        jLabel2.setText("estado2");

        jLabel3.setText("estado3");

        jLabel4.setText("estado4");

        jLabel5.setText("estado5");

        jLabel6.setText("estado6");

        jLabel7.setText("estado7");

        jLabel8.setText("estado8");

        jLabel9.setText("estado9");

        jLabel10.setText("estado10");

        jLabel11.setText("estado11");

        jLabel12.setText("estado12");

        jLabel13.setText("estado13");

        jLabel14.setText("estado14");

        jLabel15.setText("estado15");

        jLabel16.setText("estado16");

        jLabel17.setText("estado17");

        jLabel18.setText("estado18");

        jLabel19.setText("estado19");

        jLabel20.setText("estado20");

        jLabel21.setText("estado21");

        jLabel22.setText("estado22");

        jLabel23.setText("estado23");

        jLabel24.setText("estado24");

        jButton2.setText("Estado");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel7)
                .addGap(64, 64, 64)
                .addComponent(jLabel8)
                .addGap(53, 53, 53)
                .addComponent(jLabel9)
                .addGap(56, 56, 56)
                .addComponent(jLabel10)
                .addGap(42, 42, 42)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(43, 43, 43))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel13)
                .addGap(61, 61, 61)
                .addComponent(jLabel14)
                .addGap(48, 48, 48)
                .addComponent(jLabel15)
                .addGap(47, 47, 47)
                .addComponent(jLabel16)
                .addGap(49, 49, 49)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(38, 38, 38))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MESA7)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MESA1)
                            .addComponent(mesa13)
                            .addComponent(mesa19)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel19))
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(29, 29, 29)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(105, 105, 105)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(mesa9)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(mesa10)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(mesa11)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(mesa12))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(MESA3)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(MESA4)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(MESA5)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(MESA6))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(mesa15)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addComponent(mesa21)
                                                            .addGap(18, 18, 18)
                                                            .addComponent(mesa22)
                                                            .addGap(18, 18, 18)
                                                            .addComponent(mesa23)))
                                                    .addGap(0, 0, Short.MAX_VALUE))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(mesa14)
                                                        .addComponent(mesa8)
                                                        .addComponent(MESA2))
                                                    .addGap(125, 125, 125)
                                                    .addComponent(mesa16))
                                                .addComponent(mesa20))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(18, 18, 18)
                                                    .addComponent(mesa17)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(mesa18))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(125, 125, 125)
                                                    .addComponent(mesa24))))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(46, 46, 46)
                                    .addComponent(jLabel20)
                                    .addGap(45, 45, 45)
                                    .addComponent(jLabel21)
                                    .addGap(47, 47, 47)
                                    .addComponent(jLabel22)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel23)
                                    .addGap(55, 55, 55)
                                    .addComponent(jLabel24)
                                    .addGap(13, 13, 13)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel2)
                                .addGap(61, 61, 61)
                                .addComponent(jLabel3)
                                .addGap(53, 53, 53)
                                .addComponent(jLabel4)
                                .addGap(53, 53, 53)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(9, 9, 9)))))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MESA1)
                            .addComponent(MESA2)
                            .addComponent(MESA3)
                            .addComponent(MESA4)
                            .addComponent(MESA5)
                            .addComponent(MESA6))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MESA7)
                            .addComponent(mesa8)
                            .addComponent(mesa9)
                            .addComponent(mesa10)
                            .addComponent(mesa11)
                            .addComponent(mesa12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mesa13)
                            .addComponent(mesa14)
                            .addComponent(mesa15)
                            .addComponent(mesa16)
                            .addComponent(mesa17)
                            .addComponent(mesa18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mesa19)
                            .addComponent(mesa20)
                            .addComponent(mesa21)
                            .addComponent(mesa22)
                            .addComponent(mesa23)
                            .addComponent(mesa24))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel19))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel24)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel21))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(jLabel20)
                        .addContainerGap())))
        );

        mesa25.setText("MESA 25");
        mesa25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesa25ActionPerformed(evt);
            }
        });

        mesa26.setText("MESA 26");
        mesa26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesa26ActionPerformed(evt);
            }
        });

        mesa27.setText("MESA 27");
        mesa27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesa27ActionPerformed(evt);
            }
        });

        mesa28.setText("MESA 28");

        mesa29.setText("MESA 29");

        mesa30.setText("MESA 30");

        jLabel25.setText("estado25");

        jLabel26.setText("estado26");

        jLabel27.setText("estado27");

        jLabel28.setText("estado28");

        jLabel29.setText("estado29");

        jLabel30.setText("estado30");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel25)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel26))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(mesa25)
                        .addGap(26, 26, 26)
                        .addComponent(mesa26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(mesa27)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel27)
                        .addGap(27, 27, 27)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mesa28)
                        .addGap(18, 18, 18)
                        .addComponent(mesa29)
                        .addGap(18, 18, 18)
                        .addComponent(mesa30))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel28)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel29)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel30)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mesa25)
                    .addComponent(mesa26)
                    .addComponent(mesa27)
                    .addComponent(mesa28)
                    .addComponent(mesa29)
                    .addComponent(mesa30))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(660, 505));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mesa16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesa16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mesa16ActionPerformed

    private void mesa11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesa11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mesa11ActionPerformed

    private void mesa12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesa12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mesa12ActionPerformed

    private void mesa21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesa21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mesa21ActionPerformed

    private void mesa22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesa22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mesa22ActionPerformed

    private void MESA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MESA2ActionPerformed
        if(matMesa[0][1].getEstadoAtual() == DISTANCIAMENTO_SOCIAL){
            JOptionPane.showMessageDialog(null, "Aviso: A mesa " + this.matMesa[0][1].getNumeroMesa() + " está bloqueada por " + this.matMesa[0][1].getEstadoAtual());
        }
    }//GEN-LAST:event_MESA2ActionPerformed

    private void mesa19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesa19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mesa19ActionPerformed

    private void mesa26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesa26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mesa26ActionPerformed

    private void mesa27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesa27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mesa27ActionPerformed

    private void mesa25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesa25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mesa25ActionPerformed

    private void MESA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MESA1ActionPerformed
        
        janelaMesa1 jMesa1 = new janelaMesa1(this.matMesa);
        jMesa1.setVisible(true);
        dispose();
    }//GEN-LAST:event_MESA1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JOptionPane.showMessageDialog(null, "O estado atual da Mesa " + this.matMesa[0][0].getNumeroMesa() + " é: " + this.matMesa[0][0].getEstadoAtual());
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(MapaMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MapaMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MapaMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MapaMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MapaMesas().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MESA1;
    private javax.swing.JButton MESA2;
    private javax.swing.JButton MESA3;
    private javax.swing.JButton MESA4;
    private javax.swing.JButton MESA5;
    private javax.swing.JButton MESA6;
    private javax.swing.JButton MESA7;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton mesa10;
    private javax.swing.JButton mesa11;
    private javax.swing.JButton mesa12;
    private javax.swing.JButton mesa13;
    private javax.swing.JButton mesa14;
    private javax.swing.JButton mesa15;
    private javax.swing.JButton mesa16;
    private javax.swing.JButton mesa17;
    private javax.swing.JButton mesa18;
    private javax.swing.JButton mesa19;
    private javax.swing.JButton mesa20;
    private javax.swing.JButton mesa21;
    private javax.swing.JButton mesa22;
    private javax.swing.JButton mesa23;
    private javax.swing.JButton mesa24;
    private javax.swing.JButton mesa25;
    private javax.swing.JButton mesa26;
    private javax.swing.JButton mesa27;
    private javax.swing.JButton mesa28;
    private javax.swing.JButton mesa29;
    private javax.swing.JButton mesa30;
    private javax.swing.JButton mesa8;
    private javax.swing.JButton mesa9;
    // End of variables declaration//GEN-END:variables
}
