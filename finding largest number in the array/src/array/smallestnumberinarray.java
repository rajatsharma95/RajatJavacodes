package array;

import java.util.Scanner;

public class smallestnumberinarray {

	public static void main(String[] args)
	{
		 System.out.println("How many elements you want to enter");
		 Scanner sn=new Scanner(System.in);
		 int n=sn.nextInt();
		 System.out.println("Enter the Elements");
		 int arr[]=new int[n];
		 int i,j=0,temp;
		 for(i=0;i<n;i++)
		 {
			 arr[i]=sn.nextInt();
		 }
		 for(i=0;i<n;i++)
		 {
			 for(j=i+1;j<n;j++)
			 {
				 if(arr[i]<arr[j])
				 {
					 temp=arr[i]; 
					 arr[i]=arr[j];
					 arr[j]=temp;
				 }
			 }
		 }System.out.println("smallest no. is " +arr[j-1]);

}
}


