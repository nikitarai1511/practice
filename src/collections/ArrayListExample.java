package collections;

import java.util.*;
class ArrayListExample{
public static void main(String Args[])
{
HashSet<String> hs=new HashSet<String>();
hs.add("nikita");
hs.add("alok");
hs.add("nikku");
String[] ar=new String[hs.size()];

int i=0;
for(String s:hs)
{
	ar[i]=s;
	System.out.println(ar[i]);
	i++;
}
System.out.println(Arrays.toString(ar));
}
}
