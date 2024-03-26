package Exercise05;

/**
 * ClassName:PassObject
 * Package: Exercise05
 * Description:
 *
 * @Author Joan Jia
 * @Create 2024/3/24 9:21
 * @Version 1.0
 */
public class PassObject {
    public static void main(String[] args) {
        Circle circle=new Circle();
        //circle.radius=5;
        //int time=circle.radius;
        printAreas(circle,5);
    }
    public static void printAreas(Circle c,int time){
        System.out.println("Redius\t\t\t\tArea");
        for(int i=1;i<=time;i++){
            System.out.println(i+"\t\t\t"+c.findArea(i));
        }

    }
}
