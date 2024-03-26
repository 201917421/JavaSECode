package Exercise;

import java.util.Scanner;

/**
 * ClassName:Test02
 * Package: Exercise
 * Description:编写一个程序，为一个给定的年份找出其对应的中国生肖。中国的生肖基于12年一个周期，
 * 每年用一个动物代表：rat、ox、tiger、rabbit、dragon、snake、horse、sheep、monkey、rooster、dog、pig。
 *
 * 提示：2022年：虎   2022 % 12 == 6
 *
 * @Author Joan Jia
 * @Create 2024/3/3 16:25
 * @Version 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入一个年份：");
        int year=input.nextInt();
        int animal;
        animal=year%12;

        switch (animal){
            case 0:
                System.out.println("monkey");
                break;
            case 1:
                System.out.println("rooster");
                break;
            case 2:
                System.out.println("dog");
                break;
            case 3:
                System.out.println("pig");
                break;
            case 4:
                System.out.println("rat");
                break;
            case 5:
                System.out.println("ox");
                break;
            case 6:
                System.out.println("tiger");
                break;
            case 7:
                System.out.println("rabbit");
                break;
            case 8:
                System.out.println("dragon");
                break;
            case 9:
                System.out.println("snake");
                break;
            case 10:
                System.out.println("horse");
                break;
            case 11:
                System.out.println("sheep");
                break;
            default:
                System.out.println("您输入的年份有误");
        }
        input.close();
    }
}
