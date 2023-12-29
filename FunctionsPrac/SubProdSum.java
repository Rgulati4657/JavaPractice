package FunctionsPrac;

import java.util.Scanner;

public class SubProdSum {
    public static int sumprod(int n){
    int res =0,pres = 1,ans;
        int rem;
        while (n>0){
            rem = n%10;
            res = res+rem;
            pres  = pres*rem;
            n/=10;
        }
        ans = pres - res;
        return ans;
    }
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n ;
        System.out.println("Enter The Integer :");
        n = sc.nextInt();
        int result;
        result = sumprod(n);
        System.out.println(result);
    }
}
