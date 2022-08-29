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
        test8();
    }

    public static void test1(List<Integer> list) {
        System.out.println(str); // 输出 null
        System.out.println(str.toLowerCase());  // java.lang.NullPointerException

        String a = "abc";
        String b = "abc";
        // 引用比较，都指向同一块地址
//        System.out.println(a == b); // true，abc的地址0011，a=0011，b=0011
        // 值比较，值都是 abc
        System.out.println(a.equals(b));  // true

//        String a = new String("abc");
//        String b = new String("abc");

        System.out.println(a == b); // false
        System.out.println(a.equals(b));  // true
    }

    public static void test2() {
        int a = 10;
        int b = 5;

        System.out.println(a + b);//15
        System.out.println(a - b);//5
        System.out.println(a * b);//50
        System.out.println(a / b);//2
        System.out.println(a % b);//0

        b = 3;
        System.out.println(a + b);//13
        System.out.println(a - b);//7
        System.out.println(a * b);//30
        System.out.println(a / b);//3
        System.out.println(a % b);//1
    }

    public static void test3(){
        //        Infinity
        System.out.println(10.0 / 0.0);

//        NaN
        System.out.println(0.0 / 0.0);

//        java.lang.ArithmeticException
//        整数在进行除法运算时，需要先判断除数是否为 0，以免程序抛出异常。
        System.out.println(10 / 0);

    }

    public static void test4(){

        int a = 60, b = 13;
        System.out.println("a 的二进制：" + Integer.toBinaryString(a)); // 111100
        System.out.println("b 的二进制：" + Integer.toBinaryString(b)); // 1101

        int c = a & b;
        System.out.println("a & b：" + c + "，二进制是：" + Integer.toBinaryString(c));

        c = a | b;
        System.out.println("a | b：" + c + "，二进制是：" + Integer.toBinaryString(c));

        c = a ^ b;
        System.out.println("a ^ b：" + c + "，二进制是：" + Integer.toBinaryString(c));

        c = ~a;
        System.out.println("~a：" + c + "，二进制是：" + Integer.toBinaryString(c));

        c = a << 2;
        System.out.println("a << 2：" + c + "，二进制是：" + Integer.toBinaryString(c));

        c = a >> 2;
        System.out.println("a >> 2：" + c + "，二进制是：" + Integer.toBinaryString(c));

        c = a >>> 2;
        System.out.println("a >>> 2：" + c + "，二进制是：" + Integer.toBinaryString(c));


        System.out.println('a' - 0);
        System.out.println('a'&'b');
    }

    public static void test5(){
        System.out.println(10<<2);//10*2^2=10*4=40
        System.out.println(10<<3);//10*2^3=10*8=80
        System.out.println(20<<2);//20*2^2=20*4=80
        System.out.println(15<<4);//15*2^4=15*16=240


        System.out.println(10>>2);//10/2^2=10/4=2
        System.out.println(20>>2);//20/2^2=20/4=5
        System.out.println(20>>3);//20/2^3=20/8=2
    }

    public static void test6(){
        int a=10;
        int b=5;
        int c=20;
        System.out.println(a<b&&a<c);//false && true = false

        System.out.println(a>b||a<c);//true || true = true


        System.out.println(a<b&a<c);//false & true = false

        System.out.println(a>b|a<c);//true | true = true

//        逻辑与运算符（&&）：多个条件中只要有一个为 false 结果就为 false。
//        逻辑或运算符（||）：多个条件只要有一个为 true 结果就为 true。
//        逻辑非运算符（!）：用来反转条件的结果，如果条件为 true，则逻辑非运算符将得到 false。
//        单逻辑与运算符（&）：很少用，因为不管第一个条件为 true 还是 false，依然会检查第二个。
//        单逻辑或运算符（|）：也会检查第二个条件。
//        也就是说，& 和 | 性能不如 && 和 ||，但用法一样
    }

    public static void test7(){
        int a=2;
        int b=5;
        int min=(a < b) ? a : b;
        System.out.println(min);
    }

    public static enum Sports {
        TENNIS,
        FOOTBALL,
        UNKNOWN
    }
    public static void test8(){
        int age = 20;
        switch (Sports.FOOTBALL) {
            case TENNIS:
                System.out.println("20");
                break;
            case FOOTBALL:
                System.out.println("30");
                break;
            case UNKNOWN:
                System.out.println("40");
                break;
            default:
                System.out.println("default");
                break; // 可省略
        }
    }

    public static void test9(){

    }

}

interface Runnable{}
