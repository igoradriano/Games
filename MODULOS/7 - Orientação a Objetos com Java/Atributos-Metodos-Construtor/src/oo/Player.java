package oo;

public class Player {

    public int vidaInicial, tempo;

    public Player(int vidaInicial, int tempo){
        /*
        Fazendo isso, o par�metro vidaInicial do m�todo ser� colocado no vidaInicial da classe, utilizando o this.
         */
        this.vidaInicial = vidaInicial;
       System.out.println(this.vidaInicial);
    }

}
