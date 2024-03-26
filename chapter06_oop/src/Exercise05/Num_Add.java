package Exercise05;

/**
 * ClassName:Num_Add
 * Package: Exercise05
 * Description:
 * 求n个整数的和.【可变个数的形参】
 *
 * @Author Joan Jia
 * @Create 2024/3/23 14:55
 * @Version 1.0
 */
public class Num_Add {

    int sum=0;
    public int total(int ...n){
        for(int i=0;i<n.length;i++){
            sum+=n[i];
        }
        return sum;
    }

}
