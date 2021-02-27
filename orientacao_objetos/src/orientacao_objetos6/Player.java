package orientacao_objetos6;

public class Player {
	
	public int vidaInicial, tempo;
	
	//M�todo Construtor:
	public Player(int vidaInicial, int tempo) {
		//Se esse m�todo estiver vazio, n�o tem problema apenas usar o extends no Main
		// Para incorpora-lo a classe Main. Por�m caso tenha atributos a serem passados;
		//devemos utilizar o super() dentro do m�todo construtor da classe Main;
		this.vidaInicial = vidaInicial; // this.vidaInicial � o do m�todo
		System.out.println(this.vidaInicial); //Chama o vidaInicial do m�todo
		System.out.println(vidaInicial); //Cham vidaInicial da Classe
	}

}
