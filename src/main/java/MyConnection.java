import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyConnection {
    Connection con;

    public MyConnection() {
        try {
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres",
                    "1111");
        } catch (SQLException e) {
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public Connection returnConnection() {
        return con;
    }
}
