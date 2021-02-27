package graficos;

import javafx.print.PageLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

public class Game extends Canvas implements Runnable{

    /*
    JFrame representa a janela do programa com barra de t�tulo, �cone, bot�es de comando, etc
     */
    public static JFrame frame;
    private Thread thread;
    /*
    BufferedImage ser� utilizado para renderizar uma imagem preta por baixo de tudo
    para depois conseguir renderizar mapas, sprites e tudo mais
     */
    private BufferedImage image;
    // Criando variavel para imagem do player ser� um array contendo as 2 imagens de anima��o
    private BufferedImage[] player;
    /*
    Criando uma variavel do tipo Spritesheet
     */
    private Spritesheet sheet;

    private final int WIDTH = 160;
    private final int HEIGHT = 120;
    private final int SCALE = 3;

    // Variavel criada para posi��o do x do player
    private int x = 0;

    // Variavel que ser� respons�vel pelo controle  dos frames
    private int frames = 0;
    // Variavel para dizer a velocidade que ir� acontecer a anima��o
    private int maxFrames = 5;
    // Variavel ser� repsons�vel pelos indexes do array
    private int curAnimation = 0;
    // Variavel que v� quantas anima��es tem
    private int maxAnimation = 4;

    private boolean isRunning = true;

    public Game(){
        // Instanciando a variavel Spritesheet
        sheet = new Spritesheet("/spritesheet.png");
        // Dizendo que o player st�r� na posi��o 0 e 0 do arquivo spriteSheet, e que � do tamanho 16, 16
        // player = sheet.getSprite(0, 0, 16, 16);
        player = new BufferedImage[4];
        player[0] = sheet.getSprite(0, 0, 16, 16);
        player[1] = sheet.getSprite(16, 0, 16, 16);
        player[2] = sheet.getSprite(32, 0, 16, 16);
        player[3] = sheet.getSprite(48, 0, 16, 16);
        /*
        Esse m�todo � para atribuir o tamanho da janela que ir� querer, o
        new Dimension ir� fazer uma nova dimens�o
         */
        setPreferredSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
        initFrame();
        image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
    }

    public void initFrame(){
        // Criando uma nova instancia do JFrame
        frame = new JFrame("Game #1");
        // vai adicionar o canvas ao JFrame
        frame.add(this);
        // m�todo para redimencionar a tela, est� como falsa para n�o deixar
        frame.setResizable(false);
        // m�todo do frame para calcular certa as dimens�es e mostrar
        frame.pack();
        // m�todo para fazer a localiza��o da tela, dizendo que � null, ela estar� indo para o centro
        frame.setLocationRelativeTo(null);
        // m�todo que ir� dizer que se clicar no bot�o de fechar, ele ir� fechar, e n�o deixar em segundo plano
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // m�todo para deixar a janela vis�vel
        frame.setVisible(true);
    }

    public synchronized void start(){
        thread = new Thread(this);
        isRunning = true;
        thread.start();
    }

    public synchronized void stop(){
        isRunning = false;
        try{
            thread.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }

    public void tick(){

        frames++;
        if(frames > maxFrames){
            frames = 0;
            curAnimation++;

            if(curAnimation >= maxAnimation){
                curAnimation = 0;
            }
        }
    }

    public void render(){
        /*
        Buffer Strategy � uma sequencia de buffer usadas para otimizar a renderiza��o
        visto que buffer � uma �rea de armazenamento tempor�rio de dados.
         */
        BufferStrategy bs = this.getBufferStrategy();
        /*
        Se n�o tiver um BufferStrategy ele ir� criar e retornar ele
         */
        if(bs == null){
            /*
            Usasse-se 3 para melhor limpeza e otimiza��o
             */
            this.createBufferStrategy(3);
            return;
        }

        //Cria��o de uma vari�vel de objeto Graphics que contem m�todos para renderizar na tela
        Graphics g = image.getGraphics();
        // Aqui ser� definido a cor
        g.setColor(new Color(0, 0, 255));
        // Aqui ser� definido o tamanho e posi��o do ret�ngulo
        // Faz a largura e a altura
        g.fillRect(0, 0, WIDTH, HEIGHT);

        // RENDERIZA��O DO JOGO

        // Desenhando um retangulo
//        g.setColor(Color.red);
//        g.fillRect(20, 20, 80, 80);
//
//        // Desenhando uma forma Oval
//        g.setColor(Color.CYAN);
//        g.fillOval(50, 50, 60, 60);
//
//        // Desenhando string
//        g.setFont(new Font("Arial", Font.BOLD, 20));
//        g.setColor(Color.yellow);
//        g.drawString("GAME", 90, 90);

        // Variavel g2 sendo do tipo Graphics2D s� para pegar m�todos para renderiza��o da anima��o
        Graphics2D g2 = (Graphics2D) g;
        // M�todo para rotacionar o sprite, o toRadians ir� converter o 90 que � em graus para radianos e os outros � posi��o x e y
        // g2.rotate(Math.toRadians(45), 90 + 8, 90 + 8);
        // Desenhando o player
        //g2.drawImage(player, 90, 90, null);

        g2.drawImage(player[curAnimation], 90, 90, null);

        // M�todo para limpar dados das imagens que foram utilizado antes
        g.dispose();
        // O que foi feito antes foi desenhado na imagem, e agora ser� desenhado essa imagem na tela
        g = bs.getDrawGraphics();
        g.drawImage(image, 0, 0, WIDTH * SCALE, HEIGHT * SCALE, null);
        // Aqui ser� feito a exibi��o de tudo que foi feito no render
        bs.show();
    }

    @Override
    public void run() {
        // Essa vari�vel ir� pegar o tempo atual do nosso computador em nano segundos para precis�o
        long lastTime = System.nanoTime();
        // Quantos frames por segundo ir� querer;
        double amountOfTicks = 60.0;
        // Variavel que ir� dividir um segundo no formato de nano segundos para o tanto de FPS que ir� querer
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        // Variavel que ir� ser o FPS
        int frames = 0;
        // Variavel que pegar� o tempo atual s� qu deu ma forma mais leve
        double timer = System.currentTimeMillis();
        while(isRunning){
            // Variavel pegar� o tempo atual do nosso computador
            long now = System.nanoTime();
            /*Calculando o intervalo para executar o update(tick), pois est� dividindo a variavel do temp ode agora
            pelo tempo decorido at� aqui que � a vari�vel lastTime e tudo divido pelo tanto de FPS que foi calculado a cima
             */
            delta += (now - lastTime) / ns;
            // Para atirbuir o tempo atual para a variavel lastTime, assim sempre ir� atualizar o tempo em condi��o do agora
            lastTime = now;
            if(delta >= 1){
                tick();
                render();
                frames++;
                delta--;
            }
            /*SE System.currenteTimeMillis() - timer for maior ou igual a 1000 significa que passou um segundo
            ap�s a ultima vez que passou a mensagem
             */
            if(System.currentTimeMillis() - timer >= 1000){
                System.out.println("FPR: " + frames);
                frames = 0;
                timer += 1000;
            }
        }
        /*
        Metodo de garantia se der algum problema no m�todo, que as Threads parem acionando o
        public synchronized void stop()
         */
        stop();
    }
}
