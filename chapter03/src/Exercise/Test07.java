package Exercise;

import java.util.Scanner;

/**
 * ClassName:Test07
 * Package: Exercise
 * Description:声明变量balance并初始化为0，用以表示银行账户的余额，下面通过ATM机程序实现存款，取款等功能。
 *
 * =========ATM========
 *    1、存款
 *    2、取款
 *    3、显示余额
 *    4、退出
 * 请选择(1-4)：
 *
 * @Author Joan Jia
 * @Create 2024/3/4 10:05
 * @Version 1.0
 */
public class Test07 {
    public static void main(String[] args) {

        int balance=0;//账户余额
        //int flag=0;
        boolean isTrue=true;
        double money;
        Scanner input=new Scanner(System.in);
        do {
            System.out.println("=========ATM========");
            System.out.println("\t1、存款");
            System.out.println("\t2、取款");
            System.out.println("\t3、显示余额");
            System.out.println("\t4、退出");
            System.out.println("请选择(1-4):");

            int num=input.nextInt();
            if (num==1) {
                System.out.print("请输入存款金额：");
                money = input.nextDouble();
                balance += money;
                continue;
            }
            if(num==2) {
                System.out.print("请输入取款金额：");
                money = input.nextDouble();
                balance -= money;
                continue;
            }

            if(num==3) {
                System.out.println("您的当前余额为：" + balance);
                continue;
            }
            if(num==4)
                System.out.println("已退出！");
                break;

        }while(isTrue);
        input.close();
/*
        //初始化条件
        double balance = 0.0;//表示银行账户的余额
        Scanner scan = new Scanner(System.in);
        boolean isFlag = true;//用于控制循环的结束

        do{
            System.out.println("=========ATM========");
            System.out.println("\t1、存款");
            System.out.println("\t2、取款");
            System.out.println("\t3、显示余额");
            System.out.println("\t4、退出");
            System.out.print("请选择(1-4)：");

            int selection = scan.nextInt();

            switch(selection){
                case 1:
                    System.out.print("要存款的额度为：");
                    double addMoney = scan.nextDouble();
                    if(addMoney > 0){
                        balance += addMoney;
                    }
                    break;
                case 2:
                    System.out.print("要取款的额度为：");
                    double minusMoney = scan.nextDouble();
                    if(minusMoney > 0 && balance >= minusMoney){
                        balance -= minusMoney;
                    }else{
                        System.out.println("您输入的数据非法或余额不足");
                    }
                    break;
                case 3:
                    System.out.println("当前的余额为：" + balance);
                    break;
                case 4:
                    System.out.println("欢迎下次进入此系统。^_^");
                    isFlag = false;
                    break;
                default:
                    System.out.println("请重新选择！");
                    break;
            }

        }while(isFlag);

        */
    }
}
