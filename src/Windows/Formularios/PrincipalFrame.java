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
        setIconsWhite(true);
    }
    
    
    private void setIconsWhite(boolean Init){
        if (Init){
            jLabel2.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Resources/ProfileIconDefault.png")).getImage().getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH))); 
            jLabel1.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Resources/Icon.png")).getImage().getScaledInstance(80, 80, java.awt.Image.SCALE_SMOOTH))); 
            HomeIcon.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Resources/HomeWhiteIcon.png")).getImage().getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH))); 
            CloudIcon.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Resources/CloudWhiteIcon.png")).getImage().getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH))); 
            FilesIcon.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Resources/FilesWhiteIcon.png")).getImage().getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH))); 
            DocumentIcon.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Resources/DocumentWhiteIcon.png")).getImage().getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH))); 
            ConfigIcon.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Resources/ConfigWhiteIcon.png")).getImage().getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH))); 
            InfoIcon.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Resources/InfoWhiteIcon.png")).getImage().getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH))); 
        }else{
            HomeIcon.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Resources/HomeWhiteIcon.png")).getImage().getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH))); 
            CloudIcon.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Resources/CloudWhiteIcon.png")).getImage().getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH))); 
            FilesIcon.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Resources/FilesWhiteIcon.png")).getImage().getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH))); 
            DocumentIcon.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Resources/DocumentWhiteIcon.png")).getImage().getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH))); 
            ConfigIcon.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Resources/ConfigWhiteIcon.png")).getImage().getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH))); 
            InfoIcon.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Resources/InfoWhiteIcon.png")).getImage().getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH))); 
        }
    }
        
    private void setIconsGreen(){
        jLabel2.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Resources/ProfileIconDefault.png")).getImage().getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH))); 
        jLabel1.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Resources/Icon.png")).getImage().getScaledInstance(80, 80, java.awt.Image.SCALE_SMOOTH))); 
        HomeIcon.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Resources/HomeIcon.png")).getImage().getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH))); 
        CloudIcon.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Resources/CloudIcon.png")).getImage().getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH))); 
        FilesIcon.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Resources/FilesIcon.png")).getImage().getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH))); 
        DocumentIcon.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Resources/DocumentIcon.png")).getImage().getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH))); 
        ConfigIcon.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Resources/ConfigIcon.png")).getImage().getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH))); 
        InfoIcon.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Resources/InfoIcon.png")).getImage().getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH))); 
    }
    
    public void ActualizarPath(){
        String Path  = JTreeFileExplorer.getSelectionPath().pathByAddingChild("").toString().replaceAll(","," /");
        Path = Path.replaceAll("[","/");
        jLabel16.setText(Path);

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
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
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
        PanelCentral = new javax.swing.JPanel();
        FilesPanel = new javax.swing.JPanel();
        Files_ParteSuperior = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        Files_ParteInferior = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTreeFileExplorer = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel15 = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(77, 142, 92));
        jPanel1.setPreferredSize(new java.awt.Dimension(250, 442));
        jPanel1.setLayout(new java.awt.GridLayout(6, 1));

        jPanel3.setAlignmentX(0.0F);
        jPanel3.setAlignmentY(0.0F);
        jPanel3.setPreferredSize(new java.awt.Dimension(103, 90));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jLabel3.setBackground(new java.awt.Color(77, 142, 92));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("HOME");
        jLabel3.setOpaque(true);
        jPanel3.add(jLabel3, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel3);

        jPanel4.setLayout(new java.awt.BorderLayout());

        jLabel6.setBackground(new java.awt.Color(97, 157, 111));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CLOUD");
        jLabel6.setOpaque(true);
        jPanel4.add(jLabel6, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel4);

        jPanel5.setLayout(new java.awt.BorderLayout());

        jLabel8.setBackground(new java.awt.Color(77, 142, 92));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("FILES");
        jLabel8.setOpaque(true);
        jPanel5.add(jLabel8, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel5);

        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel10.setBackground(new java.awt.Color(77, 142, 92));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("DOCUMENTS");
        jLabel10.setOpaque(true);
        jPanel6.add(jLabel10, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel6);

        jPanel7.setLayout(new java.awt.BorderLayout());

        jLabel12.setBackground(new java.awt.Color(77, 142, 92));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("SETTINGS");
        jLabel12.setOpaque(true);
        jPanel7.add(jLabel12, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel7);

        jPanel8.setLayout(new java.awt.BorderLayout());

        jLabel14.setBackground(new java.awt.Color(77, 142, 92));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("INFO");
        jLabel14.setOpaque(true);
        jPanel8.add(jLabel14, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel8);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 550));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setMinimumSize(new java.awt.Dimension(150, 200));
        jPanel9.setPreferredSize(new java.awt.Dimension(150, 200));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(97, 157, 111));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Welcome User");
        jLabel4.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jLabel4.setMinimumSize(new java.awt.Dimension(250, 64));
        jLabel4.setPreferredSize(new java.awt.Dimension(250, 64));
        jPanel9.add(jLabel4, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel9, java.awt.BorderLayout.NORTH);

        jPanel12.setLayout(new java.awt.BorderLayout());

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setAlignmentX(0.0F);
        jPanel10.setAlignmentY(0.0F);
        jPanel10.setPreferredSize(new java.awt.Dimension(679, 450));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jPanel11.setForeground(new java.awt.Color(255, 255, 255));
        jPanel11.setOpaque(false);
        jPanel11.setPreferredSize(new java.awt.Dimension(655, 425));
        jPanel11.setLayout(new java.awt.GridLayout(3, 4, 10, 10));

        jLabel5.setBackground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("jLabel5");
        jLabel5.setOpaque(true);
        jPanel11.add(jLabel5);

        jLabel13.setBackground(new java.awt.Color(0, 153, 153));
        jLabel13.setText("jLabel13");
        jLabel13.setOpaque(true);
        jPanel11.add(jLabel13);

        jLabel7.setBackground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("jLabel7");
        jLabel7.setOpaque(true);
        jPanel11.add(jLabel7);

        jLabel15.setBackground(new java.awt.Color(0, 153, 153));
        jLabel15.setText("jLabel15");
        jLabel15.setOpaque(true);
        jPanel11.add(jLabel15);

        jLabel11.setBackground(new java.awt.Color(0, 153, 153));
        jLabel11.setText("jLabel11");
        jLabel11.setOpaque(true);
        jPanel11.add(jLabel11);

        jLabel9.setBackground(new java.awt.Color(0, 153, 153));
        jLabel9.setText("jLabel9");
        jLabel9.setOpaque(true);
        jPanel11.add(jLabel9);

        jPanel10.add(jPanel11, java.awt.BorderLayout.CENTER);

        jPanel12.add(jPanel10, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel12, java.awt.BorderLayout.CENTER);

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

        PanelCentral.setBackground(new java.awt.Color(255, 255, 255));
        PanelCentral.setAlignmentX(0.0F);
        PanelCentral.setAlignmentY(0.0F);
        PanelCentral.setPreferredSize(new java.awt.Dimension(850, 550));
        PanelCentral.setLayout(new java.awt.BorderLayout());

        FilesPanel.setOpaque(false);
        FilesPanel.setLayout(new java.awt.BorderLayout());

        Files_ParteSuperior.setOpaque(false);
        Files_ParteSuperior.setPreferredSize(new java.awt.Dimension(598, 50));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 102, 102));
        jLabel16.setText("jLabel16");

        javax.swing.GroupLayout Files_ParteSuperiorLayout = new javax.swing.GroupLayout(Files_ParteSuperior);
        Files_ParteSuperior.setLayout(Files_ParteSuperiorLayout);
        Files_ParteSuperiorLayout.setHorizontalGroup(
            Files_ParteSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Files_ParteSuperiorLayout.createSequentialGroup()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 213, Short.MAX_VALUE))
        );
        Files_ParteSuperiorLayout.setVerticalGroup(
            Files_ParteSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        FilesPanel.add(Files_ParteSuperior, java.awt.BorderLayout.PAGE_START);

        Files_ParteInferior.setOpaque(false);
        Files_ParteInferior.setPreferredSize(new java.awt.Dimension(674, 0));

        javax.swing.GroupLayout Files_ParteInferiorLayout = new javax.swing.GroupLayout(Files_ParteInferior);
        Files_ParteInferior.setLayout(Files_ParteInferiorLayout);
        Files_ParteInferiorLayout.setHorizontalGroup(
            Files_ParteInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
        );
        Files_ParteInferiorLayout.setVerticalGroup(
            Files_ParteInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        FilesPanel.add(Files_ParteInferior, java.awt.BorderLayout.PAGE_END);

        jPanel13.setOpaque(false);
        jPanel13.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setBackground(new java.awt.Color(153, 255, 153));
        jScrollPane1.setOpaque(false);

        JTreeFileExplorer.setBackground(new java.awt.Color(255, 255, 255));
        JTreeFileExplorer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JTreeFileExplorer.setForeground(new java.awt.Color(0, 102, 51));
        JTreeFileExplorer.setAlignmentX(0.0F);
        JTreeFileExplorer.setAlignmentY(0.0F);
        JTreeFileExplorer.setLargeModel(true);
        JTreeFileExplorer.setPreferredSize(new java.awt.Dimension(200, 80));
        JTreeFileExplorer.setShowsRootHandles(false);
        jScrollPane1.setViewportView(JTreeFileExplorer);

        jPanel13.add(jScrollPane1, java.awt.BorderLayout.EAST);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel15.setLayout(new java.awt.GridLayout(5, 6));
        jScrollPane2.setViewportView(jPanel15);

        jPanel13.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        FilesPanel.add(jPanel13, java.awt.BorderLayout.CENTER);

        PanelCentral.add(FilesPanel, java.awt.BorderLayout.CENTER);

        VentanaContenedora.add(PanelCentral, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VentanaContenedora, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VentanaContenedora, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
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
        ActualizarPath();
        setIconsWhite(false);
        HomeIcon.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Resources/HomeIcon.png")).getImage().getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH))); 
        HomeIcon.setBackground(Color.WHITE);
        CloudIcon.setBackground(new java.awt.Color(97,157,111));
        FilesIcon.setBackground(new java.awt.Color(97,157,111));
        DocumentIcon.setBackground(new java.awt.Color(97,157,111));
        ConfigIcon.setBackground(new java.awt.Color(97,157,111));
        InfoIcon.setBackground(new java.awt.Color(97,157,111));
        
    }//GEN-LAST:event_HomeIconMouseClicked

    private void CloudIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloudIconMouseClicked
        // TODO add your handling code here:
        setIconsWhite(false);
        CloudIcon.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Resources/CloudIcon.png")).getImage().getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH))); 
        CloudIcon.setBackground(Color.WHITE);
        HomeIcon.setBackground(new java.awt.Color(97,157,111));
        FilesIcon.setBackground(new java.awt.Color(97,157,111));
        DocumentIcon.setBackground(new java.awt.Color(97,157,111));
        ConfigIcon.setBackground(new java.awt.Color(97,157,111));
        InfoIcon.setBackground(new java.awt.Color(97,157,111));
    }//GEN-LAST:event_CloudIconMouseClicked

    private void FilesIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FilesIconMouseClicked
        // TODO add your handling code here:
        setIconsWhite(false);
        FilesIcon.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Resources/FilesIcon.png")).getImage().getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH))); 
        FilesIcon.setBackground(Color.WHITE);
        HomeIcon.setBackground(new java.awt.Color(97,157,111));
        CloudIcon.setBackground(new java.awt.Color(97,157,111));
        DocumentIcon.setBackground(new java.awt.Color(97,157,111));
        ConfigIcon.setBackground(new java.awt.Color(97,157,111));
        InfoIcon.setBackground(new java.awt.Color(97,157,111));
    }//GEN-LAST:event_FilesIconMouseClicked

    private void DocumentIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DocumentIconMouseClicked
        // TODO add your handling code here:
        setIconsWhite(false);
        DocumentIcon.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Resources/DocumentIcon.png")).getImage().getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH))); 
        DocumentIcon.setBackground(Color.WHITE);
        HomeIcon.setBackground(new java.awt.Color(97,157,111));
        CloudIcon.setBackground(new java.awt.Color(97,157,111));
        FilesIcon.setBackground(new java.awt.Color(97,157,111));
        ConfigIcon.setBackground(new java.awt.Color(97,157,111));
        InfoIcon.setBackground(new java.awt.Color(97,157,111));
    }//GEN-LAST:event_DocumentIconMouseClicked

    private void ConfigIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfigIconMouseClicked
        // TODO add your handling code here:
        setIconsWhite(false);
        ConfigIcon.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Resources/ConfigIcon.png")).getImage().getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH))); 
        ConfigIcon.setBackground(Color.WHITE);
        HomeIcon.setBackground(new java.awt.Color(97,157,111));
        CloudIcon.setBackground(new java.awt.Color(97,157,111));
        FilesIcon.setBackground(new java.awt.Color(97,157,111));
        DocumentIcon.setBackground(new java.awt.Color(97,157,111));
        InfoIcon.setBackground(new java.awt.Color(97,157,111));
    }//GEN-LAST:event_ConfigIconMouseClicked

    private void InfoIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InfoIconMouseClicked
        // TODO add your handling code here:
        setIconsWhite(false);
        InfoIcon.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Resources/InfoIcon.png")).getImage().getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH))); 
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
    private javax.swing.JPanel FilesPanel;
    private javax.swing.JPanel Files_ParteInferior;
    private javax.swing.JPanel Files_ParteSuperior;
    private javax.swing.JLabel HomeIcon;
    private javax.swing.JPanel IconsBorder;
    private javax.swing.JLabel InfoIcon;
    private javax.swing.JTree JTreeFileExplorer;
    private javax.swing.JPanel PanelCentral;
    private javax.swing.JPanel VentanaContenedora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
