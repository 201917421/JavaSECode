package Exercise06;

/**
 * ClassName:PersonTest
 * Package: Exercise06
 * Description:
 *
 * @Author Joan Jia
 * @Create 2024/3/24 19:48
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1=new Person();//其中这个Person（）就是一个构造器，对应Person类中显式展现出来的那一句
        Person p2=new Person(3);
        Person p3=new Person("JQQ");

    }
}
