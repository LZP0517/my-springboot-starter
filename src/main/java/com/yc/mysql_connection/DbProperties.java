package com.yc.mysql_connection;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @program: mysql_connection
 * @description:
 * @author: 作者
 * @create: 2021-04-23 19:13
 */
@ConfigurationProperties("yc.source")
public class DbProperties {
    private String drivername;
    private String url;
    private String user;
    private String password;

    public String getDrivername() {
        return drivername;
    }

    public void setDrivername(String drivername) {
        this.drivername = drivername;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
}
