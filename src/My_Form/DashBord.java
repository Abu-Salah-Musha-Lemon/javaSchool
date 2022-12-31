/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package My_Form;

import My_Class.Fun_Class;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.ComponentSampleModel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.Border;

/**
 *
 * @author USER
 */
public class DashBord extends javax.swing.JFrame {

    // the button bordre
    Border buttonBoder1 = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
    Border buttonBoder0 = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(36,37,42));

    My_Class.Fun_Class func = new Fun_Class();
    
    
    
    public DashBord() {
        initComponents();

        //creat form
        this.setLocationRelativeTo(null);

//        displayImage();

         // this display image  in the dashbord left side
        func.displayImage(jLabel_dashbordLogo.getWidth(), jLabel_dashbordLogo.getHeight(),null, "/My_image/telephone.png", jLabel_dashbordLogo);
         // buttonsHOverEffect

        // creat a panel header
        Border panelHeaderBoder = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.white);
        jPanel_header.setBorder(panelHeaderBoder);
        Border panelHeader_1_Border = BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(235, 125, 32));
        jPanel_1_header.setBorder(panelHeaderBoder);
        Border panelHeader_2_Border = BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(28, 138, 32));
        jPanel_2_header.setBorder(panelHeaderBoder);
        Border panelHeader_3_Border = BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(115, 48, 132));
        jPanel_3_header.setBorder(panelHeaderBoder);
        Border panelHeader_4_Border = BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(115, 48, 132));
        jPanel_4_header.setBorder(panelHeaderBoder);
        
        // add borders to the buttons
         //addBorder();
         

        buttonsHoverEffect();
        

    }

    // creat a hover effect
    public void buttonsHoverEffect() {
        // it is awt class Component
        //get all the component in the jpanel menu
        Component[] comps = jPanel_Main.getComponents();
        for (Component comp : comps) {
            // check if the component is a button
            if (comp instanceof JButton) {
                JButton button = (JButton) comp;
                // add the action we wash to button 
                button.addMouseListener(new MouseAdapter() {

                    public void mouseEnterd(MouseEvent evt) {
                        button.setBorder(buttonBoder1);
                    }
                    public void mouseExited(MouseEvent evt) {
                        button.setBorder(buttonBoder0);
                    }

                });

            }
        }
    }
