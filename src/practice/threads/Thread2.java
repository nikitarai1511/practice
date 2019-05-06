package practice.threads;

 class Thread2 implements Runnable  {
	public void run() {
		 System.out.println("thred");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread2 t2=new Thread2();
		Thread t1=new Thread(t2);
		t1.start();
	}

}
