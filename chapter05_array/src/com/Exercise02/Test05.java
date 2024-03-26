package com.Exercise02;

/**
 * ClassName:Test05
 * Package: com.Exercise02
 * Description:
 *   数组对称位置的元素互换。
 *
 * @Author Joan Jia
 * @Create 2024/3/6 16:11
 * @Version 1.0
 */
public class Test05 {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5};
        System.out.print("反转之前：");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }

        //进行反转
        int t;
        for(int i=0;i<arr.length/2;i++){
            t=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=t;
        }
        //反转之后
        System.out.print("反转之后：");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
    }
}
