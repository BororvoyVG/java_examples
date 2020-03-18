package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

public class Statement {

    public static final String URL = "jdbc:mysql://localhost:3306/";
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String DB_NAME = "shop";
    public static final String USER_NAME = "root";
    public static final String USER_PASS = "pass";


    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = getConnection();
            statement = connection.prepareStatement("SELECT * FROM customers WHERE sex=?");

            printNames(statement);

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

    private static void printNames(PreparedStatement statement) throws SQLException {
        if (new Random().nextBoolean()) {
            statement.setString(1, "masculine");
            System.out.println("Men");
        } else {
            statement.setString(1, "feminine");
            System.out.println("Woman");
        }

        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getRow() + resultSet.getString("lastname"));
        }
    }

    private static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL + DB_NAME, USER_NAME, USER_PASS);
    }
}
