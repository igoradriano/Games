package orientacao_objetos2;

public class Player {
	
	private void nascer() {  //m�todo privado dessa classe
		System.out.println("Nasceu...");
	}
	protected void morrer() {  //m�todo protegido pode ser extendido para outra classe
		System.out.println("Morreu..."); //mas se nao usar extend n�o pode cham�-lo
	}

}
