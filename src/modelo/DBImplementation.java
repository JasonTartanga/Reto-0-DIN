package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 *
 * @author Jason, Ian.
 */
public class DBImplementation implements Model {

    private Connection con = null;
    private PreparedStatement stmt;

    private final String GET_GREATING = "SELECT greating FROM greating";

    public void openConnection() {

        try {
            final String URL = ResourceBundle.getBundle("ficheros.configBDA").getString("url");
            final String USER = ResourceBundle.getBundle("ficheros.configBDA").getString("user");
            final String PASSWORD = ResourceBundle.getBundle("ficheros.configBDA").getString("password");;

            con = DriverManager.getConnection(URL, USER, PASSWORD);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void closeConnection() {
        try {
            if (con != null) {
                con.close();
            }
            if (stmt != null) {
                stmt.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getGreating() {
        String greating = null;
        this.openConnection();

        try {
            stmt = con.prepareStatement(GET_GREATING);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                greating = rs.getString("greating");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        this.closeConnection();
        return greating;
    }
}
