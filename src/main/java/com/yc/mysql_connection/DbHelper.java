package com.yc.mysql_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @program: mysql_connection
 * @description:
 * @author: 作者
 * @create: 2021-04-23 19:12
 */
public class DbHelper implements IDbHelper {
    private String drivername;
    private String url;
    private String user;
    private String password;

    public DbHelper(String drivername, String url, String user, String password) {
        this.drivername = drivername;
        this.url = url;
        this.user = user;
        this.password = password;
    }

    @Override
    public Connection getCon() {

        Connection con = null;
        try {
            Class.forName(drivername);
            con = DriverManager.getConnection(url, user, password);
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return con;
    }


}
