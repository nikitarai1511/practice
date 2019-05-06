package practice.threads;

public class Student implements Comparable<Student>{
	String name;
	int id;
	int percentage;
	public Student(String name, int id, int percentage) {
		super();
		this.name = name;
		this.id = id;
		this.percentage = percentage;
	}
	public Student(int i, String string, int percentage2) {
		// TODO Auto-generated constructor stub
	}
	public int compareTo(Student s)
	{
		return this.id - s.id;   
	}
	public String toString()
    {

        return "{ID : "+id+", Name : "+name+", Percentage : "+percentage+"}";
    }

}
