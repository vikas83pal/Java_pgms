public class opeartors {
     public static void main(String[] args) {

          // Arithmetic Operators
          int a = 1;
          int b = 2   ;
          int sum = a + b;
          int difference = a - b;
          int product = a * b;
          double quotient = (double) a / b; 
          int remainder = a % b;

          System.out.println("Arithmetic Operators:");
          System.out.println("a + b = " + sum);
          System.out.println("a - b = " + difference);
          System.out.println("a * b = " + product);
          System.out.println("a / b = " + quotient);
          System.out.println("a % b = " + remainder);

          // Assignment Operators
          int x = 15;
          x += 5; 
          System.out.println("\nAssignment Operator:");
          System.out.println("x = " + x);

          // Comparison Operators
          boolean isEqual = (a == b);
          boolean isNotEqual = (a != b);
          boolean isGreaterThan = (a > b);
          boolean isLessThan = (a < b);
          boolean isGreaterOrEqual = (a >= b);
          boolean isLessOrEqual = (a <= b);

          System.out.println("\nComparison Operators:");
          System.out.println("a == b : " + isEqual);
          System.out.println("a != b : " + isNotEqual);
          System.out.println("a > b : " + isGreaterThan);
          System.out.println("a < b : " + isLessThan);
          System.out.println("a >= b : " + isGreaterOrEqual);
          System.out.println("a <= b : " + isLessOrEqual);

          // Logical Operators
          boolean condition1 = true;
          boolean condition2 = false;

          boolean andResult = condition1 && condition2;
          boolean orResult = condition1 || condition2;
          boolean notResult = !condition1;

          System.out.println("\nLogical Operators:");
          System.out.println("condition1 && condition2 : " + andResult);
          System.out.println("condition1 || condition2 : " + orResult);
          System.out.println("!condition1 : " + notResult);

          // Increment and Decrement Operators
          int count = 5;
          count++; 
          int newCount = count--; 

          System.out.println("\nIncrement and Decrement Operators:");
          System.out.println("count after increment: " + count);
          System.out.println("newCount after decrement: " + newCount);

     }
}
