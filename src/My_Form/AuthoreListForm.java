package My_Form;

import My_Class.Fun_Class;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class AuthoreListForm extends javax.swing.JFrame {

    My_Class.Author author = new My_Class.Author();
    public static String formType = " ";

    public AuthoreListForm() {
        initComponents();

        // center the form
        this.setLocationRelativeTo(null);

        // add a gray border to the panel
        Border panelHeaderBorder = BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(1, 50, 74));
        jPanel11.setBorder(panelHeaderBorder);

        //Dispaly image in the top
        My_Class.Fun_Class func = new Fun_Class();
        // this display image  in the dashbord left side
        // func.displayImage(jLabel_Form_Title.getWidth(), jLabel_Form_Title.getHeight(), "/My_image/", jLabel_Form_Title);
        func.displayImage(80, 80, null, "/My_image/4185556.png", jLabel_Form_Title);

        // custom the jtable
        func.customTable(jTable_author_);

        //Customize the jtable header row
        /* jTable_author.getTableHeader().setBackground(Color.red);
        jTable_author.getTableHeader().setForeground(Color.white);
        jTable_author.getTableHeader().setFont(new Font("Verdana", Font.BOLD, 16));
        jTable_author.getTableHeader().setOpaque(false);
         */
        //short hand 
        func.customTableHeader(jTable_author_, new Color(42, 108, 150), 16);

        // populateJTableGeres 
        populateJTableAuthor();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel11 = new javax.swing.JPanel();
        jLabel_Form_Title = new javax.swing.JLabel();
        jLabel_close_ = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_author_ = new javax.swing.JTable();
        jButton_auL_Select_author_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setUndecorated(true);

        jPanel11.setBackground(new java.awt.Color(255, 204, 204));

        jLabel_Form_Title.setBackground(java.awt.Color.gray);
        jLabel_Form_Title.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel_Form_Title.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Form_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Form_Title.setText(" Author List ");
        jLabel_Form_Title.setOpaque(true);

        jLabel_close_.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_close_.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel_close_.setForeground(new java.awt.Color(255, 0, 51));
        jLabel_close_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_close_.setText("X");
        jLabel_close_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_close_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_close_MouseClicked(evt);
            }
        });

        jTable_author_.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_author_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_author_MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_author_);

        jButton_auL_Select_author_.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jButton_auL_Select_author_.setText("Select author");
        jButton_auL_Select_author_.setMaximumSize(new java.awt.Dimension(106, 40));
        jButton_auL_Select_author_.setMinimumSize(new java.awt.Dimension(106, 40));
        jButton_auL_Select_author_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_auL_Select_author_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel_Form_Title, javax.swing.GroupLayout.DEFAULT_SIZE, 811, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_close_, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(jButton_auL_Select_author_, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Form_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_close_, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_auL_Select_author_, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable_author_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_author_MouseClicked

    }//GEN-LAST:event_jTable_author_MouseClicked

    //closse the panale

    private void jLabel_close_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_close_MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel_close_MouseClicked

    private void jButton_auL_Select_author_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_auL_Select_author_ActionPerformed
        // display the selscted author

        // get the selection row index
        int index = jTable_author_.getSelectedRow();

        //get value
        int id = Integer.parseInt(jTable_author_.getValueAt(index, 0).toString());
        String firstName = jTable_author_.getValueAt(index, 1).toString();
        String lastName = jTable_author_.getValueAt(index, 2).toString();
        String full_name = firstName + " " + lastName;

        if (formType.equals("edit")) {
            EditBookForm.displayAuthorData(id, full_name);
        } else {
            AddBookForm.displayAuthorData(index, full_name);
        }
        // close the tabe
        this.dispose();

    }//GEN-LAST:event_jButton_auL_Select_author_ActionPerformed

    // create a function to poplate the jtable with book
    public void populateJTableAuthor() {

        ArrayList<My_Class.Author> authorList = author.authorList();
        // jTable
        String[] colName = {"id", "F-Name", "L-Name", "Experties", "About"};

        // row
        Object[][] row = new Object[authorList.size()][colName.length];
        for (int i = 0; i < authorList.size(); i++) {
            row[i][0] = authorList.get(i).getId();
            row[i][1] = authorList.get(i).getFirstName();
            row[i][2] = authorList.get(i).getLastName();
            row[i][3] = authorList.get(i).getField_of_Expertise();
            row[i][4] = authorList.get(i).getAbout();

        }
        DefaultTableModel model = new DefaultTableModel(row, colName);
        jTable_author_.setModel(model);

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
                    //javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AuthoreListForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AuthoreListForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AuthoreListForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AuthoreListForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AuthoreListForm().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_auL_Select_author_;
    private javax.swing.JLabel jLabel_Form_Title;
    private javax.swing.JLabel jLabel_close_;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable_author_;
    // End of variables declaration//GEN-END:variables
}
