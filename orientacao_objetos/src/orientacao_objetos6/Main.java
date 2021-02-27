package orientacao_objetos6;

public class Main extends Player{
	 //Atributos da Classe:
	
	private String nome = "Igor"; 
	private int[] numeros;
	public static final int VIDA_MAXIMA = 100; //Constante da classe
	
	
	//Método Construtor ( Usa nome da classe)
	public Main(int n1, int n2) { //Preciso instanciar os atributos que serão usados no método Construtor de Player
		super(n1,n2); //Uso o super com os atributos necessários la na Classe Player
		this.vidaInicial = 10; //Chamo o atributo vidaInicial do método Construtor de Player
		numeros = new int[100];
	}
	
	public String getNome() { //Método Público chama Atributo Privado
		return nome;
	}
	
	//Método Principal
	public static void main(String[] args) {
		Main m = new Main(100,200);
		System.out.println(Main.VIDA_MAXIMA);
		
	}
}
