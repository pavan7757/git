import java.util.Scanner;

public class apnaarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println(" enter number of array");
        int []marks=new int[n];
        for(int i=0; i<n; i++) {
            int p=sc.nextInt();
            marks[i]=p;


        }
        System.out.println();
        for(int i=0;i<marks.length;i++){
            if(marks[i]>0){
                System.out.print(marks[i]+" ");
            }

        }

    }



}