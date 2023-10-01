import java.util.Scanner;
public class MultiDimensionalArray {
     public static void main(String[] args){
          Scanner scn=new Scanner(System.in);
          System.out.println("Enter The Row Size:");
          int row=scn.nextInt();
          System.out.println("Enter The Coloum Size:");
          int col=scn.nextInt();
          int[][] arr=new int[row][col];
          System.out.println("Enter The Array Elements:");
          for(int i=0;i<row;i++){
               for(int j=0;j<col;j++){
                    arr[i][j]=scn.nextInt();
               }
          }
          for(int i=0;i<row;i++){
               for(int j=0;j<col;j++){
                    System.out.print(arr[i][j]+" ");
               }
               System.out.println();
          }
     }
     
}
