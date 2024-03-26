package com.Exercise01;

import java.util.Scanner;

/**
 * ClassName:Test02
 * Package: com.Exercise01
 * Description:从键盘读入学生成绩，找出最高分，并输出学生成绩等级。
 *
 * - 成绩>=最高分-10  等级为’A’
 * - 成绩>=最高分-20  等级为’B’
 * - 成绩>=最高分-30  等级为’C’
 * - 其余            等级为’D’
 *
 * 提示：先读入学生人数，根据人数创建int数组，存放学生成绩。
 *
 * @Author Joan Jia
 * @Create 2024/3/5 14:39
 * @Version 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        System.out.print("请输入学生人数：");
        Scanner input=new Scanner(System.in);
        int students=input.nextInt();
        double[] grades=new double[students];//初始化成绩数组

        System.out.print("请输入学生成绩：");
        for(int i=0;i<students;i++){
            grades[i]=input.nextDouble();
        }

        double maxGrade=grades[0];
        for(int j=1;j<students;j++){
            if(grades[j]>maxGrade){
                maxGrade=grades[j];
            }
        }
        System.out.println("最高分为："+maxGrade);

        String[] stage=new String[students];
        for(int k=0;k<students;k++){
            if(grades[k]>=maxGrade-10){
                stage[k]="A";
            }
            else if(grades[k]>=maxGrade-20){
                stage[k]="B";
            }
            else if(grades[k]>=maxGrade-30){
                stage[k]="C";
            }
            else{
                stage[k]="D";
            }
        }
        for(int m=0;m<students;m++){
            System.out.println("student"+m+" score is "+grades[m]+" 等级是"+stage[m]);
        }

        input.close();
    }
}
