import java.util.Scanner;
public class op2 {
    public static int[][] insert(int[][] arr, int num, int row, int col) {
        int r = arr.length;
        int c = arr[0].length;
        int[][] neww = new int[r + 1][c + 1];
    
        // Copy elements from the original array to the new array
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                neww[i][j] = arr[i][j];
            }
        }
    
        // Shift elements to the right and down by one position
        for (int i = row; i < r; i++) {
            for (int j = col; j < c; j++) {
                neww[i + 1][j + 1] = arr[i][j];
            }
        }
    
        // Insert the new element
        neww[row][col] = num;
    
        return neww;
    
    }

    // searching
    public static int[][] search(int[][] arr,int num) {
        int r=arr.length;
        int c= arr[0].length;
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                if (arr[i][j]==num){
                    System.out.println("the position is "+"("+i+","+j+")");
                }
            }
        }
        return arr;
    }
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter no. of rows:");
        int r=sc.nextInt();
        System.out.print("Enter no. of columns:");
        int c=sc.nextInt();
        int[][] att= new int[r][c];
        
        System.out.println("Enter elements:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                att[i][j]=sc.nextInt();
            }
        }
        System.out.println("The array is:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(att[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.print("Enter no. of elements to insert:");
        int isr=sc.nextInt();
        for (int i=0;i<isr;i++){
            System.out.print("Enter element to insert:");
            int nu= sc.nextInt();
            System.out.print("Enter row where to insert:");
            int ro =sc.nextInt();
            System.out.print("Enter col where to insert:");
            int co =sc.nextInt();
            att=insert(att,nu,ro,co);

        }
        System.out.println("The new array is:");
        for(int i=0;i<att.length;i++){
            for(int j=0;j<att[0].length;j++){
                System.out.print(att[i][j] + " ");
            }
            System.out.println();
        }
             
        System.out.print("Enter element to search:");
        int s=sc.nextInt();
        search(att,s);
        
        sc.close();
    
    }
}
