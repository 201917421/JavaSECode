package Exercise06.Test02;

/**
 * ClassName:Student
 * Package: Exercise06.Test02
 * Description:
 * (1)定义Student类,有4个属性： String name; int age; String school; String major;
 * (2)定义Student类的3个构造器:
 * 第一个构造器Student(String n, int a)设置类的name和age属性；
 * 第二个构造器Student(String n, int a, String s)设置类的name, age 和school属性；
 * 第三个构造器Student(String n, int a, String s, String m)设置类的name, age ,school和major属性；
 * (3)在main方法中分别调用不同的构造器创建的对象，并输出其属性值。
 *
 * @Author Joan Jia
 * @Create 2024/3/26 9:17
 * @Version 1.0
 */
public class Student {
    private String name;
    private int age;
    private String school;
    private String major;
    //设置三个有参构造器
    public Student(String n, int a){
        name=n;
        age=a;
    }
    public Student(String n, int a, String s){
        name=n;
        age=a;
        school=s;
    }
    public Student(String n, int a, String s, String m){
        name=n;
        age=a;
        school=s;
        major=m;
    }

    public String printStudents(){
        return name+"的年龄为"+age+",学校是"+school+",专业是"+major;
    }
}
