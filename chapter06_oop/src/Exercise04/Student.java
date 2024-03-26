package Exercise04;

/**
 * ClassName:Student
 * Package: Exercise04
 * Description: 定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩score(int)。 创建20个学生对象，
 * 学号为1到20，年级和成绩都由随机数确定。
 * 问题一：打印出3年级(state值为3）的学生信息。
 * 问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
 *
 *
 *
 * @Author Joan Jia
 * @Create 2024/3/21 9:02
 * @Version 1.0
 */
public class Student {
    int number;
    int state;
    int score;

    public String printStudents(){
        return "学生"+number+"的所在年级为："+state+",成绩为："+score;
    }
}
