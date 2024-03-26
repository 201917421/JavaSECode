package Exercise06.Test01;

/**
 * ClassName:TriAngle
 * Package: Exercise06
 * Description:
 * 编写两个类，TriAngle和TriAngleTest，其中TriAngle类中声明私有的底边长base和高height，同时
 * 声明公共方法访问私有变量。此外，提供类必要的构造器。另一个类中使用这些公共方法，计算三角形
 * 的面积。
 *
 * @Author Joan Jia
 * @Create 2024/3/26 9:05
 * @Version 1.0
 */
public class TriAngle {
    private double base;
    private double height;

    //有参构造器。
    public TriAngle(double b,double h){
        base=b;
        height=h;
    }

    public void setBase(double base1){
        base=base1;
    }
    public double getBase(){
        return base;
    }
    public void setHeight(double height1){
        height=height1;
    }
    public double getHeight(){
        return height;
    }
    //求面积方法
    public double areaPrint(){
        return (base*height)/2;
    }

}
