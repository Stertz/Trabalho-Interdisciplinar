/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;

/**
 *
 * @author jpmon
 */
public class OffDesktop extends javax.swing.JFrame {

    /**
     * Creates new form HomeDesktop
     */
    public OffDesktop() {
        initComponents();     
        jLMensagemUsuario.setText("Olá! " + CryptoQuestionClient.ccont.user.getNameUser());
        
        setIconImage(getIconImage());
        }
    
    public final Image getIconImage() {
        Image icone = Toolkit.getDefaultToolkit().getImage("src/view/util/logoBarra.png");
        return icone;
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPBackGround = new javax.swing.JPanel();
        jLTaxa = new javax.swing.JLabel();
        jLHome = new javax.swing.JLabel();
        jLOnOff = new javax.swing.JLabel();
        jLClients = new javax.swing.JLabel();
        jPBorda = new javax.swing.JPanel();
        jLLogo = new javax.swing.JLabel();
        jLMensagemUsuario = new javax.swing.JLabel();
        jLFotoPerfil = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jBEntrar = new javax.swing.JButton();
        jBEntrar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Encerrar - Crypto Question");
        setResizable(false);

        jPBackGround.setBackground(new java.awt.Color(255, 255, 255));
        jPBackGround.setPreferredSize(new java.awt.Dimension(640, 400));

        jLTaxa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/util/taxa.png"))); // NOI18N
        jLTaxa.setToolTipText("Botão para tela Taxas.");
        jLTaxa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLTaxaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLTaxaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLTaxaMouseExited(evt);
            }
        });

        jLHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/util/home.png"))); // NOI18N
        jLHome.setToolTipText("Botão para Tela Inicial.");
        jLHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLHomeMouseClicked(evt);
            }
        });

        jLOnOff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/util/onoffHover.png"))); // NOI18N
        jLOnOff.setToolTipText("Botão para tela Encerrar o Programa.");
        jLOnOff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLOnOffMouseClicked(evt);
            }
        });

        jLClients.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/util/clients.png"))); // NOI18N
        jLClients.setToolTipText("Botão para tela Clientes.");
        jLClients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLClientsMouseClicked(evt);
            }
        });

        jPBorda.setBackground(new java.awt.Color(217, 217, 217));
        jPBorda.setPreferredSize(new java.awt.Dimension(2, 0));

        javax.swing.GroupLayout jPBordaLayout = new javax.swing.GroupLayout(jPBorda);
        jPBorda.setLayout(jPBordaLayout);
        jPBordaLayout.setHorizontalGroup(
            jPBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPBordaLayout.setVerticalGroup(
            jPBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/util/logo.png"))); // NOI18N

        jLMensagemUsuario.setForeground(new java.awt.Color(25, 25, 25));
        jLMensagemUsuario.setText("Olá Administrador");

        jLFotoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/util/fotoPerfil.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("<html>Você tem certeza que deseja encerrar o programa?</html>");

        jBEntrar.setBackground(new java.awt.Color(255, 189, 34));
        jBEntrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBEntrar.setForeground(new java.awt.Color(2, 62, 116));
        jBEntrar.setText("Confirmar");
        jBEntrar.setToolTipText("Clique para finalizar o programa!");
        jBEntrar.setBorderPainted(false);
        jBEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEntrarActionPerformed(evt);
            }
        });

        jBEntrar1.setBackground(new java.awt.Color(255, 189, 34));
        jBEntrar1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBEntrar1.setForeground(new java.awt.Color(2, 62, 116));
        jBEntrar1.setText("Cancelar");
        jBEntrar1.setToolTipText("Clique para cancelar e retornar à Tela Inicial.");
        jBEntrar1.setBorderPainted(false);
        jBEntrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEntrar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPBackGroundLayout = new javax.swing.GroupLayout(jPBackGround);
        jPBackGround.setLayout(jPBackGroundLayout);
        jPBackGroundLayout.setHorizontalGroup(
            jPBackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBackGroundLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPBackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLOnOff)
                    .addComponent(jLHome)
                    .addComponent(jLClients)
                    .addComponent(jLTaxa))
                .addGap(18, 18, 18)
                .addComponent(jPBorda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPBackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPBackGroundLayout.createSequentialGroup()
                        .addComponent(jBEntrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jBEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPBackGroundLayout.createSequentialGroup()
                        .addComponent(jLFotoPerfil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLMensagemUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                        .addComponent(jLLogo)
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(jPBackGroundLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPBackGroundLayout.setVerticalGroup(
            jPBackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBackGroundLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLHome)
                .addGap(61, 61, 61)
                .addComponent(jLTaxa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jLClients)
                .addGap(61, 61, 61)
                .addComponent(jLOnOff)
                .addGap(68, 68, 68))
            .addComponent(jPBorda, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(jPBackGroundLayout.createSequentialGroup()
                .addGroup(jPBackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPBackGroundLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPBackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLLogo)
                            .addComponent(jLFotoPerfil)))
                    .addGroup(jPBackGroundLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLMensagemUsuario)))
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addGroup(jPBackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBEntrar)
                    .addComponent(jBEntrar1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPBackGround, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPBackGround, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLHomeMouseClicked
        // TODO add your handling code here:
        HomeDesktop scrHome = new HomeDesktop();
        scrHome.setVisible(true); // chamando a tela form principal
        dispose(); // fechando  tela login
    }//GEN-LAST:event_jLHomeMouseClicked

    private void jLTaxaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLTaxaMouseExited
        // TODO add your handling code here:
        // jLTaxa.setVisible(true);
    }//GEN-LAST:event_jLTaxaMouseExited

    private void jLTaxaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLTaxaMouseEntered
        // TODO add your handling code here:
        // jLTaxa.setVisible(false);
    }//GEN-LAST:event_jLTaxaMouseEntered

    private void jLTaxaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLTaxaMouseClicked
        // TODO add your handling code here:
        TaxaDesktop scrTaxa = new TaxaDesktop();
        scrTaxa.setVisible(true); // chamando a tela form principal
        dispose(); // fechando  tela login
    }//GEN-LAST:event_jLTaxaMouseClicked

    private void jLClientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLClientsMouseClicked
        // TODO add your handling code here:
        
        ClientsDesktop scrClients = new ClientsDesktop();
        scrClients.setVisible(true); // chamando a tela form principal
        dispose(); // fechando  tela login
    }//GEN-LAST:event_jLClientsMouseClicked

    private void jLOnOffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLOnOffMouseClicked
        // TODO add your handling code here:
        OffDesktop scrOff = new OffDesktop();
        scrOff.setVisible(true); // chamando a tela form principal
        dispose(); // fechando  tela login
    }//GEN-LAST:event_jLOnOffMouseClicked

    private void jBEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEntrarActionPerformed
        dispose();
    }//GEN-LAST:event_jBEntrarActionPerformed

    private void jBEntrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEntrar1ActionPerformed
        // TODO add your handling code here:
        HomeDesktop scrHome = new HomeDesktop();
        scrHome.setVisible(true); // chamando a tela form principal
        dispose(); // fechando  tela login
    }//GEN-LAST:event_jBEntrar1ActionPerformed

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
            java.util.logging.Logger.getLogger(OffDesktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OffDesktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OffDesktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OffDesktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OffDesktop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEntrar;
    private javax.swing.JButton jBEntrar1;
    private javax.swing.JLabel jLClients;
    private javax.swing.JLabel jLFotoPerfil;
    private javax.swing.JLabel jLHome;
    private javax.swing.JLabel jLLogo;
    private javax.swing.JLabel jLMensagemUsuario;
    private javax.swing.JLabel jLOnOff;
    private javax.swing.JLabel jLTaxa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPBackGround;
    private javax.swing.JPanel jPBorda;
    // End of variables declaration//GEN-END:variables
}
