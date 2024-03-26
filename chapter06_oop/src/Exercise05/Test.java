package Exercise05;

/**
 * ClassName:Test
 * Package: Exercise05
 * Description:
 *
 * @Author Joan Jia
 * @Create 2024/3/23 15:36
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        //1、形参是基本数据类型
        Test t=new Test();

        Person p=new Person();
        p.age=10;
        t.method2(p);
        System.out.println(p.age);//11
    }

    public void  method2(Person p){
        p.age++;
    }
}
class Person{
    int age;
}

