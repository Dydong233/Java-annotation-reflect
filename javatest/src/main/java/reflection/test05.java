package reflection;

public class test05 {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);
        //获取系统类加载器的父类加载器-->扩展类加载器
        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);
        //获取扩展类加载器的父类加载器-->根加载器（c/c++）
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);
        //测试当前类的加载器
        ClassLoader classLoader = Class.forName("reflection.test05").getClassLoader();
        System.out.println(classLoader);
        //获得系统类加载器的加载路径
        System.out.println(System.getProperty("java.class.path"));
    }
}