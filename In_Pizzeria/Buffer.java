package Pizza;
import java.util.LinkedList;
    
public class Buffer{
	private LinkedList<Ordine> buff;
	
	public Buffer() {
		buff = new LinkedList<Ordine>();
	}
	
	public synchronized void push(Ordine ordine) {
		buff.add(ordine);
	}
		
	public synchronized Ordine pop() {
		while(buff.size() == 0) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		notify();
		
		return buff.remove();
	}
	
	public synchronized Ordine popID(int ID) {
		while(buff.size() == 0) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		for(int i = 0; i < buff.size(); i++) {
			Ordine item = buff.get(i);
			if(item.getID() == ID) {
				buff.remove(item);
				notify();
				return item;
			}
		}
		notify();
		return null;
	}
	
}