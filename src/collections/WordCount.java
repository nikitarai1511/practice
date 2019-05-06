package collections;

public class WordCount {

	public static void main(String[] args) {
		String str="abc def ghi abc";
		String abc="abc";
		System.out.println(counter(str,abc));
		

	}
	static int counter(String str,String abc)
	{
		int count=0;
		String a[]=str.split(" ");
		for(int i=0;i<a.length;i++)
		{
			if(abc.equals(a[i]))
			{
				count++;
			}
		}
		return count;
	}

}
