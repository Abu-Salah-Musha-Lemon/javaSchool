package My_Form;

import My_Class.Member;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;

public class EditMember extends javax.swing.JFrame {

    // create a member object
    My_Class.Member member = new My_Class.Member();

    // create a function class instance
    My_Class.Fun_Class func = new My_Class.Fun_Class();

    // creat a variable to store the profile picture
    String imagePath = null;
    
    public EditMember() {
        initComponents();

        // center the form
        this.setLocationRelativeTo(null);

        // add a gray border to the panel
        Border panelHeaderBorder = BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(1, 50, 74));
        jPanel11.setBorder(panelHeaderBorder);
        // add a gray border to the jLabel_image_view
        Border jLabel_image_viewBorder = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 0, 0));
        jLabel_image_view.setBorder(panelHeaderBorder);

        // display image in the top
        // we will display the image using the path
        // so we will set the imageByte to null
        func.displayImage(60, 60,null, "/My_image/user.png", jLabel_Form_Title);
        
        jLabel_Empty_FirstName_.setVisible(false);
        jLabel_Empty_LastName_.setVisible(false);
        jLabel_Empty_phone_.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel11 = new javax.swing.JPanel();
        Titlebar = new javax.swing.JPanel();
        jLabel_Form_Title = new javax.swing.JLabel();
        jLabel_Form_Title1 = new javax.swing.JLabel();
        jButton_add_ = new javax.swing.JButton();
        phone = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_Phone_ = new javax.swing.JTextField();
        jLabel_Empty_phone_ = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_Email_ = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jComboBox_gender_ = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTextField_LastName_ = new javax.swing.JTextField();
        jLabel_Empty_LastName_ = new javax.swing.JLabel();
        jLabel_Empty_FirstName_ = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_firstName_ = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField_id_ = new javax.swing.JTextField();
        jButton_Search_ = new javax.swing.JButton();
        jLabel_imagePath_ = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton_selecteProfile_ = new javax.swing.JButton();
        jLabel_image_view = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(635, 632));

        jPanel11.setBackground(new java.awt.Color(255, 204, 204));
        jPanel11.setPreferredSize(new java.awt.Dimension(630, 630));

        Titlebar.setBackground(new java.awt.Color(255, 255, 255));
        Titlebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Form_Title.setBackground(new java.awt.Color(11, 150, 117));
        jLabel_Form_Title.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel_Form_Title.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Form_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Form_Title.setText("Edit  Member");
        jLabel_Form_Title.setOpaque(true);
        Titlebar.add(jLabel_Form_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 66));

        jLabel_Form_Title1.setBackground(new java.awt.Color(11, 150, 117));
        jLabel_Form_Title1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel_Form_Title1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel_Form_Title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Form_Title1.setText("x");
        jLabel_Form_Title1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 1, 1, 1, new java.awt.Color(105, 151, 204)));
        jLabel_Form_Title1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Form_Title1.setOpaque(true);
        jLabel_Form_Title1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Form_Title1MouseClicked(evt);
            }
        });
        Titlebar.add(jLabel_Form_Title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, -10, 80, 80));

        jButton_add_.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jButton_add_.setText("Submit");
        jButton_add_.setMaximumSize(new java.awt.Dimension(106, 40));
        jButton_add_.setMinimumSize(new java.awt.Dimension(106, 40));
        jButton_add_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_add_ActionPerformed(evt);
            }
        });

        phone.setPreferredSize(new java.awt.Dimension(550, 450));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setText("Phone :");

        jTextField_Phone_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_Phone_.setPreferredSize(new java.awt.Dimension(65, 25));

        jLabel_Empty_phone_.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Empty_phone_.setForeground(new java.awt.Color(153, 0, 0));
        jLabel_Empty_phone_.setText("* Enter the phone");
        jLabel_Empty_phone_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Empty_phone_MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel6.setText("Email :");

        jTextField_Email_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_Email_.setPreferredSize(new java.awt.Dimension(65, 25));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setText("Gender:");

        jComboBox_gender_.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jComboBox_gender_.setPreferredSize(new java.awt.Dimension(65, 25));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("Last Name :");

        jTextField_LastName_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_LastName_.setPreferredSize(new java.awt.Dimension(65, 25));

        jLabel_Empty_LastName_.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Empty_LastName_.setForeground(new java.awt.Color(153, 0, 0));
        jLabel_Empty_LastName_.setText("* Enter the Last Name");
        jLabel_Empty_LastName_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Empty_LastName_MouseClicked(evt);
            }
        });

        jLabel_Empty_FirstName_.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Empty_FirstName_.setForeground(new java.awt.Color(153, 0, 0));
        jLabel_Empty_FirstName_.setText("* Enter the first Name");
        jLabel_Empty_FirstName_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Empty_FirstName_MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("First Name :");

        jTextField_firstName_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_firstName_.setPreferredSize(new java.awt.Dimension(65, 25));

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel7.setText("Enter ID :");

        jTextField_id_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_id_.setPreferredSize(new java.awt.Dimension(65, 25));

        jButton_Search_.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton_Search_.setText("Search");
        jButton_Search_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Search_ActionPerformed(evt);
            }
        });

        jLabel_imagePath_.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_imagePath_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_imagePath_.setForeground(new java.awt.Color(0, 51, 255));
        jLabel_imagePath_.setText("Chose your image");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Profile Picture");

        jButton_selecteProfile_.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton_selecteProfile_.setText("Select Picture");
        jButton_selecteProfile_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_selecteProfile_ActionPerformed(evt);
            }
        });

        jLabel_image_view.setBackground(new java.awt.Color(102, 204, 255));

        javax.swing.GroupLayout phoneLayout = new javax.swing.GroupLayout(phone);
        phone.setLayout(phoneLayout);
        phoneLayout.setHorizontalGroup(
            phoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(phoneLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(phoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(phoneLayout.createSequentialGroup()
                        .addComponent(jLabel_imagePath_)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(phoneLayout.createSequentialGroup()
                        .addGroup(phoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(phoneLayout.createSequentialGroup()
                                .addGroup(phoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(phoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jComboBox_gender_, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField_id_, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField_Phone_, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField_LastName_, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField_firstName_, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField_Email_, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(phoneLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel_image_view, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(phoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_selecteProfile_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(phoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel_Empty_FirstName_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_Search_, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel_Empty_phone_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_Empty_LastName_, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(101, 101, 101))))
        );
        phoneLayout.setVerticalGroup(
            phoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(phoneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(phoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(phoneLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(phoneLayout.createSequentialGroup()
                        .addGroup(phoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_id_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Search_))
                        .addGap(18, 18, 18)
                        .addGroup(phoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Empty_FirstName_, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_firstName_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(phoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_LastName_, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Empty_LastName_, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(phoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Empty_phone_, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Phone_, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_Email_, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox_gender_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(phoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(phoneLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(phoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_selecteProfile_)))
                    .addGroup(phoneLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_image_view, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_imagePath_, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titlebar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jButton_add_, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addComponent(Titlebar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_add_, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
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

    private void jButton_add_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_add_ActionPerformed
        // Edit hte selected member
//        // hide the jlabel "empty name message"
//        jLabel_Empty_FirstName_.setVisible(false);
//        jLabel_Empty_LastName_.setVisible(false);
//        jLabel_Empty_phone_.setVisible(false);
        // add a new gener
        String fname = jTextField_firstName_.getText();
        String lname = jTextField_LastName_.getText();
        String phone = jTextField_Phone_.getText();
        String email = jTextField_Email_.getText();
        String gender = jComboBox_gender_.getSelectedItem().toString();
        //String img = jButton_selecteProfile_.getActionCommand();

        // check if the textField is empty
        if (fname.isEmpty()) {
//            System.out.println("empty");
            jLabel_Empty_FirstName_.setVisible(true);
            
        } else if (lname.isEmpty()) {
//            System.out.println("empty");
            jLabel_Empty_LastName_.setVisible(true);
            
        } else if (phone.isEmpty()) {
//            System.out.println("empty");
            jLabel_Empty_phone_.setVisible(true);
            
        } else if (email.isEmpty()) {
//            System.out.println("empty");

        } else {
            //   AddMember.
            byte[] img = null;
            if (imagePath != null) {
                
                try {
                    Integer id = Integer.parseInt(jTextField_id_.getText());
                    Path path = Paths.get(imagePath);
                    img = Files.readAllBytes(path);
                    member.editMember(id, fname, lname, phone, email, gender, img);
                } catch (IOException ex) {
                    Logger.getLogger(EditMember.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Select a Profile Picture for This Member", "NO Picture Selected", 2);
            }
            
        }
    }//GEN-LAST:event_jButton_add_ActionPerformed
    

    private void jLabel_Form_Title1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Form_Title1MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel_Form_Title1MouseClicked

    private void jButton_selecteProfile_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_selecteProfile_ActionPerformed
        // select picture fromo the computer
//        JFileChooser fileChooser = new JFileChooser();
//        fileChooser.setDialogTitle("Selecte profile picture");
//        fileChooser.setCurrentDirectory(new File("C:\\images"));
//        FileNameExtensionFilter extentionFilter = new FileNameExtensionFilter("Image", ".png", ".jpg", "jpeg");
//        fileChooser.addChoosableFileFilter(extentionFilter);
//        
//        int fileState = fileChooser.showSaveDialog(null);
//        
//        if (fileState == JFileChooser.APPROVE_OPTION) {
//            String path = fileChooser.getSelectedFile().getAbsolutePath();
//            jLabel_imagePath_.setText(path);
//            imagePath = path;
//
//            // display the image
//            func.displayImage(125, 80, null, imagePath, jLabel_image_view);
//        }
    /// short hand 
        String path =func.selectImage() ;
        jLabel_imagePath_.setText(path);
        imagePath = path;
         // display the image
         func.displayImage(125, 80, null, imagePath, jLabel_image_view);
    }//GEN-LAST:event_jButton_selecteProfile_ActionPerformed

    private void jButton_Search_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Search_ActionPerformed
        
        jButton_Search_.setVisible(true);
        
        try {
            // seatch member by ID
            Integer id = Integer.parseInt(jTextField_id_.getText());// used parseInt ot convert text to number
            //get data
            Member SelectdMember = member.getMemberById(id);
            
            if (SelectdMember != null) {
                jTextField_id_.setText(String.valueOf(SelectdMember.getId()));//convert id into a string
                jTextField_firstName_.setText(SelectdMember.getFirstName());
                jTextField_LastName_.setText(SelectdMember.getLastName());
                jTextField_Phone_.setText(SelectdMember.getPhone());
                jTextField_Email_.setText(SelectdMember.getEmail());
                jComboBox_gender_.setSelectedItem(SelectdMember.getGender());

                // display the member image 
                byte[] image = SelectdMember.getPicture();

                // display image in the top
                // we will display the image using the path
                // so we will set the imageByte to null
                func.displayImage(90, 60, image, "", jLabel_image_view);
            } else {
                JOptionPane.showMessageDialog(null, "NO member with theis id Found", "Invalit ID", 3);
            }
            
        } catch (SQLException | NumberFormatException ex) {
            // Logger.getLogger(EditMember.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Enter a valid Member ID", "Invalit ID", 3);
        }
    }//GEN-LAST:event_jButton_Search_ActionPerformed

    private void jLabel_Empty_FirstName_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Empty_FirstName_MouseClicked

        // hide this jlable on click
        jLabel_Empty_FirstName_.setVisible(false);
    }//GEN-LAST:event_jLabel_Empty_FirstName_MouseClicked

    private void jLabel_Empty_LastName_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Empty_LastName_MouseClicked
        // TODO add your handling code here:
        jLabel_Empty_LastName_.setVisible(false);
    }//GEN-LAST:event_jLabel_Empty_LastName_MouseClicked

    private void jLabel_Empty_phone_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Empty_phone_MouseClicked
        // TODO add your handling code here:
        jLabel_Empty_phone_.setVisible(false);
    }//GEN-LAST:event_jLabel_Empty_phone_MouseClicked
    
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
            java.util.logging.Logger.getLogger(EditMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditMember().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Titlebar;
    private javax.swing.JButton jButton_Search_;
    private javax.swing.JButton jButton_add_;
    private javax.swing.JButton jButton_selecteProfile_;
    private javax.swing.JComboBox<String> jComboBox_gender_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_Empty_FirstName_;
    private javax.swing.JLabel jLabel_Empty_LastName_;
    private javax.swing.JLabel jLabel_Empty_phone_;
    private javax.swing.JLabel jLabel_Form_Title;
    private javax.swing.JLabel jLabel_Form_Title1;
    private javax.swing.JLabel jLabel_imagePath_;
    private javax.swing.JLabel jLabel_image_view;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JTextField jTextField_Email_;
    private javax.swing.JTextField jTextField_LastName_;
    private javax.swing.JTextField jTextField_Phone_;
    private javax.swing.JTextField jTextField_firstName_;
    private javax.swing.JTextField jTextField_id_;
    private javax.swing.JPanel phone;
    // End of variables declaration//GEN-END:variables
}
