import java.util.Scanner;

public class DataTypes {
     public static void main(String[] args){
          Scanner scn=new Scanner(System.in);
          
          System.out.println("Enter The integer Value:");
          int a=scn.nextInt();
          
          System.out.println("Enter The float Value:");
          float f=scn.nextFloat();
          
          System.out.println("Enter The Double Value:");
          double d=scn.nextDouble();
          
          System.out.println("Enter The string Value:");
          String str=scn.next();
          
          System.out.println("The Integer Value is :"+a);
          System.out.println("The Float Value is :"+f);
          System.out.println("The Double Value is :"+d);
          System.out.println("The String Value is :"+str);

          
     }
}
