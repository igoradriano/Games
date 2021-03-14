package com.igor.graficos;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;


public class Spritesheet {
	
	private BufferedImage spritesheet;  //Declarando Atributo da classe Spritesheet
	
	//-----------------------------------------------------------------------------------------------
	public Spritesheet(String path){  //MÉTODO CONSTRUTOR
		try {  //Exception para falhas
			spritesheet = ImageIO.read(getClass().getResource(path));// o objeto spritesheet do tipo BufferedImage agora é instanciado como um Image.IO                                                                                                                                                                                                                                                                                                                                                                          
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// OBS: ImageIO.read() --> serve para leitura de imagens com a passagem da URL da imagem. Retorna um BufferedImage como resultado da decodificação do URL fornecido com um ImageReader 
	// getCLass() --> retorna uma instância da classe Class, que contém informações sobre a classe
		// que getClass() foi chamada. Class tem métodos que retornam metadados da classe do path
	// getResource --> é um método da classe Class instânciada pelo método getClass() anteriormente. Esse método
		// encontra um recurso com um determinado nome.
	// path é passado como parâmetro, ou seja, o nome do arquivo de imagem que será passado quando um objeto do 
	// tipo Spritesheet for instanciado.
	// Ex: Spritesheet spritesheet = new Spritesheet("/spritesheet.png");
	// getResource procura um recurso com o nome passado no path.
	// Esse código inteiro serve para passar o nome da imagem que será lida, e armazenar na variável spritesheet
	//-----------------------------------------------------------------------------------------------
	//MÉTODO DA CLASSE SPRITESHEET PARA CAPTURAR PARTES MENORES DE UMA IMAGEM MAIOR
	public BufferedImage getSprite(int x, int y, int width, int height) {
		return spritesheet.getSubimage(x, y, width, height); //getSubimage é um método interno da classe BufferedImage
		// como a imagem do spriteshee ja foi carregada, esse método irá retornar partes específicas desta imagem.
		
	}
}


