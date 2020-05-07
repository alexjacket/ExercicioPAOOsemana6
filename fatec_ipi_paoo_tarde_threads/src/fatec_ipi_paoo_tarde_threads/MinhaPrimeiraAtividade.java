package fatec_ipi_paoo_tarde_threads;

public class MinhaPrimeiraAtividade implements Runnable {
	
	//está implementando, "firmando o contrato" com a api runnable para threads
	@Override
	public void run() {
		System.out.println("queremos que seja executado em uma thread diferente da principal");
	}
	
}
