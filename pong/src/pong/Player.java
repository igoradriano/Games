package pong;

import java.awt.Color;
import java.awt.Graphics;

public class Player {
	
	public boolean right,left;
	public int x,y;
	public int width;
	public int height;

	
	public Player(int x, int y) {//no método construtor já passa parâmetros de coordenadas, capturados por eventos
		this.x = x;
		this.y = y;
		this.width = 40;  //guardado internamente nesse método
		this.height = 10;
	}
	
	public void tick() {
		if(right) {
			x++;
		}
		else if(left){
			x--;
		}
		
		//SISTEMA DE COLISÃO
		if(x+width > Game.WIDTH) {
			x = Game.WIDTH - width;
		}else if(x<0) {
			x = 0;
		}
	}
	
	public void render(Graphics g) {  //para manipular os Gráficos dentro desse método
		g.setColor(Color.blue);  //vou renderizar apenas com pixels, sem spritSheet
		g.fillRect(x, y, width, height);
	}

}
