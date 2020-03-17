# rotatearray.java
java program for take array from user and then ask user for index from where they want to rotate array.  

import java.util.Scanner;
class rotate{
	void rotate(int arr[], int pos, int size){
		for(int i=0;i<size-(pos-1);i++)
		{
			int j,last;
			last=arr[arr.length-1];
			for(j=arr.length-1;j>0;j--)
			{
				arr[j]=arr[j-1];
			}
			arr[0]=last;
		}
	}
		
}
			
			

class first
{ 
	public static void main(String args[]) 
	{ 
		int n;
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter no. of element you want in array:");
		n = obj.nextInt();
		int array[] = new int[n];
    		System.out.print("Enter array values:");
		for(int i=0;i<n;i++)
		{
			array[i]=obj.nextInt();
		}
		System.out.println("Enter the position from where you want to rotate array:");
		int position = obj.nextInt();
		rotate arr = new rotate();
		arr.rotate(array,position,n);
		for(int i=0;i<n;i++)
		{
			System.out.print(array[i]+" ");
		}
	}
}
