package Exercise06;

/**
 * ClassName:Person
 * Package: Exercise06
 * Description:
 *
 * @Author Joan Jia
 * @Create 2024/3/24 19:47
 * @Version 1.0
 */
public class Person {
    private String name;
    private int age;

    //构造器（显式的展示出来）
    public Person(){

    }
    public Person(int n){
        age=n;
    }

    public Person(String m){//和以下两个构造器构成重载
        name=m;
    }
    public Person(String m,int n){
        name=m;
        age=n;
    }

    //方法
    public void eat(){
        System.out.println("吃饭");
    }
}
