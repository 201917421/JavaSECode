package Exercise06.Test03;

/**
 * ClassName:Account
 * Package: Exercise06.Test03
 * Description:
 * 该类包括的属性：账号id，余额balance，年利率annualInterestRate；
 * 包含的方法：访问器方法（getter和setter方法），取款方法withdraw()，存款方法deposit()
 *
 * @Author Joan Jia
 * @Create 2024/3/26 9:59
 * @Version 1.0
 */
public class Account {
    private int id;
    private double balance;//余额
    private String annualInterestrate;
    public void setId(int id1){
        id=id1;
    }
    public int getId(){
        return id;
    }
    public void setBalance(double balance1){
        balance=balance1;
    }
    public double getBalance(){
        return balance;
    }
    public void setAnnualInterestrate(String annualInterestrate1){
        annualInterestrate=annualInterestrate1;
    }
    public String getAnnualInterestrate(){
        return annualInterestrate;
    }
    public void withdraw(double amount){
        if(amount>balance){
            System.out.println("您的余额不足！");
        }else if(amount<0){
            System.out.println("您输入的格式有误！");
        } else {
            balance-=amount;
            System.out.println("您已成功取款");
        }
    }
    public void deposit(double amount1){
        if(amount1>0){
            balance+=amount1;
            System.out.println("存款成功！");
        }

    }


}
