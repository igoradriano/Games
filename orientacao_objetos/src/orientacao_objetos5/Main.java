package orientacao_objetos5;

public class Main {
	 //atributos pertencem as classes
	private String nome = "Guilherme"; //atributo privado 
	private int[] numeros = new int[10]; //atributo privado array de numeros tamanho 10
	public int[] numeros2; //posso usar esse atributo publico depois
	public static final int Constante = 12; //Constante da classe
	public int n1 = 23;
	
	//M�todo Construtor � quando temos o public nome da classe e o que fazer
	public Main() {
		System.out.println("Classe criada " + this.nome);
		numeros2 = new int[100];  //atribui um tamanho ao numeros2
	}
	
	public String getNome() {  //criei um m�todo public que chama um atributo privado
		return nome;
	}
	
	public static void main(String[] args) {
		new Main();
		Main m = new Main(); //instanciei classe main com m�todo Main
		System.out.println(m.getNome());//chamei o m�todo public com atrivuto privado
		// isso � muito �til para chamar atributos privados atrav�s de m�todos publicos
		//em outra classe que n�o essa.
		System.out.println(Main.Constante);
		Main n = new Main();
		int total = Main.Constante + n.n1 + n.Constante;
		System.out.println("TOTAL: " +total);
		
	}
}
