package orientacao_objetos6;

public class Main extends Player{
	 //Atributos da Classe:
	
	private String nome = "Igor"; 
	private int[] numeros;
	public static final int VIDA_MAXIMA = 100; //Constante da classe
	
	
	//M�todo Construtor ( Usa nome da classe)
	public Main(int n1, int n2) { //Preciso instanciar os atributos que ser�o usados no m�todo Construtor de Player
		super(n1,n2); //Uso o super com os atributos necess�rios la na Classe Player
		this.vidaInicial = 10; //Chamo o atributo vidaInicial do m�todo Construtor de Player
		numeros = new int[100];
	}
	
	public String getNome() { //M�todo P�blico chama Atributo Privado
		return nome;
	}
	
	//M�todo Principal
	public static void main(String[] args) {
		Main m = new Main(100,200);
		System.out.println(Main.VIDA_MAXIMA);
		
	}
}
