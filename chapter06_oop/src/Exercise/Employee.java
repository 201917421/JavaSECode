package Exercise;

/**
 * ClassName:Employee
 * Package: Exercise
 * Description:
 *
 *
 * @Author Joan Jia
 * @Create 2024/3/18 10:46
 * @Version 1.0
 */
public class Employee {
    //属性
    String id;
    String name;//引用数据类型
    int age;
    double salary;
    Mydate birthday;//在类Mydate中声明了属性。引用数据类型。

    //方法
    public void printId(){
        System.out.println("员工的id为："+id);
    }
    public void printName(String name){
        System.out.println("员工"+id+"的姓名为："+name);
    }

    public int getAge(){
        return age;
    }
    public void setAge(int i){
        age=i;
    }
    public void addAge(){
        age=age+2;
    }


}
