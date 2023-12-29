package FunctionsPrac;

import java.util.Scanner;

public class PrintSumnumbs {
    public static int num ,sum;
    public static int printsum(){
        sum = 0;
        Scanner sc = new Scanner(System.in);
        while (true){
            num = sc.nextInt();
            sum = sum+num;
            if (num == 0){
        return sum;

            }
        }
    }
    public static void main(String[] args) {
        System.out.println("press 0 to stop adding the numbers ");
           int ans;
           ans =  printsum();
        System.out.println("sum is : "+ans);
    }
}
