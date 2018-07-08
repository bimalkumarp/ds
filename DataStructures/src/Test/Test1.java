package Test;

public class Test1 implements Runnable{

	int x=1;
	int y=1;
	@Override
	public void run() {
		synchronized(this){
			for(int i=0;i<1000;i++){
				System.out.println(i);
			}
		}
		
		
	}
	
	
	public static void main(String[] args) {
		Test1 test=new Test1();
		(new Thread(test)).start();
		(new Thread(test)).start();
	}
	
	
	
	
	
	
}