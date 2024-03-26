package com.Exercise03;

/**
 * ClassName:MaoPao
 * Package: com.Exercise03
 * Description: 冒泡排序，从小到大
 *
 * @Author Joan Jia
 * @Create 2024/3/12 9:00
 * @Version 1.0
 */
public class MaoPao {
    public static void main(String[] args) {
        int[] arr={3,6,4,2,11,10,5};
        int max,temp;
        for(int i=0;i<arr.length-1;i++){
            boolean flag=true;//元素已经是排好序的
            for(int j=0;j<arr.length-1-i;j++){//其中arr.length-1-i属于其中的一个优化
                if(arr[j+1]<arr[j]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=false;//设为false，证明元素在该轮交换了一次
                }
            }
            if(flag){ //如果为true，则表明在i轮后，并未再次进行交换，元素已经有序，此时可以跳出循环了
                break;
            }

        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }

    }
}
