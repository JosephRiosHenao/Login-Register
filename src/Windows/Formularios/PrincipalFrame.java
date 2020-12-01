/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Windows.Formularios;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author RiosHenao
 */
public class PrincipalFrame extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalFrame
     */
    public PrincipalFrame() {
        initComponents();
        jLabel2.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Resources/ProfileIconDefault.png")).getImage().getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH))); 
        jLabel1.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Resources/MenuButton.png")).getImage().getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH))); 
        HomeIcon.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Resources/HomeIcon.png")).getImage().getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH))); 
        CloudIcon.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Resources/CloudIcon.png")).getImage().getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH))); 
        FilesIcon.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Resources/FilesIcon.png")).getImage().getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH))); 
        DocumentIcon.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Resources/DocumentIcon.png")).getImage().getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH))); 
        ConfigIcon.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Resources/ConfigIcon.png")).getImage().getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH))); 
        InfoIcon.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Resources/InfoIcon.png")).getImage().getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH))); 

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VentanaContenedora = new javax.swing.JPanel();
        IconsBorder = new javax.swing.JPanel();
        HomeIcon = new javax.swing.JLabel();
        CloudIcon = new javax.swing.JLabel();
        FilesIcon = new javax.swing.JLabel();
        DocumentIcon = new javax.swing.JLabel();
        ConfigIcon = new javax.swing.JLabel();
        InfoIcon = new javax.swing.JLabel();
        BordeSuperior = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PanelOne = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        VentanaContenedora.setLayout(new java.awt.BorderLayout());

        IconsBorder.setBackground(new java.awt.Color(97, 157, 111));
        IconsBorder.setAlignmentX(0.0F);
        IconsBorder.setAlignmentY(0.0F);
        IconsBorder.setLayout(new java.awt.GridLayout(6, 1));

        HomeIcon.setBackground(new java.awt.Color(97, 157, 111));
        HomeIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HomeIcon.setAlignmentY(0.0F);
        HomeIcon.setOpaque(true);
        HomeIcon.setPreferredSize(new java.awt.Dimension(100, 101));
        HomeIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HomeIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HomeIconMouseExited(evt);
            }
        });
        IconsBorder.add(HomeIcon);

        CloudIcon.setBackground(new java.awt.Color(97, 157, 111));
        CloudIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CloudIcon.setOpaque(true);
        CloudIcon.setPreferredSize(new java.awt.Dimension(100, 100));
        CloudIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloudIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CloudIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CloudIconMouseExited(evt);
            }
        });
        IconsBorder.add(CloudIcon);

        FilesIcon.setBackground(new java.awt.Color(97, 157, 111));
        FilesIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FilesIcon.setOpaque(true);
        FilesIcon.setPreferredSize(new java.awt.Dimension(100, 100));
        FilesIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FilesIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FilesIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FilesIconMouseExited(evt);
            }
        });
        IconsBorder.add(FilesIcon);

        DocumentIcon.setBackground(new java.awt.Color(97, 157, 111));
        DocumentIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DocumentIcon.setOpaque(true);
        DocumentIcon.setPreferredSize(new java.awt.Dimension(100, 100));
        DocumentIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DocumentIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DocumentIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DocumentIconMouseExited(evt);
            }
        });
        IconsBorder.add(DocumentIcon);

        ConfigIcon.setBackground(new java.awt.Color(97, 157, 111));
        ConfigIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ConfigIcon.setOpaque(true);
        ConfigIcon.setPreferredSize(new java.awt.Dimension(100, 100));
        ConfigIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConfigIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ConfigIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ConfigIconMouseExited(evt);
            }
        });
        IconsBorder.add(ConfigIcon);

        InfoIcon.setBackground(new java.awt.Color(97, 157, 111));
        InfoIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InfoIcon.setOpaque(true);
        InfoIcon.setPreferredSize(new java.awt.Dimension(100, 100));
        InfoIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InfoIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                InfoIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                InfoIconMouseExited(evt);
            }
        });
        IconsBorder.add(InfoIcon);

        VentanaContenedora.add(IconsBorder, java.awt.BorderLayout.WEST);

        BordeSuperior.setBackground(new java.awt.Color(113, 177, 128));
        BordeSuperior.setLayout(new java.awt.BorderLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setPreferredSize(new java.awt.Dimension(100, 100));
        BordeSuperior.add(jLabel1, java.awt.BorderLayout.LINE_START);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setPreferredSize(new java.awt.Dimension(100, 100));
        BordeSuperior.add(jLabel2, java.awt.BorderLayout.LINE_END);

        VentanaContenedora.add(BordeSuperior, java.awt.BorderLayout.PAGE_START);

        PanelOne.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelOneLayout = new javax.swing.GroupLayout(PanelOne);
        PanelOne.setLayout(PanelOneLayout);
        PanelOneLayout.setHorizontalGroup(
            PanelOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 556, Short.MAX_VALUE)
        );
        PanelOneLayout.setVerticalGroup(
            PanelOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        VentanaContenedora.add(PanelOne, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VentanaContenedora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VentanaContenedora, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeIconMouseEntered
        // TODO add your handling code here:
        if (HomeIcon.getBackground()!=Color.WHITE){
            HomeIcon.setBackground(new java.awt.Color(143, 195, 155));
        }
    }//GEN-LAST:event_HomeIconMouseEntered

    private void HomeIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeIconMouseExited
        // TODO add your handling code here:
        if (HomeIcon.getBackground()!=Color.WHITE){
            HomeIcon.setBackground(new java.awt.Color(97,157,111));
        }
    }//GEN-LAST:event_HomeIconMouseExited

    private void CloudIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloudIconMouseEntered
        // TODO add your handling code here:
        if (CloudIcon.getBackground()!=Color.WHITE){
            CloudIcon.setBackground(new java.awt.Color(143, 195, 155));
        }
    }//GEN-LAST:event_CloudIconMouseEntered

    private void CloudIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloudIconMouseExited
        // TODO add your handling code here:
        if (CloudIcon.getBackground()!=Color.WHITE){
            CloudIcon.setBackground(new java.awt.Color(97,157,111));
        }        
    }//GEN-LAST:event_CloudIconMouseExited

    private void FilesIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FilesIconMouseEntered
        // TODO add your handling code here:
        if (FilesIcon.getBackground()!=Color.WHITE){
            FilesIcon.setBackground(new java.awt.Color(143, 195, 155));
        }
        
    }//GEN-LAST:event_FilesIconMouseEntered

    private void FilesIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FilesIconMouseExited
        // TODO add your handling code here:
        if (FilesIcon.getBackground()!=Color.WHITE){
            FilesIcon.setBackground(new java.awt.Color(97,157,111));
        }
    }//GEN-LAST:event_FilesIconMouseExited

    private void DocumentIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DocumentIconMouseEntered
        // TODO add your handling code here:
        if (DocumentIcon.getBackground()!=Color.WHITE){
            DocumentIcon.setBackground(new java.awt.Color(143, 195, 155));
        }
    }//GEN-LAST:event_DocumentIconMouseEntered

    private void DocumentIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DocumentIconMouseExited
        // TODO add your handling code here:
        if (DocumentIcon.getBackground()!=Color.WHITE){
            DocumentIcon.setBackground(new java.awt.Color(97,157,111));
        }
    }//GEN-LAST:event_DocumentIconMouseExited

    private void ConfigIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfigIconMouseEntered
        // TODO add your handling code here:
        if (ConfigIcon.getBackground()!=Color.WHITE){
            ConfigIcon.setBackground(new java.awt.Color(143, 195, 155));
        }
    }//GEN-LAST:event_ConfigIconMouseEntered

    private void ConfigIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfigIconMouseExited
        // TODO add your handling code here:
        if (ConfigIcon.getBackground()!=Color.WHITE){
            ConfigIcon.setBackground(new java.awt.Color(97,157,111));
        }
    }//GEN-LAST:event_ConfigIconMouseExited

    private void InfoIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InfoIconMouseEntered
        // TODO add your handling code here:
        if (InfoIcon.getBackground()!=Color.WHITE){
            InfoIcon.setBackground(new java.awt.Color(143, 195, 155));
        }
    }//GEN-LAST:event_InfoIconMouseEntered

    private void InfoIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InfoIconMouseExited
        // TODO add your handling code here:
        if (InfoIcon.getBackground()!=Color.WHITE){
            InfoIcon.setBackground(new java.awt.Color(97,157,111));
        }
    }//GEN-LAST:event_InfoIconMouseExited

    private void HomeIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeIconMouseClicked
        // TODO add your handling code here:
        HomeIcon.setBackground(Color.WHITE);
        CloudIcon.setBackground(new java.awt.Color(97,157,111));
        FilesIcon.setBackground(new java.awt.Color(97,157,111));
        DocumentIcon.setBackground(new java.awt.Color(97,157,111));
        ConfigIcon.setBackground(new java.awt.Color(97,157,111));
        InfoIcon.setBackground(new java.awt.Color(97,157,111));
        
    }//GEN-LAST:event_HomeIconMouseClicked

    private void CloudIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloudIconMouseClicked
        // TODO add your handling code here:
        CloudIcon.setBackground(Color.WHITE);
        HomeIcon.setBackground(new java.awt.Color(97,157,111));
        FilesIcon.setBackground(new java.awt.Color(97,157,111));
        DocumentIcon.setBackground(new java.awt.Color(97,157,111));
        ConfigIcon.setBackground(new java.awt.Color(97,157,111));
        InfoIcon.setBackground(new java.awt.Color(97,157,111));
    }//GEN-LAST:event_CloudIconMouseClicked

    private void FilesIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FilesIconMouseClicked
        // TODO add your handling code here:
        FilesIcon.setBackground(Color.WHITE);
        HomeIcon.setBackground(new java.awt.Color(97,157,111));
        CloudIcon.setBackground(new java.awt.Color(97,157,111));
        DocumentIcon.setBackground(new java.awt.Color(97,157,111));
        ConfigIcon.setBackground(new java.awt.Color(97,157,111));
        InfoIcon.setBackground(new java.awt.Color(97,157,111));
    }//GEN-LAST:event_FilesIconMouseClicked

    private void DocumentIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DocumentIconMouseClicked
        // TODO add your handling code here:
        DocumentIcon.setBackground(Color.WHITE);
        HomeIcon.setBackground(new java.awt.Color(97,157,111));
        CloudIcon.setBackground(new java.awt.Color(97,157,111));
        FilesIcon.setBackground(new java.awt.Color(97,157,111));
        ConfigIcon.setBackground(new java.awt.Color(97,157,111));
        InfoIcon.setBackground(new java.awt.Color(97,157,111));
    }//GEN-LAST:event_DocumentIconMouseClicked

    private void ConfigIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfigIconMouseClicked
        // TODO add your handling code here:
        ConfigIcon.setBackground(Color.WHITE);
        HomeIcon.setBackground(new java.awt.Color(97,157,111));
        CloudIcon.setBackground(new java.awt.Color(97,157,111));
        FilesIcon.setBackground(new java.awt.Color(97,157,111));
        DocumentIcon.setBackground(new java.awt.Color(97,157,111));
        InfoIcon.setBackground(new java.awt.Color(97,157,111));
    }//GEN-LAST:event_ConfigIconMouseClicked

    private void InfoIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InfoIconMouseClicked
        // TODO add your handling code here:
        InfoIcon.setBackground(Color.WHITE);
        HomeIcon.setBackground(new java.awt.Color(97,157,111));
        CloudIcon.setBackground(new java.awt.Color(97,157,111));
        FilesIcon.setBackground(new java.awt.Color(97,157,111));
        DocumentIcon.setBackground(new java.awt.Color(97,157,111));
        ConfigIcon.setBackground(new java.awt.Color(97,157,111));
    }//GEN-LAST:event_InfoIconMouseClicked

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
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BordeSuperior;
    private javax.swing.JLabel CloudIcon;
    private javax.swing.JLabel ConfigIcon;
    private javax.swing.JLabel DocumentIcon;
    private javax.swing.JLabel FilesIcon;
    private javax.swing.JLabel HomeIcon;
    private javax.swing.JPanel IconsBorder;
    private javax.swing.JLabel InfoIcon;
    private javax.swing.JPanel PanelOne;
    private javax.swing.JPanel VentanaContenedora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
