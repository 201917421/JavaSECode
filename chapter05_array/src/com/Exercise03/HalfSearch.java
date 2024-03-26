package com.Exercise03;

/**
 * ClassName:HalfSearch
 * Package: com.Exercise03
 * Description: 二分查找
 *
 * @Author Joan Jia
 * @Create 2024/3/8 14:56
 * @Version 1.0
 */
public class HalfSearch {
    public static void main(String[] args) {
        //能用二分查找的前提条件是顺序排列
        int[] arr=new int[]{-99,-54,-2,0,2,33,43,256,999};
        int value=2;
        int right,left=0;
        right=arr.length-1;
        int mid=(left+right)/2;
        //int i=0;//不需要定义这个变量
        while(left<=right){ //注意有＝号，否则首尾值可能找不到。

            if(arr[mid]==value){
                System.out.println("恭喜你，"+value+"找到了，位置在"+mid);
                break;
            }
            if(arr[mid]<value){
                left=mid+1;
                mid=(right+left)/2;
            }
            if(arr[mid]>value){
                right=mid-1;
                mid=(right+left)/2;
            }
            //i++;
        }

    }
}