// this function is used of Fun_Class 
//    public void displayImage() {
//        //it is swing class
//        //get the image
//        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/My_image/"));
//        //it is awt class
//        //make the image fit the jlable
//        Image image = imageIcon.getImage().getScaledInstance(jLabel_dashbordLogo.getWidth(), jLabel_dashbordLogo.getHeight(), Image.SCALE_SMOOTH);
//        //set the image into the jlable
//        jLabel_dashbordLogo.setIcon(new ImageIcon(image));
//
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel_Main = new javax.swing.JPanel();
        jPanel_header = new javax.swing.JPanel();
        jLabel_dashbordLogo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton_manage_genres_ = new javax.swing.JButton();
        jButton_Edit_Member_ = new javax.swing.JButton();
        jButton_Delete_Member_ = new javax.swing.JButton();
        jButton_Members_List = new javax.swing.JButton();
        jButton_add_member_ = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton_manage_author_ = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPane_1 = new javax.swing.JPanel();
        jPanel_1_header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPane_2 = new javax.swing.JPanel();
        jPanel_2_header = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPane_3 = new javax.swing.JPanel();
        jPanel_3_header = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPane_4 = new javax.swing.JPanel();
        jPanel_4_header = new javax.swing.JPanel();
        jLabel_4_header1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel_Main.setBackground(new java.awt.Color(36, 37, 42));

        jPanel_header.setBackground(new java.awt.Color(1, 50, 67));

        jLabel_dashbordLogo.setBackground(new java.awt.Color(255, 204, 204));
        jLabel_dashbordLogo.setText("jLabel1");
        jLabel_dashbordLogo.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 255));
        jLabel2.setText("Libary");

        javax.swing.GroupLayout jPanel_headerLayout = new javax.swing.GroupLayout(jPanel_header);
        jPanel_header.setLayout(jPanel_headerLayout);
        jPanel_headerLayout.setHorizontalGroup(
            jPanel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_dashbordLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel_headerLayout.setVerticalGroup(
            jPanel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_headerLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_dashbordLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Genres");

        jButton_manage_genres_.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton_manage_genres_.setText("Manage Genres");
        jButton_manage_genres_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_manage_genres_ActionPerformed(evt);
            }
        });

        jButton_Edit_Member_.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton_Edit_Member_.setForeground(new java.awt.Color(204, 204, 204));
        jButton_Edit_Member_.setText("Edit Member");
        jButton_Edit_Member_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Edit_Member_ActionPerformed(evt);
            }
        });

        jButton_Delete_Member_.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton_Delete_Member_.setForeground(new java.awt.Color(204, 204, 204));
        jButton_Delete_Member_.setText("Delete Member");
        jButton_Delete_Member_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Delete_Member_ActionPerformed(evt);
            }
        });

        jButton_Members_List.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton_Members_List.setForeground(new java.awt.Color(204, 204, 204));
        jButton_Members_List.setText("Members List");
        jButton_Members_List.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Members_ListActionPerformed(evt);
            }
        });

        jButton_add_member_.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton_add_member_.setForeground(new java.awt.Color(204, 204, 204));
        jButton_add_member_.setText("Add Member");
        jButton_add_member_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_add_member_ActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Member");

        jButton_manage_author_.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton_manage_author_.setText("Manage Author");
        jButton_manage_author_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_manage_author_ActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Author");

        javax.swing.GroupLayout jPanel_MainLayout = new javax.swing.GroupLayout(jPanel_Main);
        jPanel_Main.setLayout(jPanel_MainLayout);
        jPanel_MainLayout.setHorizontalGroup(
            jPanel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_MainLayout.createSequentialGroup()
                .addGroup(jPanel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_MainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel_MainLayout.createSequentialGroup()
                        .addGroup(jPanel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_MainLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel_MainLayout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jButton_manage_genres_, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel_MainLayout.createSequentialGroup()
                                    .addGap(27, 27, 27)
                                    .addGroup(jPanel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton_Edit_Member_, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton_Delete_Member_, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton_Members_List, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton_add_member_, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_MainLayout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel_MainLayout.createSequentialGroup()
                                            .addGap(9, 9, 9)
                                            .addComponent(jButton_manage_author_, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel_MainLayout.setVerticalGroup(
            jPanel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_MainLayout.createSequentialGroup()
                .addComponent(jPanel_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_manage_genres_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_manage_author_)
                .addGap(35, 35, 35)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_add_member_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Edit_Member_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Delete_Member_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Members_List)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPane_1.setBackground(new java.awt.Color(153, 255, 153));
        jPane_1.setPreferredSize(new java.awt.Dimension(250, 256));

        jPanel_1_header.setBackground(new java.awt.Color(255, 204, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("books");

        javax.swing.GroupLayout jPanel_1_headerLayout = new javax.swing.GroupLayout(jPanel_1_header);
        jPanel_1_header.setLayout(jPanel_1_headerLayout);
        jPanel_1_headerLayout.setHorizontalGroup(
            jPanel_1_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_1_headerLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel_1_headerLayout.setVerticalGroup(
            jPanel_1_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_1_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("0000");

        javax.swing.GroupLayout jPane_1Layout = new javax.swing.GroupLayout(jPane_1);
        jPane_1.setLayout(jPane_1Layout);
        jPane_1Layout.setHorizontalGroup(
            jPane_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_1_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPane_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPane_1Layout.createSequentialGroup()
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPane_1Layout.setVerticalGroup(
            jPane_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPane_1Layout.createSequentialGroup()
                .addComponent(jPanel_1_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 190, Short.MAX_VALUE))
            .addGroup(jPane_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPane_1Layout.createSequentialGroup()
                    .addGap(101, 101, 101)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addGap(101, 101, 101)))
        );

        jPane_2.setBackground(new java.awt.Color(102, 102, 255));
        jPane_2.setPreferredSize(new java.awt.Dimension(250, 256));

        jPanel_2_header.setBackground(new java.awt.Color(153, 153, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Member");

        javax.swing.GroupLayout jPanel_2_headerLayout = new javax.swing.GroupLayout(jPanel_2_header);
        jPanel_2_header.setLayout(jPanel_2_headerLayout);
        jPanel_2_headerLayout.setHorizontalGroup(
            jPanel_2_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_2_headerLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_2_headerLayout.setVerticalGroup(
            jPanel_2_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_2_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("0000");

        javax.swing.GroupLayout jPane_2Layout = new javax.swing.GroupLayout(jPane_2);
        jPane_2.setLayout(jPane_2Layout);
        jPane_2Layout.setHorizontalGroup(
            jPane_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_2_header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPane_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPane_2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPane_2Layout.setVerticalGroup(
            jPane_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPane_2Layout.createSequentialGroup()
                .addComponent(jPanel_2_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPane_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPane_2Layout.createSequentialGroup()
                    .addGap(101, 101, 101)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addGap(101, 101, 101)))
        );

        jPane_3.setBackground(new java.awt.Color(102, 255, 255));
        jPane_3.setPreferredSize(new java.awt.Dimension(250, 256));

        jPanel_3_header.setBackground(new java.awt.Color(153, 204, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Athure");

        javax.swing.GroupLayout jPanel_3_headerLayout = new javax.swing.GroupLayout(jPanel_3_header);
        jPanel_3_header.setLayout(jPanel_3_headerLayout);
        jPanel_3_headerLayout.setHorizontalGroup(
            jPanel_3_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_3_headerLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_3_headerLayout.setVerticalGroup(
            jPanel_3_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_3_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("0000");

        javax.swing.GroupLayout jPane_3Layout = new javax.swing.GroupLayout(jPane_3);
        jPane_3.setLayout(jPane_3Layout);
        jPane_3Layout.setHorizontalGroup(
            jPane_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_3_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPane_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPane_3Layout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPane_3Layout.setVerticalGroup(
            jPane_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPane_3Layout.createSequentialGroup()
                .addComponent(jPanel_3_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPane_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPane_3Layout.createSequentialGroup()
                    .addGap(101, 101, 101)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addGap(101, 101, 101)))
        );

        jPane_4.setBackground(new java.awt.Color(153, 255, 153));
        jPane_4.setPreferredSize(new java.awt.Dimension(250, 256));

        jPanel_4_header.setBackground(new java.awt.Color(255, 204, 102));

        jLabel_4_header1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel_4_header1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_4_header1.setText("books");

        javax.swing.GroupLayout jPanel_4_headerLayout = new javax.swing.GroupLayout(jPanel_4_header);
        jPanel_4_header.setLayout(jPanel_4_headerLayout);
        jPanel_4_headerLayout.setHorizontalGroup(
            jPanel_4_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_4_headerLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel_4_header1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_4_headerLayout.setVerticalGroup(
            jPanel_4_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_4_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_4_header1, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPane_4Layout = new javax.swing.GroupLayout(jPane_4);
        jPane_4.setLayout(jPane_4Layout);
        jPane_4Layout.setHorizontalGroup(
            jPane_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_4_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPane_4Layout.setVerticalGroup(
            jPane_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPane_4Layout.createSequentialGroup()
                .addComponent(jPanel_4_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 251, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_Main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jPane_1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(jPane_2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jPane_3, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(jPane_4, javax.swing.GroupLayout.DEFAULT_SIZE, 829, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jPane_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPane_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPane_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(78, 78, 78)
                .addComponent(jPane_4, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_manage_genres_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_manage_genres_ActionPerformed
        
        // show the Manage Geners form
        ManageGenresForm mngGenresF = new ManageGenresForm();
        mngGenresF.setVisible(true);
        
    }//GEN-LAST:event_jButton_manage_genres_ActionPerformed

    private void jButton_manage_author_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_manage_author_ActionPerformed
        
        // show the Manage author_ form
        ManageAuthoreForm mngAuthors = new ManageAuthoreForm();
        mngAuthors.setVisible(true);
    }//GEN-LAST:event_jButton_manage_author_ActionPerformed

    private void jButton_add_member_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_add_member_ActionPerformed
        // show the Add Member _ form
        AddMember addMember = new AddMember();
        addMember.setVisible(true);
    }//GEN-LAST:event_jButton_add_member_ActionPerformed

    private void jButton_Edit_Member_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Edit_Member_ActionPerformed
        // show the Edit Member _ form
        EditMember editMember = new EditMember();
        editMember.setVisible(true);
    }//GEN-LAST:event_jButton_Edit_Member_ActionPerformed

    private void jButton_Delete_Member_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Delete_Member_ActionPerformed
        // show the Delete Member _ form
        DeleteMember deleteMember = new DeleteMember();
        deleteMember.setVisible(true);
    }//GEN-LAST:event_jButton_Delete_Member_ActionPerformed

    private void jButton_Members_ListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Members_ListActionPerformed
        // show the Delete Member _ form
        MemberListForm MemberList = new MemberListForm();
        MemberList.setVisible(true);
    }//GEN-LAST:event_jButton_Members_ListActionPerformed


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
            java.util.logging.Logger.getLogger(DashBord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashBord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashBord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashBord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashBord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Delete_Member_;
    private javax.swing.JButton jButton_Edit_Member_;
    private javax.swing.JButton jButton_Members_List;
    private javax.swing.JButton jButton_add_member_;
    private javax.swing.JButton jButton_manage_author_;
    private javax.swing.JButton jButton_manage_genres_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_4_header1;
    private javax.swing.JLabel jLabel_dashbordLogo;
    private javax.swing.JPanel jPane_1;
    private javax.swing.JPanel jPane_2;
    private javax.swing.JPanel jPane_3;
    private javax.swing.JPanel jPane_4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_1_header;
    private javax.swing.JPanel jPanel_2_header;
    private javax.swing.JPanel jPanel_3_header;
    private javax.swing.JPanel jPanel_4_header;
    private javax.swing.JPanel jPanel_Main;
    private javax.swing.JPanel jPanel_header;
    // End of variables declaration//GEN-END:variables
}
