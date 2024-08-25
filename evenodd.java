import java.util.Scanner;

public class evenodd {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        //int k=sc.nextInt();

        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println("  ");
        for(int j=1;j<=n;j++){
            if(j%2!=0){
                System.out.print(j+" ");
            }
        }
    }

}
