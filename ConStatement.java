import static java.lang.Math.*;

import java.util.Arrays;
import java.util.Scanner;

class ConStatement
{
     public static void main(String... agrs)
{
      Scanner sc = new Scanner(System.in);
     
	// Integer a = new Integer();
	// System.out.println(a instanceof Integer);

       System.out.println("Enter Number:");
	int num = sc.nextInt();
      if((num%2)==0)
      {
      System.out.println("Given Number is EVEN");
      }
      else
      {
      System.out.println("Given Number is ODD");
      }
     if((num&1)==0)
      {
      System.out.println("Given Number is EVEN");
      }
      else
      {
      System.out.println("Given Number is ODD");
      }
}
}

class IfStat
{
     public static void main(String... agrs)
{
      Scanner sc = new Scanner(System.in);
       System.out.println("Enter First Number:");
	int a = sc.nextInt();
      System.out.println("Enter Second Number:");
	int b = sc.nextInt();
       System.out.println("Enter Third Number:");
	int c = sc.nextInt();
      if((a==b)&&(b==c)&&(a==c))
      {
      System.out.println("Given Numbers all are same");
      }
      else if((a==b)||(b==c)||(a==c))
      {
      System.out.println("Given Numbers two are Same");
      }
      else
      {
      System.out.println("Given Numbers all are different");
      }
	
}
}

class QuatEqu
{
     public static void main(String... agrs)
{
      Scanner sc = new Scanner(System.in);
       System.out.println("Enter Value of a:");
	double a = sc.nextDouble();
      System.out.println("Enter Value of b:");
	double b = sc.nextDouble();
       System.out.println("Enter Value of c:");
	double c = sc.nextDouble();
	double d = b*b-4*a*c;
	double x1, x2;
      if(d==0)
      {
      System.out.println("Given Numbers are Real and Equal");
	x1 = x2 = -b/2*a;
	 System.out.println("x1 = "+x1+ "x2 =" +x2);
      }
      else if(d > 0)
      {
      System.out.println("Given Numbers are Real and Distinct");
	x1 = -b+(sqrt(d))/2*a;
	x2 = -b-(sqrt(d))/2*a;
	 System.out.println("x1="  +x1+ "x2 =" +x2);
      }
      else
      {
      System.out.println("Given Numbers are Imaginary");
      }
	
}
}

class LeapYear
{
     public static void main(String... agrs)
{
      Scanner sc = new Scanner(System.in);
       System.out.println("Enter Year:");
	int Year = sc.nextInt();
      
      if(Year%4==0)
      {
	if(Year%100 == 0)
	{
		if(Year%400 == 0)
		{
		System.out.println("Given Year is Leap Year");
		}
		else
	        {
		System.out.println("Given Year is Not a Leap Year");
	        }

	}
	else
	{
	System.out.println("Given Year is a Leap Year");
	}

      }
     else
     {
     System.out.println("Given Year is Not a Leap Year");
     }
	
}
}


class ATMPin  
{
     public static void main(String... agrs)
{
      Scanner sc = new Scanner(System.in);
       System.out.println("Enter Four Digit Pin:");
	int Pin = sc.nextInt();
      
      if(Pin>=1111 && Pin<=9999)
      {
      System.out.println("Given Pin is Authorized");
	System.out.println("Enter Amount");
	int Amount = sc.nextInt();
	if(Amount%100==0)
	{
		System.out.println("Cash Withdrawn");
	}
	else
	{
		System.out.println("Unable to Withdraw Cash");
	}
      }
      
      else
      {
      System.out.println("Given Pin is Not Authorized");
      }
	
}
}

class FindAvg
{
     public static void main(String... agrs)
{
      Scanner sc = new Scanner(System.in);
       System.out.println("Enter Marks of Sub1:");
	int sub1 = sc.nextInt();
      System.out.println("Enter Marks of Sub2:");
	int sub2 = sc.nextInt();
       System.out.println("Enter Marks of Sub3:");
	int sub3 = sc.nextInt();
	float avg =(sub1+sub2+sub3)/3;
	System.out.println("Average = " +avg);
      if(avg>90)
      {
      System.out.println("Gold Medal");

      }
      else if(avg > 80 && avg < 90)
      {
      System.out.println("First Class and Distinction");
      }
      else if(avg > 60 && avg < 80)
      {
      System.out.println("First Class");
      }
	
      else if(avg > 45 && avg < 60)
      {
      System.out.println("Second Class");
      }

	else if(avg < 45)
      {
      System.out.println("Fail");
      }
}
}


