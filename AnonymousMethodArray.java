class Demo{
     public static void printArray(int[] arr){
          for(int num:arr){
               System.out.print(num+" ");
          }
     }
}
public class AnonymousMethodArray {
     public static void main(String[] args){
          int[] arr={1,2,3,4,5};
          Demo.printArray(arr);
     }
}
