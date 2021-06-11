package br.com.heranca;

public class TesteImpressao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cachorro dog1 = new Cachorro();
		Cavalo horse1 = new Cavalo();
		Preguica preguica1 = new Preguica();
		
	
		dog1.setNome("Peludinho");
		dog1.setIdade(2);
		
		horse1.setNome("Pé de pano");
		horse1.setIdade(10);
		
		preguica1.setNome("Cadu");
		preguica1.setIdade(8);
		
		
		System.out.println("\n==============================================\n"); 
		
		dog1.emitirSom();
		dog1.seLocomerver();
		
		System.out.println("\n==============================================\n");
		
		horse1.emitirSom();
		horse1.seLocomerver();
		
		System.out.println("\n==============================================\n");
		
		preguica1.emitirSom();
		preguica1.seLocomerver();
	}

}
