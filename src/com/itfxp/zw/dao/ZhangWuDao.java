package com.itfxp.zw.dao;

import com.itfxp.zw.domain.ZhangWu;
import com.itfxp.zw.unit.JDBCUnit;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class ZhangWuDao {

    private JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUnit.getDataSource());

    public List<ZhangWu> findAllList() {

        String sql = "select * from zhangwu";

        List<ZhangWu> zw = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(ZhangWu.class));

        return zw;

    }
}
