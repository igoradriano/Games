package com.igor.main;

import java.awt.Dimension; 
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import com.igor.entities.Enemy;
import com.igor.entities.Entity;
import com.igor.entities.Player;
import com.igor.graficos.Spritesheet;

import java.awt.Canvas;    
import java.awt.Color;

public class Game extends Canvas implements Runnable{ 
	private static final long serialVersionUID = 1L;
	
//Classe Game com Interface Runnable
	
	public static JFrame frame;  //declarando frame do tipo JFrame
	private final int  WIDTH = 240; //declarando constante WIDTH com seu valor
	private final int HEIGTH = 160;
	private final int SCALE = 3;
	private Thread thread;  //declarando thread
	private boolean isRunning = true;  
	private BufferedImage image;
	
	public List<Entity> entities; //importe List until e o Package entities para fazer essa lista do tipo Entity
	public Spritesheet spritesheet;
	public Game() {   //Método Construtor	
		this.setPreferredSize(new Dimension(WIDTH*SCALE,HEIGTH*SCALE));  //criando Janela passando as constantes como parâmetro
		initFrame(); //chamando método init abaixo
		//Inicializando Objetos:
		image = new BufferedImage(WIDTH,HEIGTH,BufferedImage.TYPE_INT_RGB); //largura,altura,tipo
		entities = new ArrayList<Entity>();
		spritesheet = new Spritesheet("/spritesheet.png");
		Player player = new Player(50,50,16,16,spritesheet.getSprite(32, 0, 16, 16)); //cria um novo player com o tamanho e coordenadas que ele vai ser criado, e passa o spritesheet que ele vai ser retirado através do método do getSprit criado na classe Spritesheet
		entities.add(player); //adiciona o player a lista entities para ser renderizado e fazer o tick
		Enemy enemy = new Enemy(50,70,16,16,spritesheet.getSprite(112, 16, 16, 16)); //cria um novo player com o tamanho e coordenadas que ele vai ser criado, e passa o spritesheet que ele vai ser retirado através do método do getSprit criado na classe Spritesheet
		entities.add(enemy); //adiciona o player a lista entities para ser renderizado e fazer o tick
	}
	public void initFrame() {
		frame = new JFrame("Janela do Igor");   //instanciando JFrame
		frame.add(this);  //'this' se refere ao Canvas, no caso a linha de cima, this.setPreferenceSize
		frame.setResizable(false); //Não quero que usuário consiga redimensionar a Janela
		frame.pack(); //método do frame para depois que adicionar o canvas, calcular certo as dimensoes e mostrar
		frame.setLocationRelativeTo(null);  //abre no centro da tela
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Chamando método frame dizendo que quando clicar eu quero que de fato feche sem continuar executando o programa.
		frame.setVisible(true);  //Quando inicializar ja está visível
		
	}
	public synchronized void start() { //método start que será chamado pelo objeto game
		thread = new Thread(this);   //Essa classe game vai como parâmetro no thread
		isRunning = true; //por padrão é false
		thread.start();  //Duas threads estão sendo executadas simultaneamente: a thread atual (que retorna da chamada para o método start) e a outra thread (que executa seu método run). 
		
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
		for (int i = 0; i < entities.size(); i++) { //looping  enquanto i menor que o tamanho da lista, a Entity e vai recebendo cada objeto da lista entities e vai chamando o método tick de cada uma
			Entity e = entities.get(i);
			if (e instanceof Player) {  //se aqui for uma instancia do Player
				//Estou dando tick no Player
			}
			e.tick();
		}
	
	}
	
	public void render() {
		BufferStrategy bs = this.getBufferStrategy(); //BufferStrategy é uma sequencia de buffers para utilizar na renderização
		if(bs == null) {
			this.createBufferStrategy(3);
			return; //funciona como um break
		}
		Graphics g = image.getGraphics();
		g.setColor(new Color(0,0,0)); //RGB 
		g.fillRect(0, 0,WIDTH,HEIGTH);
		//2 linhas acima são sempre obrigatórias para renderização. Basicamente apaga o que tinha na tela antes e renderiza novamente;
		//Colocando um retangulo da cor que eu quero
		
		/*RENDERIZAÇÃO do JOGO*/
		//Graphics2D g2 = (Graphics2D) g; //(Graphics2D) é um cast . Agora tenho um objeto 2d sendo igual a variável g to tipo Graficos.
		/***/
		for (int i = 0; i < entities.size(); i++) { //mesma l[ogica do tick
			Entity e = entities.get(i);
			e.render(g);
		}
		g.dispose();//limpar dados que tem na imagem que foram utilizados antes
		g = bs.getDrawGraphics();
		g.drawImage(image,0,0,WIDTH*SCALE,HEIGTH*SCALE,null);
		bs.show();
	}
	public void run() {	 //método run deve ser chamado na execução do thread.start() dentro do método start da classe;
		long lastTime = System.nanoTime(); //tempo atual do pc em nano segundos
		double amoutOfTicks = 30.0; // quantidade de frames desejadas 
		double ns = 1000000000 / amoutOfTicks;   // período dos frames (1s/60 frames) = 60fps, porém está em nano seundos
		double delta = 0;  //declarando delta, diferença entre frames atuais e do tempo anterior
		int frames = 0;   //declarando quantidade de frames
		double timer = System.currentTimeMillis(); //declarando tempo em milisegundos
		while(isRunning) {  
			long now = System.nanoTime();  //recebo o tempo atual
			delta+= (now - lastTime) / ns;   //diferença do tempo anterior menos o atual / período
			lastTime = now; //tempo atual vira tempo passado
			if (delta >= 1) { // quando o somatório dos  deltas der igual a 1 faça:
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
		stop();  //não obrigatório; Para parar as threads
	}

}
