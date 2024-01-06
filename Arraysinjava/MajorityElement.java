package Arraysinjava;

import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of Array");
        int var =sc.nextInt();
        System.out.println("Enter The Numbers To Check The Majority Of Elements");
        int[] arr = new int[var];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = sc.nextInt();

        }
        int ans = majorityElement(arr);
        System.out.println(ans);
    }
    static int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            if(count == 0){
                candidate = nums[i];
            }
            if(candidate == nums[i]){
                count++;
            }else{
                count--;
            }
        }
        return candidate;
    }
}
