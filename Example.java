class Example{  
    public static void main(String... args)
   {  
     System.out.println("Hello");  
    }  
}  


class Simple{  
    public static void main(String args[])
   {  
     System.out.println("Hello World");
     
    }  
} 

class Simple1{  
    public static void main(String args[])
   {  
     String str[] = {"a","b","c"};
     Example.main(str);
     Simple.main(str);
     System.out.println("Hello Java");
     
    }  
}  