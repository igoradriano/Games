package pong;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

public class Game extends Canvas implements Runnable, KeyListener{
	private static final long serialVersionUID = 1L;
	public static int WIDTH = 160;
	public static int HEIGHT = 120;
	public static int SCALE = 3;
	
	public static Player player;
	public static Enemy enemy;
	public static Ball ball;
	public BufferedImage layer = new BufferedImage(WIDTH,HEIGHT,BufferedImage.TYPE_INT_RGB); //layer para renderizar os gr[aficos
	
	public Game() {  //M�todo Construtor da classe Game. Lembrando que Game se extende a um Canvas 
		this.setPreferredSize(new Dimension(WIDTH*SCALE, HEIGHT*SCALE));
		this.addKeyListener(this);
		player = new Player(100, HEIGHT-5);
		enemy = new Enemy(100,0);
		ball = new Ball(100, HEIGHT/2);
	}
	
	public static void main(String[] args) {
		Game game = new Game(); 
		JFrame frame = new JFrame("Pong By: IGOR");
		frame.setResizable(false); //Nao redimensiona a Janela
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //parar o processo quando fechar a janela
		frame.add(game);
		frame.setVisible(true);
		frame.pack();
		frame.setLocationRelativeTo(null); //Janela no centro da tela
		new Thread(game).start();
	}
	

	public void tick() {
		player.tick();
		enemy.tick();
		ball.tick();
	}
	
	public void render() {
		BufferStrategy bs = this.getBufferStrategy();
		if (bs == null) {
			this.createBufferStrategy(3);
			return;
		}
		Graphics g = layer.getGraphics();
		g.setColor(Color.black);   //limpar o eveto anterior, para n�o sobrepor 
		g.fillRect(0, 0, WIDTH, HEIGHT);     //limpar evento anterior para n�o sobrepor
		player.render(g);
		enemy.render(g);
		ball.render(g);
		
		g = bs.getDrawGraphics(); 
		g.drawImage(layer, 0, 0, WIDTH*SCALE,HEIGHT*SCALE,null);
		
		
		bs.show(); //mostrar na tela
		
	//O bufferStratagy � basicamente onde � feita toda a rendereiza��o do game. Quando executamos
	// pela primeira vez, o buffer ainda n�o existe, por isso criamos a condi��o de bs == null, para 
	//saber se o buffer j� existe. Caso n�o tenha ele cria um.
	}

	@Override
	public void run() {
		while (true) {
			tick();
			render();
			try {
				Thread.sleep(1000/60);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) { //verifica a tecla que foi pressionada, se for igual a tecla seta direita, fa�a isso
			player.right = true;
		}else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			player.left = true;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {  //Soltar bot�o
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) { //verifica a tecla que foi pressionada, se for igual a tecla seta direita, fa�a isso
			player.right = false;
		}else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			player.left = false;
		}
		
	}
	

}
