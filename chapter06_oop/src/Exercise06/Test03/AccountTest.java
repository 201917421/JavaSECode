package Exercise06.Test03;

/**
 * ClassName:AccountTest
 * Package: Exercise06.Test03
 * Description:
 * （1）创建一个Customer ，名字叫 Jane Smith, 他有一个账号为1000，余额为2000元，年利率为 1.23％ 的
 * 账户。 （2）对Jane Smith操作。 存入 100 元，再取出960元。再取出2000元。 打印出Jane Smith 的基本
 * 信息
 *
 * @Author Joan Jia
 * @Create 2024/3/26 10:17
 * @Version 1.0
 */
public class AccountTest {
    public static void main(String[] args) {
        Customer p1=new Customer("Jane","Smith");
        Account acc=new Account();
        //创建账户
        acc.setId(1000);
        acc.setBalance(2000);
        acc.setAnnualInterestrate("1.23%");
        //如何将客户和账户联系起来呢？
        //1、首先先在Customer类中，将setAccount(Account acc)；2、将账户类的对象对象地址赋给客户对象的账户属性。
        p1.setAccount(acc);
        //double money=acc.getBalance();
        //p1.setAccount(money);这种方式只能单纯传个数值。
        System.out.println( p1.printPerson());
        acc.deposit(100);//存入100
        System.out.println( p1.printPerson());
        acc.withdraw(960);//取出960
        System.out.println( p1.printPerson());
        acc.withdraw(2000);//再取2000
        System.out.println( p1.printPerson());
    }

}
