//java program to reverse number
class ReverseNumber   
{ 
     public static void main(String[] args)   //main method
     {  
        int number = 398, reverse = 0;
		
		// run whileloop until num becomes 0
		while(number != 0)   
        {  
           int remainder = number % 10;          // get last digit from num
           reverse = reverse * 10 + remainder;    //formula for reverse number
           number = number/10;                   // remove the last digit from num
        }
		
		/*
		// run forloop until num becomes 0
		for(;number != 0; number /= 10) 
		{
             int digit = number % 10; // get last digit from num
             reverse = reverse * 10 + digit;
        }
		*/
		
         System.out.println("The reverse of the given number is: " + reverse);  //to print the reverse number
     }  
}  

