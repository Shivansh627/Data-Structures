import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
         int i,j, k;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter no. of rows:");
        int r=sc.nextInt();
        for (i = 0; i <=r; i++) {
            for (j = 0; j < r-i; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= 2*i-1; k++){
            System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
