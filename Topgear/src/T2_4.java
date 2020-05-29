
public class T2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="sfdrswasfertsd";
		int len=str.length();
		char ch='s';
		int count=0;
		str.charAt(2);
		for(int i=0;i<len;i++)
		{
			if(str.charAt(i)=='s')
			{
				count++;
			}
		}
		System.out.println("Frequency of 's': "+count);
	}

}
