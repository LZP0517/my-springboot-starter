package com.yc.mysql_connection;

import java.sql.Connection;

/**
 * @program: mysql_connection
 * @description:
 * @author: 作者
 * @create: 2021-04-23 19:12
 */
public interface IDbHelper {
    public Connection getCon();
}
