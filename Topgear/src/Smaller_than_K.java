
public class Smaller_than_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int a[]= {3,5,7,2,3};
		int len=a.length;
		int k=7;                        //to find greater number but smaller than k;
		int big=0,res=0;
		for(int i=0;i<len-1;i++)
		{                                         //3<5=big=5 & 7>5=res=5
			if(a[i]<a[i+1] && a[i+1]>big)         //5<7=big=7 & 7>7...false... res=5
			{                                       //7<2...false.. big=7 & res=5
				big=a[i+1];         
				if(k>big)
				{
					res=big;
				}
			}
		}
		System.out.println(res);
	}

}
