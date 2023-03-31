package com.itfxp.zw.test;

import com.itfxp.zw.unit.JDBCUnit;

import java.sql.Connection;
import java.sql.SQLException;

public class JDBCTest {
    public static void main(String[] args) throws SQLException {
        Connection con = JDBCUnit.getConnection();
        System.out.println(con);
    }
}
