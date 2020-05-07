package fatec_ipi_paoo_tarde_threads;

public class MinhaPrimeiraThread extends Thread{
	public void run () {
		System.out.println("estou sendo executado por uma thread diferente da principal, veja: " + Thread.currentThread().getName());
	}
	
	//fazer thread assim é meio ruim. Você desperdiça a herança, e não pode herdar de mais ninguém, só do thread. 
	//por isso, se utilziará outra interface, a "runnable".
}
