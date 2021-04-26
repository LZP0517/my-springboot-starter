package com.yc.mysql_connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: mysql_connection
 * @description:
 * @author: 作者
 * @create: 2021-04-23 19:16
 */

@Configuration
@ConditionalOnClass(IDbHelper.class)
@EnableConfigurationProperties(DbProperties.class)
public class DbConfiguration {

    @Autowired
    private DbProperties dbProperties;

    @Bean
    public IDbHelper iDbHelper() {
        return new DbHelper(dbProperties.getDrivername(), dbProperties.getUrl(), dbProperties.getUser(), dbProperties.getPassword());
    }
}
