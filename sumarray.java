import java.util.Scanner;

public class sumarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        System.out.println(" enter number of array");
        int []marks = new int[n];
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            marks[i] = p;


        }
        System.out.println();
        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];

            System.out.print(marks[i] + " ");
        }
        System.out.println();
        System.out.println("sum of all array");
    }
}

