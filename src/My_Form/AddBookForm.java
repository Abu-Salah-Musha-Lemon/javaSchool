package My_Form;

import My_Class.adb_Book;
import java.awt.Color;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class AddBookForm extends javax.swing.JFrame {

    My_Class.Member member = new My_Class.Member();
    My_Class.Fun_Class func = new My_Class.Fun_Class();
    My_Class.Genre genre = new My_Class.Genre();
    HashMap<String, Integer> genresMap = genre.getGenersMap();

    String imagePath = "";

    public AddBookForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        // add a gray border to the panel
        Border panelHeaderBorder = BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(1, 50, 74));
        jPanel11.setBorder(panelHeaderBorder);

        // display Image in the top
        func.displayImage(80, 80, null, "/My_image/4185556.png", jLabel_Form_Title);

        // populate jcombobox with genres
        fillJcomboboxWithGenres();
        // display member in the jtable
        populateJTableMember("");// dont use space in the cotation
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel11 = new javax.swing.JPanel();
        Titlebar = new javax.swing.JPanel();
        jLabel_Form_Title = new javax.swing.JLabel();
        jLabel_Form_Title1 = new javax.swing.JLabel();
        jLabel_image_view = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_adb_Authore_ = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField_adb_Name_ = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_adb_ISBN_ = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField_adb_Publisher_ = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField_adb_Price_ = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Description_ = new javax.swing.JTextArea();
        jButton_selecte_image_ = new javax.swing.JButton();
        jLabel_imagePath_ = new javax.swing.JLabel();
        jButton_add_ = new javax.swing.JButton();
        jComboBox_adb_Gener_ = new javax.swing.JComboBox<>();
        jButton_Cancel_ = new javax.swing.JButton();
        jSpinner_adb_Quantity_ = new javax.swing.JSpinner();
        jLabel_adb_image_view_ = new javax.swing.JLabel();
        jButton_adb_selsect_authore_ = new javax.swing.JButton();
        jLabel_adb_authore_id = new javax.swing.JLabel();
        jLabel_adb_genre_id_ = new javax.swing.JLabel();
        jButton_adb_Clear_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setPreferredSize(new java.awt.Dimension(460, 300));

        Titlebar.setBackground(new java.awt.Color(255, 255, 255));
        Titlebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Form_Title.setBackground(new java.awt.Color(11, 150, 117));
        jLabel_Form_Title.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel_Form_Title.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Form_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Form_Title.setText("Add A New Book");
        jLabel_Form_Title.setOpaque(true);
        Titlebar.add(jLabel_Form_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 66));

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
        Titlebar.add(jLabel_Form_Title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, -10, 90, 80));

        jLabel_image_view.setBackground(new java.awt.Color(102, 204, 255));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel3.setText("Quantity :");

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel6.setText("Genre :");

        jTextField_adb_Authore_.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextField_adb_Authore_.setDoubleBuffered(true);
        jTextField_adb_Authore_.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel4.setText("Authore :");

        jTextField_adb_Name_.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel5.setText("Name");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel2.setText("IBSN:");

        jTextField_adb_ISBN_.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel7.setText("Publisher :");

        jTextField_adb_Publisher_.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel8.setText("Price :");

        jTextField_adb_Price_.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel9.setText("Date Received :");

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel10.setText("Book Description:");

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel11.setText("Book Cover");

        jTextArea_Description_.setColumns(20);
        jTextArea_Description_.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Description_);

        jButton_selecte_image_.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton_selecte_image_.setText("Select Picture");
        jButton_selecte_image_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_selecte_image_ActionPerformed(evt);
            }
        });

        jLabel_imagePath_.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_imagePath_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_imagePath_.setForeground(new java.awt.Color(0, 51, 255));
        jLabel_imagePath_.setText("Chose your image");

        jButton_add_.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jButton_add_.setText("Add New Book");
        jButton_add_.setMaximumSize(new java.awt.Dimension(106, 40));
        jButton_add_.setMinimumSize(new java.awt.Dimension(106, 40));
        jButton_add_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_add_ActionPerformed(evt);
            }
        });

        jComboBox_adb_Gener_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_adb_Gener_ActionPerformed(evt);
            }
        });

        jButton_Cancel_.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jButton_Cancel_.setText("Cancel");
        jButton_Cancel_.setMaximumSize(new java.awt.Dimension(106, 40));
        jButton_Cancel_.setMinimumSize(new java.awt.Dimension(106, 40));
        jButton_Cancel_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Cancel_ActionPerformed(evt);
            }
        });

        jLabel_adb_image_view_.setBackground(new java.awt.Color(102, 204, 255));

        jButton_adb_selsect_authore_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_adb_selsect_authore_.setText("Select Author");
        jButton_adb_selsect_authore_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_adb_selsect_authore_ActionPerformed(evt);
            }
        });

        jLabel_adb_authore_id.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel_adb_authore_id.setText("ID");

        jLabel_adb_genre_id_.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel_adb_genre_id_.setText("ID");

        jButton_adb_Clear_.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jButton_adb_Clear_.setText("Clear");
        jButton_adb_Clear_.setMaximumSize(new java.awt.Dimension(106, 40));
        jButton_adb_Clear_.setMinimumSize(new java.awt.Dimension(106, 40));
        jButton_adb_Clear_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_adb_Clear_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titlebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel_image_view)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_adb_Clear_, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_add_, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton_Cancel_, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(103, 103, 103)
                        .addComponent(jTextField_adb_ISBN_, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119)
                        .addComponent(jLabel10))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_adb_Name_, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_adb_Publisher_, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_adb_Price_, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jTextField_adb_Authore_, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(jLabel_adb_authore_id)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_adb_selsect_authore_))
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel11Layout.createSequentialGroup()
                                    .addComponent(jComboBox_adb_Gener_, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel_adb_genre_id_, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jSpinner_adb_Quantity_, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton_selecte_image_)
                                    .addComponent(jLabel_adb_image_view_, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addComponent(jLabel_imagePath_))))
                    .addComponent(jLabel9)))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Titlebar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_image_view))
                .addGap(40, 40, 40)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_adb_ISBN_, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jTextField_adb_Name_, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_adb_Authore_, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel_adb_authore_id, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton_adb_selsect_authore_, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(11, 11, 11)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox_adb_Gener_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_adb_genre_id_, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addComponent(jSpinner_adb_Quantity_, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(jTextField_adb_Publisher_, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jTextField_adb_Price_, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addGap(100, 100, 100)
                                        .addComponent(jButton_selecte_image_))
                                    .addComponent(jLabel_adb_image_view_, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_imagePath_, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(47, 47, 47)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton_add_, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_adb_Clear_, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton_Cancel_, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_Form_Title1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Form_Title1MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel_Form_Title1MouseClicked

    private void jButton_selecte_image_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_selecte_image_ActionPerformed
        // select picture fromo the computer
        String path = func.selectImage();
        jLabel_imagePath_.setText(path);
        // display the image
        func.displayImage(125, 100, null, path, jLabel_adb_image_view_);
        imagePath = path;
    }//GEN-LAST:event_jButton_selecte_image_ActionPerformed

    private void jButton_add_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_add_ActionPerformed
        // add a new book
        My_Class.adb_Book book = new adb_Book();
        String ISBN = jTextField_adb_ISBN_.getText();
        if (!verif()) {
            JOptionPane.showMessageDialog(null, "One or more field is empty", "Empty data", 2);
            System.out.println("One or more field is empty");
        } else if (book.isISBNexists(ISBN)) {
            JOptionPane.showMessageDialog(null, "The ISBN alredy exists", "Worning ISBN", 2);
        } else {
            try {
                //get value

                String name = jTextField_adb_Name_.getText();
                Integer author_id = Integer.parseInt(jLabel_adb_authore_id.getText());// gent the author id
                Integer genre_id = Integer.parseInt(jLabel_adb_genre_id_.getText());// get the genre id
                Integer quantity = Integer.parseInt(jSpinner_adb_Quantity_.getValue().toString());
                //Date received_date = jDataChooser_Date.getDate();
                String publisher = jTextField_adb_Publisher_.getText();
                String description = jTextArea_Description_.getText();
                double price = Double.parseDouble(jTextField_adb_Price_.getText());

                // get the image bytes
                Path path = Paths.get(imagePath);
                byte[] img = Files.readAllBytes(path);

                book.addMember(ISBN, name, author_id, genre_id, quantity, publisher, price, description, img);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Make Sure To add a cover Image ", "Cover Image Is not found", 2);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "You Enterd Wrong Data In a Number", "Wrong data", 2);
        } catch (NullPointerException ex) {
            System.out.println("NullPointerException");
        }
            
        }


    }//GEN-LAST:event_jButton_add_ActionPerformed

    private void jButton_Cancel_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Cancel_ActionPerformed
        // close the windows
        this.dispose();
    }//GEN-LAST:event_jButton_Cancel_ActionPerformed

    private void jButton_adb_selsect_authore_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_adb_selsect_authore_ActionPerformed
        // show a form
        // the form will have a jtable populated with author
        // the user can select an author from hte table and he will be display in the jtextField
        AuthoreListForm authorsForm = new AuthoreListForm();
        authorsForm.setVisible(true);
    }//GEN-LAST:event_jButton_adb_selsect_authore_ActionPerformed

    private void jComboBox_adb_Gener_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_adb_Gener_ActionPerformed
        // display the selected genre id
        // if hte jcombobox is empty an error will be through
        // so to avoid that we will addd a empty try catch just an case

        try {
            int genreID = genresMap.get(jComboBox_adb_Gener_.getSelectedItem().toString());
            jLabel_adb_genre_id_.setText(String.valueOf(genreID));
        } catch (Exception e) {
            System.out.println("Error from jComboBox Genre Action performed - " + e.getMessage());
        }


    }//GEN-LAST:event_jComboBox_adb_Gener_ActionPerformed

    private void jButton_adb_Clear_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_adb_Clear_ActionPerformed
        // Clear all the fields
        jTextField_adb_ISBN_.setText("");

        jTextField_adb_Name_.setText("");
        jTextField_adb_Authore_.setText("");
        jLabel_adb_authore_id.setText("ID");
        jComboBox_adb_Gener_.setSelectedIndex(0);
        jLabel_adb_genre_id_.setText("ID");
        jSpinner_adb_Quantity_.setValue(0);
        jTextField_adb_Publisher_.setText("");
        jTextArea_Description_.setText("");
        jTextField_adb_Price_.setText("");
        jLabel_adb_image_view_.setIcon(null);
        jLabel_imagePath_.setText(" Picture path");
    }//GEN-LAST:event_jButton_adb_Clear_ActionPerformed

