package com.itfxp.zw.dao;

import com.itfxp.zw.domain.User;
import com.itfxp.zw.unit.JDBCUnit;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author lxf
 * dao层 用于操作数据库，对数据库进行增删改查
 */
public class UserDao {

    private JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUnit.getDataSource());

    public User login(User puser) {
        try {
            // 编写sql语句
            String sql = "select * from zw_user where username = ? and password = ?";
            return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), puser.getUsername(), puser.getPassword());

        } catch (DataAccessException e) {
            return null;
        }
    }
}
