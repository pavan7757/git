import java.util.Scanner;

public class digit{
    public static void main(String[]arg){
        Scanner Sc = new Scanner (System.in);
        int a= Sc.nextInt();
        int sum=0;
        while(a!=0){
            sum=sum+ a%10;
            a=a/10;


        }
        System.out.println(sum);






    }
}

