package com.igor.graficos;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;


public class Spritesheet {
	
	private BufferedImage spritesheet;  //Declarando Atributo da classe Spritesheet
	
	//-----------------------------------------------------------------------------------------------
	public Spritesheet(String path){  //M�TODO CONSTRUTOR
		try {  //Exception para falhas
			spritesheet = ImageIO.read(getClass().getResource(path));// o objeto spritesheet do tipo BufferedImage agora � instanciado como um Image.IO                                                                                                                                                                                                                                                                                                                                                                          
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// OBS: ImageIO.read() --> serve para leitura de imagens com a passagem da URL da imagem. Retorna um BufferedImage como resultado da decodifica��o do URL fornecido com um ImageReader 
	// getCLass() --> retorna uma inst�ncia da classe Class, que cont�m informa��es sobre a classe
		// que getClass() foi chamada. Class tem m�todos que retornam metadados da classe do path
	// getResource --> � um m�todo da classe Class inst�nciada pelo m�todo getClass() anteriormente. Esse m�todo
		// encontra um recurso com um determinado nome.
	// path � passado como par�metro, ou seja, o nome do arquivo de imagem que ser� passado quando um objeto do 
	// tipo Spritesheet for instanciado.
	// Ex: Spritesheet spritesheet = new Spritesheet("/spritesheet.png");
	// getResource procura um recurso com o nome passado no path.
	// Esse c�digo inteiro serve para passar o nome da imagem que ser� lida, e armazenar na vari�vel spritesheet
	//-----------------------------------------------------------------------------------------------
	//M�TODO DA CLASSE SPRITESHEET PARA CAPTURAR PARTES MENORES DE UMA IMAGEM MAIOR
	public BufferedImage getSprite(int x, int y, int width, int height) {
		return spritesheet.getSubimage(x, y, width, height); //getSubimage � um m�todo interno da classe BufferedImage
		// como a imagem do spriteshee ja foi carregada, esse m�todo ir� retornar partes espec�ficas desta imagem.
		
	}
}


