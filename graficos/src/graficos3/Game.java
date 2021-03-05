package graficos3;

import java.awt.Dimension; 
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;  
import java.awt.Canvas;    
import java.awt.Color;

public class Game extends Canvas implements Runnable{  //Classe Game com Interface Runnable
	
	public static JFrame frame;  //declarando frame do tipo JFrame
	private final int  WIDTH = 240; //declarando constante WIDTH com seu valor
	private final int HEIGTH = 160;
	private final int SCALE = 4;
	private Thread thread;  //declarando thread
	private boolean isRunning = true;  
	private BufferedImage image;
	private Spritesheet sheet;
	private BufferedImage[] player;
	private int frames = 0;
	private int maxframes = 1;  //de quantos em quantos frames quero que anime meu personagem
	private int curAnimation = 0, maxAnimation = 3;  //maxAnimation � n�mero m�ximo de anim��es(imagens)
	private int x;
	
	public Game() {   //M�todo Construtor	
		sheet = new Spritesheet("/spritesheet.png");
		player = new BufferedImage[4];
		player[0] = sheet.getSprite(0, 0, 16, 16);
		player[1] = sheet.getSprite(16, 0, 16, 16);
		player[2] = sheet.getSprite(32, 0, 16, 16);
		player[3] = sheet.getSprite(48, 0, 16, 16);
		this.setPreferredSize(new Dimension(WIDTH*SCALE,HEIGTH*SCALE));  //criando Janela passando as constantes como par�metro
		initFrame(); //chamando m�todo init abaixo
		image = new BufferedImage(WIDTH,HEIGTH,BufferedImage.TYPE_INT_RGB); //largura,altura,typo
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
	public synchronized void start() { //m�todo start que ser� chamado pelo objeto game
		thread = new Thread(this);   //Essa classe game vai como par�metro no thread
		isRunning = true; //por padr�o � false
		thread.start();  //Duas threads est�o sendo executadas simultaneamente: a thread atual (que retorna da chamada para o m�todo start) e a outra thread (que executa seu m�todo run). 
		
	}
	public synchronized void stop() {
		isRunning= false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		Game game = new Game(); 
		game.start();	
	}
	
	public void tick() {
		frames++; 	
		if (frames > maxframes) {
			frames = 0;
			curAnimation++;
			if(curAnimation > maxAnimation) { //depois o curAnimation � passado cmo par�metro do player g2
				curAnimation = 0;
			}
		}
		x+=1;
	}
	
	public void render() {
		BufferStrategy bs = this.getBufferStrategy(); //BufferStrategy � uma sequencia de buffers para utilizar na renderiza��o
		if(bs == null) {
			this.createBufferStrategy(3);
			return; //funciona como um break
		}
		Graphics g = image.getGraphics();
		g.setColor(new Color(255,250,250)); //RGB 
		g.fillRect(0, 0,WIDTH,HEIGTH);
		//2 linhas acima s�o sempre obrigat�rias para renderiza��o. Basicamente apaga o que tinha na tela antes e renderiza novamente;
		//Colocando um retangulo da cor que eu quero
		
		/*RENDERIZA��O do JOGO*/
		Graphics2D g2 = (Graphics2D) g; //(Graphics2D) � um cast . Agora tenho um objeto 2d sendo igual a vari�vel g to tipo Graficos.
		//g2.rotate(Math.toRadians(45),90+8,90+8); //+8 pois a imagem tem 16 px, aidiconando 8 a cada coordenada, consigo o meio da imagem
		g2.drawImage(player[curAnimation], x, 50,null); //Boneco imagem
		//g2.rotate(Math.toRadians(-45),90+8,90+8);
		g2.setColor(new Color(0,0,0,100)); //colocar uma layer de outra cor
		g2.fillRect(0, 0, WIDTH, HEIGTH);
		
		
		/***/
		g.dispose();//limpar dados que tem na imagem que foram utilizados antes
		g.setColor(Color.cyan); // setando cores de outro objeto
		g.fillRect(10, 0, 10, 10);  //renderizando outro retangulo (pos_x,pos_y,tam_x,tam_y)
		g.setColor(Color.gray); 
		g.fillRect(20, 20, 20, 20); 
		g.setColor(Color.green); 
		g.fillRect(40, 40, 30, 30);  
		g.setColor(Color.red); 
		g.fillRect(80, 80,80, 40);  
		g.setColor(Color.yellow); 
		g.fillOval(100, 10, 30,30);  //CIRCULAR
		g.setFont(new Font("Arial", Font.BOLD, 10)); //font, style, tamanho
		g.drawString("Ol� Mundo", 20, 20);  //RENDERIZANDO STRING
		g = bs.getDrawGraphics();
		g.drawImage(image,0,0,WIDTH*SCALE,HEIGTH*SCALE,null);
		bs.show();
	}
	public void run() {	 //m�todo run deve ser chamado na execu��o do thread.start() dentro do m�todo start da classe;
		long lastTime = System.nanoTime(); //tempo atual do pc em nano segundos
		double amoutOfTicks = 30.0; // quantidade de frames desejadas 
		double ns = 1000000000 / amoutOfTicks;   // per�odo dos frames (1s/60 frames) = 60fps, por�m est� em nano seundos
		double delta = 0;  //declarando delta, diferen�a entre frames atuais e do tempo anterior
		int frames = 0;   //declarando quantidade de frames
		double timer = System.currentTimeMillis(); //declarando tempo em milisegundos
		while(isRunning) {  
			long now = System.nanoTime();  //recebo o tempo atual
			delta+= (now - lastTime) / ns;   //diferen�a do tempo anterior menos o atual / per�odo
			lastTime = now; //tempo atual vira tempo passado
			if (delta >= 1) { // quando o somat�rio dos  deltas der igual a 1 fa�a:
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
		stop();  //n�o obrigat�rio; Para parar as threads
	}

}
