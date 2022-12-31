package My_Form;

import My_Class.Fun_Class;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;

public class AddMember extends javax.swing.JFrame {

    // create a member object
    My_Class.Member member = new My_Class.Member();
    My_Class.Fun_Class func = new My_Class.Fun_Class();

    // creat a variable to store the profile picture
    String imagePath = null;

    public AddMember() {
        initComponents();

        // center the form
        this.setLocationRelativeTo(null);

        // add a gray border to the panel
        Border panelHeaderBorder = BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(1, 50, 74));
        jPanel11.setBorder(panelHeaderBorder);

        //Dispaly image in the top
        My_Class.Fun_Class func = new Fun_Class();
        // this display image  in the dashbord left side
        func.displayImage(60, 60, null, "/My_image/user.png", jLabel_Form_Title);

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
        form = new javax.swing.JPanel();
        firstName = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_firstName_ = new javax.swing.JTextField();
        jLabel_Empty_FirstName_ = new javax.swing.JLabel();
        lastName = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_LastName_ = new javax.swing.JTextField();
        jLabel_Empty_LastName_ = new javax.swing.JLabel();
        phone = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_Phone_ = new javax.swing.JTextField();
        jLabel_Empty_phone_ = new javax.swing.JLabel();
        email = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_Email_ = new javax.swing.JTextField();
        gender = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox_gender_ = new javax.swing.JComboBox<>();
        profile = new javax.swing.JPanel();
        jButton_selecteProfile_ = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel_imagePath_ = new javax.swing.JLabel();
        jButton_add_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel11.setBackground(new java.awt.Color(255, 204, 204));

        Titlebar.setBackground(new java.awt.Color(255, 255, 255));
        Titlebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Form_Title.setBackground(new java.awt.Color(11, 150, 117));
        jLabel_Form_Title.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel_Form_Title.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Form_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Form_Title.setText("Add Member");
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

        form.setBackground(new java.awt.Color(51, 153, 255));

        firstName.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel2.setText("First Name :");

