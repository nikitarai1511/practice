package practice.threads;

public class Thread3 extends Thread {
 public void run(){
	 for(int i=0;i<5;i++)
	 {
		 try
		 {
			 Thread.sleep(500);
		 }
		 catch(InterruptedException e){System.out.println(e);} 
			 System.out.println(i);
		 }
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Thread3 t3=new Thread3();
		Thread3 t4=new Thread3();
		t3.start();
		t4.start();
	}

}
