package com.Exercise03;

/**
 * ClassName:LinearSearch
 * Package: com.Exercise03
 * Description: 顺序查找
 *   查找value第一次在数组中出现的index
 *
 * @Author Joan Jia
 * @Create 2024/3/8 14:11
 * @Version 1.0
 */
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr=new int[]{34,54,3,2,65,7,34,5,76,34,67};

        int value=34;
        boolean isFlag=false;
        System.out.print("value值"+value+"出现的索引值为：");
        for(int i=0;i<arr.length;i++){
            if(arr[i]==value){
                isFlag=true;
                int index=i;
                System.out.print(i+" ");
            }
        }
        if(!isFlag){
            System.out.println("不好意思，没有找到此值！");
        }

    }
}
