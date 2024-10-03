package produttore_consumatore;
import java.util.Stack;

public class buffer implements Runnable{
	int elementi,max;
	
	Stack<Integer> stack;		//crea una coda
	public buffer(int n) {		//costruttore
		stack = new Stack<>();	//crea una nuova coda
		elementi = 0;
		max = n;
	}
	
	
	synchronized void push(int valore) { //metodo push
		
		while (elementi < max) {		//controlla se gli elementi nello stack sono < del massimo. se lo sono, li pusha dentro, altimenti aspetta che i valori siano minori del massimo
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		stack.push(valore);
		elementi++;
		notify();						//chiama il prossimo a fare la push. quello dopo sta dormendo
	}
	
	synchronized int pop() {			//elimina gli elementi dalla coda
		while (elementi > 0) {			//controlla che ci siano elemnti. se ci sono li prende, altrimenti no	
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		elementi--;
		notify();
		return stack.pop();
	}

	public void run() {
	}
}