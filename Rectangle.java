//PROGRAM TO FIND AREA AND PERIMETER OF RECTANGLE USING CONSTRUCTOR
class Rectangle
{
   int area,length,breadth,perimeter;
   Rectangle( )    //DEFAULT CONSTRUCTOR
   {
     length=10;
     breadth=15;
    }
	/*
   Rectangle(int l, int b)  //PARAMETERIZED CONSTRUCTOR
   {
     length=l;
     breadth=b;
   }
   */
   
    void area( )        //AREA FORMULA
   {    
       area = length*breadth;
       System.out.println(""+area);
    }
   void perimeter()     //PERIMETER FORMULA
   {
       perimeter = 2*(length+breadth);                  
	   System.out.println(""+perimeter);
   }
	
   public static void main(String args[ ]) //MAIN METHOD
   {
      Rectangle r1=new Rectangle( );    //DEFAULT CONSTRUCTOR IS CALLED

      //Rectangle r2=new Rectangle(15,15);  //PARAMETERIZED CONSTRUCTOR
	
	//with default constructor
      System.out.println("Area of rectangle is: "); 
      r1.area( );
	  System.out.println("Perimeter of rectangle is: "); 
      r1.perimeter( );
	  
	  /*
	  //with parameterized constructor 
      System.out.println("Area of rectangle is: ");
      r2.area( );
      System.out.println("Peimeter of rectangle is: ");
      r2.perimeter( );
	  */
   }
}


