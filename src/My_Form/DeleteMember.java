package My_Form;

import My_Class.Fun_Class;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class DeleteMember extends javax.swing.JFrame {

    // create a member object
    My_Class.Member member = new My_Class.Member();

    // creat a variable to store the profile picture
    String imagePath = null;

    public DeleteMember() {
        initComponents();

        // center the form
        this.setLocationRelativeTo(null);

        // add a gray border to the panel
        Border panelHeaderBorder = BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(1, 50, 74));
        jPanel11.setBorder(panelHeaderBorder);

        //Dispaly image in the top
        My_Class.Fun_Class func = new Fun_Class();
        // this display image  in the dashbord left side
        func.displayImage(60, 60,null, "/My_image/user.png", jLabel_Form_Title);

        jLabel_Empty_ID_.setForeground(Color.white);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel11 = new javax.swing.JPanel();
        Titlebar = new javax.swing.JPanel();
        jLabel_Form_Title = new javax.swing.JLabel();
        jLabel_Form_Title1 = new javax.swing.JLabel();
        form = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_ID_ = new javax.swing.JTextField();
        jLabel_Empty_ID_ = new javax.swing.JLabel();
        jButton_Delete_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel11.setBackground(new java.awt.Color(255, 204, 204));
        jPanel11.setPreferredSize(new java.awt.Dimension(460, 300));

        Titlebar.setBackground(new java.awt.Color(255, 255, 255));
        Titlebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Form_Title.setBackground(new java.awt.Color(11, 150, 117));
        jLabel_Form_Title.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel_Form_Title.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Form_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Form_Title.setText("Delete Member");
        jLabel_Form_Title.setOpaque(true);
        Titlebar.add(jLabel_Form_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 391, 66));

        jLabel_Form_Title1.setBackground(new java.awt.Color(11, 150, 117));
        jLabel_Form_Title1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel_Form_Title1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Form_Title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Form_Title1.setText("x");
        jLabel_Form_Title1.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel_Form_Title1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Form_Title1.setOpaque(true);
        jLabel_Form_Title1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Form_Title1MouseClicked(evt);
            }
        });
        Titlebar.add(jLabel_Form_Title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, -10, 80, 80));

        form.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel2.setText("Enter The ID :");

        jTextField_ID_.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel_Empty_ID_.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Empty_ID_.setForeground(new java.awt.Color(153, 0, 0));
        jLabel_Empty_ID_.setText("You must enter the member ID(id desite)");
        jLabel_Empty_ID_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Empty_ID_MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout formLayout = new javax.swing.GroupLayout(form);
        form.setLayout(formLayout);
        formLayout.setHorizontalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField_ID_, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
            .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(formLayout.createSequentialGroup()
                    .addGap(161, 161, 161)
                    .addComponent(jLabel_Empty_ID_, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        formLayout.setVerticalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_ID_, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78))
            .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(formLayout.createSequentialGroup()
                    .addGap(45, 45, 45)
                    .addComponent(jLabel_Empty_ID_, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(46, Short.MAX_VALUE)))
        );

        jButton_Delete_.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jButton_Delete_.setText("Delete Member");
        jButton_Delete_.setMaximumSize(new java.awt.Dimension(106, 40));
        jButton_Delete_.setMinimumSize(new java.awt.Dimension(106, 40));
        jButton_Delete_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Delete_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(Titlebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Delete_, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addComponent(Titlebar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(form, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_Delete_, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Delete_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Delete_ActionPerformed

        // delete The selected member
        try {
            Integer id = Integer.parseInt(jTextField_ID_.getText());

            int confirm = JOptionPane.showConfirmDialog(null, "Are you Sure to delete this member", "Confirmation Box", JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_NO_OPTION) {
                member.removeMember(id);
            }else{
                System.out.println("Cancel");
            
            }

        } catch (Exception e) {
            jLabel_Empty_ID_.setForeground(Color.red);
        }
    }//GEN-LAST:event_jButton_Delete_ActionPerformed


    private void jLabel_Form_Title1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Form_Title1MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel_Form_Title1MouseClicked

    private void jLabel_Empty_ID_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Empty_ID_MouseClicked

        // hide this jlable on click
        jLabel_Empty_ID_.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_Empty_ID_MouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    //javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DeleteMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteMember().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Titlebar;
    private javax.swing.JPanel form;
    private javax.swing.JButton jButton_Delete_;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_Empty_ID_;
    private javax.swing.JLabel jLabel_Form_Title;
    private javax.swing.JLabel jLabel_Form_Title1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JTextField jTextField_ID_;
    // End of variables declaration//GEN-END:variables
}
