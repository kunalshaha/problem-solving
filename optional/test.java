package test;

public class test  {
	
	public static void main(String args[])
	{
		tryone t1 = new tryone("t11");
		tryone t2 = new tryone("t222");
		Thread t11 = new Thread(t1);
		Thread t22 = new Thread(t2);
		
		t22.start();;
		t11.start();
	}
	
}
class tryone implements Runnable{
	private Thread t;

private String tname;

public tryone(String tname) {
	this.tname=tname;
}

@Override
public void run() {
	while(true) {
		try {
		System.out.println(tname);
		Thread.sleep(1000);
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}

public void start()
{
	if(t==null) {
		t=new Thread(this,tname);
		t.start();
		
	}
}

}
