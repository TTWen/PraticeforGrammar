package com.test.object;

import java.util.Arrays;

/**
 * @author ting.wen
 * @create 2022-09-07 11:22 PM
 * @pkgName com.test
 * @Description
 */


public class _2_Person {

    /**
     * 成员变量 aka 实例变量
     * 编译时不占用内存空间，运行时获取内存，在对象实例化时，字段才会获取到内存
     */
    private String name;
    private int age;
    private int sex;

    /**
     * 默认的构造方法，因为为空，所以可以缺省
     */
    public _2_Person() {

    }

    public _2_Person(String name, int age, int sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    private void eat() {

    }

    private void sleep() {

    }

    public void initialize(String n, int a, int s) {
        name = n;
        age = a;
        sex = s;
    }

//    public void ppp(String[] args) {
//        System.out.println("1");
//        _2_Person person = new _2_Person();
//        person.ppp(new String[]{"a"}); // 循环调用
//    }
//
//    public static void main(String[] args) {
//        _2_Person p = new _2_Person();
//        p.ppp(new String[]{"a"});
//    }

    public static void main(String[] args) {
        /**
         * 实际开发中，我们通常不在当前类中直接创建对象并使用它，而是放在使用对象的类中，比如说上图中的 PersonTest 类
         */
        _2_Person person = new _2_Person();
        System.out.println(person.name); // null
        System.out.println(person.age); // 0
        System.out.println(person.sex); // 0


        /**
         * 对象 _2_Person
         * person1 是引用变量
         */
        _2_Person person1 = new _2_Person();
        person1.name = "xixi";
        person1.age = 20;
        person1.sex = 0;

        /**
         * 通过 initialize 方法初始化
         */
        _2_Person person2 = new _2_Person();
        person2.initialize("haha", 2, 1);


        /**
         * 通过构造方法初始化
         */
        _2_Person person3 = new _2_Person("haha", 2, 1);


        // 匿名对象。匿名对象意味着没有引用变量，它只能在创建的时候被使用一次
        new _2_Person().initialize("haha", 2, 1);
        Arrays.toString(new String[]{"a"});

    }

}
