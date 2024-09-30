package TH;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("T:");
		int t = scanner.nextInt();
		
		System.out.println("N:");
		int n = scanner.nextInt();
		scanner.close();
				
		Conserva[] num = new Conserva[t];	//
		Thread[] paolo = new Thread[t];		//assegna un thread a far runnare un processore 
		
		ThreadPrincipale sorbillo = new ThreadPrincipale(num, paolo);
		Thread paolo2 = new Thread(sorbillo);
		paolo2.start();
		
		for(int i = 0; i < t; i++) {
			num[i] = new Conserva(new Numeri(n));			
			paolo[i] = new Thread(num[i]);
			paolo[i].start();
			
			
		}
		
		
	}

}
