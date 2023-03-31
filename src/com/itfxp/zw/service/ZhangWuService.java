package com.itfxp.zw.service;

import com.itfxp.zw.dao.ZhangWuDao;
import com.itfxp.zw.domain.ZhangWu;

import java.util.List;

public class ZhangWuService {

    private ZhangWuDao zhangWuDao = new ZhangWuDao();

    public List<ZhangWu> findAllList() {

        List<ZhangWu> list = zhangWuDao.findAllList();

        return list;

    }
}
