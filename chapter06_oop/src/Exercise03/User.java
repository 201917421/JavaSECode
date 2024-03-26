package Exercise03;

/**
 * ClassName:User
 * Package: Exercise03
 * Description:用户类：
 *      属性：用户名，密码
 *      方法：登录
 * 界面类：
 *      在界面类中添加main方法，接受用户输入，并调用用户类的登录方法进行验证。
 *      输出：
 *          登录失败：用户名或密码错误！
 *          登录成功：欢迎你，用户名
 *
 * @Author Joan Jia
 * @Create 2024/3/20 14:36
 * @Version 1.0
 */
public class User {
    String Name;
    String passWord;

    public void login(String name,String password){
        if(Name.equals(name)&&passWord.equals(password))
            System.out.println("登录成功，欢迎你"+Name);
        else
            System.out.println("登录失败：用户名或密码错误！");
    }

}
