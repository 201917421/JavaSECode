package Exercise06.Test03;

/**
 * ClassName:Customer
 * Package: Exercise06.Test03
 * Description:
 *a. 声明三个私有对象属性：firstName、lastName和account。 b. 声明一个公有构造器，这个构造器带有
 * 两个代表对象属性的参数（f和l） c. 声明两个公有存取器来访问该对象属性，方法getFirstName和
 * getLastName返回相应的属性。 d. 声明setAccount 方法来对account属性赋值。 e. 声明getAccount 方法以
 * 获取account属性。
 * @Author Joan Jia
 * @Create 2024/3/26 10:10
 * @Version 1.0
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Account account;

    //声明一个构造器
    public Customer(String f,String l){
        firstName=f;
        lastName=l;
    }
    public void setFirstName(String fname){
        firstName=fname;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lname){
       lastName=lname;
    }
    public String getLastName(){
        return lastName;
    }
    public void setAccount(Account acc){
        account=acc;
    }
    public Account getAccount(){
        return account;
    }
    public String printPerson(){
        return firstName+" "+lastName+"的账户id为"+account.getId()+",账户余额为"+account.getBalance();
    }
}
