package dsArray;

public class ArrayRotation 
{
	void leftRotate(int arr[],int d,int n)
	{
		for(int i=0;i<d;i++)
		{
			leftRotateOne(arr,n);
		}
	}
	void leftRotateOne(int arr[],int n)
	{
		int i,temp;
		temp=arr[0];
		for(i=0;i<n-1;i++)
		{
			arr[i]=arr[i+1];
			arr[n-1]=temp;
		}
	}
	void printArray(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
	public static void main(String[] args)
	{
		ArrayRotation rotate=new ArrayRotation();
		int arr[]= {1,2,3,4,5,6,7};
		rotate.leftRotate(arr, 2, 7);
		rotate.printArray(arr, 7);
	}
}
