package TH;

public class Conserva implements Runnable { 	//classe che incrementa 
	Numeri conservatore;
	
	public Conserva(Numeri num) {		//gli passo l'oggetto "num" che gli servono 
		conservatore = num;
	}
	
	public void run() {
		int x = conservatore.getX();
		while(conservatore.AumentoCounter() != x) { //controllo se counter è diverso da X	 
		}
	}
	
	public Numeri getNum() {
		return conservatore;
	}

}
