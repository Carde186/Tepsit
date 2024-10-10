package Pizza;

public class Tavolo implements Runnable{
	private int id;
	private Buffer bOrdini;
	private Buffer pizzePronte;
	private int persone;
	private Ordine ordine;
	private Sala sala;
	
	public Tavolo(int id, Buffer bOrdini, Buffer pizzePronte, Sala sala) {
		this.id = id;
		this.bOrdini = bOrdini;
		this.pizzePronte = pizzePronte;
		persone = (int) (Math.random() * 5 + 1);
		ordine = new Ordine(this.id, persone);
		this.sala = sala;
	}
	
	public void run() {	
		
			bOrdini.push(ordine);
			sala.inc();
			sala.add(persone);
			System.out.println("Tavolo " + id + ": ha ordinato");
			
			while(pizzePronte.popID(id) == null) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {}
			}
			sala.dec();
			sala.dec(persone);
			for(int i = 0; i < persone; i++) {
				pizzePronte.popID(id);
				System.out.println("Tavolo " + id + ": ha ricevuto le pizze");
			}
		
		
		
	}
	
}
