package com.igor.entities;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Entity {
	//Toda Entity por padr�o vai ter: Esses atributos irei acessar por m�todo e n�o diretamente, por isso s�o privados
	private int x;
	private int y;
	private int width;
	private int height;
	private BufferedImage sprite;
	
	public Entity(int x, int y, int width, int height, BufferedImage sprite) { //M�todo Construtor
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.sprite = sprite;
	}

	//M�todos abaixo s�o para acessar os atributos privados da classe
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
	
	//M�todo para renderizar o que quer que seja essa Entity ( jogador, inimigo, arma...)
	public void render(Graphics g) { //para esse m�todo devo passar um objeto do tipo Graphics como par�metro
		g.drawImage(sprite, this.getX(), this.getY(), null);
	}
	
	//M�todo tick():
	public void tick() {
		
	}
}
