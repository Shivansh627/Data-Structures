package sorting;

import java.util.Scanner;

public class selec {

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    

    static void selectsort(int arr[],int n){
        for(int i=0;i<n-1;i++){
            int loc=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[loc]){
                    loc=j;
                }
            }
            swap(arr, i, loc);
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
            System.out.print(a[i]+" ");;
        }
        System.out.println();
        selectsort(a,n);

        for(int i=0; i<n;i++){
            System.out.print(a[i]+" ");;
        }

        sc.close();
    }
}
