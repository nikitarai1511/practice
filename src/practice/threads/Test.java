package practice.threads;

import java.util.LinkedList;

class Test{
	public static void main(String args[])
	{
		LinkedList<String> list=new LinkedList<String>();
		list.add("Nikita");
		list.add("Alok");
		list.add("Nikita");
		list.add("nikki");
		list.add("Nikita");
		System.out.println(list.indexOf("Nikita"));
	}
}