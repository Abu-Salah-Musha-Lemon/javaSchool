package My_Class;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Member {

    private int id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String gender;
    private byte[] picture;

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public byte[] getPicture() {
        return picture;
    }

    public Member() {
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

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    public Member(int _id, String _fname, String _lname, String _phone, String _email, String _gender, byte[] _picture) {

        this.id = _id;
        this.firstName = _fname;
        this.lastName = _lname;
        this.phone = _phone;
        this.email = _email;
        this.picture = _picture;
        this.gender = _gender;

    }

    // add Member information
    public void addMember(String _firstName, String _lastName, String _phone, String _email, String _gender, byte[] _pic) {
        String insertQuery = "INSERT INTO `member`(`firstName`, `lastName`, `phone`, `email`, `gender`, `picture`)"
                + " VALUES (?,?,?,?,?,?)";

        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);

            ps.setString(1, _firstName);
            ps.setString(2, _lastName);
            ps.setString(3, _phone);
            ps.setString(4, _email);
            ps.setString(5, _gender);
            ps.setBytes(6, _pic);

            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Member Added", "add Member", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Member NOT Added", "add Member", 2);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // edit Member information function
    public void editMember(int _id, String _firstName, String _lastName, String _phone, String _email, String _gender, byte[] _pic) {
        // allways care of the systex for the database function
        String editQuery = "UPDATE `member` SET `firstName`=?,`lastName`=?,`phone`=?,`email`=?,`gender`=?,`picture`=? WHERE `id`=?";

        try {
            // databass connection
            PreparedStatement ps = DB.getConnection().prepareStatement(editQuery);

            ps.setString(1, _firstName);
            ps.setString(2, _lastName);
            ps.setString(3, _phone);
            ps.setString(4, _email);
            ps.setString(5, _gender);
            ps.setBytes(6, _pic);
            ps.setInt(7, _id);

            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Member Edit", " Edit Member", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Member NOT Edit", "Edit Member", 2);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // remove/ Delete Member function
    public void removeMember(int _id) {
        String removeQuery = "DELETE FROM `member` WHERE `id`=? ";

        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(removeQuery);

            ps.setInt(1, _id);

            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Member Delete", " Remove Member ", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Member NOT Delete", "Remove Member", 2);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // get member by id
    public Member getMemberById(Integer _id) throws SQLException {

        Fun_Class func = new Fun_Class();
        String query = "SELECT * FROM `member` WHERE `id` =" + _id;
        ResultSet rs = func.getData(query);

        if (rs.next()) {
            return new Member(
                    rs.getInt(0),
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getBytes(6)
            );
        } else {
            return null;
        }
    }

    // function to populate an array list with member
    public ArrayList<Member> memberList(String qurey) {

        ArrayList<Member> mList = new ArrayList<>();

        My_Class.Fun_Class func = new Fun_Class();

        try {
            if (qurey.equals("")) {
                qurey = "SELECT * FROM member";
            }
            ResultSet rs = func.getData(qurey);
            Member member;

            while (rs.next()) {
                member = new Member(
                        rs.getInt("id"),
                        rs.getString("firstName"),
                        rs.getString("lastName"),
                        rs.getString("phone"),
                        rs.getString("email"),
                        rs.getString("gender"),
                        rs.getBytes("picture")// always use the same name of the database name 
                );
                mList.add(member);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mList;

    }

}
