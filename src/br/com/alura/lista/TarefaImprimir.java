package br.com.alura.lista;

public class TarefaImprimir implements Runnable {

	private Lista lista;

	public TarefaImprimir(Lista lista) {
		this.lista = lista;
	}

	@Override
	public void run() {
		
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e1) {
//			e1.printStackTrace();
//		}
		
		synchronized (lista) {
			if (!lista.estaCheia()) {
				try {
					System.out.println("indo esperar, aguardando notificação");
					lista.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			for (int i = 0; i < lista.tamanho()/*lista.size()*/; i++) {
				System.out.println(i + " - " + lista.pegaElemento(i));
//				System.out.println(i + " - " + lista.get(i));
			}
		}
		
		
	}

}
