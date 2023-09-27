import javax.swing.text.StyledEditorKit;

public class TypeConversion {
     public static void main(String[] args){
          byte b=1;
          int a = (int)b;
          System.out.println("Byte To Int Conversion : "+a);
          int i=17;
          float f=(int)i;
          System.out.println("Int To Float conversion : "+f);
          System.out.println("Int To Double Conversion : "+f);
          char ch='A';
          int i1=(int)ch;
          System.out.println("char To Int Conversion : "+i1);
          

     }
}
