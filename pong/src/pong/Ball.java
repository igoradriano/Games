package pong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class Ball {
	public double x,y,width,height; 
	
	public double dx,dy;
	public double speed = 1.6;
	
	public Ball(int x, int y) {
		this.x = x;
		this.y = y;
		this.width = 4;
		this.height = 4;
		
		int angle = new Random().nextInt(120-45) + 46; // angulos entre 120 e 45, e somo sempre a 46 
		dx = Math.cos(Math.toRadians(angle));
		dy = Math.sin(Math.toRadians(angle));
		//dx = new Random().nextGaussian(); nextGaussian gera numero entre zero e 1
		//dy = new Random().nextGaussian();
		
	}
	
	public void tick() {
		//SISTEMA DE COLISÃO COM PAREDES LATERAIS
		if(x+(dx*speed) + width >= Game.WIDTH) {
			dx*=-1;	  //muda de direção
		}else if(x + (dx*speed) < 0) {
			dx*=-1;
		}
		if(y >= Game.HEIGHT) {
			// PONTO DO COMPUTADOR
			System.out.println("Ponto do Inimigo!");
			new Game(); //inicia um novo game quando o inimigo marca ponto
			return;
		}else if(y < 0) {
			//PONTO DO JOGADOR
			System.out.println("Ponto nosso! YAYY!");
			new Game();  //incia um novo game quando marcamos um ponto
			return;
		}
		
		Rectangle bounds = new Rectangle((int)(x + (dx*speed)),(int)(y+(dy*speed)),(int)width, (int)height);
		Rectangle boundsPlayer = new Rectangle(Game.player.x,Game.player.y,Game.player.width, Game.player.height);
		Rectangle boundsEnemy = new Rectangle((int)Game.enemy.x,(int)Game.enemy.y,(int)Game.enemy.width,(int)Game.enemy.height);
		
		if(bounds.intersects(boundsPlayer)) {
			int angle = new Random().nextInt(120-45) + 46; // angulos entre 120 e 45, e somo sempre a 46 
			dx = Math.cos(Math.toRadians(angle));
			dy = Math.sin(Math.toRadians(angle));
			if (dy > 0) {
				dy*=-1;
			}
			
		}else if (bounds.intersects(boundsEnemy)) {
			int angle = new Random().nextInt(120-45) + 46; // angulos entre 120 e 45, e somo sempre a 46 
			dx = Math.cos(Math.toRadians(angle));
			dy = Math.sin(Math.toRadians(angle));
			if (dy < 0) {
				dy*=-1;
			}
			
		}
		x+=dx*speed;
		y+=dy*speed;
		
	}

	public void render(Graphics g) {
		g.setColor(Color.yellow);  //vou renderizar apenas com pixels, sem spritSheet
		g.fillRect((int)x, (int)y, (int)width, (int)height); //(int) é um Cast
		
	}

}
