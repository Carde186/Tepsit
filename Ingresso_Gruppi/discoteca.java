package dancing;

public class discoteca {
	
	private lista listaDisco;
	
	public discoteca(lista listaDiscoteca) {
		this.listaDisco = listaDiscoteca;
	}
	
	public void entrata(gruppo i) {
		Thread d = new Thread(i);
		d.start();
	}
	
	public int getPersone() {
		return listaDisco.get();
	}
}
