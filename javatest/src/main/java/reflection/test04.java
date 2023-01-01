package reflection;

import java.util.Scanner;

//测试类的初始化时间
public class test04 {
    static {
        System.out.println("main");
    }

    public static void main(String[] args) throws ClassNotFoundException {
        //1.主动引用
        Son son = new Son();
        //2.反射也会产生主动引用
        Class.forName("reflection.Son");
        //3.不会产生类的引用方法
        System.out.println(Son.b);
    }
}

class Father{
    static {
        System.out.println("father");
    }
    static int b=2;
}

class Son extends Father{
    static {
        System.out.println("子类被加载");
        m = 300;
    }
    static int m = 100;
    static final int M = 1;
}