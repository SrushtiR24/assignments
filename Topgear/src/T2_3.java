
public class T2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= {{2,1},{3,7}};
		int c[][]=new int[2][2];
        for(int i=0;i<2;i++)
        {
        	for(int j=0;j<2;j++)
        	{
        		c[i][j]=a[j][i];
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
