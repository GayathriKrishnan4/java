import java.util.Scanner;
public class Matrix{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows");
        int m=sc.nextInt();
        System.out.println("enter the number of columns");
        int n=sc.nextInt();
        int[][] a=new int[m][n];
        int[][] b=new int[m][n];
        System.out.println("enter elements of the 1st matrix:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
                }
                }
        System.out.println("enter elements of the 2st matrix:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                b[i][j]=sc.nextInt();
                }   
                }

        System.out.println("sum of matrix");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print((a[i][j] +b[i][j] + " "));
                }
                System.out.println();
                }
                sc.close();
                }
                }