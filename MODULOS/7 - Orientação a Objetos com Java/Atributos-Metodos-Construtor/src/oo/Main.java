package oo;

public class Main extends Player {

    /*
    Atributos s�o vari�veis de classe
     */
    private String nome = "Guilherme";
    private int[] numeros;
    public static final int VIDA_MAXIMA = 100;

    /*
    M�todo Construtor � primeiro m�todo que sempre ser� chamado quando instanciar a classe
     */
    public Main(int n1, int n2){
        /*
        o super � o m�todo que ir� chamar o m�todo construtor da classe Pai
         */
        super(n1, n2);
        System.out.println("Classe criada");

        numeros = new int[100];
    }

    public String getNome()
    {
        return nome;
    }

    public static void main(String[] args) {
        /*
        Quando se passa par�metros no m�todo, � NEESS�RIO passar par�metros depois.
         */
        Main m = new Main(100, 200);

        System.out.println(m.getNome());
        System.out.println(m.VIDA_MAXIMA);
    }
}
