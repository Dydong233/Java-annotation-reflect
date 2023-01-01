package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//动态的创建对象,通过反射
public class test07 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //获取class对象
        Class c1 = Class.forName("reflection.User");
        //通过反射newInstance,构造对象
        User user = (User) c1.newInstance();
        System.out.println(user);
        //通过构造器创建对象
        Constructor constructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
        User user2 = (User) constructor.newInstance("dydong", 1, 18);
        System.out.println(user2);
        //通过反射调用方法
        User user3 = (User) c1.newInstance();
        Method setName = c1.getDeclaredMethod("setName", String.class);
        setName.invoke(user3,"dydong"); //用invoke来实现方法
        System.out.println(user3.getName());
    }
}
