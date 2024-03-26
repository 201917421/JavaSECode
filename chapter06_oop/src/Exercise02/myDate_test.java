package Exercise02;

/**
 * ClassName:myDate_test
 * Package: Exercise02
 * Description: 声明一个日期类型MyDate：有属性：年year,月month，日day。创建2个日期对象，分别赋值为：
 * 你的出生日期，你对象的出生日期，并显示信息。
 *
 * @Author Joan Jia
 * @Create 2024/3/20 14:31
 * @Version 1.0
 */
public class myDate_test {
    public static void main(String[] args) {
        myDate p1=new myDate();
        myDate p2=new myDate();
        p1.year=2001;
        p1.month=2;
        p1.day=24;

        p2.year=2001;
        p2.month=3;
        p2.day=8;
        System.out.println("我的生日是："+p1.year+"年"+p1.month+"月"+p1.day+"日");
        System.out.println("另一个人的生日是："+p2.year+"年"+p2.month+"月"+p2.day+"日");
    }
}
