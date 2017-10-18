package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManagerMSSQL implements IConnectionManagerMSSQL {

    private static final ConnectionManagerMSSQL INSTANCE = new ConnectionManagerMSSQL();

    private Connection connection;

    private ConnectionManagerMSSQL(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS:1433;database=my_portal_test", "admin", "strongpass");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static synchronized ConnectionManagerMSSQL getInstance(){
        return INSTANCE;
    }


    public Connection getConnection(){
        return connection;
    }

}
