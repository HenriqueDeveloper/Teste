package aula01;

public class Aula01 {

public static void main(String args []) {
	
	Caneta c1 = new Caneta();  //Intanciar significa criar um novo objeto da classe Caneta.
	                             
	
	
	c1.cor = "Azul"; // Chamando o atributo
	c1.ponta = 0.5f;
	c1.destampar(); // Chamando o método
	c1.rabiscar();
	
	Caneta c2 = new Caneta();
	c2.modelo = "Henrique";
	c2.carga = 10;
	c2.cor = "Amarela";
	c2.tampar();
	c2.rabiscar();

	
	
}

}
