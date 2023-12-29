package FunctionsPrac;

import java.util.Scanner;

public class GradePrac {
    public static float res;
    public static void desc(){
        System.out.println("first tell me how many subjects do u have and it must be of 100 marks exam :");
        System.out.println("The Grade System is based on this criteria ");
        System.out.println(" MARKS       GRADE");
        System.out.println(" 91-100        AA ");
        System.out.println(" 81-90         AB ");
        System.out.println(" 71-80         BB ");
        System.out.println(" 61-70         BC ");
        System.out.println(" 51-60         CD ");
        System.out.println(" 41-50         DD ");
        System.out.println("  <= 40       Fail ");
    }
    public static String gradetime(float res){
        String g ="";
        if (res>90&&res<=100){
            g="AA";
        } else if (res>80&&res<=90) {
            g="AB";

        }else if (res>70&&res<=80) {
            g="BB";

        }else if (res>60&&res<=70) {
            g="BC";

        }else if (res>50&&res<=60) {
            g="CD";

        }else if (res>40&&res<=50) {
            g="DD";

        }else if (res<=40){
            g = "Fail";
        }else {
            System.out.println("Something went wrong");
        }

        return g;
    }
    public static void allotgrade(float sum ,int count){
        count = count*100;
        res = (sum/count)*100;
        String ans;
        System.out.println("Lets see your grade");
        ans = gradetime(res);
        System.out.println(ans);
    }
    public static void calcmarks(){
        Scanner sc = new Scanner(System.in);
        float nums;
        int count= 0;
        float sum = 0;
        System.out.println("Press -1 when u entered ur all marks ");
        while (true){
            nums = sc.nextFloat();
            if (nums == -1){
                break;
            }
            sum = sum+nums;
            count++;

        }
        allotgrade(sum,count);

    }
    public static void main(String[] args) {
        desc();
        calcmarks();
    }
}
