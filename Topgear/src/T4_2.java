
public class T4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[][]= {{1,2},{4,1}};
    int sum=0;
    int Srow,Scol=0;
    for(int i=0;i<a.length;i++)  //col
    {
    	Srow=0;
    	for(int j=0;j<a.length;j++)  //row
    	{
    		Srow=Srow+a[i][j];       // a00+a01+a10+a11
    	}
    	System.out.println("Sum of "+(i+1)+"row: "+Srow);
    }
    
    for(int i=0;i<a.length;i++)  
    {
    	Scol=0;
    	for(int j=0;j<a.length;j++)  
    	{
    		Scol=Scol+a[j][i];      
    	}
    	System.out.println("Sum of "+(i+1)+"col: "+Scol);
    }
}

}
//1 2
//4 1