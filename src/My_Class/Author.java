package My_Class;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Author {

    private int id;
    private String firstName;
    private String lastName;
    private String field_of_Expertise;
    private String about;

    public Author() {
    }

    public Author(int _id, String _fname, String _lname, String _Experties, String _about) {

        this.id = _id;
        this.firstName = _fname;
        this.lastName = _lname;
        this.field_of_Expertise = _Experties;
        this.about = _about;

    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getField_of_Expertise() {
        return field_of_Expertise;
    }

    public String getAbout() {
        return about;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setField_of_Expertise(String field_of_Expertise) {
        this.field_of_Expertise = field_of_Expertise;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    // add author information
    public void addAuthor(String firstName, String lastNameame, String experts, String about) {
        String insertQuery = "INSERT INTO `author`( `firstName`, `lastName`, `experts`, `about`) VALUES (?,?,?,?)";

        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            ps.setString(1, firstName);
            ps.setString(2, lastNameame);
            ps.setString(3, experts);
            ps.setString(4, about);

            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Authors Added", "add Authors", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Authors NOT Added", "add Authors", 2);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // edit authors information function
    public void editAuthor(int _id, String firstName, String lastNameame, String experts, String about) {

        String editQuery = "UPDATE `author` SET `firstName`=?,`lastName`=?,`experts`=?,`about`=? WHERE `id`=?";

        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(editQuery);
            ps.setString(1, firstName);// never for get that setString(1,_name)
            ps.setString(2, lastNameame);// never for get that setString(1,_name)
            ps.setString(3, experts);// never for get that setString(1,_name)
            ps.setString(4, about);// never for get that setString(1,_name)
            ps.setInt(5, _id);

            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Author Edit", " Edit Authors", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Author NOT Edit", "Edit Authors", 2);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // remove/ Delete Author function
    public void removeAuthor(int _id) {
        String removeQuery = "DELETE FROM `author` WHERE `id`=? ";

        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(removeQuery);

            ps.setInt(1, _id);

            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Author Delete", " Remove Author ", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Author NOT Delete", "Remove Author", 2);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // function to populate an array list with book
    public ArrayList<Author> authorList() {

        ArrayList<Author> aList = new ArrayList<>();
        // this cord used for the fun_class      
//        String selectQuery = "SELECT * FROM `author`";
//        PreparedStatement ps;
//        
//        ResultSet rs;
//        
//        try {
//            ps = DB.getConnection().prepareStatement(selectQuery);
//            rs = ps.executeQuery();
//            Author author;
//            
//            // use while loop for fill the table
//            //
//            while (rs.next()) {                
//                author = new Author(rs.getInt("id"),rs.getString("firstName"),rs.getString("lastName"),rs.getString("experts"),rs.getString("about"));
//                aList.add(author);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return aList;

        String selectQuery = "SELECT * FROM `author`";
        My_Class.Fun_Class func = new Fun_Class();
        ResultSet rs;

        try {
            rs = func.getData(selectQuery);
            Author author;

            while (rs.next()) {
                author = new Author(rs.getInt("id"), rs.getString("firstName"), rs.getString("lastName"), rs.getString("experts"), rs.getString("about"));
                aList.add(author);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }
        return aList;

    }

    public Author getAuthorByID(Integer id) {
        My_Class.Fun_Class func = new Fun_Class();
        ResultSet rs = func.getData("SELECT * FROM `author`where id = "+ id);

        Author author = null;
        try {

            if (rs.next()) {
                author = new Author(rs.getInt("id"), rs.getString("firstName"), rs.getString("lastName"), rs.getString("experts"), rs.getString("about"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }
        return author;

    }

}
