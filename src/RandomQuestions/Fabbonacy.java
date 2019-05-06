package RandomQuestions;

import java.util.Scanner;

public class Fabbonacy {

	public static void main(String[] args) {
		System.out.println("Enter number upto which Fibonacci series to print: ");
int number=new Scanner(System.in).nextInt();
System.out.println("Fibonacci series upto " + number +" numbers : ");

int n1=0,n2=1,n3,fabbonacy;
System.out.print(n1+" "+n2);
for(int i=2;i<number;i++)
{
	n3=n1+n2;
	System.out.print(" "+n3);
	n1=n2;
	n2=n3;
	
	
}

	}

}
