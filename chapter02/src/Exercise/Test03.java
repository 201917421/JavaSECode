package Exercise;

import java.util.Scanner;

/**
 * ClassName:Test03
 * Package: Exercise
 * Description:
 *
 * @Author Joan Jia
 * @Create 2024/3/3 11:17
 * @Version 1.0
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int week=2;
        int week2=week+10;
        int weeks=week2%7;
        System.out.println("今天是周"+week+","+"10天以后是周"+((weeks==0)?"日":(weeks)));
    }
}
