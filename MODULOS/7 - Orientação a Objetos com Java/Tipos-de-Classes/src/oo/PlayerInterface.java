package oo;

/*
Uma interface serve para que possa fazer assinatura de m�todos, ou seja
os m�todos n�o ser�o feitos aqui, apenas criado os nomes, dizendo que
a classe que der implements nessa interface, ter� que criar esses m�todos
fazendo suas instru��es. Pois uma interface n�o pode criar instru��es em m�todos.
 */
public interface PlayerInterface {

    public abstract void iniciar();
    public abstract void morrer();
    public abstract void perderVida();
}
