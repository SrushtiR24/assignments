
public class T5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={12,42,1,65,24};
		int large=-99999;
		int SecLarge=-99999;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>large)
			{
				large=a[i];
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>SecLarge && a[i]!=large)
			{
				SecLarge=a[i];
			}
		}
		System.out.println(SecLarge);

	}

}
