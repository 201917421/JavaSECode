package Exercise04;

/**
 * ClassName:Test
 * Package: Exercise04
 * Description:
 *
 * @Author Joan Jia
 * @Create 2024/3/21 17:00
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Test p1=new Test();

        //特点1：
        p1.method();//传入实参个数为0个
        p1.method(2,3,4);//传入实参个数为3个，输出111

        //特点2：
        p1.method(5,6);//输出222
        }

    public void method(int...a){
        System.out.println("111");
    }
    //public void method(int i,int...a){//这样写没问题

    //}
    //public void method(int...a,int i){

    //}

 //   public void method(int[] a){

 //   }
    public void method(int i,int j){
        System.out.println("222");
    }
}
