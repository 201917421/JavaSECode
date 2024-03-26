package Exercise;

import java.util.Scanner;

/**
 * ClassName:Test01
 * Package: Exercise
 * Description:从键盘分别输入年、月、日，判断这一天是当年的第几天
 *
 * 注：判断一年是否是闰年的标准：
 *    1）可以被4整除，但不可被100整除
 * 	  或
 *    2）可以被400整除
 *
 * 例如：1900，2200等能被4整除，但同时能被100整除，但不能被400整除，不是闰年
 *
 * @Author Joan Jia
 * @Create 2024/3/3 15:58
 * @Version 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("输入年份：");
        //输入年
        int year=input.nextInt();
        System.out.println("输入月份：");
        //输入月
        int month=input.nextInt();
        System.out.println("输入日子：");
        //输入天
        int day=input.nextInt();

        //判断该年是否为闰年。
        int Feb;
        if(year%4==0&&year%100!=0||year%400==0)
            Feb=29;
        else Feb=28;

        int sumdays=0;

        switch(month) {
            case 12:
                sumdays += 30;//这个30是代表11月份的满月天数
            case 11:
                sumdays += 31;//这个31是代表10月份的满月天数
            case 10:
                sumdays+=30;
            case 9:
                sumdays+=30;
            case 8:
                sumdays+=31;
            case 7:
                sumdays+=30;
            case 6:
                sumdays+=31;
            case 5:
                sumdays+=30;
            case 4:
                sumdays+=31;
            case 3:
                sumdays+=Feb;
            case 2:
                sumdays+=31;
            case 1:
                sumdays+=day;
                break;
            default:
                break;

        }

        System.out.println("今年是"+year+"年,"+month+"月,"+day+"日。"+"是今年的第"+sumdays+"天。");
        input.close();//防止内存泄漏
    }
}
