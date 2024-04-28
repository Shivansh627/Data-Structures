package sorting;
public class insert {

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void insersort(int[] arr){
        for (int i=0;i<7;i++){
            for (int j=1;j<7;j++){
                if(arr[j]<arr[j-1]){
                    swap(arr, j, j-1);
                }
            }
        }
    }
    public static void main(String[] args) {
        int a[]=new int[10];
        a[0]=10;
        a[1]=9;
        a[2]=8;
        a[3]=7;
        a[4]=6;
        a[5]=5;
        a[6]=4;

        for(int i=0;i<7;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        
        insersort(a);

        for(int i=0;i<7;i++){
            System.out.print(a[i]+" ");
        }
    }
}
