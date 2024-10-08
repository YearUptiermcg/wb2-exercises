package com.pluralsight;

import java.util.Arrays;

public class Array1 {

    public static void main(String[] args){
        int i = 7;

        int[] nums = {63, 65, 60, 53, 58, 37, 35, 31};
        //            0   1   2   3   4   5   6   7

        System.out.println(Arrays.toString( nums) );
        nums[5] = 0;
        nums[6] = 0;

        System.out.println(Arrays.toString( nums) );

        System.out.println("-------------------");
        int[] nums2 = new int[8];

        System.out.println(Arrays.toString( nums2) );

        nums2[0] = 63;
        nums2[1] = 65;
        nums[2] = 60;
        //....
        nums2[7] = 31;

        //  for (int i = 0; i < nums.length; i++;
        // System.out.print(nums[i] + " ");
        //}
        // System.out.println();

    }
}
