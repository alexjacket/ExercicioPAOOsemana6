package fatec_ipi_paoo_tarde_threads;

public class MinhaPrimeiraThread extends Thread{
	public void run () {
		System.out.println("estou sendo executado por uma thread diferente da principal, veja: " + Thread.currentThread().getName());
	}
	
	//fazer thread assim � meio ruim. Voc� desperdi�a a heran�a, e n�o pode herdar de mais ningu�m, s� do thread. 
	//por isso, se utilziar� outra interface, a "runnable".
}
