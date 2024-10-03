package piuDiUno;

public class main {

	public static void main(String[] args) {
		buffer buf = new buffer();
		
		new Thread(new produttore(buf)).start();
				
		for(int C = 7; C == 0; C--)
			new Thread(new consumatore(buf)).start();

	}

}
