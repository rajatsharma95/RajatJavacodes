package array;

import java.util.Scanner;

public class largest {
	public static void main(String[] args)
	{
		 System.out.println("How many elements you want to enter");
		 Scanner sn=new Scanner(System.in);
		 int n=sn.nextInt();
		 System.out.println("Enter elements");
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
				 if(arr[i]>arr[j])
				 {
					 temp=arr[i]; 
					 arr[i]=arr[j];
					 arr[j]=temp;
				 }
			 }
		 }System.out.println("largest no. is " +arr[j-1]);// after the loop exit when the condition(j<n) fails, means jb loop for(j=0;j<n;j++) exit hoga tab j ki value [3+1]=4 hi rahegi jis kaaran loop exit hoga or isiliye that will print the value at a[4] because n ki value 4 hai islie ye a[4] print karega pr array a[3] tak hai islie hmne a[j-1] kiya taaki a[4] value print na ho and only the largest value will be printed i.e a[j-1] or a[3] 

}
}