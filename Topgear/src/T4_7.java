
public class T4_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int a[][]= {{1,2,3},{7,5,3},{2,5,4}};
         int len=a.length;
         int odd=0,even=0;
         for(int i=0;i<len;i++)
         {
        	 for(int j=0;j<len;j++)
        	 {
        		 if(a[i][j]%2==0)
        		 {
        			 even++;
        		 }
        		 else
        			 odd++;
        	 }
         }
         System.out.println("Even elements: "+even);
         System.out.println("Odd elements: "+odd);

	}

}
