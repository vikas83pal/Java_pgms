import java.util.Scanner;
public class SingleDiminsionalArray {
     public static void main(String args[]){
          Scanner scn=new Scanner(System.in);
          System.out.println("Enter The Size Of Array:");
          int n=scn.nextInt();
          int[] arr=new int[n];
          System.out.println("Enter The Elements of an Array:");
          for(int i=0;i<n;i++){
               arr[i]=scn.nextInt();
          }
          System.out.println("Array Elements Are:");
          // for(int i=0;i<n;i++){
          //      System.out.println(arr[i]);
          // }
          
          //Printing The Array Using For_Each Loop
          for(int i:arr){
               System.out.println(i);
          }
     }
}
