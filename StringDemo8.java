public class StringDemo8{
	public static void main(String... args){
		String str = "My Mom Told Dad learn Malayalam";
		String str1 = str.replace("Dad","Mom");
		String str2 = str1.replaceFirst("Mom","Dad");
		System.out.println(str2);
	}
}
class BlockDemo{
	static{
		System.out.println("Static block is executing");
	}
	{
		System.out.println("Instance block is executing");
	}
	public static void main(String... args){
		System.out.println("Main method is executing");
		BlockDemo bd1 = new BlockDemo();
		BlockDemo bd2 = new BlockDemo();
	}
}
class VariablesInJava{
	static String name;//class/static variable
	int id;//instance variable
	public static void main(String... args){
		float a=10;//local variable
		VariablesInJava vij = new VariablesInJava();
		System.out.println("a = "+a+" name = "+name+" id = "+vij.id);
		vij.display();
	}
	public void display(){//instance method
		System.out.println("name = "+name+" id = "+id);
	}
}
class VariablesInJava1{
	static int a=10;//static/class variable
	int b = 20;//instance variable
	public static void main(String... args){
		VariablesInJava1 vij1 = new VariablesInJava1();
		vij1.a++;vij1.b++;
		VariablesInJava1 vij2 = new VariablesInJava1();
		vij2.a++;vij2.b++;
		System.out.println("vij1.a = "+vij1.a+" vij1.b = "+vij1.b);
		System.out.println("vij2.a = "+vij2.a+" vij2.b = "+vij2.b);
	}
}
class A{
	protected static class B{}
}
class ConstructorInJava{
	int a;//instance variable
	public static void main(String... args){//static method
		//how to access instance variable inside a static context
		ConstructorInJava cij = new ConstructorInJava();
		System.out.println("a = "+cij.a);
		System.out.println(cij);
	}
}
class Person{
	int age;//instance variable
	String name;//instance variable
	Person(int age,String name){//parameterized constructor
		this.age=age;//this refers to current instance
		this.name=name;
	}
	Person(){}//this will be considered as method by JVM

}
class MainC{
	public static void main(String... args){
		Person p1 = new Person();//here we are calling default constructor
		Person p2 = new Person(25,"Isha");
		System.out.println("Age = "+p1.age+" Name = "+p1.name);
		System.out.println("Age = "+p2.age+" Name = "+p2.name);
	}
}
class Sample{
	static String str;
	private Sample(String str){
		this.str=str;
	}
	static Sample display(String str){
		return new Sample(str);
	}
}
class MainSample{
	public static void main(String... args){
		Sample s1 = Sample.display("I  m made private");
		System.out.println(s1.str);
	}
}
class Swap{
	int a;
	int b;
	Swap(int a,int b){
		this.a=a;
		this.b=b;
	}
	Swap(Swap s1){//copy constructor
		System.out.println("Hai copy constructor");
		this.a=s1.a;
		this.b=s1.b;
	}
}
class MainSwap{
	public static void main(String... args){
		Swap s1 = new Swap(10,20);
		Swap s2 = new Swap(s1);
		s2.a=400;
		System.out.println("s2.a = "+s2.a+" s2.b = "+s2.b+" s1.a = "+s1.a);
		System.out.println(s1+" : "+s2);
	}
}






















































