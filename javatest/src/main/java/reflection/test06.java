package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//获得类的信息
public class test06 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class c1 = Class.forName("reflection.User");

        //获得类的名字
        System.out.println(c1.getName());   //获得包名+类名

        //获得类的属性
        Field[] fields = c1.getDeclaredFields();    //找到全部的属性
        for (Field field : fields) {
            System.out.println(field);
        }
        Field name = c1.getDeclaredField("name");   //获取指定的属性
        System.out.println(name);

        //获得类的方法
        Method[] methods = c1.getDeclaredMethods();     //获得所有的方法
        for (Method method : methods) {
            System.out.println(method);
        }

        //获得类的构造器
        Constructor[] constructors = c1.getDeclaredConstructors();  //获得所有的构造器
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
    }
}
