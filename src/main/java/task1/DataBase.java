package task1;

import java.sql.*;
import java.util.Objects;

public class DataBase {
    private static DataBase instance;
    private Connection c = null;
    private DataBase() {
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:user.db");
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS USER" +
                    "(ID INTEGER PRIMARY KEY AUTOINCREMENT," +
                    " NAME           TEXT, " +
                    " EMAIL            TEXT, " +
                    " AGE         INTEGER)";
            stmt.executeUpdate(sql);
            stmt.close();
            c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Table created successfully");
    }
    public static DataBase getInstance() {
        instance = Objects.requireNonNullElseGet(instance, DataBase::new);
        return instance;
    }

    public void insertUser(User user) {
        try {
            c = DriverManager.getConnection("jdbc:sqlite:user.db");
            Statement stmt = c.createStatement();
            String sql = "INSERT INTO USER (NAME,EMAIL,AGE) " +
                    "VALUES ('"+user.getName()+"', '"+user.getEmail()+"', "+user.getAge()+" );";
            stmt.executeUpdate(sql);
            stmt.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("task1.User saved successfully");
    }
}
