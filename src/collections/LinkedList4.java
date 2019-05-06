package collections;

import java.util.*;  
public class LinkedList4{  
 public static void main(String args[]){  
  
  HashMap<Integer,String> map=new HashMap<Integer,String>();
  map.put(1, "Monday");
  map.put(2,"Tuesday");
//  for(String s:set)
//  {
//	  System.out.println(s);
//  }
     map.forEach((key,value)->
     {
    	 System.out.println(key+" "+value);
     });
     
 }  
}  