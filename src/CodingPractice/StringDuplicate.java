package CodingPractice;

import java.util.HashSet;

public class StringDuplicate {

	public static void main(String[] args) {
		String str="IIAAmk";
		
		char[] ch=str.toCharArray();
		HashSet<Character>duplicate=new HashSet();
		HashSet<Character> hs=new HashSet();
		for(char c:ch)
		{
			if(!hs.add(c))
			{
				
				duplicate.add(c);
			}
		}
System.out.println(duplicate);
	}

}
