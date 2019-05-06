package collections;

import java.util.*;
class HashSetExample{
public static void main(String Args[])
{
  HashMap<Integer,String> hm=new HashMap<Integer,String>();
  hm.put(105,"Mekhk");
  hm.put(102,"She");
  System.out.println("Iterating or looping map using keySet Iterator");
  TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
  tm.putAll(hm);
//  for(Map.Entry<Integer,String> sort:tm.entrySet())
//  {
//	  System.out.println(sort.getKey()+""+sort.getValue());
//  }
  
  tm.forEach((key,value)->{
	  System.out.println(key+""+value);
  });
	  
 
}
  
}
