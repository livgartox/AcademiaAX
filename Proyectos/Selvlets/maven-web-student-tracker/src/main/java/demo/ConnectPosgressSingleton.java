package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConnectPosgressSingleton {
	private static ConnectPosgressSingleton instance;
    private static Connection conn;

    private ConnectPosgressSingleton() {
        String urlDatabase = "jdbc:postgresql://localhost:5432/Crud3";
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(urlDatabase,"postgres","1234567890");
        } catch (Exception e) {
            System.out.println("Ocurrio un error:" + e.getMessage());
        }
        System.out.println("La conexion se realizo sin problemas");
    }

    public Connection getConnection() {
        return conn;
    }

    public static ConnectPosgressSingleton getInstance() {
        if (conn == null) {
            instance = new ConnectPosgressSingleton();
        }
        return instance;
    }

    public boolean execute(String sql) {
        boolean res = false;
        Statement st = null;
        try {
            st = conn.createStatement();
            st.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectPosgressSingleton.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ConnectPosgressSingleton.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return res;
    }


}
