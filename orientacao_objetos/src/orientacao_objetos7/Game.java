package orientacao_objetos7;

public class Game {
	
	private Player player; //DECLAREI O PLAYER
	private Player player2; //DECLAREI O PLAYER2
	private Inimigo inimigo; //DECLAREI O INIMIGO
	
	public Game() {
		player2 = new Tipo1(); // INSTANCIEI O PLAYER2
		//N�o vai dar erro j� que declarei como Player nas linhas de cima, pois o Tipo1 � tbm um Player, com o extends
		inimigo = new Inimigo(); // INSTANCIEI O INIMIGO
		
		//Verificando se player j� INSTANCIADO, CASO AINDA N�O, ELE IR� INICIALIZAR
		if (player == null) {
			System.out.println("O player n�o foi inicializado. Vou iniciar para voc�");
			player = new Player();
		}else {
			System.out.println("O player foi inicializado");
		}
		
		//Verificando se player j� foi instanciado
		if(player instanceof Player) {
			System.out.println("O player foi inicializado com sucesso e faz refer�ncia a classe Player");
		}
		
		if(player2 instanceof Tipo1) {
			System.out.println("O player2 � um Player do Tipo1");
		}else if (player2 instanceof Player) {
			System.out.println("O player2 � apenas um Player");
		}
		
	}

	public Player getPlayer() {
		return player;
	}
	public Inimigo getInimigo() {
		return inimigo;
	}
	
	
	public static void main(String[] args) {
		Game game = new Game();
		Player player = game.getPlayer();
		player.atacarInimigo(game.getInimigo());
		System.out.println(game.getInimigo().life);
	}
}
