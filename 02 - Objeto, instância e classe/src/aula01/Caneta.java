package aula01;

public class Caneta {
	String  modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	void status() {
		System.out.println("Modelo: "+ this.modelo);  // this � uma refer�ncia ao objeto que foi chamado
		System.out.println("Tipo de ponta: "+ this.ponta);
		System.out.println("Uma caneta: " + this.cor);
		System.out.println("Situa��o da carga: "+ this.carga);
		System.out.println("Est� tampada ? " + this.tampada);
	}
	void rabiscar() {
	 if(this.tampada == true) {
		 System.out.println("Desculpe, n�o posso rabiscar!");
	 }else {
		 System.out.println("Estou rabiscando.");
	 }
}
	void tampar() {
	this.tampada = true;
	
}
	void destampar() {
		this.tampada = false;
		
	}
}
