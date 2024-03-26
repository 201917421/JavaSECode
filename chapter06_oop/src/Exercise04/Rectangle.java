package Exercise04;

/**
 * ClassName:Rectangle
 * Package: Exercise04
 * Description: 定义矩形类Rectangle，包含长、宽属性，area()返回矩形面积的方法，perimeter()返回矩形周长的
 * 方法，String getInfo()返回圆对象的详细信息（如：长、宽、面积、周长等数据）的方法
 *
 * @Author Joan Jia
 * @Create 2024/3/21 10:05
 * @Version 1.0
 */
public class Rectangle {
    double length;
    double width;

    public double area(){
        return length*width;
    }
    public double perimeter(){
        return (length+width)*2;
    }
    public String getInfo(){
        double Area=area();
        double Perimeter=perimeter();
        return "矩形的长为："+length+",宽为："+width+",面积为："+Area+",周长为："+Perimeter;
    }
}
