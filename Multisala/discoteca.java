package dancing;

public class discoteca {
	private lista listaDiscoteca;
	private int numeroPiste;
	
	public discoteca(lista listaDiscoteca) {
		this.listaDiscoteca = listaDiscoteca;
		this.numeroPiste = listaDiscoteca.getLunghezza();
	}
	
	public void entra(gruppo i) {
		Thread th = new Thread(i);
		th.start();
	}
	
	public void getPersone() {
		for(int i = 0; i < numeroPiste; i++)
			System.out.print("Lista " + i + " -> " + listaDiscoteca.get(i) + " ");
		System.out.println();
	}

}
