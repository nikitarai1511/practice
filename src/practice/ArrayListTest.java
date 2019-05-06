package practice;



public class ArrayListTest {
	static int MissingNumber(int a[],int n)
	{
		int total;
		total=(n+1)*(n+2)/2;
		for(int i=0;i<n;i++)
		{
			total-=a[i];
		}
		return total;
	}

	public static void main(String[] args) {
		
		int a[]= {1,2,4,4,6};
		int number=MissingNumber(a,5);
		System.out.println("the missing no:" +number);
	}

}
