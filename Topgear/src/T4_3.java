
public class T4_3 {

	public static void main(String args[])
	{
		int a[][]= {{2,4},{3,2}};
		int b[][]= {{7,5},{6,4}};
		int len=a.length;
		int c[][]=new int[len][len];
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len;j++)
			{
				c[i][j]=0;
				for(int k=0;k<len;k++)
				{
					c[i][j]=a[i][k]*b[k][j];
				}
			}
		}
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}
//2 4      7 5   14 20 
//3 2      6 4   18 8
