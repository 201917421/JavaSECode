package Exercise;

/**
 * ClassName:Test09
 * Package: Exercise
 * Description:九九乘法表**
 *
 *
 *
 * @Author Joan Jia
 * @Create 2024/3/4 14:44
 * @Version 1.0
 */
public class Test09 {
    public static void main(String[] args) {
        //9行
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+(i*j)+"   ");
            }
            System.out.print("\n");
        }

    }
}
