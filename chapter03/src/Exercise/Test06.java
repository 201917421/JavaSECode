package Exercise;

/**
 * ClassName:Test06
 * Package: Exercise
 * Description:世界最高山峰是珠穆朗玛峰，它的高度是8848.86米，假如我有一张足够大的纸，它的厚度是0.1毫米。
 * 请问，我折叠多少次，可以折成珠穆朗玛峰的高度?
 *
 * @Author Joan Jia
 * @Create 2024/3/4 9:52
 * @Version 1.0
 */
public class Test06 {
    public static void main(String[] args) {

        double zf=8848860;
        double paper=0.1;
        int num=0;
       while (paper<=zf){

           paper=paper*2;
           num++;
       }
        System.out.println("要折叠"+num+"次");



    }
}
