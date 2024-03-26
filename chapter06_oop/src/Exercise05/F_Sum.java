package Exercise05;

/**
 * ClassName:F_Sum
 * Package: Exercise05
 * Description:
 * 已知有一个数列：f(0) = 1，f(1) = 4，f(n+2)=2*f(n+1) + f(n)，其中n是大于0的整数，求f(10)的值。
 *
 * 已知一个数列：f(20) = 1,f(21) = 4,f(n+2) = 2*f(n+1)+f(n)，其中n是大于0的整数，求f(10)的值。
 *
 * @Author Joan Jia
 * @Create 2024/3/24 14:41
 * @Version 1.0
 */
public class F_Sum {
    public static void main(String[] args) {
        int n=3;
        System.out.println(f_sum(n));
    }
    public static int f_sum(int num){
        if(num==0){
            return 1;
        }else if(num==1){
            return 4;
        }else
            return f_sum(num-2)+2*f_sum(num-1);
    }

    public static int f_sum2(int num){
        if(num==20){
            return 1;
        }else if(num==21){
            return 4;
        }else
            return f_sum2(num+2)-2*f_sum2(num+1);
    }
}
