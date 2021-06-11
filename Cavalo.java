package br.com.heranca;

public class Cavalo extends AnimalSuper implements Animal{

	@Override
	public void emitirSom() {
		
		System.out.println(getNome()+ " tem" + getIdade()+ " de idade." + " É um cavalor e esta relinchando!!!");
	}

	@Override
	public void seLocomerver() {
		
		System.out.println("O cavalo está trotando!!!");
	}
	
}
