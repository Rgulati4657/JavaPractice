package first_java_program;

import java.util.Scanner;

public class ArmstrongNum {

    public static boolean checkarm(long i){
        long arm = i,rem;
        int count = 0;
        while (arm>0){
            arm/=10;
            count++;
        }
        arm = i;
        long sum =0;
        while (arm >0){
            rem =arm %10;
            sum+=Math.pow(rem,count);
            arm/=10;
        }
        if(sum == i){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long first,last;
        System.out.println("Enter the First value :");
        first = sc.nextLong();
        System.out.println("Enter the last value :");
        last = sc.nextLong();
        for(long i=first;i<=last;i++){
            boolean a = checkarm(i);
            if(a == true){
                System.out.println(i);
            }
        }

    }
}
