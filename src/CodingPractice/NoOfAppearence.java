package CodingPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class NoOfAppearence {

	
	 static void duplicateNo(String str)
	{
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		String[] strng=str.split(" ");
		for(String s:strng)
		{
			if(hm.containsKey(s))
			{
				hm.put(s,hm.get(s)+1);
			}
			else
			{
			hm.put(s,1);
			}
		}
		Iterator<String> itr=hm.keySet().iterator();
		while(itr.hasNext())
		{
			String temp=itr.next();
			if(hm.get(temp)>1)
			{
				System.out.println("the word "+temp+" appared "+hm.get(temp));
			}
		}
		
	}
	 static void duplicateChar(String string) {
		HashMap<Character,Integer> hm1=new HashMap<>();
		for(char c:string.toCharArray())
		{
		
		if(hm1.containsKey(c))
		{
			hm1.put(c, hm1.get(c)+1);
		}
		else
		{
		hm1.put(c,1);
		}
		
	}
		Iterator<Character> itr1=hm1.keySet().iterator();
		while(itr1.hasNext())
		{
			char ch=itr1.next();
			if(hm1.get(ch)>1)
			{
				System.out.println("the word "+ch+" appared "+hm1.get(ch));
			}
		}
	 }
	public static void main(String[] args) {
	duplicateNo("I am am Repeating number number");
	duplicateChar("javaee");

	}
	

}
