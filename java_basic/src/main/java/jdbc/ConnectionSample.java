package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static java.lang.String.format;

public class ConnectionSample {

    public static final String URL = "jdbc:mysql://localhost:3306/";
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String DB_NAME = "shop";
    public static final String USER_NAME = "root";
    public static final String USER_PASS = "pass";
    public static final String CREATE_SELLERS = "CREATE TABLE Sellers " + " (id INTEGER not NULL, " +
            "name VARCHAR(40), PRIMARY KEY(id))";
    public static final String CREATE_CUSTOMERS = "CREATE TABLE customers " + " (id INTEGER not NULL, " +
            "lastname VARCHAR(40), firstname VARCHAR(40), PRIMARY KEY(id))";
    public static final String ADD_CUSTOMER_TEMPLATE = "INSERT INTO customers (id, lastname, firstname)" +
            "VALUES (%s, \"%s\", \"%s\")";
    public static final String ALTER_CUSTOMERS = "ALTER TABLE customers ADD sex VARCHAR(10) ";

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = getConnection();
            statement = connection.createStatement();
            //use  needed statement
//            statement.executeUpdate(ALTER_CUSTOMERS);
            statement.executeUpdate(format(ADD_CUSTOMER_TEMPLATE, 3, "Lo", "Young", "feminine"));

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL + DB_NAME, USER_NAME, USER_PASS);
    }
}
