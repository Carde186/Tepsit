package Pizza;

public class Sala {
	private int tavoli;
	private int PPTOT;	//persone totali
	
	public Sala() {
		tavoli = 0;
		PPTOT = 0;
	}
	
	public synchronized void inc() {
		tavoli++;
	}
	
	public synchronized void dec() {
		tavoli--;
	}
	
	public synchronized void add(int num) {
		PPTOT += num;
	}
	
	public synchronized void dec(int num) {
		PPTOT -= num;
	}
	
	public synchronized int getPersone() {
		return PPTOT;
	}
	
	public synchronized int getNum() {
		return tavoli;
	}
	
	public synchronized boolean isEmpty() {
		if(tavoli == 0) {
			return true;
		}else {
			return false;
		}
	}

}