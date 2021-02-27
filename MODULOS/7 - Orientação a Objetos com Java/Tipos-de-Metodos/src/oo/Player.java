package oo;

public class Player {

    /*
    Isso se chama m�todo, � uma fun��o criada, que pode ou n�o receber
    par�metros, os par�metros s�o colocados dentro dos par�ntes.

    Public = singifica que a fun��o ser� acess�vel para todas as outras classes quando for instanciada
    Private = significa que a fun��o ser� s� acess�vel para essa classe
    Protected = significa que as todas classes que estiverem dentro desse pacote (oo) poder� acessar os m�todos, mas outras
    classes n�o.

     */
    public void nascer(){
        System.out.println("Nasceu...");

        /*
        Chamando o m�todo statico que foi criado dentro da classe Main,
        pode se ver que n�o precisou instanciar, s� chamar pelo nome da classe e o nome do m�todo
         */
        Main.exemplo();
    }

    private void morrer(){
        System.out.println("Morreu...");
    }

    protected void reviver(){
        System.out.println("Reviveu...");
    }
}
