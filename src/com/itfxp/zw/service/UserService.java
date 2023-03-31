package com.itfxp.zw.service;

import com.itfxp.zw.dao.UserDao;
import com.itfxp.zw.domain.User;

/**
 * @author lxf
 * service 层 主要处理业务逻辑
 * 调用Dao层方法 讲数据是就花操作
 * 该类中创建UserDao对象  作为成员变量
 */
public class UserService {
    private UserDao userDao = new UserDao();

    /**
     * 用户登录
     */
    public boolean login(User puser) {
        User user = userDao.login(puser);

        //判断user是否为null
        if (user == null) {
            return false;
        }
        return true;
    }
}
