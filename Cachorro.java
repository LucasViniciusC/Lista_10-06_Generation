package br.com.heranca;

public class Cachorro extends AnimalSuper implements Animal {

	@Override
	public void emitirSom() {
		System.out.println(getNome() + " É um cachorro que não para de latir !!!!");
	}

	@Override
	public void seLocomerver() {
		System.out.println("O cachorro está correndo");
	}

}
