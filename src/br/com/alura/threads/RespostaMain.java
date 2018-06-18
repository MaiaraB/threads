package br.com.alura.threads;

public class RespostaMain {
	
	public static void main(String[] args) {
		Thread novaThread = new Thread(new ImprimeString());
		novaThread.start();
	}
	
}