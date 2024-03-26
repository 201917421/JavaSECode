package Exercise03;

import java.util.Scanner;

/**
 * ClassName:UI
 * Package: Exercise03
 * Description:
 *
 * @Author Joan Jia
 * @Create 2024/3/20 14:38
 * @Version 1.0
 */
public class UI {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        User user=new User();
        user.Name="贾琼琼";
        user.passWord="123456";
        System.out.print("请输入名字：");
        String name=input.next();
        System.out.print("请输入密码：");
        String passWord=input.next();


        user.login(name,passWord);
        input.close();
    }

}
