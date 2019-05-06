package collections;

import java.util.*; 

class GFG { 
    public static void main(String args[]) 
    { 
        // Map to store the elements 
        Map<String, String> treemap =  
               new TreeMap<String, String>(Collections.reverseOrder()); 
  
        // Put elements to the map 
        treemap.put("1", "Sunday"); 
        treemap.put("2", "Monday"); 
        treemap.put("3", "Tuesday"); 
        treemap.put("4", "Wednesday"); 
        treemap.put("5", "thursday"); 
  
        Set set = treemap.entrySet(); 
        Iterator i = set.iterator(); 
  
        // Traverse map and print elements 
        while (i.hasNext()) { 
            Map.Entry me = (Map.Entry)i.next(); 
            System.out.print(me.getKey() + ": "); 
            System.out.println(me.getValue()); 
        } 
    } 
} 