package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 * Esta clase es la implementacion de la logica del negocio mediante una base de
 * datos.
 *
 * @author Jason, Ian.
 */
public class DBImplementation implements Model {

    private Connection con = null;
    private PreparedStatement stmt;

    private final String GET_greeting = "SELECT greeting FROM greeting";

    /**
     * Abre la conexion con la base de datos.
     */
    public void openConnection() {

        try {
            final String URL = ResourceBundle.getBundle("files.configBDA").getString("url");
            final String USER = ResourceBundle.getBundle("files.configBDA").getString("user");
            final String PASSWORD = ResourceBundle.getBundle("files.configBDA").getString("password");;

            con = DriverManager.getConnection(URL, USER, PASSWORD);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Cierra la conexion con la base de datos.
     */
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

    /**
     * Busca el mensaje que se va a mostrar en la base de datos.
     *
     * @return el mensaje que se va a mostrar.
     */
    @Override
    public String getGreeting() {
        String greeting = null;
        this.openConnection();

        try {
            stmt = con.prepareStatement(GET_greeting);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                greeting = rs.getString("greeting");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        this.closeConnection();
        return greeting;
    }
}
