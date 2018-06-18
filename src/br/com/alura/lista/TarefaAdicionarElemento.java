package br.com.alura.lista;

public class TarefaAdicionarElemento implements Runnable {

	private Lista lista;
//	private List<String> lista;
	private int numeroDaThread;

	public TarefaAdicionarElemento(Lista/*List<String>*/ lista, int numeroDaThread) {
		this.lista = lista;
		this.numeroDaThread = numeroDaThread;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			lista.adicionaElementos("Thread " + numeroDaThread + " - " + i);
//			lista.add("Thread " + numeroDaThread + " - " + i);
		}
	}

}
