/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

/**
 *
 * @author RiosHenao
 */
public class RegisterForm extends javax.swing.JFrame {
    
    /**
     * Creates new form RegisterForm
     */
    public RegisterForm() {
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

        jPanel1 = new javax.swing.JPanel();
        Pasword1Text = new javax.swing.JPasswordField();
        Pasword2Text = new javax.swing.JPasswordField();
        UsernameText = new javax.swing.JTextField();
        EmailText = new javax.swing.JTextField();
        RegisterButton = new javax.swing.JLabel();
        ExitButton = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(400, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pasword1Text.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Pasword1Text.setForeground(new java.awt.Color(20, 77, 95));
        Pasword1Text.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Pasword1Text.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        Pasword1Text.setCaretColor(new java.awt.Color(20, 77, 95));
        Pasword1Text.setOpaque(false);
        Pasword1Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pasword1TextActionPerformed(evt);
            }
        });
        jPanel1.add(Pasword1Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 230, 40));

        Pasword2Text.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Pasword2Text.setForeground(new java.awt.Color(20, 77, 95));
        Pasword2Text.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Pasword2Text.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        Pasword2Text.setCaretColor(new java.awt.Color(20, 77, 95));
        Pasword2Text.setOpaque(false);
        jPanel1.add(Pasword2Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 230, 40));

        UsernameText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        UsernameText.setForeground(new java.awt.Color(20, 77, 95));
        UsernameText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        UsernameText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        UsernameText.setCaretColor(new java.awt.Color(20, 77, 95));
        UsernameText.setOpaque(false);
        UsernameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameTextActionPerformed(evt);
            }
        });
        jPanel1.add(UsernameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 230, 40));

        EmailText.setBackground(new java.awt.Color(60, 63, 65));
        EmailText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        EmailText.setForeground(new java.awt.Color(20, 77, 95));
        EmailText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        EmailText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        EmailText.setCaretColor(new java.awt.Color(20, 77, 95));
        EmailText.setOpaque(false);
        EmailText.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                EmailTextPropertyChange(evt);
            }
        });
        jPanel1.add(EmailText, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 230, 40));

        RegisterButton.setBackground(new java.awt.Color(113, 177, 128));
        RegisterButton.setFont(new java.awt.Font("Dubai Light", 0, 24)); // NOI18N
        RegisterButton.setForeground(new java.awt.Color(255, 255, 255));
        RegisterButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RegisterButton.setText("REGISTER");
        RegisterButton.setOpaque(true);
        jPanel1.add(RegisterButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 190, -1));

        ExitButton.setFont(new java.awt.Font("Dubai Light", 1, 36)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(255, 255, 255));
        ExitButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ExitButton.setText("X");
        ExitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitButtonMouseClicked(evt);
            }
        });
        jPanel1.add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 30, 30));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/MenuSelector.png"))); // NOI18N
        Background.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BackgroundMouseDragged(evt);
            }
        });
        Background.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BackgroundMousePressed(evt);
            }
        });
        jPanel1.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitButtonMouseClicked

    private void BackgroundMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackgroundMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx,y-xy);
    }//GEN-LAST:event_BackgroundMouseDragged
    int xx, xy;
    private void BackgroundMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackgroundMousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_BackgroundMousePressed

    private void Pasword1TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pasword1TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pasword1TextActionPerformed

    private void EmailTextPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_EmailTextPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailTextPropertyChange

    private void UsernameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameTextActionPerformed
    public void setLocationRelativeToSelector(int x, int y){
        Formularios.EnterSelection MenuSelection = new Formularios.EnterSelection();
        //this.setBounds(MenuSelection.xOnScreen, MenuSelection.yOnScreen, 400, 500);
        /*boolean PocisionConfirmada = true;
        while (PocisionConfirmada) {
            int x = MenuSelection.getXOnScreen();
            int y = MenuSelection.getYOnScreen();
            if (x != 0 || y != 0){
                PocisionConfirmada = false;
            }
            System.out.println(x+"   "+y);
            this.setBounds(x,y,400,500);
        }
        */
        System.out.println(x+"   "+y);
        this.setBounds(x,y,400,500);
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
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JTextField EmailText;
    private javax.swing.JLabel ExitButton;
    private javax.swing.JPasswordField Pasword1Text;
    private javax.swing.JPasswordField Pasword2Text;
    private javax.swing.JLabel RegisterButton;
    private javax.swing.JTextField UsernameText;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
