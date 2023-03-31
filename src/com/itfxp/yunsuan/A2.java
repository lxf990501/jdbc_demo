package com.itfxp.yunsuan;

import java.util.Scanner;

/**
 * @Author : lxf
 * @create : 2023/3/3 15:22
 * @Version :
 * @Acton :所有成绩为整数，学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示
 */
public class A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        while (true) {
            System.out.println("请输入成绩：");
            String ss = sc.nextLine();
            try {
                score = Integer.parseInt(ss);
                if (score < 0 || score > 100) {
                    break;
                }
                System.out.println("成绩应该在 0 ~ 100 之间！");
            } catch (Exception e) {
                System.out.println("成绩格式不正确！");
            }
        }

    }
}
