package produttore_consumatore;

public class main {

	public static void main(String[] args) {
		buffer buffer = new buffer(10);
		produttore produttore = new produttore(buffer);
		consumatore consumatore = new consumatore(buffer);
		
		Thread consu = new Thread(consumatore);
		Thread produ = new Thread(produttore);
		
		produ.start();
		consu.start();
	}

}
