/*
Classe para configurar a posição dos aneis dos rotores
*/

package simuladorenigma;


public class SetarAneis extends javax.swing.JFrame {

    int pA1 = 1;
    int pA2 = 1;
    int pA3 = 1;

    public int getPa1() {
        return pA1;
    }

    public int getPa2() {
        return pA2;
    }

    public int getPa3() {
        return pA3;
    }
    
    public SetarAneis() {
        initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        parafuso2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        bMaisA1 = new javax.swing.JButton();
        bMenosA1 = new javax.swing.JButton();
        bMaisA2 = new javax.swing.JButton();
        bMenosA2 = new javax.swing.JButton();
        bMaisA3 = new javax.swing.JButton();
        bMenosA3 = new javax.swing.JButton();
        lAnel1 = new javax.swing.JLabel();
        lAnel2 = new javax.swing.JLabel();
        lAnel3 = new javax.swing.JLabel();
        lR1 = new javax.swing.JLabel();
        lR2 = new javax.swing.JLabel();
        lR3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        parafuso = new javax.swing.JLabel();
        parafuso1 = new javax.swing.JLabel();
        parafuso3 = new javax.swing.JLabel();
        parafuso4 = new javax.swing.JLabel();
        parafuso5 = new javax.swing.JLabel();
        parafuso6 = new javax.swing.JLabel();

        parafuso2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/parafuso.png"))); // NOI18N

        setTitle("Configuracao dos Aneis");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(108, 106, 105));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        bMaisA1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bMaisA1.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bMaisA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/setaCima.png"))); // NOI18N
        bMaisA1.setBorder(null);
        bMaisA1.setPreferredSize(new java.awt.Dimension(33, 28));
        bMaisA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMaisA1ActionPerformed(evt);
            }
        });

        bMenosA1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bMenosA1.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bMenosA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/setaBaixo.png"))); // NOI18N
        bMenosA1.setBorder(null);
        bMenosA1.setPreferredSize(new java.awt.Dimension(33, 28));
        bMenosA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMenosA1ActionPerformed(evt);
            }
        });

        bMaisA2.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bMaisA2.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bMaisA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/setaCima.png"))); // NOI18N
        bMaisA2.setBorder(null);
        bMaisA2.setPreferredSize(new java.awt.Dimension(33, 28));
        bMaisA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMaisA2ActionPerformed(evt);
            }
        });

        bMenosA2.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bMenosA2.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bMenosA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/setaBaixo.png"))); // NOI18N
        bMenosA2.setBorder(null);
        bMenosA2.setPreferredSize(new java.awt.Dimension(33, 28));
        bMenosA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMenosA2ActionPerformed(evt);
            }
        });

        bMaisA3.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bMaisA3.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bMaisA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/setaCima.png"))); // NOI18N
        bMaisA3.setBorder(null);
        bMaisA3.setPreferredSize(new java.awt.Dimension(33, 28));
        bMaisA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMaisA3ActionPerformed(evt);
            }
        });

        bMenosA3.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bMenosA3.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        bMenosA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/setaBaixo.png"))); // NOI18N
        bMenosA3.setBorder(null);
        bMenosA3.setPreferredSize(new java.awt.Dimension(33, 28));
        bMenosA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMenosA3ActionPerformed(evt);
            }
        });

        lAnel1.setBackground(new java.awt.Color(255, 255, 255));
        lAnel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lAnel1.setForeground(new java.awt.Color(255, 255, 255));
        lAnel1.setText("1");
        lAnel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lAnel1.setPreferredSize(new java.awt.Dimension(12, 19));

        lAnel2.setBackground(new java.awt.Color(255, 255, 255));
        lAnel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lAnel2.setForeground(new java.awt.Color(255, 255, 255));
        lAnel2.setText("1");
        lAnel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lAnel2.setPreferredSize(new java.awt.Dimension(12, 19));

        lAnel3.setBackground(new java.awt.Color(255, 255, 255));
        lAnel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lAnel3.setForeground(new java.awt.Color(255, 255, 255));
        lAnel3.setText("1");
        lAnel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lAnel3.setPreferredSize(new java.awt.Dimension(12, 19));

        lR1.setBackground(new java.awt.Color(255, 255, 255));
        lR1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lR1.setForeground(new java.awt.Color(255, 255, 255));
        lR1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lR1.setPreferredSize(new java.awt.Dimension(12, 19));

        lR2.setBackground(new java.awt.Color(255, 255, 255));
        lR2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lR2.setForeground(new java.awt.Color(255, 255, 255));
        lR2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lR2.setPreferredSize(new java.awt.Dimension(12, 19));

        lR3.setBackground(new java.awt.Color(255, 255, 255));
        lR3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lR3.setForeground(new java.awt.Color(255, 255, 255));
        lR3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lR3.setPreferredSize(new java.awt.Dimension(12, 19));

        jLabel1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        jLabel1.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/rotor.png"))); // NOI18N

        jLabel2.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        jLabel2.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/rotor.png"))); // NOI18N

        jLabel3.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        jLabel3.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/rotor.png"))); // NOI18N

        parafuso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/parafuso.png"))); // NOI18N

        parafuso1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/parafuso.png"))); // NOI18N

        parafuso3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/parafuso.png"))); // NOI18N

        parafuso4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/parafuso.png"))); // NOI18N

        parafuso5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/parafuso.png"))); // NOI18N

        parafuso6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladorenigma/botoesEnigma/parafuso.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bMaisA1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bMenosA1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lAnel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lR1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bMaisA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bMenosA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lAnel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(parafuso5)
                            .addComponent(lR2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(parafuso6))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lAnel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lR3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bMenosA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bMaisA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(parafuso4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(parafuso))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(parafuso3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(parafuso1))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lAnel1, lAnel2, lAnel3, lR1, lR2, lR3});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(parafuso, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(parafuso5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bMaisA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bMaisA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bMaisA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lR1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                                    .addComponent(lAnel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bMenosA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lR3, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                                    .addComponent(lAnel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bMenosA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lR2, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                                    .addComponent(lAnel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bMenosA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(parafuso1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(parafuso6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(parafuso4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(parafuso3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lAnel1, lAnel2, lAnel3, lR1, lR2, lR3});

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

    private void bMenosA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMenosA1ActionPerformed
        if( pA1 >= 2 )
            pA1--;
        else
            pA1 = 26;
        lAnel1.setText(""+pA1);
    }//GEN-LAST:event_bMenosA1ActionPerformed

    private void bMenosA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMenosA2ActionPerformed
        if( pA2 >= 2 )
            pA2--;
        else
            pA2 = 26;
        lAnel2.setText(""+pA2);
    }//GEN-LAST:event_bMenosA2ActionPerformed

    private void bMenosA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMenosA3ActionPerformed
        if( pA3 >= 2 )
            pA3--;
        else
            pA3 = 26;
        lAnel3.setText(""+pA3);
    }//GEN-LAST:event_bMenosA3ActionPerformed

    private void bMaisA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMaisA1ActionPerformed
        if(pA1 <= 25)
            pA1++;
        else
            pA1 = 1;
        lAnel1.setText(""+pA1);
    }//GEN-LAST:event_bMaisA1ActionPerformed


    private void bMaisA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMaisA2ActionPerformed
        if(pA2 <= 25)
            pA2++;
        else
            pA2 = 1;
        lAnel2.setText(""+pA2);
    }//GEN-LAST:event_bMaisA2ActionPerformed

    private void bMaisA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMaisA3ActionPerformed
        if(pA3 <= 25)
            pA3++;
        else
            pA3 = 1;
        lAnel3.setText(""+pA3);
    }//GEN-LAST:event_bMaisA3ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
       //
    }//GEN-LAST:event_formWindowClosed
    
    public void iniciarVariaveis(int a, int b, int c){
        lR1.setText(""+a);
        lR2.setText(""+b);
        lR3.setText(""+c);    
    }
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
            java.util.logging.Logger.getLogger(SetarAneis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SetarAneis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SetarAneis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SetarAneis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SetarAneis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bMaisA1;
    private javax.swing.JButton bMaisA2;
    private javax.swing.JButton bMaisA3;
    private javax.swing.JButton bMenosA1;
    private javax.swing.JButton bMenosA2;
    private javax.swing.JButton bMenosA3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lAnel1;
    private javax.swing.JLabel lAnel2;
    private javax.swing.JLabel lAnel3;
    private javax.swing.JLabel lR1;
    private javax.swing.JLabel lR2;
    private javax.swing.JLabel lR3;
    private javax.swing.JLabel parafuso;
    private javax.swing.JLabel parafuso1;
    private javax.swing.JLabel parafuso2;
    private javax.swing.JLabel parafuso3;
    private javax.swing.JLabel parafuso4;
    private javax.swing.JLabel parafuso5;
    private javax.swing.JLabel parafuso6;
    // End of variables declaration//GEN-END:variables

}
