package dancing;

public class lista {
	private int numInseriti;
	
	public lista(){
		this.numInseriti = 0;
	}
	
	public synchronized void inc(int N) {
		numInseriti += N;
	}
	
	public synchronized void dec(int N) {
		numInseriti -= N;
	}
	
	public synchronized int get() {
		return numInseriti;
	}
}
