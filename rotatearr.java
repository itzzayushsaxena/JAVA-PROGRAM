import java.util.Scanner;

class rotatearr
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
			for(int k=0;k<size;k++)
			{
			System.out.print(arr[k]+" ");
			}
			System.out.println(" ");
		}
	}
		

