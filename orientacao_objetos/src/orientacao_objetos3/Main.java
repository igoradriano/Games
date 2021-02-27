package orientacao_objetos3;

public class Main {
	
	public void metodoDinamico() {
		System.out.println("Chamei um m�todo Dinamico");		
	}
	protected static void metodoEstatico() {
		System.out.println("Chamei um m�todo Est�tico");
	}
	
	public static void main(String[] args) {
		//Chamando m�todo Din�mico:
		Main main = new Main();
		main.metodoDinamico();
		
		//Chamando m�todo Est�tico:
		Main.metodoEstatico();  //primeira forma
		metodoEstatico();       //segunda forma
	}

}
