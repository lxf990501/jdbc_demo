package com.itfxp.yunsuan;

/**
 * @Author : lxf
 * @create : 2023/3/3 13:52
 * @Version :
 * @Acton : java 运算符
 */
public class javaTest01 {
    public static void main(String[] args) {
        int a = 10;
        int b = a++;
        int c = b + a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println(a > b);
        System.out.println("c = " + c);

        int d = (10 < 5) ? 10 : 5;

        System.out.println("d = " + d);

    }
}