class FindLarSide
{
     public static void main(String... agrs)
{
      Scanner sc = new Scanner(System.in);
       System.out.println("Enter First Side :");
	int x = sc.nextInt();
      System.out.println("Enter Second Side :");
	int y = sc.nextInt();
       System.out.println("Enter Third Side:");
	int z = sc.nextInt();
	int d = (x>y)?(x>z?x:z):(y>z?y:z);
      System.out.println("Largest of three number is= " +d);

      if(d==x)
      {
            if (d>(y+z)) 
            {
                  System.out.println("Sides Form");
            }
            else
            {
                  System.out.println("Sides Does not Form");
            }
     
      }
	else if(d==y)
      {
            if (d>(x+z)) 
            {
                  System.out.println("Sides Form");
            }
            else
            {
                  System.out.println("Sides Does not Form");
            }
      
      }
      else

      {
            if (d>(x+y)) 
            {
                  System.out.println("Sides Form");
            }
            else
            {
                  System.out.println("Sides Does not Form");
            }   
      }
}
}



 class SwitchExample 
 {  
      public static void main(String[] args) 
      {  
          //Declaring a variable for switch expression  
          int number=20;  
          //Switch expression  
          switch(number)
          {  
          //Case statements  
          case 10: System.out.println("Ten");  
          break;  
          case 20: System.out.println("Twenty");  
          break;  
          case 30: System.out.println("Thirty");  
          break;  
          //Default case statement  
          default:System.out.println("Not in 10, 20 or 30");  
          }  
      }  
}  

class SwitchVowels 
{  
     public static void main(String[] args) 
     {  
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Character :");
       int Vowel = sc.next().charAt(0);
         switch(Vowel)
         {  
         //Case statements  
         case 'A': 
         System.out.println("Print A"); 
         System.out.println("This is Vowel"); 
         break;  
         case 'E': 
         System.out.println("Print E");
         System.out.println("This is Vowel");  
         break;  
         case 'I':
         System.out.println("Print I");
         System.out.println("This is Vowel");  
         break;  
         case 'O':
         System.out.println("Print O");
         System.out.println("This is Vowel");  
         break; 
         case 'U':
         System.out.println("Print U");
         System.out.println("This is Vowel");  
         break; 
         case 'a': 
         System.out.println("Print a"); 
         System.out.println("This is Vowel"); 
         break;  
         case 'e': 
         System.out.println("Print e");
         System.out.println("This is Vowel");  
         break;  
         case 'i':
         System.out.println("Print i");
         System.out.println("This is Vowel");  
         break;  
         case 'o':
         System.out.println("Print o");
         System.out.println("This is Vowel");  
         break; 
         case 'u':
         System.out.println("Print u");
         System.out.println("This is Vowel");  
         break; 
         //Default case statement  
         default:
         System.out.println("Not a Vowel");  
         }  
     }  
}  


class Sum_Digits
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);        
		System.out.print("Enter the Digits :");
		int num = sc.nextInt(); 
		int sum=0;     
            int prod=1;
            int rem;  
		while(num>0)
		{
			rem = num % 10;
			sum = sum + rem;
                  prod = prod * rem;
			num = num/10;
		}
		
		System.out.println("Sum of Digits :" + sum);
            System.out.println("Subtract of Digits :" + prod);
	}
} 

class ReverseDigit
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);        
		System.out.print("Enter the Digits :");
		int num = sc.nextInt(); 
		int rem;
            int rev = 0;
		while(num>0)
		{
			rem = num % 10;
	 		rev = (rev*10)+rem;
			num = num/10;
		}
		
		System.out.println("Reverse of Digits :" + rev);
            
	}
}


class ArmstrongNo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);        
		System.out.print("Enter the Digits :");
		int dig = sc.nextInt(); 
		int anum = 0, onum=dig, rem;
            int count = 0;
	  	while(dig>0)
		{
			count++;
			dig = dig/10;
		}
            dig=onum;
            while(dig>0)
		{
			rem = dig % 10;
			anum+=Math.pow(rem,count);
			dig = dig/10;
		}
		if(anum==onum)
            {
		System.out.println("Armstrong No");
            }
            else
            {
                  System.out.println("Not an Armstrong No");
            }
	}
}



