//java program to sort the array
class SortAsc 
{    
    public static void main(String[] args) //main method
	{        
            
        //Initialize array     
        int [] arr = {92,33,-2,43,0,69,-17};     
        int temp = 0;    
            
        //Display elements of original array    
        System.out.println("Elements of original array: "); 
		
        for (int i = 0; i < arr.length; i++) 
		{     
            System.out.print(arr[i] + " ");    
        }    
            
        //Sort the array in ascending order    
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) 
			{     
               if(arr[i] > arr[j]) 
			   {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
          
        System.out.println();    
            
        //Display elements of array after sorting    
        System.out.println("Elements of array sorted in ascending order: ");    
        for (int i = 0; i < arr.length; i++) 
		{     
            System.out.print(arr[i] + " ");    
        }    
    }    
}    