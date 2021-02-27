package orientacao_objetos3;

public class Player {
	
	//Chamando Método Estático de outra classe sem instanciar:
	protected void metodoProtegido() {  //Protegido dinamico
		Main.metodoEstatico();
	}
	
	public void metodoPublico() {  // Publico dinamico
		Main.metodoEstatico();
	}
	
	private void metodoPrivado() {   //Privado dinamico
		Main.metodoEstatico();
	}
	
	protected static void metodoProtegidoEstatico() {  //Protegido Estatico
		Main.metodoEstatico();
	}
	
	public static void metodoPublicoEstatico() {  // Publico Estatico
		Main.metodoEstatico();
	}
	
	private static void metodoPrivadoEstatico() {   //Privado Estatico
		Main.metodoEstatico();
	}
	
}



