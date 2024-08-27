import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int p=0;
        while(n!=0){
            p=n%10;
            sum=sum*10+p;
            n=n/10;

        }
        System.out.println(sum);


    }
}

