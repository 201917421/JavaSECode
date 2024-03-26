package Exercise;

/**
 * ClassName:EmployeeTest
 * Package: Exercise
 * Description:
 *
 * @Author Joan Jia
 * @Create 2024/3/18 10:48
 * @Version 1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.birthday=new Mydate();
        /*另一种写法：
        Mydate mydate1=new Mydate();
        e1.birthday=mydate1;
         */
        e1.birthday.day=24;
        e1.birthday.month=2;
        e1.birthday.year=2001;


        Employee e2=new Employee();
        //e1.age=25;
        //e2.age=26;
        e1.id="001";
        e2.id="002";
        e1.name="小红";//e1.name=new String("小红")
        e2.name="小明";
        e1.salary=2500;
        e2.salary=2600;


        e1.printName(e1.name);
        e2.printName(e2.name);

        e1.setAge(25);
        int age=e1.getAge();
        System.out.println("age:"+age);

        e1.addAge();
        System.out.println("新的age为："+e1.age);
        e1.printId();
        e2.printId();
    }
}
