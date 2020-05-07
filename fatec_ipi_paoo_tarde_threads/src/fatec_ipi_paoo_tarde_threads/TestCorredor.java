package fatec_ipi_paoo_tarde_threads;

public class TestCorredor {

	public static void main(String[] args) {
		//é injusto os corredores iniciarem em ordem. O ideal seria se todos fossem ao mesmo tempo. Tem como esperar o main terminar para executar os disparos de threads:
		//por isso criareu uma 'main thread' e editarei algumas de suas regras:
		Thread mainThread = Thread.currentThread();
		Thread corredor1 = new Thread (new Corredor(mainThread, 60), "Senna"); //criar thread chamada corredor 1 como uma nova thread corredor chamada senna
		Thread corredor2 = new Thread (new Corredor(mainThread, 43), "Barrichello");
		Thread corredor3 = new Thread (new Corredor(mainThread, 55), "Mansell");
		Thread corredor4 = new Thread (new Corredor(mainThread, 49), "Piquet");
		Thread corredor5 = new Thread (new Corredor(mainThread, 57), "Hill");
		
		corredor1.start();
		corredor2.start();
		corredor3.start();
		corredor4.start();
		corredor5.start();
		
		System.out.println("começou!!");
	}

}
