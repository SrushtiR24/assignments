
public class T3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= {{1,0,0},{0,1,0},{0,0,1}};
	    int len=a.length;
	    int flag=0;
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len;j++)
			{
				if(i==j && a[i][j]==1)
				{
					flag=1;
					break;
				}
				if(i!=j && a[i][j]==0)
				{
					flag=1;
					break;
				}
			}
		}
		if(flag==1)
		{
			System.out.println("Matrix is identity matrix");
		}
		else
		{
			System.out.println("Matrix is not an identity matrix");

		}
	}

}
