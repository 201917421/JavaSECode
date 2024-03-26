package Exercise06.Test02;

import java.util.Scanner;

/**
 * ClassName:StudentTest
 * Package: Exercise06.Test02
 * Description:
 *
 * @Author Joan Jia
 * @Create 2024/3/26 9:21
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        Student[] students=new Student[2];
        Scanner scanner=new Scanner(System.in);
        String name;
        int age;
        for(int i=0;i<students.length;i++){
            System.out.print("请输入姓名：");
            name=scanner.next();
            System.out.print("请输入年龄：");
            age=scanner.nextInt();
            //Student temp=new student(name,age); students[i]=temp; 也正确
            students[i]=new Student(name,age);//这里可以根据构造器设置的参数数量进行赋值。
        }

        for(int i=0;i<students.length;i++){
            System.out.println(students[i].printStudents());
        }
    }
}
