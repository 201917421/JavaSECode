package com.Exercise03;

import java.util.Arrays;

/**
 * ClassName:ArrTest
 * Package: com.Exercise03
 * Description:
 *
 * @Author Joan Jia
 * @Create 2024/3/12 10:04
 * @Version 1.0
 */
public class ArrTest {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
        int[] arr2={4,5,6,7};
        boolean isEquals= Arrays.equals(arr1,arr2);
        System.out.println(isEquals);
    }
}
