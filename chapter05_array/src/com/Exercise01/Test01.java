package com.Exercise01;

import java.util.Scanner;

/**
 * ClassName:Test01
 * Package: com.Exercise01
 * Description:输出英文星期几
 *
 * 用一个数组，保存星期一到星期天的7个英语单词，从键盘输入1-7，显示对应的单词
 * {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"}
 *
 * @Author Joan Jia
 * @Create 2024/3/5 11:28
 * @Version 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        String[] weeks= new String[]{"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"}; //声明和初始化
        Scanner input=new Scanner(System.in);

            System.out.print("请输入一个数字：");
            int days=input.nextInt();
            if(days<1||days>7){
                System.out.println("您输入的数有误，请重新输入：");
                days=input.nextInt();
            }
            System.out.println("今天是星期"+weeks[days-1]);
            input.close();
    }
}
