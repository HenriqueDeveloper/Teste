package aula01;

public class Atividade {

public static void main(String args []) {
	
	Ps3 console  = new Ps3();
	console.marca = "Sony";
	console.cor = "Preto";
	console.modelo = "Super Slim";
	
	console.status();
	console.desligar();
	console.iniciargame();
	
	Ps3 console2 = new Ps3();
	console2.marca = "Sony";
	console2.cor = "Branco";
	console2.modelo = "Slim";
	
	console2.status();
	
	
} 
}
