package Exercise;

/**
 * ClassName:Test03
 * Package: Exercise
 * Description:题目：输出所有的水仙花数，所谓水仙花数是指一个3位数，其各个位上数字立方和等于其本身。
 * 例如： `153 = 1*1*1 + 3*3*3 + 5*5*5
 *
 * @Author Joan Jia
 * @Create 2024/3/3 16:38
 * @Version 1.0
 */
public class Test03 {
    public static void main(String[] args) {

        for(int i=100;i<1000;i++){
            int ge=i%10;
            int shi=i%100/10;
            int bai=i/100;
            int sum;
            sum=ge*ge*ge+shi*shi*shi+bai*bai*bai;
            if(sum==i)
                System.out.println(sum);

        }
    }
}
