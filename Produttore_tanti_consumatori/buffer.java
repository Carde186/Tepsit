package piuDiUno;

import java.util.LinkedList;
import java.util.Queue;

public class buffer {
	Queue<Integer> lista;
	
	buffer(){ 
		 lista = new LinkedList<>();
	}
	
	public void push(int val) {
		lista.add(val);
	}
	
	
	public synchronized int pop() {
		
		/* controllo lista vuota list.isempty() non va
		 * 						 catch(NoSuchElementException) not found
		 */ 7
		
		return lista.remove();
		
	}
}
