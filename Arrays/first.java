// 1-D array
import java.util.Scanner;
public class first{
    public static void main(String[] args) {
        int n,i;
        int[] a;
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter no. of elements in array :");
        n=sc.nextInt();
        a= new int[n];
        System.out.println("Enter elements in array:");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        System.out.println("The array is:");
        for(i=0;i<n;i++){
            System.out.print(a[i]);
            System.out.print(" ");
        }
        sc.close();
    }
}