class Calculatorloop
	{
        public static void main(String... args)
		{
			Scanner sc = new Scanner(System.in);
			char ch;
	        
			do
			{
		
			System.out.println("Enter the charatcter or Symbol: ");
			ch = sc.next().charAt(0);
                  System.out.println("Enter the value of a: ");
			int a = sc.nextInt();
                  System.out.println("Enter the Value of b: ");
			int b = sc.nextInt();
				switch(ch)
				{
					 case '+':
					 System.out.println("Addition = " +(a+b));
					 break;
					 case '-':
					 System.out.println("Subtraction = " +(a-b));
					 break ;
					 case '*':
					 System.out.println("Multiplication = " +(a*b));
					 break ;
					 case '/':
					 System.out.println("Division = " +(a/b));
					 break ;
					 case '%':
					 System.out.println("Modulus = " +(a%b));
					 break ;
					 case 'P':
					 System.out.print("Power = " +Math.pow(a,b));
					 break ;
				}
			}
			while(ch!='e');

					 
		}
	}
	

       class Factors {  
            public static void main(String[] args)
             {  
                  Scanner sc = new Scanner(System.in);
                  System.out.println("Enter Value: ");
			int fact = sc.nextInt();
                for(int i=1;i<=fact;i++)
                {  
                  if(fact%i==0)
                    System.out.println("Factors of " + fact + " is " +i );  
                }  
            }  
            }  


            class FactorCount {  
                  public static void main(String[] args)
                   {  
                        Scanner sc = new Scanner(System.in);
                        System.out.println("Enter Value: ");
                        int fact = sc.nextInt();
                        int count = 0;
                      for(int i=1;i<=fact;i++)
                      {  
                        if(fact%i==0)
                        {
                          System.out.println("Factors of " + fact + " is " +i ); 
                          count++;
                        }
                           
                      }  
                      System.out.println("Count of Factor is" +count );
                       
                  }  
                  }  


                  class GreComFact {  
                        public static void main(String[] args)
                         {  
                              int Gcd=1;
                              Scanner sc = new Scanner(System.in);
                              System.out.println("Enter Value1: ");
                              int fact1 = sc.nextInt();
                              System.out.println("Enter Value2: ");
                              int fact2 = sc.nextInt();
                            
                            for(int i=1;i<=fact1 && i<=fact2;i++)
                            {  
                              if((fact1%i==0)&&(fact2%i==0))
                              {
                                System.out.println("Factors of " + fact1 + " is " +i );  
                                System.out.println("Factors of " + fact2 + " is " +i );  
                                Gcd = i;
                              }
                                
                            }  
                            System.out.println("Greatest Common Fact is " +Gcd );  
                           
                              
                            
                        }  
                        } 



                        class Sample1
                        {
                              public static void main(String[] args)
                         {
                              for(int i=0;i<5;i++)
                              {
                                    if(i==2)
                                    {
                                          break;
                                    }
                                    System.out.println(i);
                              }
                        }  
                         
                        }

                        class Pattern1
                        {
                              public static void main(String[] args)
                         {
                              Scanner sc = new Scanner(System.in);
                        System.out.println("Enter No of rows: ");
                        int rows = sc.nextInt();
                              for(int i=1;i<=rows;i++)
                              {
                                    for (int j = rows; j >= i; j--) 
                                    { 
                                          System.out.print(" *"); 
                                      }   
                             
                                      System.out.println(); 
                                   
                              
                              }
                        }  
                         
                        }


                        class Fibonacci
                        {
                              public static void main(String[] args)
                         {
                             int t1=1,t2=1,nt;
                        
                              for(int i=1;i<=10;i++)
                              {

                                      System.out.println(t1); 
                                      nt=t1+t2;
                                      t1=t2;
                                      t2=nt;
                                   
                              
                              }
                        }  
                         
                        }


                        class Pattern3
                        {
                              public static void main(String[] args)
                         {
                              Scanner sc = new Scanner(System.in);
                              System.out.println("Enter No of rows: ");
                              int rows = sc.nextInt();
                        
                              for(int i=1;i<=rows;i++)
                              {
                                    for(int j=1;j<=i;j++)
                                    {
                                      System.out.print("*"); 
                                    }
                                     System.out.println(); 
                              }
                        }  
                         
                        }

                        class Pattern4
                        {
                              public static void main(String[] args)
                         {
                              Scanner sc = new Scanner(System.in);
                              System.out.println("Enter No of rows: ");
                              int rows = sc.nextInt();
                              int n=1;
                              System.out.println(); 
                              for(int i=1;i<=rows;i++)
                              {
                                    for(int j=1;j<=i;j++)
                                    {
                                      System.out.print(n++); 
                                     
                                    }
                                     System.out.println(); 
                              }
                        } 
                  }
                        
                        class Pattern5
                        {
                              public static void main(String[] args)
                         {
                              Scanner sc = new Scanner(System.in);
                              System.out.println("Enter No of rows: ");
                              int rows = sc.nextInt();
                              
                              System.out.println(); 
                              for(int i=1;i<=rows;i++)
                              {
                                    int n=i;
                                    for(int j=1;j<=i;j++)
                                    {
                                      System.out.print(n); 
                                      n=(n+rows)-j;
                                     
                                    }
                                     System.out.println(); 
                              }
                        }    
                         
                        }
 
                        
                        class SwapDigit
                        {
                              public static void main(String[] args)
                              {
                                    Scanner sc = new Scanner(System.in);        
                                    System.out.print("Enter the Digits :");
                                    int num = sc.nextInt(); 
                                    int digcount = (int)log10(num);
                                    int fd = num/((int)pow(10,digcount));
                                    int ld = num%10;
                                    int x = fd*((int)pow(10,digcount));
                                    int y = num%x;
                                    num = y/10;
                                    int swap = ld*((int)pow(10,digcount))+(num*10+fd);
                                    System.out.println("Swap of the Digit is :" + swap);
                                    
                              }
                        }

                        class PronicNo
                        {
                              public static void main(String[] args)
                         {
                              Scanner sc = new Scanner(System.in);
                              System.out.println("Enter the values: ");
                              int num = sc.nextInt();
                              
                               int pnum, i=1;
                              while(true)
                              {
                                    pnum = i*(i+1);
                                    if(pnum==num)
                                    {
                                          System.out.print("Pronic No"); 
                                          break;
                                    }
                                    else if(pnum<num)
                                    {
                                          i++;
                                          continue;
                                    }
                                     else
                                     {
                                          System.out.print("Not a Pronic No"); 
                                          break;
                                     }
                                     
                                    
                              }
                        }    
                         
                        }
 

                        class Array1
                        {
                              public static void main(String[] args)
                         {
                              int Sum=0;
                              int arr[] = new int[6];
                              Scanner sc = new Scanner(System.in);
                              System.out.println("Enter the Array Values: ");
                              for(int i=0;i<arr.length;i++)
                              {
                              arr[i] = sc.nextInt();
                              //System.out.println(arr[i] + " ");
                              Sum = Sum + arr[i]; 
                              }
                              
                              
                              System.out.println("Sum of Array is " + Sum);
                         }
                        }

                        class Array2 
                        {
                              public static void main(String[] args)
                         {
                              
                              int arr[] = new int[6];
                              Scanner sc = new Scanner(System.in);
                              System.out.println("Enter the Array Values: ");

                              for(int i=0;i<arr.length;i++)
                              {
                              arr[i] = sc.nextInt();
                              }
                              for(int i=0;i<arr.length;i++)
                              {
                              Arrays.sort(arr);
                              System.out.println(arr[i] + " ");
                              }
                         }
                        }

                        class Array3
                        {
                              public static void main(String[] args)
                         {
                              
                              int arr[] = new int[6];
                              Scanner sc = new Scanner(System.in);
                              System.out.println("Enter the Array Values: ");

                              for(int i=0;i<arr.length;i++)
                              {
                              arr[i] = sc.nextInt();
                              }
                              int la = arr[0];
                              int sa = arr[0];
                              for(int i=0;i<arr.length;i++)
                              {
                              if(arr[i]>la)
                              {
                                    la = arr[i];
                              }
                              if(arr[i]<sa)
                              {
                                     sa = arr[i];
                              }
                              }

                              System.out.println("Largest Array : " + la);
                              System.out.println("Smallest Array : " + sa);
                         }
                        }

                        class Array4
                        {
                              public static void main(String[] args)
                         {
                              
                              int arr[] = new int[6];
                              Scanner sc = new Scanner(System.in);
                              System.out.println("Enter the Array Values: ");

                              for(int i=0;i<arr.length;i++)
                              {
                              arr[i] = sc.nextInt();
                              //System.out.println(arr[i]);
                              }
                              System.out.println("Enter Search Value: ");
                              int SeaArray= sc.nextInt();
                              System.out.println(SeaArray);
                              for(int i=0;i<arr.length;i++)
                              {
                              if(SeaArray == arr[i])
                              {
                                    System.out.println(SeaArray + " Found at location " + (i+1));
                                    break; 
                              }
                              }
                             
                         }
                        }

                        class Array5
                        {
                              public static void main(String[] args)
                         {
                              
                              int arr[] = new int[6];
                              Scanner sc = new Scanner(System.in);
                              System.out.println("Enter the Array Values: ");

                              for(int i=0;i<arr.length;i++)
                              {
                              arr[i] = sc.nextInt();
                              }
                              int la = arr[0];
                              for(int i=0;i<arr.length;i++)
                              {
                                    if(arr[i]>la)
                                    {
                                          la=arr[i];
                                    }
                              }
                              int count = 0;
                              for(int i=0;i<arr.length;i++)
                              {
                                    if(arr[i]==la)
                                    {
                                          count++;
                                    }
                              }
                              System.out.println( "Largest Candle is with size " + la + " and count is " + count);
                         }
                        }


                        class Array6
                        {
                              public static void main(String[] args)
                         {
                              
                              int arr[] = new int[6];
                              Scanner sc = new Scanner(System.in);
                              System.out.println("Enter the Array Values: ");

                              for(int i=0;i<arr.length;i++)
                              {
                              arr[i] = sc.nextInt();
                              }
                              for(int i=0;i<arr.length;i++)
                              {
                                    for(int j=0;j<arr.length - 1;j++)
                                    {
                                    if(arr[j]>arr[j+1])
                                    {
                                          int temp = arr[j];
                                          arr[j]=arr[j+1];
                                          arr[j+1] = temp;

                                    }
                                    }
                                    System.out.println( "After Bubble " + arr[i]);
                              }
                         }
                        }


                        class Array7
                        {
                              public static void main(String[] args)
                         {
                              int Even, count=0, Odd, count1 = 0;
                              int arr[] = new int[6];
                              Scanner sc = new Scanner(System.in);
                              System.out.println("Enter the Array Values: ");

                              for(int i=0;i<arr.length;i++)
                              {
                              arr[i] = sc.nextInt();
                              }
                              for(int i=0;i<arr.length;i++)
                              {
                                    if (arr[i]%2==0)
                                    {
                                          Even = arr[i];
                                          count++;
                                          System.out.println("EVEN NUMBERS");
                                          System.out.println(Even);
                                         
                                    }
                                    
                                    else
                                    {
                                          Odd = arr[i];
                                          count1++;
                                          System.out.println("ODD NUMBERS");
                                          System.out.println(Odd);
                                          
                                    }
                                    
                                   
                              }
                              System.out.println("Count of Even No is " +count);
                              System.out.println("Count of Odd No is " +count1);
                         }

                        }


                        class Array8
                        {
                              public static void main(String[] args)
                         {
                              int count = 0;
                              int arr[] = new int[6];
                             // int arr1[][] = new int[3][4];
                             // int arr1[] = {23, 33, 44, 55, 66, 77};
                              Scanner sc = new Scanner(System.in);
                              System.out.println("Enter the Array Values: ");

                              for(int i=0;i<arr.length;i++)
                              {
                              arr[i] = sc.nextInt();
                              }
                              
                             int val = arr[0];
                              for(int i=0;i<arr.length;i++)
                              {

                                    if((arr[i])!=0)
                                    {
                                          val=arr[i];
                                          
                                    }
                                  
                                    for(int j=0;j<arr.length;j++)
                                    {
                                          count++;
                                          System.out.println( "Age " + val + "count" + count); 
                                          count = 0;
                                    }
                                    // System.out.println( "Age " + val); 
                                     
                              }
                                  
                              
                        
                         }
                        }


                        class Array9
                        {
                              public static void main(String[] args)
                         {
                              
                              int arr[][] = {
                                                { 1,2,3 },
                                                { 4,5,6 },
                                                { 7,8,9 }
                                            };
                             int arr1[][] = {
                                                { 9,8,7 },
                                                { 6,5,4 },
                                                { 3,2,1 }
                                            };
                              for(int i=0; i<arr.length;i++)
                              {
                                    for(int j=0; j<arr[i].length;j++)
                                    {
                                          System.out.print((arr[i][j] +arr1[i][j])+" ");  
                                    }
                                    System.out.println(); 

                              }
                        
                         }
                        }

                        class Array10
                        {
                              public static void main(String[] args)
                         {
                             final int CITY = 2;
                             final int WEEK = 7;
                              
                              int arr[][] = new int[CITY][WEEK];
                              Scanner sc = new Scanner(System.in);
                              
                              System.out.println("Input");
                              for(int i=0; i<arr.length;i++)
                              {
                                    for(int j=0; j<arr[i].length;j++)
                                    {
                                        arr[i][j] = sc.nextInt();;  
                                    }
                                    System.out.println(); 

                              }
                              System.out.println("Display");
                              for(int i=0; i<arr.length;i++)
                              {
                                    for(int j=0; j<arr[i].length;j++)
                                    {
                                          System.out.print(arr[i][j] + " ");  
                                    }
                                    System.out.println(); 

                              }
                        
                         }
                        }

                        class Array11
                        {
                              public static void main(String[] args)
                         {
                             
                              
                              int arr[][] = new int[2][];
                              Scanner sc = new Scanner(System.in);
                              for(int i=0; i<arr.length;i++)
                              {
                                    System.out.print("Input " + (i+1) + "Column Size");
                                    arr[i] = new int[sc.nextInt()];
                              }
                              System.out.println("Input");
                              for(int i=0; i<arr.length;i++)
                              {
                                    for(int j=0; j<arr[i].length;j++)
                                    {
                                       arr[i][j] = sc.nextInt();;  
                                    }
                                    System.out.println(); 

                              }
                              System.out.println("Display");
                              for(int i=0; i<arr.length;i++)
                              {
                                    for(int j=0; j<arr[i].length;j++)
                                    {
                                          System.out.print(arr[i][j] + " ");  
                                    }
                                    System.out.println(); 

                              }
                        
                         }
                        } 


                        class Array12
                        {
                              public static void main(String[] args)
                         {
                             
                              
                              int arr[][][] = {
                                               {{1, 2, 3},{4, 5, 6}}, 
                                               {{7, 8, 9},{10, 11, 12}} 
                                              };
                                              
                              int Sum = 0;
                              for(int i=0; i<arr.length;i++)
                              {
                                    for(int j=0; j<arr[i].length;j++)
                                    {
                                          for(int k=0; k<arr[i][j].length;k++)
                                          {
                                                System.out.print(arr[i][j][k] + " ");
                                                Sum = Sum + arr[i][j][k]; 
                                          }
                                         
                                          
                                          System.out.println("sum =" + Sum);
                                          Sum = 0;
                                          System.out.println();
                                    }
                                    System.out.println();
                              }
                      
                         }
                        }

                        class String1 {
                              public static void main(String[] args) {
                            
                                String str = "R O H I N I";
                               String[] str1 = str.split(" ");
                              
                                System.out.println(Arrays.toString(str1));  
                              
                              }
                            }

                            class String2 
                            {
                              public static void main(String[] args) 
                              {
                            
                                String str = "R O H I N I";
                               String[] str1 = str.split(" ");
                              for( int i=0;i<str1.length;i++)
                              {
                                    System.out.println(str1[i]);
                              }
                                  
                              
                              }
                            }
                            class String3
                             {
                              public static void main(String[] args)
                               {
                            
                                    Scanner sc = new Scanner(System.in);  
                                    System.out.println("Enter Palindrome");
                                    String Palindrome = sc.nextLine(); 
                                    // System.out.println(Palindrome);
                                    StringBuffer sb = new StringBuffer(Palindrome);
                                    String AfPal = sb.reverse().toString();
                                    // System.out.println(AfPal);
                                    System.out.println(sb.toString());
                                    if(Palindrome.equals(AfPal))
                                    {
                                          System.out.println("It is A Palindrome");
                                    }
                                    else
                                    {
                                          System.out.println("It is Not A Palindrome");
                                    }
                              }
                            }

                            class String4
                             {
                              public static void main(String[] args)
                               {
                            
                                    Scanner sc = new Scanner(System.in);  
                                    System.out.println("Enter Palindrome");
                                    String Palindrome = sc.nextLine().toLowerCase(); 
                                    String[] SpPal = Palindrome.split(" ");
                                    for( int i=0;i<SpPal.length;i++)
                                    {
                                          // System.out.println(SpPal[i]);
                                          StringBuffer sb = new StringBuffer(SpPal[i]);
                                          String AfPal = sb.reverse().toString();
                                         // System.out.println(sb.toString());
                                          if(AfPal.equals(SpPal[i]))
                                          {
                                                System.out.println(SpPal[i]);
                                                
                                          }
                                        
                                    }
                              }
                            }


                            class String5
                             {
                              public static void main(String[] args)
                               {
                            
                                    Scanner sc = new Scanner(System.in);  
                                    System.out.println("Enter Palindrome");
                                    String Palindrome = sc.nextLine(); 
                                    String str1 = Palindrome.replace("Dad","Mom");
                                    String str2 = str1.replaceFirst("Mom","Dad");
                                    System.out.println(str2);
                                    
                              }
                            }

                            class Block{
                              static{
                                    System.out.println("Static block is executing");
                              }
                              {
                                    System.out.println("Instance block is executing");
                              }
                              public static void main(String... args){
                                    System.out.println("Main method is executing");
                                    Block b1 = new Block();
                                  Block b2 = new Block();
                              }
                        }

                        class Variables1 
                        {
                              static String name;//class/static variable
                              int id;//instance variable
                              public static void main(String... args)
                              {
                                    int a=10;//local variable
                                    Variables1 var = new Variables1();
                                    System.out.println(" name = "+name+ " a = "+a+" id = "+ var.id);
                              }
                             
                        }

                        class Variables2 
                        {
                              static String name;//class/static variable
                              int id;//instance variable
                              public static void main(String... args)
                              {
                                    int a=10;//local variable
                                    Variables2 var = new Variables2();
                                    System.out.println(" name = "+name+ " a = "+a);
                                    var.display();
                              }
                              public void display(){//instance method
                                    System.out.println(" id = "+id);
                              }
                        }

                        class Person 
                        {
                              static String Country = "India";//class/static variable
                              private String Name;//instance variable
                              private Long AadharNo;
                              public void setName(String Name)
                              {
                                    this.Name = Name;
                              }
                              public String getName()
                              {
                                    return Name;
                              }

                              public void setAadharNo(Long AadharNo)
                              {
                                    this.AadharNo = AadharNo;
                              }
                              public Long getAadharNo()
                              {
                                    return AadharNo;
                              }
                        }
                        class MainPerson 
                        {
                        public static void main(String... args)  
                              {
                                   
                                    Person p1 = new Person();
                                    p1.setName("Sakthi");
                                    p1.setAadharNo(57568786l);
                                    System.out.println(" Name = "+p1.getName()+ " Aadhar = "+p1.getAadharNo()+ " Country = " +p1.Country);
                                    
                              }      
                        }   
                       


             // Java program implementing Singleton class
            // with using getInstance() method

            // Class 1
            // Helper class
            class Singleton {
                  // Static variable reference of single_instance
                  // of type Singleton
                  private static Singleton single_instance = null;

                  // Declaring a variable of type String
                  public String s;

                  // Constructor
                  // Here we will be creating private constructor
                  // restricted to this class itself
                  private Singleton()
                  {
                        s = "Hello I am a string part of Singleton class";
                  }

                  // Static method
                  // Static method to create instance of Singleton class
                  public static synchronized Singleton getInstance()
                  {
                        if (single_instance == null)
                              single_instance = new Singleton();

                        return single_instance;
                  }
            }

            // Class 2
            // Main class
            class MainSingleton {
                  // Main driver method
                  public static void main(String args[])
                  {
                        // Instantiating Singleton class with variable x
                        Singleton x = Singleton.getInstance();


                        // Printing the hash code for above variable as
                        // declared
                        System.out.println("Hashcode of x is "
                                                + x.hashCode());
                  }
            }

 //Single inheritance

            class In1
            {
                  private Long AadharNo;
                              
                              public void setAadharNo(Long AadharNo)
                              {
                                    this.AadharNo = AadharNo;
                              }
                              public Long getAadharNo()
                              {
                                    return AadharNo;
                              }
            }
            class In2 extends In1
            {
                  private String Name;
                  private String Address;
                              public void setName(String Name)
                              {
                                    this.Name = Name;
                              }
                              public String getName()
                              {
                                    return Name;
                              }

                              public void setAddress(String Address)
                              {
                                    this.Address = Address;
                              }
                              public String getAddress()
                              {
                                    return Address;
                              }
                              public void display()
                              {
                                    System.out.println(" Name = "+Name + " Address = "+Address+ " Aadhar = "+getAadharNo());
                              }

                             
            }

            class MainIN
            {
                  public static void main(String args[])
                  {
                    
                  In2 I2 = new In2();
                  I2.setName("Sakthi");
                  I2.setAddress("Srivilliputtur");
                  I2.setAadharNo(123242424l);
                  I2.display();
                  }

            }


            //hierarchy inheritance

            class EBBill
            {
                  
                    float Price;
                    EBBill(float Price)
                    {
                        this.Price = Price;
            
                    } 
                    public void Bill(int Unit)
                    {
                        System.out.println(" Unit = " + (Unit * Price));
                    }         
                              
            }
            class Domestic extends EBBill
            {
                 Domestic(float price)
                 {
                  super(price);
                 }
            }

            class Commercial extends EBBill
            {
                  Commercial(float price)
                 {
                  super(price);
                 }
                           
                             
            }
            class MainEBBill
            {
                  public static void main(String args[])
                  {
                    
                  Domestic D = new Domestic(2.0f);
                  Commercial C = new Commercial(6.0f);
                  D.Bill(200);
                  C.Bill(50);
                  
                  }

            }


            class Pattern6
            {
                  public static void main(String[] args) 
                  {
                        System.out.println("Enter Pattern Values");
                        Scanner sc = new Scanner(System.in);
                        int a = sc.nextInt();
                        int b = sc.nextInt();
                        int c = sc.nextInt();
                        Patternpar(a,b,c);

                  }
                  public static void Patternpar(int a, int b, int c)

                  {
                        for(int i=1;i<=a;i++)
                        {
                              for (int j = 1; j <= a-i; j++)
                               {
                                    System.out.print(" ");
                                }
                              for(int j=1;j<=i;j++)
                              {
                                    System.out.print(i + " "); 
                              }
                               System.out.println(); 
                        }
                        System.out.println(); 
                        
                        for(int i=1;i<=b;i++)
                        {
                              for (int j = 1; j <= b-i; j++)
                               {
                                    System.out.print(" ");
                                }
                              for(int j=1;j<=i;j++)
                              {
                                    System.out.print(i + " "); 
                              }
                               System.out.println(); 
                        }
                        System.out.println(); 

                        for(int i=1;i<=c;i++)
                        {
                              for (int j = 1; j <=c-i; j++)
                               {
                                    System.out.print(" ");
                                }
                              for(int j=1;j<=i;j++)
                              {
                                    System.out.print(i + " "); 
                              }
                               System.out.println(); 
                        }
                  }
            }

            class Source
            {
                  public static void main(String[] args)
                  {
                        Scanner sc = new Scanner(System.in);
                        int T = sc.nextInt();
                        sc.next();
                        String[] testcase = new String[T];
                        for(int i=0;i<T;i++)
                        {
                              testcase[i]= sc.next();

                        }
                        sc.close();
                        findSubString(T,testcase);

                  }
                  public static void findSubString(int T, String[] testcase)

                  {
                        for(int i=0;i<T;i++)
                        {
                              String[] split = testcase[i].split(" ");
                              String str1 = split[0];
                              String toFind = split[1];
                              int strLength= str1.length();
                              int toFindLengnth = toFind.length();
                              if(toFindLengnth >strLength)
                              {
                                    System.out.println("NO");
                              }
                              else if((str1 +str1).contains(toFind))
                              {
                                    System.out.println("YES");
                              }
                              else
                              {
                                    System.out.println("NO");
                              }

                        } 
                  }

            }

            class ArmsMain
            {
                  public int countAm(String str)
                  {

                  str = str.toLowerCase();
                  int count = 0;
                  for(int i=0; i<str.length();i++)
                  {
                      if(str.charAt(i) == 'a' && str.charAt(i+1) == 'm')
                      {
                        count++;
                      }  
                  }
                  return count;
                  }
            }
                  class Source1
                  {

                  public static void main(String[] args) 
                  {
                        ArmsMain A = new ArmsMain();
                       System.out.println(A.countAm("I Am in Amsterdam am 17")); 
                  }
                 }

           //inheritance
                              class GrandParent
                              {
                                    void dis()
                                    {
                                          System.out.println("Grand parent class");
                                    }
                              }
                              class Parent extends GrandParent
                              {
                              int age;
                              public Parent(int age)
                                          {
                                          this.age=age; 
                                          } 
                                          void display()
                                          {
                                                System.out.println("Parent class method"); 
                                          } 
                              } 
                              class Child extends Parent
                                    {
                                          String nm;
                                          public Child(int age,String nm) 
                                          { 
                                          super(age);
                                          this.nm=nm;
                                          }
                                          void msg()
                                          {
                                          System.out.println("age: "+age+" Name "+nm);
                                          }
                                          int age=30;
                                          void display() 
                                          {
                                           super.display();
                                            System.out.println("Child class method"); 
                                          
                                          } 
                                          void disAge() 
                                          { 
                                                System.out.println("Parent class : "+super.age); 
                                                System.out.println("Child class"+age);
                                           }
                                           }
                                          class SingleInheritanceDemo
                                             {
                                                 public static void main(String[] args)
                                                  {
                                                       Child c=new Child(20,"Pooja");
                                                        c.display();
                                                         //c.display1(); c.disAge(); 
                                                         c.msg(); //c.disChildAge(); 
                                                      }
                                                 }

            //Method Overloading
                                          class Polymorphism
                                             {
                                                void add(int a)
                                                {
                                                      System.out.println("Single Para : " +(++a));
                                                 }
                                                 public static void main(String[] args)
                                                  {
                                                       Polymorphism P = new Polymorphism();
                                                       P.add(5);
                                                  }
                                             }

            //Method Overriding
                                          class Vehicle
                                          {
                                                 void type()
                                            {
                                                 System.out.println("Vehicle class type");
                                            } 
                                          } 
                                          class Car extends Vehicle
                                          { 
                                            void type() 
                                            {
                                                 super.type();
                                                  System.out.println("car class type");
                                           }
                                           }
                                             class MethodOverridingEx
                                             {
                                                 //method overriding->method name and parameter are same but implment using
                                                  //inheritance 
                                                  //can not override final and static method
                                                   public static void main(String[] args)
                                                    {
                                                       Car c=new Car();
                                                        c.type();
                                                       }
                                            }

                                          

                                          
                                            abstract class Employee
                                            {
                                                private int hrs;
                                                private String nm;
                                                abstract public int calSal();
                                                   //abstract method 
                                                public void disEmp()
                                                {
                                                  System.out.println("Empl class");
                                                } 
                                                public Employee(int hrs, String nm)
                                                { 
                                                this.hrs = hrs; this.nm = nm;
                                                }
                                                public int getHrs() 
                                                {
                                                 return hrs;
                                                } 
                                                public void setHrs(int hrs)
                                                {
                                                this.hrs = hrs;
                                                }
                                                public String getNm()
                                                
                                                {
                                                 return nm;
                                                }
                                                 public void setNm(String nm)
                                                {
                                                 this.nm = nm;
                                                } 
                                          } 
                                          class Contractor extends Employee
                                           {
                                                private int workinghrs;
                                                public Contractor(int hrs, String nm,int workinghrs)
                                                {
                                                super(hrs, nm);
                                                this.workinghrs=workinghrs;
                                                }
                                                  public int calSal()
                                                  {
                                                      return getHrs()*workinghrs;
                                                  } 
                                           } 
                                           
                                           class FullTimeEmp extends Employee
                                           {
                                                 public FullTimeEmp(int hrs, String nm)
                                                {
                                                 super(hrs, nm);
                                                }
                                                   public int calSal()
                                                {
                                                  return getHrs()*8;
                                                } 
                                          }
                                          class AbstractClass
                                          {

                                           public static void main(String[] args) 
                                           {
                                             Employee cemp=new Contractor(5, "Raju", 7);
                                             Employee femp=new FullTimeEmp(5, "priya");
                                             System.out.println("Contract Emp: "+cemp.calSal());
                                             System.out.println("Fulltime Emp : "+femp.calSal()); 
                                             cemp.disEmp(); 
                                          } 
                                    
                                          }

//Multiple Inheritance

              interface HumanEat
            {
                  
                    
                  void eat();      
                              
            }
            interface HumanWalk
            {
                 
                  void walk();
            }

            class Human implements HumanEat, HumanWalk
            {
                       public void eat()
                       {
                         System.out.println("Eat");
                       } 
                       
                       public void walk()
                       {
                         System.out.println("Walk");
                       } 
            }
            class MainHuman
            {
                  public static void main(String args[])
                  {
                    
                   Human H = new Human();
                   H.eat();
                   H.walk();
                  
                  }

            }



            //Hybrid Inheritance

            class Vegetables
            {

            
            interface Carrot
            {
                  
                    
                 public void display();      
                              
            }
            interface Apple
            {
                 
                  public void display();
                  public void show();
            }

            }
            class MainVegetables extends  Vegetables implements Vegetables.Carrot, Vegetables.Apple
            {
                       public void display()
                       {
                         System.out.println("Display");
                       } 
                      
                       public void show()
                       {
                         System.out.println("Show Vegetables");
                       }
                       public static void main(String args[])
                  {
                    
                        MainVegetables V = new MainVegetables();
                   V.display();
                   V.show();
                  
                  }
            }
                

           

