package practice;

import java.util.Scanner;

class Student{  

	
		 public static void main(String args[]){  
		   System.out.println("Enter the letter");
		   Scanner s=new Scanner(System.in);
		   String s1="Nikita Rai";
		   
		   //String s2="";
		   //char ch[]=s1.toCharArray();
		   //for(int i=ch.length-1;i>=0;i--)
		   //{
			//   s2 +=ch[i];
		  // }
		   //System.out.println(s2);
		   char ch[]=s1.toCharArray();  
		    String rev="";  
		    for(int i=ch.length-1;i>=0;i--){  
		        rev+=ch[i];  
		    }  
		    System.out.println( rev); 
		   
		  
		 }  
		}  
 
		
