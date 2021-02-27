package orientacao_objetos6;

public class Player {
	
	public int vidaInicial, tempo;
	
	//Método Construtor:
	public Player(int vidaInicial, int tempo) {
		//Se esse método estiver vazio, não tem problema apenas usar o extends no Main
		// Para incorpora-lo a classe Main. Porém caso tenha atributos a serem passados;
		//devemos utilizar o super() dentro do método construtor da classe Main;
		this.vidaInicial = vidaInicial; // this.vidaInicial é o do método
		System.out.println(this.vidaInicial); //Chama o vidaInicial do método
		System.out.println(vidaInicial); //Cham vidaInicial da Classe
	}

}
