package Exercise06.Test01;

/**
 * ClassName:TriAngleTest
 * Package: Exercise06
 * Description:
 *
 * @Author Joan Jia
 * @Create 2024/3/26 9:14
 * @Version 1.0
 */
public class TriAngleTest {
    public static void main(String[] args) {
        TriAngle triAngle=new TriAngle(5,6);
        double area=triAngle.areaPrint();
        System.out.println("三角形的面积为："+area);
    }
}
