package aula01;

public class Ps3 {
	String modelo;
	String cor;
	int numeracao;
	String marca;
	boolean estado;
	
	void status() {
		System.out.println("Modelo de cor: " + this.cor);
		System.out.println("Cor do console: "+ this.modelo);
		System.out.println("Qual a marca do console: "+ this.marca);
		System.out.println("Qual a numera��o: " + this.numeracao);
	}
	void ligar() {
		estado = true;
		System.out.println("O console est� ligando...");
			
		}
	void desligar() {
		estado = false;
		System.out.println("O console est� desligando...");
	}
	
	void iniciargame() {
		if(this.estado == true) {
			System.out.println("O console est� iniciando o game!");
		}else {
			System.out.println("O console saiu do game!!");
		}
		
	}
}
