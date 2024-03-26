package Exercise;

/**
 * ClassName:Test01
 * Package: Exercise
 * Description:
 *
 * @Author Joan Jia
 * @Create 2024/3/3 11:03
 * @Version 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        int num=1234;
        System.out.println("个位数"+num%10);
        System.out.println("十位数"+num%100/10);
        System.out.println("百位数"+num%1000/100);
        System.out.println("千位数"+num/1000);
    }
}
