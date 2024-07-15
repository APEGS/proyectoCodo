package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

public class Connect {
    private final static String BDURL = "jdbc:mysql://127.0.0.1:3306/juegos";
    private final static String BDUSER="root";
    private final static String PASSBDWORD="";

    public static DataSource getDataSource() {
        BasicDataSource dsourse = new BasicDataSource();
        dsourse.setUrl(BDURL);
        dsourse.setUsername(BDUSER);
        dsourse.setPassword(PASSBDWORD);
        dsourse.setInitialSize(100);
        return dsourse;
    }

    public static Connection getConnect() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch(ClassNotFoundException cnfe) {
            cnfe.printStackTrace(System.out);
          }
          return getDataSource().getConnection();
    }

    public static void close(ResultSet rs) throws SQLException {
        rs.close();
    }

    public static void close(Statement st) throws SQLException {
        st.close();
    }

    public static void close(Connection cn) throws SQLException {
        cn.close();
    }
    
}