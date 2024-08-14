import java.util.Scanner;
public class game1 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.err.println("enter number");
        int a=Sc.nextInt();
        System.out.println(a);
        int randomNum = (int)(Math.random() * 101);  // 0 to 100
        System.err.println("randaom number is");
        System.out.println(randomNum);


        if (a>randomNum) {
            System.out.println("Too high");
            System.err.println("Try again");

        } else if(a<randomNum) {
            System.out.println("Too low");
            System.err.println("Try again");


        } else {
            System.out.println("try again");
        }
    }
}


