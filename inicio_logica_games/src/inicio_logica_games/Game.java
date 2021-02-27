package inicio_logica_games;

import java.util.ArrayList;  //Importando o ArrayList para adicionar infinitos elementos no array

public class Game implements Runnable{ //Interface Runnable permite trabalhar com threads
	
	private boolean isRunning; //se o Jogo ta rodando. Por padr�o � falso
	private Thread thread;  //declarando minha thread do tipo Thread
	private ArrayList<Entidade> entidades = new ArrayList<>(); //  <Tipo_de_Classe> nome_var_guarda_lista
	
	public Game() {
		entidades.add(new Entidade());  //�ndice 0
		entidades.add(new Entidade());  //�ndice 1
		entidades.add(new Entidade());  //�ndice 2
		entidades.add(new Entidade());
		entidades.add(new Entidade());
		for(int i=0; i < entidades.size(); i++) {
			Entidade e = entidades.get(0);  //get(�ndice)
		}
		
	}
	public static void main(String[] args) {
		Game game = new Game();  //Instanciando classe game
		game.start();  //Para iniciar o Jogo
		
	}
	
	public synchronized void start() { //m�todo sincronizado assim que chamar ele
		isRunning = true;  // Por padr�o � false, mas como o jogo so roda se for true, atribuo o true aqui.
		thread = new Thread(this);  //Instanciando a minha Thread. Passando como par�metro � a classa que eu quero que tenha a interface  Runnable, passo o Game atrav�s do this
		thread.start(); //M�todo Start() da Thread, vai pegar o m�todo Run, que na verdade � uma thread.
	}

	public void atualizar() {  
		//Atualizar o Jogo.
		System.out.println("M�todo Atualizar");
	}
	
	public void renderizar() {	
		//Renderizar o Jogo.
		System.out.println("M�todo Renderizar");
	}
@Override
public void run() {  //THREAD, permite que os 2 m�todos rodem simultaneamente dentro do loop
	
	while(isRunning) {
		atualizar();
		renderizar();
		
		/*try {                    //Gambiarra Jogos pequenos para 60fps
			Thread.sleep(1000/60);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
	}
	
}

}
