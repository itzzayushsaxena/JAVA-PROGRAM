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
		
}
			
			