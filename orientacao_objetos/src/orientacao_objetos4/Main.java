package orientacao_objetos4;

public class Main {
	
	private static void metodoEstaticoVoid() {
		System.out.println("Void --> Não retorna Nada!");	
	}
	
	private static int metodoEstaticoInt() {
		System.out.println("Int --> Retorna um número!");
		return 10;
	}
	
	private static String metodoEstaticoString() {
		System.out.println("String --> Retorna uma String!");
		return "IGOR";
	}
	
	public void metodoComParametros(int n1, String nome) {
		System.out.println("Desta forma --> Retorna o tipo de variável dentro do met");
		System.out.println(n1);
		System.out.println(nome);
	}
	
	
	
	
	public static void main(String[] args) {
		metodoEstaticoInt(); //sem instanciar e sem precisar do Main() pois é Estático
		metodoEstaticoVoid();
		metodoEstaticoString();
		new Main().metodoComParametros(10, "Forma NÃO Instanciada");//sem instanciar
		Main instancia = new Main();
		instancia.metodoComParametros(11, "Forma Instanciada");
		
	}

}
