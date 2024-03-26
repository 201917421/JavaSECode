package Exercise05;

/**
 * ClassName:Num_AddTest
 * Package: Exercise05
 * Description:
 *
 * @Author Joan Jia
 * @Create 2024/3/23 14:56
 * @Version 1.0
 */
public class Num_AddTest {
    public static void main(String[] args) {
        int sum1,sum2;
        Num_Add p=new Num_Add();
        sum1=p.total(1,2,3);
        Num_Add p2=new Num_Add();
        sum2=p2.total(1,2,3,4,5);
        System.out.println("和为："+sum2);
    }
}
