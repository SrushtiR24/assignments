
public class T5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String str="Java J2EE Java JSP J2EE ";
		char ch[]=str.toCharArray();
		int l=ch.length;
		int b[]=new int[l];
		for(int i=0;i<l;i++)
		{
			b[i]=1;
			
			for(int j=i+1;j<l;j++)
			{
				if(ch[i]==ch[j])
				{
					b[i]++;
					ch[j]='0';
				}
			}
		}
		for(int i=0;i<b.length;i++)
		{
			if(ch[i]!=' ' && ch[i]!='0')
			System.out.println(ch[i]+":"+b[i]);
		}
	}

}
