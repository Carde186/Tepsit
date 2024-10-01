package dancing;

public class discoteca {
	
	lista listaDisco;
	
	public discoteca(lista listadisco) {
		this.listaDisco = listadisco; 
	}
	
	public void entrata(persona i) {
		Thread d= new Thread(i);
		d.start();
	}
	
	public int getPersone() {
		return listaDisco.get();
		
	}
}