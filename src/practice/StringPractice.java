package practice;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

// TODO Auto-generated method stub
		class StringPractice{  
			public static void main(String args[]) throws ParseException {
				String tmp = "13567";
			      int result = 0;
			      for (int i =0; i < tmp.length(); i++){
			          result = result * 10 + tmp.charAt(i) - '0';

			      }

			      System.out.println(result);
			 
			} 
		}
