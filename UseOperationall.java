//java program to show all the operations like add, subtract, multiplication, and divsion
//in a class operations
class Operations
{
   void add(int a,int b)//method 1
   {
	  System.out.println("The addition is");
      System.out.println(a+b);
   }
	void subtract(int a, int b)//method2 
	{
		System.out.println("The subtraction is");
	    System.out.println(a-b);
	}
	void multiplication(int a, int b)//method3
	{
	  System.out.println("The multiplication is");
	  System.out.println(a*b);
	}
	void division(int a, int b)//method 4
	{
		System.out.println("The division is");
	    System.out.println(a/b);
	}
}
class UseOperationall
{
  public static void main(String args[])
  {
   Operations m1=new Operations();//creating an object
   { 
      m1.add(21,56);
	  m1.subtract(10,15);
	  m1.multiplication(5,3);
	  m1.division(15,3);
	}
  }
}