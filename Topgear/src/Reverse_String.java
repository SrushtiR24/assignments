import java.util.*;
public class Reverse_String {

	public static void main(String args[])
	{
		String str="Srushti";
		int len=str.length();
		String rev="";
		int i;
		for(i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}
}