        jTextField_firstName_.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel_Empty_FirstName_.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Empty_FirstName_.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_Empty_FirstName_.setForeground(new java.awt.Color(153, 0, 0));
        jLabel_Empty_FirstName_.setText("* Enter the first Name");
        jLabel_Empty_FirstName_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Empty_FirstName_MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout firstNameLayout = new javax.swing.GroupLayout(firstName);
        firstName.setLayout(firstNameLayout);
        firstNameLayout.setHorizontalGroup(
            firstNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(firstNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(firstNameLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(firstNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField_firstName_)
                        .addGroup(firstNameLayout.createSequentialGroup()
                            .addGroup(firstNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel_Empty_FirstName_, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 176, Short.MAX_VALUE)))
                    .addContainerGap()))
        );
        firstNameLayout.setVerticalGroup(
            firstNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
            .addGroup(firstNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(firstNameLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jTextField_firstName_, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel_Empty_FirstName_, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel3.setText("Last Name :");

        jTextField_LastName_.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel_Empty_LastName_.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Empty_LastName_.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_Empty_LastName_.setForeground(new java.awt.Color(153, 0, 0));
        jLabel_Empty_LastName_.setText("* Enter the Last Name");
        jLabel_Empty_LastName_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Empty_LastName_MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout lastNameLayout = new javax.swing.GroupLayout(lastName);
        lastName.setLayout(lastNameLayout);
        lastNameLayout.setHorizontalGroup(
            lastNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lastNameLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(lastNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_LastName_, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Empty_LastName_, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        lastNameLayout.setVerticalGroup(
            lastNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lastNameLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jTextField_LastName_, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel_Empty_LastName_, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel5.setText("Phone :");

        jTextField_Phone_.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel_Empty_phone_.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Empty_phone_.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_Empty_phone_.setForeground(new java.awt.Color(153, 0, 0));
        jLabel_Empty_phone_.setText("* Enter the phone");
        jLabel_Empty_phone_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Empty_phone_MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout phoneLayout = new javax.swing.GroupLayout(phone);
        phone.setLayout(phoneLayout);
        phoneLayout.setHorizontalGroup(
            phoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(phoneLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(phoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Phone_, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Empty_phone_, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        phoneLayout.setVerticalGroup(
            phoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(phoneLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jTextField_Phone_, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel_Empty_phone_, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel6.setText("Email :");

        jTextField_Email_.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        javax.swing.GroupLayout emailLayout = new javax.swing.GroupLayout(email);
        email.setLayout(emailLayout);
        emailLayout.setHorizontalGroup(
            emailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emailLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(emailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Email_, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        emailLayout.setVerticalGroup(
            emailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emailLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jTextField_Email_, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel1.setText("Gender:");

        jComboBox_gender_.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jComboBox_gender_.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        javax.swing.GroupLayout genderLayout = new javax.swing.GroupLayout(gender);
        gender.setLayout(genderLayout);
        genderLayout.setHorizontalGroup(
            genderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genderLayout.createSequentialGroup()
                .addGroup(genderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(genderLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboBox_gender_, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        genderLayout.setVerticalGroup(
            genderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genderLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jComboBox_gender_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButton_selecteProfile_.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton_selecteProfile_.setText("Select Picture");
        jButton_selecteProfile_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_selecteProfile_ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Profile Picture");

        jLabel_imagePath_.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_imagePath_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_imagePath_.setForeground(new java.awt.Color(0, 51, 255));
        jLabel_imagePath_.setText("Chose your image");

        javax.swing.GroupLayout profileLayout = new javax.swing.GroupLayout(profile);
        profile.setLayout(profileLayout);
        profileLayout.setHorizontalGroup(
            profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_imagePath_, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jButton_selecteProfile_, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        profileLayout.setVerticalGroup(
            profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel_imagePath_, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(profileLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jButton_selecteProfile_))
        );

        javax.swing.GroupLayout formLayout = new javax.swing.GroupLayout(form);
        form.setLayout(formLayout);
        formLayout.setHorizontalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(firstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(profile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(gender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(phone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        formLayout.setVerticalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(formLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(formLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(profile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jButton_add_.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jButton_add_.setText("Submit");
        jButton_add_.setMaximumSize(new java.awt.Dimension(106, 40));
        jButton_add_.setMinimumSize(new java.awt.Dimension(106, 40));
        jButton_add_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_add_ActionPerformed(evt);
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
                .addGap(23, 23, 23)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_add_, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addComponent(Titlebar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_add_, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jButton_add_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_add_ActionPerformed
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

        } else {
            //   AddMember.
            byte[] img = null; // change the byte to long if the image size is too large
            if (imagePath != null) {

                try {
                    Path path = Paths.get(imagePath);
                    img = Files.readAllBytes(path);
                    member.addMember(fname, lname, phone, email, gender, img);
                } catch (IOException ex) {
                    Logger.getLogger(AddMember.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Select a Profile Picture for This Member", "NO Picture Selected", 2);
            }

        }
    }//GEN-LAST:event_jButton_add_ActionPerformed


    private void jLabel_Empty_FirstName_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Empty_FirstName_MouseClicked

        // hide this jlable on click
        jLabel_Empty_FirstName_.setVisible(false);
    }//GEN-LAST:event_jLabel_Empty_FirstName_MouseClicked

    private void jLabel_Empty_LastName_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Empty_LastName_MouseClicked
        // TODO add your handling code here:
        jLabel_Empty_LastName_.setVisible(false);
    }//GEN-LAST:event_jLabel_Empty_LastName_MouseClicked

    private void jLabel_Form_Title1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Form_Title1MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel_Form_Title1MouseClicked

    private void jLabel_Empty_phone_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Empty_phone_MouseClicked
        // TODO add your handling code here:
        jLabel_Empty_phone_.setVisible(false);
    }//GEN-LAST:event_jLabel_Empty_phone_MouseClicked

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
//            String path = fileChooser.getSelectedFile().getAb solutePath();
//            jLabel_imagePath_.setText(path);
//            imagePath = path;
//
//        } short hand
        String path =func.selectImage() ;
        jLabel_imagePath_.setText(path);
        imagePath = path;
    }//GEN-LAST:event_jButton_selecteProfile_ActionPerformed

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
            java.util.logging.Logger.getLogger(AddMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMember().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Titlebar;
    private javax.swing.JPanel email;
    private javax.swing.JPanel firstName;
    private javax.swing.JPanel form;
    private javax.swing.JPanel gender;
    private javax.swing.JButton jButton_add_;
    private javax.swing.JButton jButton_selecteProfile_;
    private javax.swing.JComboBox<String> jComboBox_gender_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_Empty_FirstName_;
    private javax.swing.JLabel jLabel_Empty_LastName_;
    private javax.swing.JLabel jLabel_Empty_phone_;
    private javax.swing.JLabel jLabel_Form_Title;
    private javax.swing.JLabel jLabel_Form_Title1;
    private javax.swing.JLabel jLabel_imagePath_;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JTextField jTextField_Email_;
    private javax.swing.JTextField jTextField_LastName_;
    private javax.swing.JTextField jTextField_Phone_;
    private javax.swing.JTextField jTextField_firstName_;
    private javax.swing.JPanel lastName;
    private javax.swing.JPanel phone;
    private javax.swing.JPanel profile;
    // End of variables declaration//GEN-END:variables
}
