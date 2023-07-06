package service;

import java.sql.Connection;
import java.sql.DriverManager;

public class SQLServerService {

    protected Connection connection = null;

    public SQLServerService() {

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://DESKTOP-CFKU9I3;databaseName=NGANHANG";
            String user = "sa";
            String pass = "123";
            connection = DriverManager.getConnection(url, user, pass);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
