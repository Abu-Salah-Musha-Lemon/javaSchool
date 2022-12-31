package My_Class;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Fun_Class {

    public void displayImage(int width, int height, byte[] imageByte, String imagePath, JLabel label) {
        //it is swing class
        //get the image
        ImageIcon imageIcon;
        if (imageByte != null) {    // get image used byte
            imageIcon = new ImageIcon(imageByte);
        } else {// get image using paht

            try {
                // get the image from the project resources
                imageIcon = new ImageIcon(getClass().getResource(imagePath));
            } catch (Exception e) {
                // get the image from the desktop
                imageIcon = new ImageIcon(imagePath);
            }

        }
//        imageIcon = new ImageIcon(getClass().getResource(imagePath));
        //it is awt class
        //make the image fit the jlable
        Image image = imageIcon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        //set the image into the jlable
        label.setIcon(new ImageIcon(image));

    }

    /*----------------------------End----------------------------*/
 /*----------------------------Table create----------------------------*/
    // create a table to costomize the table
    public void customTable(JTable table) {

        table.setSelectionBackground(new Color(249, 105, 14));
        table.setSelectionForeground(Color.white);
        table.setRowHeight(20);
        table.setBackground(new Color(248, 248, 247));
        table.setShowHorizontalLines(true);
        table.setGridColor(Color.yellow);

    }

    // create a table to costomize the table header
    public void customTableHeader(JTable table, Color back_color, Integer fontSize) {
        table.getTableHeader().setBackground(back_color);
        table.getTableHeader().setForeground(Color.white);
        table.getTableHeader().setFont(new Font("Verdana", Font.BOLD, fontSize));
        table.getTableHeader().setOpaque(false);

    }

    /*----------------------------Table end----------------------------*/
 /*----------------------------ResultSet----------------------------*/
    // create a function to return a resultSet
    // we will use this function to reduce the code when populating array list
    public ResultSet getData(String query) {
        PreparedStatement ps;
        ResultSet rs = null;

        try {
            ps = DB.getConnection().prepareStatement(query);
            rs = ps.executeQuery();

        } catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);

        }
        return rs;

    }

    // Creat a function to select  image
    // the funciton will return hte image path
    public String selectImage() {

        // select picture fromo the computer
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Selecte profile picture");
        fileChooser.setCurrentDirectory(new File("C:\\images"));
        FileNameExtensionFilter extentionFilter = new FileNameExtensionFilter("Image", ".png", ".jpg", "jpeg");
        fileChooser.addChoosableFileFilter(extentionFilter);

        int fileState = fileChooser.showSaveDialog(null);
        String path = ""; 
        if (fileState == JFileChooser.APPROVE_OPTION) {
             path = fileChooser.getSelectedFile().getAbsolutePath();
        }
        return path;

    }

}
