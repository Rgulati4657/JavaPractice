package Arraysinjava;

import java.util.Arrays;
import java.util.Scanner;

public class ShuffleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of Array");
        int n =sc.nextInt();
        int[] nums = new int[2*n];
        System.out.println("Enter The Elements");
        for (int i = 0; i < nums.length ; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(ShuffleArray(nums,n)));

    }
    static int[] ShuffleArray(int[] nums,int n){
        int[] arr = new int[nums.length];
        int start = 0;
        int mid = n;
        for (int i = 0; i <nums.length ; i++) {
            arr[i] = nums[start];
            i++;
            arr[i]= nums[mid];
            mid++;
            start++;
        }
        return arr;
    }
}
