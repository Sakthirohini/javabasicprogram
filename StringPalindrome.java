import java.util.Scanner;

class StringPalindrome
                             {
                              public static void main(String[] args)
                               {
                            
                                    Scanner sc = new Scanner(System.in);  
                                    System.out.println("Enter Palindrome");
                                    String Palindrome = sc.nextLine().toLowerCase(); 
                                    StringBuffer sb = new StringBuffer(Palindrome);
                                    String AfPal = sb.reverse().toString();
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


                            class NumberPalindrome{  
                                public static void main(String args[]){  
                                 int r,sum=0,temp; 
                                 Scanner sc = new Scanner(System.in);
                                System.out.print("Enter a number: ");
                                int number = sc.nextInt();   
                                  
                                 
                                 temp=number;    
                                 while(number>0){    
                                  r=number%10;  //getting remainder  
                                  sum=(sum*10)+r;    
                                  number=number/10;    
                                 }    
                                 if(temp==sum)    
                                  System.out.println("palindrome number ");    
                                 else    
                                  System.out.println("not palindrome");    
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


                                class SwapNumbers {
                                    public static void main(String[] args) 
                                    {
                                        Scanner sc = new Scanner(System.in);
                                        System.out.print("Enter First number: ");
                                        int num1 = sc.nextInt(); 
                                        
                                        System.out.print("Enter Second number: ");
                                        int num2 = sc.nextInt(); 
                                       
                                
                                        System.out.println("Before swapping:");
                                        System.out.println("num1 = " + num1);
                                        System.out.println("num2 = " + num2);
                                
                                        
                                        int temp = num1;
                                        num1 = num2;
                                        num2 = temp;
                                
                                        System.out.println("After swapping:");
                                        System.out.println("num1 = " + num1);
                                        System.out.println("num2 = " + num2);
                                    }
                                }


                        class LargestArray
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
                                    la = arr[i];
                              }
                             
                              }

                              System.out.println("Largest Array : " + la);
                             
                         }
                        }



                       
                class VowelorNot {
                    public static void main(String[] args)
                    {

                        Scanner sc = new Scanner(System.in);
                              System.out.println("Enter the Char: ");
                              int Vowel = sc.next().charAt(0);

                        if (Vowel == 'a' || Vowel == 'e' || Vowel == 'i' || Vowel == 'o'|| Vowel == 'u' || Vowel == 'A' || Vowel == 'E' || Vowel == 'I'|| Vowel == 'O' || Vowel == 'U')
                            {
                                System.out.println("It is a Vowel.");
                            }
                            
                        else
                        {
                            System.out.println("It is Not a Vowel.");
                        }
                            
                    }
                    
                }

                