package pong;

import java.awt.Color;
import java.awt.Graphics;


public class Enemy {
	
	public double x,y,width,height; //double pois como o inimigo vai ter uma inteligencia artificial, as vezes
	//a velocidade dele pode alterar, n�o vai ser igual a que est� em nosso jogador
	
	
	public Enemy(int x, int y) {
		this.x = x;
		this.y = y;
		this.width = 40;
		this.height = 5;
		
	}
	
	public void tick() {
		x += (Game.ball.x - x - 6) * 0.1; //acrescenta a cada renderiza��o a diferen�a entre a posi��o da bola e a bosicao da barra
		//0.4 � multiplicado ao final para garantir que o inimigo so pegue 40% das bolas
	}

	public void render(Graphics g) {
		g.setColor(Color.red);  //vou renderizar apenas com pixels, sem spritSheet
		g.fillRect((int)x, (int)y, (int)width, (int)height); //(int) � um Cast
		
	}
}
