import java.util.Scanner;
    public class asssignment {
        public static void main(String[] args) {
            Scanner Sc = new Scanner (System.in);
            int a= Sc.nextInt();
            if (a>0) {
                System.out.println("number is positive");

            } else if (a<0){
                System.out.println("number is negative");

            } else{
                System.out.println("number is zero");
            }

        }
    }

