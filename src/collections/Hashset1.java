package collections;

import java.util.*;  
class Hashset1{  
 public static void main(String args[]){  
  //Creating HashSet and adding elements  
    TreeSet<String> set=new TreeSet();  
           set.add("One");    
           set.add("Two");    
           set.add("Three");   
           set.add("Four");  
           set.add("");
           set.add("");  
           
           Iterator<String> i=set.iterator();  
           while(i.hasNext())  
           {  
           System.out.println(i.next());  
           }  
 }  
}  
