package My_Class;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DB {

    //creat the connection between the projec and mysql data bas
    private static String server = "localhost";
    private static String username = "root";
    private static String dbname = "java_library_system";
    private static int portNumber = 3306;
    private static String password = "";

    // creat a function to connecte & return connecton
    public static Connection getConnection() {

        Connection connection = null;
        MysqlDataSource datasource = new MysqlDataSource();
        datasource.setServerName(server);
        datasource.setUser(username);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portNumber);
        datasource.setPassword(password);

        try {
            connection = datasource.getConnection();
           // System.out.println("connected succes");
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }

        return connection;

    }

}
