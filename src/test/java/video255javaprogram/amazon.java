package video255javaprogram;

import java.util.ArrayList;

public class amazon {

	public static void main(String[] args)
	{
      //Print unique number
		int a[]= {4,5,5,5,4,6,6,9,4,3};
		ArrayList al= new ArrayList();
		for (int i=0;i<a.length;i++)
		{
			int k=0;
			if(!al.contains(a[i]))
			{
				al.add(a[i]);
				k++;
				for(int j=i+1;j<a.length;j++)
				{
				   if(a[i]==a[j])	
				       {
				            k++;	 
				       }
			    }
				System.out.println(a[i]+" is repeated "+k+" times");
				if(k==1)
				{
					System.out.println("**************************************");
					System.out.println("Unique number is :"+a[i]);
				}
			}
		}
		
		
		
	}

}
