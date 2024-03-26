package com.Exercise02;

/**
 * ClassName:Test01
 * Package: com.Exercise02
 * Description:
 *获取arr数组中所有元素的和。
 *
 * 提示：使用for的嵌套循环即可。
 *
 * @Author Joan Jia
 * @Create 2024/3/6 10:42
 * @Version 1.0
 */
public class Test01 {
    public static void main(String[] args) {

        int[][] arr=new int[][]{{3,5,8},{12,9},{7,0,6,4}};//二维数组初始化
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
        }
        System.out.println("数组arr元素的和为："+sum);
    }
}
