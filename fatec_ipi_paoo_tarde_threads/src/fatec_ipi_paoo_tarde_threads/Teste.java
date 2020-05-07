package fatec_ipi_paoo_tarde_threads;

public class Teste {

	
	//utilizando este teste, a gente só usa a linha do main, não dispara a thread alternativa. usando o "thread.run" 
	public static void main(String[] args) {
	MinhaPrimeiraThread thread = new MinhaPrimeiraThread();
	//thread.run(); chamar o metodo 'run' nao cria uma nova thread
	thread.start(); //ele cria uma nova thread e chama os metodos nela. O metodo run se torna praticamente o "main" daquela classe MinhaPrimeiraThread!
	System.out.println("no main: " + Thread.currentThread().getName());

	}

}

