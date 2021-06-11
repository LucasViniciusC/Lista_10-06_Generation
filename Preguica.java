package br.com.heranca;

public class Preguica extends AnimalSuper implements Animal {

	@Override
	public void emitirSom() {
		System.out.println(getNome() + " É uma preguiça que emite ruidos não idêntificados!!!!");
	}

	@Override
	public void seLocomerver() {
		// TODO Auto-generated method stub
		System.out.println("A preguiça se locomove escalando as Árvores!!!!!");
	}

}
