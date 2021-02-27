package graficos;

import java.awt.Dimension; //importando Dimension
import javax.swing.JFrame;  //importando JFrame
import java.awt.Canvas;    // importando Canvas
public class Game extends Canvas implements Runnable{  //Classe Game com Interface Runnable
	
	public static JFrame frame;  //declarando frame do tipo JFrame
	private final int  WIDTH = 160; //declarando constante WIDTH com tamanho	
	private final int HEIGTH = 120;
	private final int SCALE = 3;
	
	public Game() {   //M�todo Construtor	
		this.setPreferredSize(new Dimension(WIDTH*SCALE,HEIGTH*SCALE));  //criando Janela passando as constantes como par�metro
		frame = new JFrame("Janela do Igor");   //instanciando JFrame
		frame.add(this);  //'this' se refere ao Canvas, no caso a linha de cima, this.setPreferenceSize
		frame.setResizable(false); //N�o quero que usu�rio consiga redimensionar a Janela
		frame.pack(); //m�todo do frame para depois que adicionar o canvas, calcular certo as dimensoes e mostrar
		frame.setLocationRelativeTo(null);  //abre no centro da tela
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Chamando m�todo frame dizendo que quando clicar eu quero que de fato feche sem continuar executando o programa.
		frame.setVisible(true);  //Quando inicializar ja est� vis�vel
		
	}
	public static void main(String[] args) {
		Game game = new Game(); 
	}
	public void run() {	
	}

}
