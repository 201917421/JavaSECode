package com.Exercise02;

/**
 * ClassName:Test02
 * Package: com.Exercise02
 * Description:使用二维数组打印一个 10 行杨辉三角。
 *
 * 提示：
 *
 * 1. 第一行有 1 个元素, 第 n 行有 n 个元素
 * 2. 每一行的第一个元素和最后一个元素都是 1
 * 3. 从第三行开始, 对于非第一个元素和最后一个元素的元素。即：
 * yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
 *
 * @Author Joan Jia
 * @Create 2024/3/6 10:51
 * @Version 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        //先声明,确定了有10行，但列数不确定。
        int[][] yanghui=new int[10][];//此时堆中有10块null区域.
        //1、接下来确定每行包含多少列
        for(int i=0;i<yanghui.length;i++){
            yanghui[i] =new int[i+1];
        }

        //2、设置每一行第一个和最后一个元素的值。
        for(int i=0;i<yanghui.length;i++){
            yanghui[i][0]=1;
            yanghui[i][yanghui[i].length-1]=1;
        }//1、2、可以合并。

        //3、设置非第一个和最后一个元素的值
        for(int i=2;i<yanghui.length;i++){
            for(int j=1;j<yanghui[i].length-1;j++){
                yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
            }
        }
        //打印值
        for(int i=0;i<yanghui.length;i++){
            for(int j=0;j<yanghui[i].length;j++){
                System.out.print(yanghui[i][j]+" ");
            }
            System.out.println();
        }


    }
}
