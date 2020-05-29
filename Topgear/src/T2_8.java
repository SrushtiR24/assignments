
public class T2_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,4,7};
		int b[]= {3,6,8};
		int l1=a.length;
		int l2=b.length;
		int c[]=new int[l1+l1];
		for(int i=0;i<l1;i++)
		{
			c[i]=a[i];
		}
		int j=l1;
		for(int i=0;i<l2;i++)
		{
			c[j]=b[i];
			j++;
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
	}

}
