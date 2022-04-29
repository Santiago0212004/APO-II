package main;

public class Cronometro extends Thread {
	
	public int crono = 0;
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(crono);
			crono++;
			
			
			if(crono%10 == 0) {
				Cronometro next = new Cronometro();
				next.start();
				break;
			}
		}
		
		
		
	}
	
}
