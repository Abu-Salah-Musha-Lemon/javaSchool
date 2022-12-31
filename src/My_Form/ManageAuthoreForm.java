package My_Form;

import My_Class.Fun_Class;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class ManageAuthoreForm extends javax.swing.JFrame {

    My_Class.Author author = new My_Class.Author();

    public ManageAuthoreForm() {
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
        func.customTable(jTable_author);

        //Customize the jtable header row
       /* jTable_author.getTableHeader().setBackground(Color.red);
        jTable_author.getTableHeader().setForeground(Color.white);
        jTable_author.getTableHeader().setFont(new Font("Verdana", Font.BOLD, 16));
        jTable_author.getTableHeader().setOpaque(false);
        */
       //short hand 
       func.customTableHeader(jTable_author,new Color(42,108,150) , 16);

        // hide the jLable "empty name massage
        jLabel_Empty_FirstName_.setVisible(false);
        jLabel_Empty_LastName_.setVisible(false);

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
        jTable_author = new javax.swing.JTable();
        form = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_ExpertiesName_ = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel_Empty_LastName_ = new javax.swing.JLabel();
        jTextField_LastName_ = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel_Empty_FirstName_ = new javax.swing.JLabel();
        jTextField_firstName_ = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField_ID_ = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_about_ = new javax.swing.JTextArea();
        button = new javax.swing.JPanel();
        jButton_add_ = new javax.swing.JButton();
        jButton_Delete_ = new javax.swing.JButton();
        jButton_Edit_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setUndecorated(true);

        jPanel11.setBackground(new java.awt.Color(255, 204, 204));

        jLabel_Form_Title.setBackground(java.awt.Color.gray);
        jLabel_Form_Title.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel_Form_Title.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Form_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Form_Title.setText("Manage Authors");
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

        jTable_author.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_author.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_authorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_author);

        form.setBackground(new java.awt.Color(51, 153, 255));

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel6.setText("About :");

        jTextField_ExpertiesName_.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel5.setText("Experties:");

        jLabel_Empty_LastName_.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Empty_LastName_.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel_Empty_LastName_.setForeground(new java.awt.Color(153, 0, 0));
        jLabel_Empty_LastName_.setText("* Enter the Last Name");
        jLabel_Empty_LastName_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Empty_LastName_MouseClicked(evt);
            }
        });

        jTextField_LastName_.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel3.setText("Last Name :");

        jLabel_Empty_FirstName_.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Empty_FirstName_.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel_Empty_FirstName_.setForeground(new java.awt.Color(153, 0, 0));
        jLabel_Empty_FirstName_.setText("* Enter the first Name");
        jLabel_Empty_FirstName_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Empty_FirstName_MouseClicked(evt);
            }
        });

        jTextField_firstName_.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel2.setText("First Name :");

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel1.setText("ID :");

        jTextField_ID_.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jTextArea_about_.setColumns(20);
        jTextArea_about_.setRows(5);
        jScrollPane2.setViewportView(jTextArea_about_);

        javax.swing.GroupLayout formLayout = new javax.swing.GroupLayout(form);
        form.setLayout(formLayout);
        formLayout.setHorizontalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_ExpertiesName_)
                    .addComponent(jLabel5)
                    .addComponent(jLabel_Empty_LastName_, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_LastName_)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Empty_FirstName_, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_firstName_)
                    .addComponent(jLabel2)
                    .addGroup(formLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_ID_, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        formLayout.setVerticalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField_ID_, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_firstName_, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel_Empty_FirstName_, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_LastName_, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Empty_LastName_, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField_ExpertiesName_, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton_add_.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        jButton_add_.setText("Add");
        jButton_add_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_add_ActionPerformed(evt);
            }
        });

        jButton_Delete_.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        jButton_Delete_.setText("Delete");
        jButton_Delete_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Delete_ActionPerformed(evt);
            }
        });

        jButton_Edit_.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        jButton_Edit_.setText("Edit");
        jButton_Edit_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Edit_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonLayout = new javax.swing.GroupLayout(button);
        button.setLayout(buttonLayout);
        buttonLayout.setHorizontalGroup(
            buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_add_, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(jButton_Delete_, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jButton_Edit_, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        buttonLayout.setVerticalGroup(
            buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Delete_)
                    .addComponent(jButton_add_)
                    .addComponent(jButton_Edit_))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel_Form_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_close_, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Form_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_close_, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //closse the panale

    private void jLabel_close_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_close_MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel_close_MouseClicked

    private void jButton_add_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_add_ActionPerformed
        // add a new gener
        String fname = jTextField_firstName_.getText();
        String lname = jTextField_LastName_.getText();
        String experties = jTextField_ExpertiesName_.getText();
        String about = jTextArea_about_.getText();

        // check if the textField is empty
        if (fname.isEmpty()) {
//            System.out.println("empty");
            jLabel_Empty_FirstName_.setVisible(true);

        } else if (lname.isEmpty()) {
//            System.out.println("empty");
            jLabel_Empty_LastName_.setVisible(true);

        } else {
            // System.out.println("no");
            //  My_Class.Genre genre = new Genre();
            author.addAuthor(fname, lname, experties, about);

            //refreseh the  populateJTableGeres
            //populateJTableGeres();
        }
    }//GEN-LAST:event_jButton_add_ActionPerformed

    private void jButton_Edit_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Edit_ActionPerformed
        // TODO add your handling code here:
        //edit the selectde genre
        // int id = Integer.valueOf(jTextField_ID_.getText()); this variable used in else statement 
        String fname = jTextField_firstName_.getText();
        String lname = jTextField_LastName_.getText();
        String experties = jTextField_ExpertiesName_.getText();
        String about = jTextArea_about_.getText();

        // check if the textField is empty
        if (fname.isEmpty()) {
//            System.out.println("empty");
            jLabel_Empty_FirstName_.setVisible(true);

        } else if (lname.isEmpty()) {
//            System.out.println("empty");
            jLabel_Empty_LastName_.setVisible(true);

        } else {
            // System.out.println("no");
            //  My_Class.Genre genre = new Genre();
            try {
                int id = Integer.parseInt(jTextField_ID_.getText());
                author.editAuthor(id, fname, lname, experties,about);

                //refreseh the  populateJTableGeres
                populateJTableAuthor();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid Author id", "Error", 3); 
            }
        }
    }//GEN-LAST:event_jButton_Edit_ActionPerformed

    private void jButton_Delete_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Delete_ActionPerformed

        // delete htee selection text
        try {
            int id = Integer.parseInt(jTextField_ID_.getText());
            author.removeAuthor(id);
            //refreseh the  populateJTableGeres
            populateJTableAuthor();

            // clear text from the textField
            jTextField_ID_.setText("");
            jTextField_firstName_.setText("");
            jTextField_LastName_.setText("");
            jTextField_ExpertiesName_.setText("");
            jTextArea_about_.setText("");

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Invalid Book  Id" + ex.getMessage(), "Error", 0);
        }
    }//GEN-LAST:event_jButton_Delete_ActionPerformed

    private void jTable_authorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_authorMouseClicked
        // display the selscted author

        // get the selection row index
        int index = jTable_author.getSelectedRow();

        //get value
        String id = jTable_author.getValueAt(index, 0).toString();
        String firstName = jTable_author.getValueAt(index, 1).toString();
        String lastName = jTable_author.getValueAt(index, 2).toString();
        String experties = jTable_author.getValueAt(index, 3).toString();
        String about = jTable_author.getValueAt(index, 4).toString();

        // show data in textfield
        jTextField_ID_.setText(id);
        jTextField_firstName_.setText(firstName);
        jTextField_LastName_.setText(lastName);
        jTextField_ExpertiesName_.setText(experties);
        jTextArea_about_.setText(about);

    }//GEN-LAST:event_jTable_authorMouseClicked

    // create a function to poplate the jtable with book
    public void populateJTableAuthor() {

        ArrayList<My_Class.Author> authorList = author.authorList();
        // jTable
        String[] colName = {"id", "F-Name","L-Name","Experties","About"};

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
        jTable_author.setModel(model);

    }

    private void jLabel_Empty_FirstName_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Empty_FirstName_MouseClicked

        // hide this jlable on click
        jLabel_Empty_FirstName_.setVisible(false);
    }//GEN-LAST:event_jLabel_Empty_FirstName_MouseClicked

    private void jLabel_Empty_LastName_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Empty_LastName_MouseClicked
        // TODO add your handling code here:
        jLabel_Empty_LastName_.setVisible(false);
    }//GEN-LAST:event_jLabel_Empty_LastName_MouseClicked

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
            java.util.logging.Logger.getLogger(ManageAuthoreForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageAuthoreForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageAuthoreForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageAuthoreForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageAuthoreForm().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel button;
    private javax.swing.JPanel form;
    private javax.swing.JButton jButton_Delete_;
    private javax.swing.JButton jButton_Edit_;
    private javax.swing.JButton jButton_add_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_Empty_FirstName_;
    private javax.swing.JLabel jLabel_Empty_LastName_;
    private javax.swing.JLabel jLabel_Form_Title;
    private javax.swing.JLabel jLabel_close_;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_author;
    private javax.swing.JTextArea jTextArea_about_;
    private javax.swing.JTextField jTextField_ExpertiesName_;
    private javax.swing.JTextField jTextField_ID_;
    private javax.swing.JTextField jTextField_LastName_;
    private javax.swing.JTextField jTextField_firstName_;
    // End of variables declaration//GEN-END:variables
}
