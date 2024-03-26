package Exercise04;

/**
 * ClassName:Rectangle_Test
 * Package: Exercise04
 * Description:  在测试类中创建长度为3的Rectangle[]数组，用来装3个矩形对象，并给3个矩形对象的长分别赋值
 * 为10,20,30，宽分别赋值为5,15,25，遍历输出
 *
 * @Author Joan Jia
 * @Create 2024/3/21 10:10
 * @Version 1.0
 */
public class Rectangle_Test {
    public static void main(String[] args) {
        Rectangle[] rectangles=new Rectangle[3];
        for(int i=0;i<rectangles.length;i++){
            rectangles[i]=new Rectangle();
            rectangles[i].length=(i+1)*10;
            rectangles[i].width=i*10+5;
        }

        for(int i=0;i<rectangles.length;i++){
            System.out.println(rectangles[i].getInfo());
        }
    }
}
