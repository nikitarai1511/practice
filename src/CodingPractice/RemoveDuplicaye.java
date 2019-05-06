package CodingPractice;

public class RemoveDuplicaye {
	static int removeDuplicate(int n, int[] arr) {
		
		if(n==0||n==1)
		{
			return 1;
		}
		int[] temp=new int[n];
		int j=0;
		for(int i=0;i<n-1;i++) {
			if(arr[i]!=arr[i+1])
			{
				temp[j++]=arr[i];
			}
			
		}
		temp[j++]=arr[n-1];
		
		for (int i=0; i<j; i++) 
            arr[i] = temp[i]; 
       
        return j; 
		
	
	}

	public static void main(String[] args) {
		int[] arr= {1,2,2,3,4,5,6,6};
		int n= arr.length;
		n=removeDuplicate(n,arr);
		
		for (int i=0; i<n; i++) 
	           System.out.print(arr[i]+" "); 
	}

	 
}
