package Pizza;

public class Pizzaiolo implements Runnable{
	private Buffer pizzeDentro;
	private Buffer pizzeFuori;
	private int ordini;
	
	public Pizzaiolo(Buffer pizzeDentro, Buffer pizzeFuori, int ordini) {
		this.pizzeDentro = pizzeDentro;
		this.pizzeFuori = pizzeFuori;
		this.ordini = ordini;
	}
	
	public void run() {
		while(ordini != 20) {
			pizzeFuori.push(pizzeDentro.pop());
			ordini++;
			System.out.println("Ordine " + ordini + " Completato");
		}
	}
}
