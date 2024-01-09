import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        //rectangular pattern
        int i, j,k;
        Scanner sc= new Scanner(System.in);
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                System.err.print("*");
            }
            System.err.println();
        }
        
        //rectangular numerical pattern
        System.out.println("Enter no.of rows:");
        int r=sc.nextInt();
        for(i=1;i<=r;i++){
            for(j=i;j<=r;j++){
                System.out.print(j);
            }
            for(k=1;k<=i-1;k++){
                System.out.print(k);
            }
            System.out.println();
        }



    }
}