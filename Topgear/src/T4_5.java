
public class T4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[][]= {{1,2,3},{7,5,3},{2,5,4}};
    int l=a.length;
    int b[][]=new int[l][l];
    
    for(int i=0;i<l;i++) {
    	for(int j=0;j<l;j++)
    	{
    		if(i>=j)
    		{
    			b[i][j]=a[i][j];
    		}
    		else
    		{
    			b[i][j]=0;
    		}
    	}
    }
    for(int i=0;i<l;i++)
    {
    	for(int j=0;j<l;j++)
    	{
    		System.out.print(b[i][j]+" ");
    	}
    	System.out.println();
    }
	}

}
