package br.com.heranca;

public class Preguica extends AnimalSuper implements Animal {

	@Override
	public void emitirSom() {
		System.out.println(getNome() + " � uma pregui�a que emite ruidos n�o id�ntificados!!!!");
	}

	@Override
	public void seLocomerver() {
		// TODO Auto-generated method stub
		System.out.println("A pregui�a se locomove escalando as �rvores!!!!!");
	}

}
