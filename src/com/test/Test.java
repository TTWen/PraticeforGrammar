package com.test;

/**
 * @author ting.wen
 * @create 2022-08-27 7:09 PM
 * @pkgName com.test
 * @Description
 */


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 文档注释
 */
public class Test {

    // age
    /**
     * 文档注释
     */
    static final int MAX_AGE = 100;

    /**
     * 程序入口
     * @param args 主函数的参数
     */

    static String str;
    public static void main(String[] args) {

        System.out.println(str); // 输出 null
//        System.out.println(str.toLowerCase());  // java.lang.NullPointerException
//        Integer a = new Integer(3);
//        Integer b = new Integer(3);

//        String a = "abc";
//        String b = "abc";
        // 引用比较，都指向同一块地址
//        System.out.println(a == b); // true，abc的地址0011，a=0011，b=0011
        // 值比较，值都是 abc
//        System.out.println(a.equals(b));  // true

        String a = new String("abc");
        String b = new String("abc");

        System.out.println(a == b); // false
        System.out.println(a.equals(b));  // true

    }

    public static void test(List<Integer> list) {

    }

    /*
    多行注释
     */
    public void runTestCases() {

    }
}

interface Runnable{}
