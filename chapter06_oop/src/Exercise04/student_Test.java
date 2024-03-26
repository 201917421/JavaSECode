package Exercise04;

/**
 * ClassName:student_Test
 * Package: Exercise04
 * Description: 创建20个学生对象。学号为1到20，年级和成绩都由随机数确定。
 *  * 问题一：打印出3年级(state值为3）的学生信息。
 *  * 问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
 *
 * @Author Joan Jia
 * @Create 2024/3/21 9:04
 * @Version 1.0
 */
public class student_Test {
    public static void main(String[] args) {
        Student[] students=new Student[20];//创建对象数组。
        for(int i=0;i<students.length;i++){
            students[i]=new Student();//要为20个学生依次new对象，堆中
            students[i].number=i+1;
            students[i].state=(int)(Math.random()*6+1);//[1,6]
            students[i].score=(int)(Math.random()*101);//[0,100]
        }
        int state=3;
        for(int i=0;i<students.length;i++){
            if(state==students[i].state){
                System.out.println(students[i].printStudents());
            }
        }
        //局部变量存放在栈中。属性（成员变量）在堆中
        for(int i=0;i<students.length-1;i++){
            boolean flag=true;//元素已经是排好序的
            for(int j=0;j<students.length-1-i;j++){
                if(students[j].score>students[j+1].score){
                    Student temp=students[j];
                    students[j]=students[j+1];
                    students[j+1]=temp;
                    flag=false;//设为false，证明元素在该轮交换了一次
                }
            }
            if(flag){ //如果为true，则表明在i轮后，并未再次进行交换，元素已经有序，此时可以跳出循环了
                break;
            }
        }
        System.out.println();
        for(int i=0;i<students.length;i++){
            System.out.println(students[i].printStudents());
        }

    }
}
