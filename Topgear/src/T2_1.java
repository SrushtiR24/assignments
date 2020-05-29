
public class T2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= {{2,1},{3,2}};
		int b[][]= {{4,7},{3,1}};
		int c[][]=new int[2][2];
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.println(c[i][j]);
			}
		}
		
				
	}

}
