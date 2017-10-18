package DB;

import java.sql.Connection;

public interface IConnectionManagerMSSQL {
    Connection getConnection();
}
