package practice.threads;

public class Threads1 extends Thread{
public void run()
{
	System.out.println("thread is running");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Threads1 t1=new Threads1();	
		t1.start();
	}

}
