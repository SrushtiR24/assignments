
public class T5_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {14,0,5,2,0,3,0};                                  
		int len=a.length;
		for(int i=0;i<len;i++)
		{
			if(a[i]==0)
			{
				for(int j=i;j<len-1;j++)
				{
				a[j]=a[j+1];
		     	}
				a[len-1]=0;
			}
		}
		for(int i=0;i<len;i++)
		{
			System.out.println(a[i]);
		}
	}

}
