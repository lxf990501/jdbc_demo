package com.itfxp.zw.unit;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUnit {
    private static DataSource dataSource;

    static {
        try {
            Properties pro = new Properties();
            // 读取数据库连接池配置文件
            InputStream is = JDBCUnit.class.getClassLoader().getResourceAsStream("druid.properties");

            pro.load(is);
            dataSource = DruidDataSourceFactory.createDataSource(pro);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //提供一个用于获取数据库连接池的方法
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    // 提供一个用于获取数据库链接池对象的方法
    public static DataSource getDataSource() {
        return dataSource;
    }
}
