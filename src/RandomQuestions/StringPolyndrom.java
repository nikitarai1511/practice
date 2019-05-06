package RandomQuestions;

import java.util.Scanner;

public class StringPolyndrom {

	public static void main(String[] args) {
		
		System.out.println("Enter the string");
		String str=new Scanner(System.in).nextLine();
		String b="";
		int size=str.length();
		for(int i=size-1;i>=0;i--)
		{
			b=b+str.charAt(i);
		}
		if(str.equalsIgnoreCase(b))
		{
			System.out.println("Polyndrom");
		}
		else
		{
			System.out.println("not");
		}
		System.out.println(b);

	}

}
