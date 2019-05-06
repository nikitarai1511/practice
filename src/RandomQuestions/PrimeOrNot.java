package RandomQuestions;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		int num=new Scanner(System.in).nextInt();
		int flag=0;
		int sqrt=(int) (Math.sqrt(num)+1);
		for(int i=2;i<sqrt;i++)
		{
			if(num==0||num==1)
			{
				System.out.println(num+" is not prime number");      
			}
			else
			{
			if(num%i==0)
			{
				flag =1;
				System.out.println("Number is not prime");
				break;
				
			}
			}
			
			if(flag==0)
			{
				System.out.println(num+" is prime number");  
			}
			
		}

	}

}
