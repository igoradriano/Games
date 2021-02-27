package orientacao_objetos;

public class Main extends Teste_class_abstrata{
	public static void main(String[] args) {
		//Instanciando a Classe Jogador
		Player player1 = new Player();
		player1.iniciarJogador();   //usando método criado
		Player player2 = new Player();
		player2.iniciarJogador();   //usando método criado
		
		//Instancionando a Classe Inimigo
		Inimigo inimigo = new Inimigo();
		inimigo.iniciarInimigo();   //usando método criado   
		
		new Main().instanceMain2();	 //Subclasse chamada dentro da classe	
		
		new Main().chamarMetodoAbstract();
		Main abstrato = new Main();//declarando objeto do tipo Main 
		abstrato.iniciarJogo();  //Chamando método abstrato diretamente
		
	}
	
	public void chamarMetodoAbstract() {
		iniciarJogo();  //puxando métodos da classe abstrata
		terminarJogo();
		this.instanceMain2(); //puxando classe criada abaixo para dentro desta
		//this.instanceMain2();  //chamando um método da subclasse Main2 da classe Main
	}
	
	
	public void instanceMain2(){  //para poder instanciar uma subclasse
		new Main2().print1();;
	}
	private class Main2{ //Subclasse criada dentro da primeira classe (InnerClass)
		public void print1() {
			System.out.println("Chamando meu método");
		}
	}
	
}
