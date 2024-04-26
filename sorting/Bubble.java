package sorting;

import java.util.Scanner;

public class Bubble {

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    

    static void Bubblesort(int arr[],int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a;

        int n= sc.nextInt();

        a=new int[n];

        System.out.println("Enter values in array:");

        for(int i=0; i<n;i++){
            a[i]=sc.nextInt();
        }

        for(int i=0; i<n;i++){
            System.out.print(a[i]);;
        }
        System.out.println();
        Bubblesort(a,n);

        for(int i=0; i<n;i++){
            System.out.print(a[i]);;
        }

        sc.close();
    }
}
