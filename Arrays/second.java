// 2-D array
import java.util.Scanner;
public class second{
    public static void main(String[] args) {
        int m,n,i,j;
        Scanner sc=new Scanner (System.in);
        System.out.print("Eneter Rows:");
        m=sc.nextInt();
        System.out.print("Eneter Columns:");
        n=sc.nextInt();
        int[][] a;
        a=new int[m][n];
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("the array is");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
        sc.close();

    }
}