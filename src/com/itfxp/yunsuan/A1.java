package com.itfxp.yunsuan;

import java.util.Scanner;

/**
 * @Author : lxf
 * @create : 2023/3/3 14:07
 * @Version :1.0.0
 * @Acton : 判断输入年份是否为闰年
 */
public class A1 {
    public static void main(String[] args) {
        int year = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入年份：");
            String ss = sc.nextLine();
            try {
                year = Integer.parseInt(ss);
                if (year > 0) {
                    break;
                }
                System.out.println("输入的年份需要大于0！");
            } catch (Exception e) {
                System.out.println("输入的年份不正确！");
            }
        }
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "是闰年");
        } else {
            System.out.println(year + "不是闰年");
        }
    }

}
