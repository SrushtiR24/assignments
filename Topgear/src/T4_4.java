
public class T4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= {{2,4,3},{7,1,2},{4,3,5}};
		int b[][]= {{2,4,3},{7,1,2},{4,3,5}};
		int flag=0;
		int l1=a.length;
		int l2=b.length;
		if(l1!=l2)
		{
			flag=0;
		}
		else
		{
			for(int i=0;i<l1;i++)
			{
				for(int j=0;j<l1;j++)
				{
					if(a[i][j]==b[i][j])
					{
						flag=1;
					}
					else
						flag=0;
						break;
				}
			}
		}
		if(flag==1)
		{
			System.out.println("Both Matrix are equal");
		}
		else
		{
			System.out.println("Both Matrix are not equal");

		}
	}

}
