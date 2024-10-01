package dancing;

public class persona implements Runnable {
	int timer;
	lista listaDisco;
	
	public persona(lista listadisco) {
		timer = (int) ((Math.random() * (1000 - 100)) + 100);
		this.listaDisco = listadisco;
	}
	
	
	public void run() {
		listaDisco.inc();
		try {
			Thread.sleep(timer);
		} catch (InterruptedException e) {}
		listaDisco.dec();
	}
	
	
	
}
