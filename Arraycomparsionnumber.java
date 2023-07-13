//java program to print largest and smallest number in array
class Arraycomparsionnumber
{
   public static void main(String args[]) //main method
   {
     int arr[]= {11,14,29,2,72,99}; //assign the values
	 int large = arr[0];
	 int small = arr[0];
	 for(int i=0;i<arr.length;i++)
	 {
	 if(large<arr[i]) //to find large number
	 {
	    large = arr[i];
	  }
	  else if(small>arr[i]) //to find smallest number
	 {
	    small = arr[i];
	  }
	 }
	 System.out.println("The largetest number is:" +large);
	System.out.println("The smallest number is:"+small);
	}
}