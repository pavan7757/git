import java.util.Scanner;
public class swip{
    public static void main(String[]arg){
        Scanner Sc = new Scanner (System.in);
        int a= Sc.nextInt();
        int b=Sc.nextInt();
        int c=0;
        c= a;
        a= b;
        b = c;
        System.out.println(a);
        System.out.println(b);


    }
}

