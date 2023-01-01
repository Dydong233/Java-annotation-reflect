package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//分析性能问题
public class test08 {
    //普通方式调用
    public static void test01(){
        User user = new User();
        long startTime = System.currentTimeMillis();
        for (int i=0;i<1000000000;i++) user.getName();
        long endTime = System.currentTimeMillis();
        System.out.println("使用的时间为："+(endTime-startTime)+"ms");
    }
    //反射方式调用
    public static void test02() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        User user = new User();
        Class c1 = user.getClass();
        Method getName = c1.getDeclaredMethod("getName", null);
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000000000; i++) {
            getName.invoke(user,null);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("反射方式执行10亿次:" + (endTime - startTime) + "ms");
    }

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        test01();
        test02();
    }
}
