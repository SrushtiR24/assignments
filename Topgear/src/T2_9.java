
public class T2_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch='s';
		String str="Srushti";
		//to convert character to string
		String res=Character.toString(ch);
		
		//to convert string to character
		char[] a=str.toCharArray();
		System.out.println("Converted char to string :"+res);
		System.out.println("Converted string to char :");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
