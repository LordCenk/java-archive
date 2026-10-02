import java.util.*;

public class Solution{
    public static boolean search(int matrix[][], int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == key){
                    System.out.println("found at cell(" + i + "," + j +")");
                    return true;
                }
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String args[]){
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;//n=no of rows, m=no of columns
        Scanner sc = new Scanner(System.in);// standard - we take first  row wise then column wise
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        //output
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
               System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }
        search(matrix,5);
    }
}
