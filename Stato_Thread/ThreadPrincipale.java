package TH;


public class ThreadPrincipale implements Runnable{ //controllo stato di tutti i thread
	
	Conserva[] temp;
	Thread[] tt;
	public ThreadPrincipale(Conserva arr[], Thread[] arr2){
		temp = arr;
		tt = arr2;
	}
	
	public void run() {
		Boolean vivi = true;	//mi dice se i thread creati sono vivi (anche solo 1)
		while (vivi) {
			vivi = false;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			for(int i = 0; i < temp.length; i++) {
				if(tt[i].isAlive()) {			//controllo se è vivo
					vivi = true;
					System.out.println(tt[i].getId() + "è vivo" + temp[i].getNum().getCounter()); //stampo
				}else {
					System.out.println(tt[i].getId() + "è morto"); 	//stampo
				}
			}
			
			
			
		}
		
		
	}

}
