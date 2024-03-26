package Exercise06;

/**
 * ClassName:AnimalTest
 * Package: Exercise06
 * Description:
 *
 * @Author Joan Jia
 * @Create 2024/3/24 16:13
 * @Version 1.0
 */
public class AnimalTest {
    public static void main(String[] args) {
        Animal animal=new Animal();

        animal.name="小兔子";
        //animal.legs=4;
        //animal.legs=-4;//数据非法，此时如果在这里直接赋值是不可以的。但在Animal类中不能直接单纯输入赋值的执行语句。所以要写入set/get方法。

        //调用该方法对Animal类中的legs属性赋值，并将Animal类中legs属性私有化（private）
        animal.setLegs(4);
        animal.getLegs();//获得Animal类中legs的值
    }

}

class Animal{
    String name;

    //因为legs私有化了，所以legs出了Animal类外就不能被调用了。
    private int legs;

    public void setLegs(int leg){
        if(leg>0&&leg%2==0){
            legs=leg;
        }else
            System.out.println("您输入的数据非法");
    }
    public int getLegs(){
        return legs;
    }
}
