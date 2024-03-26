package Exercise;

/**
 * ClassName:Test05
 * Package: Exercise
 * Description:打印1~100之间所有奇数的和
 *
 * @Author Joan Jia
 * @Create 2024/3/4 9:45
 * @Version 1.0
 */
public class Test05 {
    public static void main(String[] args) {

        int sum=0;
        for(int i=1;i<100;i++){
            if(i%2==0)
                continue;
            else
                sum=sum+i;
        }
        System.out.println("100之间奇数的总和为："+sum);
    }
}
