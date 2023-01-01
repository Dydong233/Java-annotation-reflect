package reflection;

//反射机制,Class对象是Class类的对象，一个加载的类(例如User.java)在JVM中只会有一个Class对象
//一个Class对象对应的是一个加载到JVM中的对应的XXX.class文件
//每个类(例如User.java)的实例(例如User u = new User()中的u)都会记着自己是由哪个Class对象所生成
//通过CLass对象可以完整地得到一个类(例如User.java)中所有被加载的信息
//通过类可以创建类的实例，通过Class类可以获取某类的Class对象
@SuppressWarnings("all")
public class test01 {
    public static void main(String[] args) throws ClassNotFoundException {
        User user = new User();
        System.out.println(user);
        //通过对象获得
        Class c1 = user.getClass();
        //通过forname获得
        Class c2 = Class.forName("reflection.User");
        //通过类class获得
        Class c3 = User.class;
        //获得父类
        Class c4 = c1.getSuperclass();
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());
    }
}

//实体类
class User{
    private String name;
    private int id;
    private int age;

    public User(){

    }
    public User(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}