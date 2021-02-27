package orientacao_objetos3;

public class Main {
	
	public void metodoDinamico() {
		System.out.println("Chamei um método Dinamico");		
	}
	protected static void metodoEstatico() {
		System.out.println("Chamei um método Estático");
	}
	
	public static void main(String[] args) {
		//Chamando método Dinâmico:
		Main main = new Main();
		main.metodoDinamico();
		
		//Chamando método Estático:
		Main.metodoEstatico();  //primeira forma
		metodoEstatico();       //segunda forma
	}

}
