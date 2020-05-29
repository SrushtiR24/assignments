
public class power_of_2 {

       static boolean PowerOfTwo(int i) 
		    { 
		        if (i == 0) 
		            return false; 
		          
		        while (i != 1) 
		        { 
		            if (i % 2 != 0) 
		                return false; 
		            i = i / 2; 
		        } 
		        return true; 
		    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 if (PowerOfTwo(1)) 
	            System.out.println("Yes"); 
	        else
	            System.out.println("No"); 
	  
	        if (PowerOfTwo(98)) 
	            System.out.println("Yes"); 
	        else
	            System.out.println("No"); 
	}

}
