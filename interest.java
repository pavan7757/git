import java.util.Scanner;
public class interest{
    public static void main(String []arg){
        Scanner Sc = new Scanner (System.in);
        double p=Sc.nextInt();
        double r=Sc.nextInt();
        double t=Sc.nextInt();

        System.out.println((p*r*t)/100);

    }
}

