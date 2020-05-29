
public class T4_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int a[][]= {{1,1,1},{2,5,8},{1,2,3}};
		 int l=a.length;
		 int b[][]=new int[l][l];
         for(int i=0;i<l;i++)
         {
        	 for(int j=0;j<l;j++)
        	 {
        		 b[i][j]=a[j][i];
        	 }
         }
         for(int i=0;i<l;i++)
         {
        	 for(int j=0;j<l;j++)
        	 {
        		 System.out.print(b[i][j]);
        	 }
        	 System.out.println();
         }
	}

}
