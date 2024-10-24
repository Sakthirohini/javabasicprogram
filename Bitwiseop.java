import static java.lang.Math.*;

import java.util.Date;
import java.util.Scanner;
class Bitwiseop{
   public static void main(String... args){
        int a=27,b=24;
        System.out.println("27&24= "+(a&b));
        System.out.println("27&24= "+(a|b));
        System.out.println("27&24= "+(a^b));
        System.out.println("27&24= "+(a>>b));
        System.out.println("27&24= "+(a<<b));
        System.out.println("~5= "+(~5));   
       }
}
/** This arithmatic class performs the arithmatic opertator such as addition ,subraction ,multiplication,division,modulus.*/

class Arithmatic{
     public static void main(String... agrs){
        int a=6, b=3;
        System.out.printf("%d",a+b);
        System.out.printf("\n%d",a-b);
        System.out.printf("\n%d",a/b);
        System.out.printf("\n%d",a*b);
        System.out.printf("\n%d",a%b);
       }
}
 
 class Display{
    public static void main(String... agrs){
    System.out.println("Hai\n\t\t\"Welcome to Java Tutorial\"");
}
}

 class Relational{
      public static void main(String... args){
        if(25>35)
           System.out.println("True");
        else
           System.out.println("False");
}
}

 class Example{
     public static void main(String... args)
     {
     System.out.println(sqrt(16));
}
}

 class Example1{
     public static void main(String... agrs){
    
          System.out.println("date: "+new Date());
}
}

class Swap
{
     public static void main(String... agrs)
{
      int a=24, b=27;
      System.out.println("Before swapping a = "+a+" b = "+b+" ");
      int temp = a;
      a = b;
      b=temp;
     //  a = a^b;
     //  b = a^b;
     //  a = a^b;
      System.out.println("After swapping a = "+a+" b = "+b+" ");
}
}

class OddOREven
{
     public static void main(String... agrs)
{
      int a=24;
     // 
     if(a%2==0)
      {
      System.out.println("EVEN");
      }
      else
      {
      System.out.println("ODD");
      }

}
}

class AssignOP
{
     public static void main(String... agrs)
{
      int a=5;
      a*= 5;
      System.out.println("a = "+a);
      
}
}

class UnaryOp
{
     public static void main(String... agrs)
{
      int a=10;
      System.out.println(a++);
      System.out.println(++a);
      System.out.println(a--);
      System.out.println(--a);
      int c = ++a + ++a + ++a;
      System.out.println("c = " +c);

      
}
}

class TernaryOp
{
     public static void main(String... agrs)
{
      int a=10, b=20, c=27;
      int d = (a>b)?a:b;
      System.out.println("Largest of two number is= " +d);
     int e = (a>b)?(a>c?a:c):(b>c?b:c);
      System.out.println("Largest of three number is= " +e);
}
}

class OperPresedence
{
     public static void main(String... agrs)
{
      int a=10, b=15, c=6, d=5;
      a=+d%b*(c/2)+~d+ ++b*2;
      System.out.println("a= " +a);
}
}

class CeltoFaren
{
     public static void main(String... agrs)
{
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter Celcius Value:");
     float Cel = sc.nextFloat();
     float Far1 = ((9/5)*Cel) + 32;
     System.out.println("Farenheat Value is:" +Far1); 
     System.out.println("Enter Farenheat Value:");
     float Far = sc.nextFloat();
     float Cel1 = (Far-32)*5/9;
     System.out.println("Celcius Value is:" +Cel1); 

}
}

class CirArea
{
     public static void main(String... agrs)
{
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter Radius:");
     double Rad = sc.nextDouble();
     double Area = Math.PI*Rad*Rad;
     System.out.println("Area of Circle is:" +Area); 

}
}

class RectArea
{
     public static void main(String... agrs)
{
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter Length:");
     int Len = sc.nextInt();
     System.out.println("Enter Width:");
     int Wid = sc.nextInt();
     int Area = Len * Wid;
     System.out.println("Area of Rectangle is:" +Area); 

}
}



//How to get Input from user
//nextInt()
//nextFloat()
//nextByte()
//nextDouble()
//nextBoolean()
//nextShort()
//nextLong()
//next() or nextLine()  -> String
// char - > No direct method


class InputFromUser
{
     public static void main(String... agrs)
{
     Scanner sc = new Scanner(System.in);
     System.out.println("Input int");
     int a = sc.nextInt();
     System.out.println("Input float");
     float b = sc.nextFloat();
     System.out.println("Input char");
     char ch = sc.next().charAt(0);
     System.out.println("Integer is:" +a); 
     System.out.println("Float is:" +b);
     System.out.println("Char is:" +ch);

}
}


 