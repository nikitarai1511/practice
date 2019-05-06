package collections;


import java.util.ArrayList;
import java.util.List;

class Book
{
	int id;
	String name,author,publisher;
	int quantity;
	public Book(int id,String name,String author,String publisher,int quantity)
	{
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
	}
	
}
public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book> list=new ArrayList<Book>(); 
		Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
		Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
		Book b3=new Book(103,"Operating System","Galvin","Wiley",6);  
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.forEach(a->{
			System.out.println(a.id+" "+a.name+" "+a.author+" "+a.publisher+" "+a.quantity);
		});

	}

}
