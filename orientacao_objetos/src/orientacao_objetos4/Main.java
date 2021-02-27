package orientacao_objetos4;

public class Main {
	
	private static void metodoEstaticoVoid() {
		System.out.println("Void --> N�o retorna Nada!");	
	}
	
	private static int metodoEstaticoInt() {
		System.out.println("Int --> Retorna um n�mero!");
		return 10;
	}
	
	private static String metodoEstaticoString() {
		System.out.println("String --> Retorna uma String!");
		return "IGOR";
	}
	
	public void metodoComParametros(int n1, String nome) {
		System.out.println("Desta forma --> Retorna o tipo de vari�vel dentro do met");
		System.out.println(n1);
		System.out.println(nome);
	}
	
	
	
	
	public static void main(String[] args) {
		metodoEstaticoInt(); //sem instanciar e sem precisar do Main() pois � Est�tico
		metodoEstaticoVoid();
		metodoEstaticoString();
		new Main().metodoComParametros(10, "Forma N�O Instanciada");//sem instanciar
		Main instancia = new Main();
		instancia.metodoComParametros(11, "Forma Instanciada");
		
	}

}
