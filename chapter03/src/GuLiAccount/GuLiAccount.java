package GuLiAccount;

import java.util.Scanner;

/**
 * ClassName:GuLiAccount
 * Package: GuLiAccount
 * Description:
 *
 * @Author Joan Jia
 * @Create 2024/3/4 16:24
 * @Version 1.0
 */
public class GuLiAccount {
    public static void main(String[] args) {

        double balance=100000;//账户余额
        boolean isTrue=true;
        double money=0;
        Scanner input=new Scanner(System.in);
        String desc2="";//标记收入的说明
        String desc3="";//标记支出的说明
        String details="";
        char con = 0;
        do {
            System.out.println();
            System.out.println("=========谷粒记账软件========");
            System.out.println("\t1、收支明细");
            System.out.println("\t2、登记收入");
            System.out.println("\t3、登记支出");
            System.out.println("\t4、退出");
            System.out.println("请选择(1-4):");

            //int num=input.nextInt();
            char num=Utility.readMenuSelection();//调用该包下Utility类中的方法。
            if(num=='1') {
                System.out.println("-----------------当前收支明细记录-----------------\n");
                System.out.println("收支"+"\t"+" 账户金额 "+"\t"+" 收支金额 "+"\t"+" 说    明 ");
                 /*
                if(desc2!=""||desc3!=""){

                    switch(in){
                        case 1:
                            System.out.println("收入"+"\t"+" "+balance+"\t"+" "+money+"\t"+"   "+desc2);
                            break;
                        case 0:
                            System.out.println("支出"+"\t"+" "+balance+"\t"+" "+money+"\t"+"   "+desc3);
                            break;
                        default:
                            break;
                    }


                }
                  */
                System.out.println(details);
                continue;
            }
            if (num=='2') {
                System.out.print("本次收入金额：");
                money=Utility.readNumber();
                //money = input.nextDouble();
                balance += money;
                System.out.print("本次收入说明：");
                desc2=Utility.readString();//用于收支说明
                details+="收入"+"\t"+" "+balance+"\t"+" "+money+"\t"+"\t"+desc2+"\n";
                continue;
            }
            if(num=='3') {
                System.out.print("本次支出金额：");
                money=Utility.readNumber();
                if( money>0 && balance>money)
                    balance -= money;
                else System.out.println("您输入的数字非法或余额不足！");
                System.out.print("本次支出说明：");
                desc3=Utility.readString();//用于收支说明
                details+="支出"+"\t"+" "+balance+"\t"+" "+money+"\t"+"\t"+desc3+"\n";
                continue;
            }

            if(num=='4'){
                System.out.print("请确认是否退出（Y/N）:");
                con=Utility.readConfirmSelection();//接收Y或N
                if(con=='N'){
                    continue;
                }else{
                    break;
                }
            }
        }while(isTrue);
        input.close();

    }
}
