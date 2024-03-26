package Exercise;

/**
 * ClassName:Test10
 * Package: Exercise
 * Description:找出100以内所有的素数（质数）？100000以内的呢？
 *
 * @Author Joan Jia
 * @Create 2024/3/4 15:09
 * @Version 1.0
 */
public class Test10 {
    public static void main(String[] args) {

        for(int i=2;i<=100;i++){
            boolean isEmpty=true;
            for(int j=2;j<=Math.sqrt(i);j++){// 优化2：使用Math.sqrt(i)。for(int j=2;j<i;j++){
                if(i%j==0){
                    isEmpty=false;
                    break;//优化1
                }
            }
            if(isEmpty){
                System.out.print(i+"  ");
            }
        }
    }
}
