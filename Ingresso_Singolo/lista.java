package dancing;

public class lista {
	private int numInseriti;
	
	public lista(){
		this.numInseriti = 0;
	}
	
	public synchronized void inc() {
		numInseriti++;
	}
	
	public synchronized void dec() {
		numInseriti--;
	}
	
	public synchronized int get() {
		return numInseriti;
	}
}
