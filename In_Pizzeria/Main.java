package Pizza;

public class Main {
	public static void main(String[] args) {
		Buffer ordini = new Buffer();
		Buffer pizzeDentro = new Buffer();
		Buffer pizzeFuori = new Buffer();
		Buffer consegne = new Buffer();
		Sala sala = new Sala();
		
		for(int i = 0; i < 3; i++) {
			new Thread(new Cameriere(sala, ordini, pizzeDentro, pizzeFuori, consegne, i)).start();
		}

		int ordiniDaFare = sala.getNum();

		new Thread(new Pizzaiolo(pizzeDentro, pizzeFuori, ordiniDaFare)).start();
		
		for(int i = 0; i < 20; i++) {
			new Thread(new Tavolo(i, ordini, pizzeDentro, sala)).start();
		}
		
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {}
		System.out.println("Persone in sala: " + sala.getPersone());

		
				
	}
}