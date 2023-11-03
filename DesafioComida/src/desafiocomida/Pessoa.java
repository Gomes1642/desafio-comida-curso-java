package desafiocomida;

public class Pessoa {
//Atributos da pessoa
	String nome;
	double peso;

//Contrutor 	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}

//Método
	void comer(Comida comida) {
		if(comida != null) {
			this.peso += comida.peso;
		}
	}

//Apresentação do Marcelo
String apresentacao() {
	return "Oi! Eu sou o " + nome + " e tenho " + peso + "KGs"; 
}


}
