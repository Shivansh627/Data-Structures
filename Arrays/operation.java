import java.util.Scanner;

public class operation {

    // insertion
   public static int[] insert(int[] arr, int val, int pos) {
       int[] newArr = new int[arr.length + 1];

       for (int i = 0; i < newArr.length; i++) {
           if (i < pos) {
               newArr[i] = arr[i];
           } else if (i == pos) {
               newArr[i] = val;
           } else {
               newArr[i] = arr[i - 1];
           }
       }
       return newArr;
   }

//    bubble sort
public static int[] bubble(int[] arr){
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length-1;j++){
            if(arr[j]>arr[j+1]){
                int temp;
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
            else{
                arr[j]=arr[j];
            }
        }
    }
    return arr;
}

//    deletion
   public static int[] del(int[] arr,int pos){
    int[] b=new int[arr.length-1];
    for(int i=0;i<b.length;i++){
        if(i<pos){
            b[i]=arr[i];
        }
        else if(i>=pos){
            b[i]=arr[i+1];
        }
    
    }
    return b;
   }

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter the size of array: ");
       int size = sc.nextInt();

       int[] arr = new int[size];
       System.out.println("Enter the elements in array: ");
       for (int i = 0; i < size; i++) {
           arr[i] = sc.nextInt();
       }

       System.out.println("The Array is: ");
       for (int i = 0; i < size; i++) {
           System.out.print(arr[i] + " ");
       }
       System.out.println("");

       System.out.print("Enter no. of element to insert: ");
       int el = sc.nextInt();

       for (int i = 0; i < el; i++) {
           System.out.print("Enter value: ");
           int val = sc.nextInt();

           System.out.print("Enter position: ");
           int pos = sc.nextInt();

           arr = insert(arr, val, pos);
       }

       int n = arr.length;
       System.out.println("The new Array after insertion is: ");
       for (int i = 0; i < n; i++) {
           System.out.print(arr[i] + " ");
       }
       System.out.println("");
       System.out.print("enter no. of element to delete:");
       int x=sc.nextInt();
       
       for(int i=0;i<x;i++){
           System.out.print("Enter position: ");
           int pos = sc.nextInt();
           arr=del(arr,pos);
        }

        int n1 = arr.length;
        System.out.println("The new Array after deletion is: ");
        for (int i = 0; i < n1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        
        arr=bubble(arr);

        int n2 = arr.length;
        System.out.println("The new Array after sorting is: ");
        for (int i = 0; i < n2; i++) {
            System.out.print(arr[i] + " ");
        }

       sc.close();
   }
}

