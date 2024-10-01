package dancing;

public class gestore {
	public static void main(String[] args) {
		lista listaDisco = new lista(4);
		discoteca disco = new discoteca(listaDisco);
		
		long delta = System.currentTimeMillis();
		
		while(true) {
			long currentTime = System.currentTimeMillis();
			if(currentTime - delta >= 500) {
				delta = System.currentTimeMillis();
				disco.getPersone();
			}
			if(currentTime - delta >= 100)
				disco.entra(new gruppo(10, listaDisco));
		}
	}

}
