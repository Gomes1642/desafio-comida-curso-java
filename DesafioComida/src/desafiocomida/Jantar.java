package desafiocomida;

public class Jantar {

	public static void main(String[] args) {
		Comida c1 = new Comida("Macarrao", 0.330);
		Comida c2 = new Comida("Feijao", 0.300);
		
		Pessoa p = new Pessoa("Marcelo", 89.69);
		
//Apresentação do peso antes de comer		
		System.out.println(p.apresentacao());
		p.comer(c1);
//Primeiro aumento de peso
		System.out.println(p.apresentacao());
		p.comer(c2);
//Segundo aumento de peso
		System.out.println(p.apresentacao());
	}
}
