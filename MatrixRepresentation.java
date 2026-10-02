mport java.util.*;

public class Solution{
    public static void main(String args[]){
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;//n=no of rows, m=no of columns
        Scanner sc = new Scanner(System.in);// standard - we take first  row wise then column wise
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        //output
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
