package dancing;

public class gestore {
	
	public static void main(String[] args) {
		lista listadisco = new lista()
;		discoteca disco = new discoteca(listadisco);
		
		long delta = System.currentTimeMillis();
		
		while(true) {
			
			if(System.currentTimeMillis() - delta >= 1000) { 
				delta = System.currentTimeMillis();
				System.out.println(disco.getPersone());
			}
			if(System.currentTimeMillis() - delta >= 950) { 
				disco.entrata(new persona(listadisco));						}
		}

	}
}
