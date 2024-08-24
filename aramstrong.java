import java.util.Scanner;

public class aramstrong {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int p=n;
        int sum=0;
        int rem=0;
        int k=0;
        while(n!=0){
            sum=n%10;
            rem=sum*sum*sum;
            k=k+rem;
            n=n/10;

        }
        if(p==k){
            System.out.println("armstrong Number");
        } else{
            System.out.println("Not a Armstrong number");
        }
        System.out.println("this is your armstrong number "+ k);




    }

}
