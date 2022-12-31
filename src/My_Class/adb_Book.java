package My_Class;

import java.awt.print.Book;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class adb_Book {

    private Integer id;
    private String ISBN;
    private String name;
    private Integer authore_id;
    private Integer gener_id;
    private Integer quantity;
    private String publisher;
    private double price;
    //private Date date_received;
    private String description;
    private byte[] cover;

    public adb_Book(int _id, String _ISBN, String _name, int _authore_id, int _gener_id, int _quantity, String _publisher, double _price, String _description, byte[] _cover) {
        this.id = _id;
        this.ISBN = _ISBN;
        this.name = _name;
        this.authore_id = _authore_id;
        this.gener_id = _gener_id;
        this.quantity = _quantity;
        this.publisher = _publisher;
        this.price = _price;
        //this.date_received = _date_received;
        this.description = _description;
        this.cover = _cover;
    }

    public adb_Book() {
    }

    public Integer getId() {
        return id;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getName() {
        return name;
    }

    public Integer getAuthore_id() {
        return authore_id;
    }

    public Integer getGener_id() {
        return gener_id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String getPublisher() {
        return publisher;
    }

    public double getPrice() {
        return price;
    }

//    public Date getDate_received() {
//        return date_received;
//    }
    public String getDescription() {
        return description;
    }

    public byte[] getCover() {
        return cover;
    }

    // add Member information
    public void addMember(String _ISBN, String _name, Integer _authore_id, Integer _gener_id, Integer _quantity,
            String _publisher, double _price, String _description, byte[] _cover) {
        String insertQuery = "INSERT INTO `adb_book`(`isbn`, `name`, `authore_id`, `gener_id`, `quantity`, `pubisher`, `price`,"
                + "  `cover`, `descritpion`) VALUES (?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);

            ps.setString(1, _ISBN);
            ps.setString(2, _name);
            ps.setInt(3, _authore_id);
            ps.setInt(4, _gener_id);
            ps.setInt(5, _quantity);
            ps.setString(6, _publisher);
            ps.setDouble(7, _price);
//            ps.setDate(8, _date_received);
            ps.setBytes(8, _cover);
            ps.setString(9, _description);

            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Book  Added", "add Book", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Book Not Added", "add Book", 2);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    Fun_Class func = new Fun_Class();

    public boolean isISBNexists(String _isbn) {
        String qurey = "SELECT * FROM `adb_book` WHERE `isbn`='" + _isbn + "' ";

        ResultSet rs = func.getData(qurey);
        try {
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(adb_Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;

    }

    public adb_Book searchBookByID_Isbn(int id, String _isbn) {
        String qurey = "SELECT * FROM `adb_book` WHERE `id`= " + id + "  OR `isbn` = '" + _isbn + "'";

        ResultSet rs = func.getData(qurey);
        adb_Book book = null;
        try {
            if (rs.next()) {
                book = new adb_Book(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getString(7),
                        rs.getDouble(8),
                        rs.getString(10),
                        rs.getBytes(9)
                );

            } else {
                return book;
            }
        } catch (SQLException ex) {
            Logger.getLogger(adb_Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        return book;

    }
}
