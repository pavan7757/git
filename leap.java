import java.util.Scanner;
public class leap{
    public static void main(String[]arg){
        Scanner Sc = new Scanner (System.in);
        int a= Sc.nextInt();
        if (a%4==0) {
            System.out.println("it is leap year");
        } else if(a%100==0){
            if(a%400==0);{
                System.out.println("it is leap year");
            }
        } else{
            System.out.println("not a leap year");
        }







    }
}