// display the selectied author data
    public static void displayAuthorData(int id, String fullName) {
        jTextField_adb_Authore_.setText(fullName);
        jLabel_adb_authore_id.setText(String.valueOf(id));
    }

    // create a function to verify the required fields
    public boolean verif() {

        if (jTextField_adb_ISBN_.getText().equals("") || jTextField_adb_Authore_.getText().equals("")
                || jTextField_adb_Price_.getText().equals("") || jTextField_adb_Authore_.getText().equals("")
                || jLabel_adb_genre_id_.getText().equals("ID")) {
            return false;
        } else {

            return true;
        }

    }

    // create a function to populate he jcombobox with hte genere name and id using hashmap
    public void fillJcomboboxWithGenres() {

        for (String genreName : genresMap.keySet()) {
            jComboBox_adb_Gener_.addItem(genreName);

        }
    }

    // create a function to poplate the jtable with Member
    public void populateJTableMember(String query) {
        ArrayList<My_Class.Member> memberList = member.memberList(query);
        // jTable
        String[] colName = {"id", "F-Name", "L-Name", "phone", "email", "Gender"};

        // row
        Object[][] row = new Object[memberList.size()][colName.length];
        for (int i = 0; i < memberList.size(); i++) {
            row[i][0] = memberList.get(i).getId();
            row[i][1] = memberList.get(i).getFirstName();
            row[i][2] = memberList.get(i).getLastName();
            row[i][3] = memberList.get(i).getPhone();
            row[i][4] = memberList.get(i).getEmail();
            row[i][5] = memberList.get(i).getGender();
//            row[i][4] = memberList.get(i).getPicture();

        }
        DefaultTableModel model = new DefaultTableModel(row, colName);

    }

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
            java.util.logging.Logger.getLogger(AddBookForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBookForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBookForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBookForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBookForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Titlebar;
    private javax.swing.JButton jButton_Cancel_;
    private javax.swing.JButton jButton_adb_Clear_;
    private javax.swing.JButton jButton_adb_selsect_authore_;
    private javax.swing.JButton jButton_add_;
    private javax.swing.JButton jButton_selecte_image_;
    private javax.swing.JComboBox<String> jComboBox_adb_Gener_;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Form_Title;
    private javax.swing.JLabel jLabel_Form_Title1;
    private static javax.swing.JLabel jLabel_adb_authore_id;
    private static javax.swing.JLabel jLabel_adb_genre_id_;
    private javax.swing.JLabel jLabel_adb_image_view_;
    private javax.swing.JLabel jLabel_imagePath_;
    private javax.swing.JLabel jLabel_image_view;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner_adb_Quantity_;
    private javax.swing.JTextArea jTextArea_Description_;
    private static javax.swing.JTextField jTextField_adb_Authore_;
    private javax.swing.JTextField jTextField_adb_ISBN_;
    private javax.swing.JTextField jTextField_adb_Name_;
    private javax.swing.JTextField jTextField_adb_Price_;
    private javax.swing.JTextField jTextField_adb_Publisher_;
    // End of variables declaration//GEN-END:variables
}
