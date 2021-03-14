package com.igor.entities;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Entity {
	//Toda Entity por padrão vai ter: Esses atributos irei acessar por método e não diretamente, por isso são privados
	private int x;
	private int y;
	private int width;
	private int height;
	private BufferedImage sprite;
	
	public Entity(int x, int y, int width, int height, BufferedImage sprite) { //Método Construtor
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.sprite = sprite;
	}

	//Métodos abaixo são para acessar os atributos privados da classe
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	public int getWidth() {
		return this.width;
	}
	public int getHeight() {
		return this.height;
	}
	
	//Método para renderizar o que quer que seja essa Entity ( jogador, inimigo, arma...)
	public void render(Graphics g) { //para esse método devo passar um objeto do tipo Graphics como parâmetro
		g.drawImage(sprite, this.getX(), this.getY(), null);
	}
	
	//Método tick():
	public void tick() {
		
	}
}
