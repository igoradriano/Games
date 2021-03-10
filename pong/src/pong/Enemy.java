package pong;

import java.awt.Color;
import java.awt.Graphics;


public class Enemy {
	
	public double x,y,width,height; //double pois como o inimigo vai ter uma inteligencia artificial, as vezes
	//a velocidade dele pode alterar, não vai ser igual a que está em nosso jogador
	
	
	public Enemy(int x, int y) {
		this.x = x;
		this.y = y;
		this.width = 40;
		this.height = 5;
		
	}
	
	public void tick() {
		x += (Game.ball.x - x - 6) * 0.1; //acrescenta a cada renderização a diferença entre a posição da bola e a bosicao da barra
		//0.4 é multiplicado ao final para garantir que o inimigo so pegue 40% das bolas
	}

	public void render(Graphics g) {
		g.setColor(Color.red);  //vou renderizar apenas com pixels, sem spritSheet
		g.fillRect((int)x, (int)y, (int)width, (int)height); //(int) é um Cast
		
	}
}
