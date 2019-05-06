package RandomQuestions;

import java.util.Scanner;

public class NumberPolyndrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enetr the number");
		int num= new Scanner(System.in).nextInt();
		int rev=0;
		int polyndrom=num;
		int reminder=0;
		while(num!=0)
		{
			reminder=num%10;
			System.out.println(reminder);
			rev=rev*10+reminder;
			System.out.println(rev);
			num=num/10;
		}
		if(rev==polyndrom)
		{
			System.out.println("Polyndrom");
		}
		else
		{
			System.out.println("Not");
		}
	}

}
