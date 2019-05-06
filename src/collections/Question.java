package collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 HashMap<Integer,String> HM =new HashMap<Integer,String>();
 HM.put(1,"Sunday");
 HM.put(2,"Monday");
 HM.put(3,"Tuesday");
 HM.put(4,"Wednesday");
  TreeMap<Integer,String> TM=new TreeMap<Integer,String>(Collections.reverseOrder());
  TM.putAll(HM);
  TM.forEach((key,value)->
  {
	  System.out.print(key+""+value);
	  
  });
 
	}

}
