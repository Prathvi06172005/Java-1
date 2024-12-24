class MyRunnable implements Runnable{
	@Override
	public void run() {
		try {
			Thread.sleep(500);
			System.out.println("Thread"+Thread.currentThread().getId()+" is running");}
		catch (InterruptedException e){
			e.printStackTrace();}}}

public class TestMainThread{
	public static void main(String[] args) {
MyRunnable mr=new MyRunnable();
                Thread t1=new Thread(mr);
		Thread t2=new Thread(mr);
		Thread t3=new Thread(mr);
		t1.start();
		t2.start();
		t3.start();}}