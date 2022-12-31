package My_Class;

import java.sql.PreparedStatement;
import My_Class.DB;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Genre {

    private int id;
    private String name;

    //constructor
    public Genre() {
    }

    public Genre(int id, String name) {
        this.id = id;
        this.name = name;
    }
// geter and seter 

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // function
    My_Class.Fun_Class func = new Fun_Class();
    // insert a new genrs function
    public void addGenre(String name) {
        String insertQuery = "INSERT INTO book_geners(name) VALUES (?)";

        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            ps.setString(1, name);

            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Gener Added", "add genre", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Gener NOT Added", "add genre", 2);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // edit a new genrs function
    public void editGenre(int _id, String _name) {
        String editQuery = "UPDATE `book_geners` SET`name`=? WHERE `id`=?";

        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(editQuery);
            ps.setString(1, _name);// never for get that setString(1,_name)
            ps.setInt(2, _id);

            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Gener Edit", " Edit Genre", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Gener NOT Edit", "Edit Genre", 2);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // remove/ Delete a new genrs function
    public void removeGenre(int _id) {
        String removeQuery = "DELETE FROM `book_geners` WHERE `id`=?";

        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(removeQuery);

            ps.setInt(1, _id);

            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Gener Delete", " Remove ", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Gener NOT Delete", "Remove Genre", 2);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // function to populate an array list with book
    public ArrayList<Genre> genreList() {

        ArrayList<Genre> gList = new ArrayList<>();

        String selectQuery = "SELECT * FROM `book_geners`";
        PreparedStatement ps;

        ResultSet rs;

        try {
            ps = DB.getConnection().prepareStatement(selectQuery);
            rs = ps.executeQuery();
            Genre genre;
            while (rs.next()) {
                genre = new Genre(rs.getInt("id"), rs.getString("name"));
                gList.add(genre);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }
        return gList;

    }

    // create a function to return a hashmap
    // string is the key
    // integer is the value
    public HashMap<String, Integer> getGenersMap() {
        HashMap<String, Integer> map = new HashMap<>();

        String selectQuery = "SELECT * FROM `book_geners`";
        PreparedStatement ps;
        ResultSet rs;

        try {
            ps = DB.getConnection().prepareStatement(selectQuery);
            rs = ps.executeQuery();
            Genre genre;
            while (rs.next()) {
                genre = new Genre(rs.getInt("id"), rs.getString("name"));
                map.put(genre.getName(),genre.getId());
            }
        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }
        return map;

    }
}
