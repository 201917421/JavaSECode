package Exercise02;

/**
 * ClassName:Test03
 * Package: Exercise02
 * Description:编写程序，声明一个method方法，在方法中打印一个 10*8的*型矩形 ，在main方法中调用该方法。
 *在method方法中，除打印一个 10*8的*型矩形 外，再计算该矩形的面积，并将其
 * 作为方法返回值。在main方法中调用该方法，接收返回的面积值并打印。
 *
 * 修改上一个程序，在method方法提供m和n两个参数，方法中打印一个 m*n的*型矩形 ，并计算该矩
 * 形的面积， 将其作为方法返回值。在main方法中调用该方法，接收返回的面积值并打印。
 * @Author Joan Jia
 * @Create 2024/3/20 11:23
 * @Version 1.0
 */
public class Test03 {
    public static void main(String[] args) {
        Test03 p1=new Test03();
        int m=5;
        int n=6;
        int square=p1.squarePrint(m,n);
        System.out.println("矩形的面积为："+square);
    }

    //如果main和方法在同一个类中，在main中不声明对象调用方法的情况下，方法要用static修饰？？？
    // public static void squarePrint()
    public int squarePrint(int m,int n){
        for(int i=1;i<=m;i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        int square=m*n;
        return square;
    }



}
