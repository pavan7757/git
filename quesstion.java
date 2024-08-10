import java.util.Scanner;
public class quesstion {
    public static void main(String[] args) {
        System.out.println("enter hours wage");
        System.out.println("enter hourly work");
        Scanner Sc = new Scanner(System.in);
        double  wage= Sc.nextInt();
        double work = Sc.nextInt();
        System.out.println(wage*work);

    }
}

