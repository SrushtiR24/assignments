import java.util.*;
public class Reverse_array {

	public static void main(String args[])
	{
		int a[]= {2,8,7,5,3,9};
		int i,j=0;
		int l=a.length;
		int b[]=new int[l];
		  for(i=l-1;i>=0;i--) 
		  { 
		  b[j]=a[i]; 
		  j++; 
		  }
		  for(int p=0;p<l;p++)
		  {
			  System.out.println(b[p]);
		  }
}
}