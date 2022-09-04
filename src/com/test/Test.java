package com.test;

/**
 * @author ting.wen
 * @create 2022-08-27 7:09 PM
 * @pkgName com.test
 * @Description
 */


import java.util.*;
import java.util.stream.Stream;

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
        test12();
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
        int[] start;
        int end[];

        int[] array = new int[10]; // 默认初始化为 0
        Integer[] array1 = new Integer[]{1,2,3}; // 可变长度

//        但需要注意的是，该方法返回的 ArrayList 并不是 java.util.ArrayList，它其实是 Arrays 类的一个内部类
        List<Integer> alist = Arrays.asList(array1); // 数组转 list
//        如果需要添加元素或者删除元素的话，需要把它转成 java.util.ArrayList。
        new ArrayList<>(Arrays.asList(array1));

        Arrays.sort(array1);

        String [] array2 = new String[] {"A","E","Z","B","C"};
//        对1~3位置上的内容反序输出
        Arrays.sort(array2, 1, 3, Comparator.comparing(String::toString).reversed());

        int index = Arrays.binarySearch(array1, 1);



    }

    public static void test10() {
        String [] test = new String[]{"111", "222", "333", "444"};

        Arrays.asList(test).stream().forEach(s -> System.out.println(s));
        System.out.println();

        Stream.of(test).forEach(System.out::println);
        System.out.println();

        Arrays.stream(test).forEach(System.out::println);
        System.out.println();

        System.out.println(Arrays.toString(test));

        String[][] deepArray = new String[][] {{"11", "12"}, {"21", "22"}};
        System.out.println(Arrays.deepToString(deepArray));
    }

    public static void test11() {

        /**
         * 使用 new 关键字创建一个字符串对象时，
         * Java 虚拟机会先在字符串常量池中查找有没有‘123’这个字符串对象，
         * 如果有，就不会在字符串常量池中创建‘123’这个对象了，
         * 直接在堆中创建一个‘123’的字符串对象，
         * 然后将堆中这个‘123’的对象地址返回赋值给变量 str1
         *
         * 如果没有，先在字符串常量池中创建一个‘123’的字符串对象
         * （常量池中的对象虽然不用，但可以顺便创建一个在常量池里，这种方式创建的对象都在堆上），
         * 然后再在堆中创建一个‘123’的字符串对象，
         * 然后将堆中这个‘123’的字符串对象地址返回赋值给变量 s
         */
//        String str1 = new String("123");


        /**
         * Java 虚拟机会先在字符串常量池中查找有没有“456”这个字符串对象，
         * 如果有，则不创建任何对象，直接将字符串常量池中这个“456”的对象地址返回，赋给变量 str2；
         * 如果没有，在字符串常量池中创建“456”这个对象，然后将其地址返回，赋给变量 str2
         */
//        String str2 = "456";


        /*
        这两行代码会创建三个对象，字符串常量池中一个，堆上两个:
        1、首先看常量池中有没有111，没有，则在常量池中创建一个 "111" 对象
        2、在堆上创建一个 "111" 的对象，同时有一个引用 s 指向 堆上的 "111"
        3、再看常量池中有没有111，已经有了，则不再在常量池中创建
        4、在堆上再创建一个"111"的对象，同时有一个引用 s1 指向再次创建的"111"
         */
//        String s = new String("111");
//        String s1 = new String("111");


//        这两行代码只会创建一个对象，就是字符串常量池中的那个。这样的话，性能肯定就提高了
//        String s2 = "222";
//        String s3 = "222";


        /*
        字符串常量池总结：
        1、使用双引号声明的字符串对象会保存在字符串常量池中。
        2、使用 new 关键字创建的字符串对象会先从字符串常量池中找，如果没找到就创建一个，
        然后再在堆中创建字符串对象；如果找到了，就直接在堆中创建字符串对象。
        3、针对没有使用双引号声明的字符串对象来说，就像下面代码中的 s 那样：
         */
//        String s = new String("111") + new String("222");
//        如果想把 s 的内容也放入字符串常量池的话，可以调用 intern() 方法来完成。




//        String s1 = new String("111222");
//        String s2 = s1.intern();  // 如果常量池里有111222，则返回常量池里的引用
//        System.out.println(s1 == s2); // False
//        s1 返回的是堆上的对象，s2 返回的常量池的中对象



        String s1 = new String("111") + new String("222");
        String s2 = s1.intern();
        System.out.println(s1 == s2);
//        首先在常量池中新建 "111"对象，再在堆上新建"111"对象
//        再在常量池中新建"222"对象，再在堆上新建"222"对象
//        再在堆中创建一个 "111222"的对象，s1指向这个对象
//        执行 intern 时，首先从字符串常量池中找到"111222"，没有，但堆中有，
//        那么字符串常量池中的保存的是堆中"111222"对象的引用
//        s1 返回的是堆上的对象的地址，s2 返回的也是堆上对象的地址

    }

    public static void test12() {
        String alita = new String("111");
        String luolita = new String("111");

        System.out.println(alita.equals(luolita)); // true
        System.out.println(alita == luolita); // false


        System.out.println(new String("333").equals("333"));
        // 堆上创建的 "333"对象，常量池中创建的 "333"对象，值相同，true

        System.out.println(new String("444") == "444");
//        堆上创建的"444"对象，常量池中创建的 "444"对象，地址不同，false

        System.out.println(new String("555") == new String("555"));
//        都是堆上创建的两个 "555"对象，false

        System.out.println("666" == "666");
//        常量池中的同一个对象，true

        System.out.println("8777" == "8" + "777");
//        "8" 和 "777" 都在字符串常量池，编译器在遇到‘+’操作符的时候将其自动优化为"8777"，true

        System.out.println(new String("999").intern() == "999");
//        先在字符串常量池中创建"999"，再在堆上创建"999"，intern直接返回堆上的"999"，true


        /*
        如果要进行两个字符串对象的内容比较，除了 .equals() 方法，还有其他两个可选的方案。
        Objects.equals() 这个静态方法的优势在于不需要在调用之前判空。
        如果直接使用 a.equals(b)，则需要在调用之前对 a 进行判空，
        否则可能会抛出空指针 java.lang.NullPointerException。Objects.equals() 用起来就完全没有这个担心
        .contentEquals() 的优势在于可以将字符串与任何的
        字符序列（StringBuffer、StringBuilder、String、CharSequence）进行比较

         */
//

    }
}

interface Runnable{}
