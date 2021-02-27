package graficos2;

import java.awt.Dimension; //importando Dimension
import javax.swing.JFrame;  //importando JFrame
import java.awt.Canvas;    // importando Canvas
public class Game extends Canvas implements Runnable{  //Classe Game com Interface Runnable
	
	public static JFrame frame;  //declarando frame do tipo JFrame
	private final int  WIDTH = 160; //declarando constante WIDTH com tamanho	
	private final int HEIGTH = 120;
	private final int SCALE = 3;
	private Thread thread;
	private boolean isRunning = true;
	
	public Game() {   //M�todo Construtor	
		this.setPreferredSize(new Dimension(WIDTH*SCALE,HEIGTH*SCALE));  //criando Janela passando as constantes como par�metro
		initFrame();
	}
	public void initFrame() {
		frame = new JFrame("Janela do Igor");   //instanciando JFrame
		frame.add(this);  //'this' se refere ao Canvas, no caso a linha de cima, this.setPreferenceSize
		frame.setResizable(false); //N�o quero que usu�rio consiga redimensionar a Janela
		frame.pack(); //m�todo do frame para depois que adicionar o canvas, calcular certo as dimensoes e mostrar
		frame.setLocationRelativeTo(null);  //abre no centro da tela
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Chamando m�todo frame dizendo que quando clicar eu quero que de fato feche sem continuar executando o programa.
		frame.setVisible(true);  //Quando inicializar ja est� vis�vel
		
	}
	public synchronized void start() {
		thread = new Thread(this);   //Essa classe game vai como par�metro no thread
		isRunning = true;
		thread.start();  //Duas threads est�o sendo executadas simultaneamente: a thread atual (que retorna da chamada para o m�todo start) e a outra thread (que executa seu m�todo run). 
		
	}
	public synchronized void stop() {
		
	}
	public static void main(String[] args) {
		Game game = new Game(); 
		game.start();	
	}
	
	public void tick() {
		
	}
	
	public void render() {
		
	}
	public void run() {	 //m�todo run deve ser chamado na execu��o do thread.start() dentro do m�todo start da classe;
		long lastTime = System.nanoTime(); //tempo atual d pc em segundos
		double amoutOfTicks = 60.0;
		double ns = 1000000000 / amoutOfTicks;
		double delta = 0;
		int frames = 0;
		double timer = System.currentTimeMillis();
		while(isRunning) {
			long now = System.nanoTime();
			delta+= (now - lastTime) / ns;
			lastTime = now;
			if (delta >= 1
					
					) {
				tick();
				render();
				frames ++; 
				delta --;
				
			}
			if (System.currentTimeMillis() - timer >= 1000) {
				System.out.println("FPS: "+ frames);
				frames = 0;
				timer += 1000;
			}
		}
	}

}
