package br.com.heranca;

public class Cachorro extends AnimalSuper implements Animal {

	@Override
	public void emitirSom() {
		System.out.println(getNome() + " � um cachorro que n�o para de latir !!!!");
	}

	@Override
	public void seLocomerver() {
		System.out.println("O cachorro est� correndo");
	}

}
