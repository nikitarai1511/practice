package collections;

import java.util.Set;
import java.util.TreeSet;

 class SetExample {
	public static void main()
	{
		TreeSet<String> set= new TreeSet<String>();
		set.add("Nikita");
		set.add("alok");
		Set<String> result = set.stream().filter(ab->"Nikita".equals(ab))
		
	}
	

}
