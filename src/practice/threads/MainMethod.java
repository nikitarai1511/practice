package practice.threads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainMethod {

	public static void main(String[] args) {
		
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(101,"Vijay",23));  
		al.add(new Student(106,"Ajay",27));  
		al.add(new Student(105,"Jai",21)); 
	System.out.println(al);
	Collections.sort(al);  
	for(Student st:al){  
	System.out.println(st.id+" "+st.name+" "+st.percentage);  
	}

         

	}

}
