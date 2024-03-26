package com.Exercise02;

/**
 * ClassName:Test03
 * Package: com.Exercise02
 * Description:    找最值及其第一次出现的下标,找最值及其所有最值的下标
 *
 * @Author Joan Jia
 * @Create 2024/3/6 11:42
 * @Version 1.0
 */
public class Test03 {
    public static void main(String[] args) {
        int[] arr=new int[]{4,5,6,1,9,9,3};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("最大值是："+max);
        //接下来找所有最值下标
        System.out.println("最值下标有：");
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max){
                System.out.print(i+"\t");
            }
        }

    }
}
