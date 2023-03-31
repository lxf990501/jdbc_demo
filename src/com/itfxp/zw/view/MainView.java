package com.itfxp.zw.view;

import com.itfxp.zw.domain.User;
import com.itfxp.zw.domain.ZhangWu;
import com.itfxp.zw.service.UserService;
import com.itfxp.zw.service.ZhangWuService;

import java.util.List;
import java.util.Scanner;

/**
 * @Author : lxf
 * @create 2023/2/13 14:52
 * view层 用户所接触到的界面  用于接收用户录入的数据 以及将数据展示给用户
 * 接收之后的数据将通过service层进行逻辑的处理
 * 创建 UserService 和 ZhangWuService 作为该类的成员变量
 */
public class MainView {

    private UserService userService = new UserService();
    private ZhangWuService zhangWuService = new ZhangWuService();

    //定义一个方法，用于启动相关界面

    //创建本地项目的启动类
    public void run() {
        //根据用户的操作来判断显示的界面
        if (userView()) {
            System.out.println("登录成功！");
            new MainView().zhangWuView();
        } else {
            System.out.println("登录失败，您输入的的账号或密码错误！");
        }
    }


    //用户登录界面
    private boolean userView() {
        System.out.println("~~~~~~~~~欢迎进入财务管理系统~~~~~~~~~~");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入登录账号：");
        String username = sc.nextLine();
        System.out.println("请输入登录密码：");
        String password = sc.nextLine();

        // 封装User对象
        User user = new User(username, password);
        boolean d = userService.login(user);
        return d;
    }

    //账务管理界面
    private void zhangWuView() {
        Scanner sc = new Scanner(System.in);
        System.out.println("~~~~~~~~~~欢迎使用财务管理系统~~~~~~~~~~~~~~~");
        System.out.println("1.添加账务 2.编辑账务 3.删除账务 4.查询账务 5.退出系统");
        System.out.println("请输入想要操作的功能编号[1~5]:");

        int num = sc.nextInt();
        // switch 进行判断
        switch (num) {
            case 1:
                System.out.println("添加账务！");
                break;
            case 2:
                System.out.println("编辑账务！");
                break;
            case 3:
                System.out.println("删除账务！");
                break;
            case 4:
                new MainView().queryZhangWu();
                break;
            case 5:
                System.out.println("拜拜~~~");
                break;
            default:
                System.out.println("" +
                        "\n" +
                        "                       .::::.\n" +
                        "                     .::::::::.\n" +
                        "                    :::::::::::\n" +
                        "                 ..:::::::::::'\n" +
                        "              '::::::::::::'\n" +
                        "                .::::::::::\n" +
                        "           '::::::::::::::..\n" +
                        "                ..::::::::::::.\n" +
                        "              ``::::::::::::::::\n" +
                        "               ::::``:::::::::'        .:::.\n" +
                        "              ::::'   ':::::'       .::::::::.\n" +
                        "            .::::'      ::::     .:::::::'::::.\n" +
                        "           .:::'       :::::  .:::::::::' ':::::.\n" +
                        "          .::'        :::::.:::::::::'      ':::::.\n" +
                        "         .::'         ::::::::::::::'         ``::::.\n" +
                        "     ...:::           ::::::::::::'              ``::.\n" +
                        "    ```` ':.          ':::::::::'                  ::::..\n" +
                        "                       '.:::::'                    ':'````..\n" +
                        "没有对应功能哦~");
        }
    }

    //查询账务界面
    private void queryZhangWu() {
        // 提示用户按条件查询还是查询所有
        Scanner sc = new Scanner(System.in);
        System.out.println("1.查询所有账务 2.查询指定时间账务");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                queryAll();
                break;
            case 2:
                queryByPram();
                break;
            default:
                System.out.println("抱歉 其他功能研发人员正在努力研发中~~~");
                // 正常退出系统
                System.exit(0);
        }
    }

    private void queryByPram() {
    }

    // 查询全部账务
    private void queryAll() {
        List<ZhangWu> list = zhangWuService.findAllList();
        System.out.println(list);
    }
}
    
