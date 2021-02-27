package inicio_logica_games;

import java.util.ArrayList;

/*
Implementando a interface Runnable, que ser� respons�vel por implementar o m�todo run() para que possamos
executar o looping do jogo
 */
public class Game implements Runnable {

    private boolean isRunning;
    /*
    Thread � um pequeno programa que trabalha como um subsistema, sendo uma forma de um processo se autodividir
    em duas ou mais tarefas. � o termo em ingl�s para Linha ou Encadeamento de Execu��o.
     */
    private Thread thread;

    private ArrayList<Entidade> entidades = new ArrayList<>();

    public Game(){
        entidades.add(new Entidade());
        entidades.add(new Entidade());
        entidades.add(new Entidade());
        entidades.add(new Entidade());
        entidades.add(new Entidade());

        for(int i = 0; i < entidades.size(); i++){
            /*
            Forma para se pegar a entidade
             */
            Entidade e = entidades.get(2);
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        // Dando start no jogo
        game.start();
    }

    /*
    M�todo avan�ado para manter o jogo sempre sincronizado
     */
    public synchronized void start(){
        /*
        Dizendo que o isRunning ser� true, para que o loop funcione e fique
        sempre executando
         */
        isRunning = true;
        /*
        Passando o this no new Thread() estar� dizendo
        que ir� querer executar esse game, assim chamando o m�todo run
         */
        thread = new Thread(this);
        thread.start();
    }

    // Tick � o m�todo de atualizar, usado para atualizar a cada frame o game
    public void tick(){
        //System.out.println("Tick");
    }

    // M�todo para renderizar o jogo, aparecer na tela
    public void render(){
        //System.out.println("render");
    }

    @Override
    public void run() {
        while(isRunning){
            tick();
            render();

            /*
            Game Loop amador, usado para coisas r�pidas, n�o � uma forma
            otimizada

            try {
                Thread.sleep(1000 / 60);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            */

        }
    }
}
