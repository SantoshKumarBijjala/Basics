package Assignment1;

public class BinarySearch {
	public static int binarySearch(int[]a,int b)
	{
		int first=0;
		int second=a.length-1;
		int mid=(first+second)/2;
		while(first<=second)
		{
			if(a[mid]<b) 
			{
				first=mid+1;
			}
			else if(a[mid]==b)
			{
				return mid;
			}
			else
			{
				second=mid-1;
			}
			mid=(first+second)/2;
		}
		return -1;
	}

	public static void main(String[] args) {
		int []a= {1,2,3,4,5,6,7};
		int ans=binarySearch(a,1);
		System.out.println(ans);
	}

}
