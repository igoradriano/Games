/*
Package oo � o package que foi criado dentro do src, e alunos � o nome dele
se importa ele para dizer onde essa pasta est� localizada, j� que o projeto pode
ter v�rias pastas com v�rios c�digos.
 */
package oo;

/*
Player � o nome da classe ( nome do arquivo criado ), ele n�o pode ser main com letra minuscula
porque ir� dar conflito com o m�todo main, sempre iniciar nome de classe com letra mai�sucla

O extends � usado para chamar outra classe, abstrata ou uma classe normal, assim pegando todos os seus
atributos e m�todos

O implements � usado para chamar uma interface
 */
public class Main extends TesteAbstract implements PlayerInterface {
    /*
    M�todo main, o m�todo que inicia todo o programa a ser executado
    Ele nunca mudar� de nome, pois o main n�o � o nome da sua classe, e sim o nome do m�todo
     */
    public static void main(String[] args) {

        /*
        Player � o nome do objeto criado
        player � o nome da vari�vel de tipo PLAYER
        new � a palavra reservado para INSTANCIAR um novo objeto, ou seja
        ir� criar o objeto agora, e ele ser� do tipo PLAYER, pois estamos dizendo
        new Player();
         */
        Player player = new Player();
        Player player2 = new Player();
        /*
        Se quiser usar s� uma vez pode ser feito a instancia��o dessa forma
        e j� chamando o m�todo na mesma linha
         */
        new Player().iniciarJogador();

        Inimigo inimigo = new Inimigo();

        /*
        Aqui estamos usando a vari�vel do tipo Player para
        chamar o m�todo que criamos la dentro da classe Player,
        para isso usamos um ponto e escrevemos o nome do m�todo.
         */
        player.iniciarJogador();
        player2.iniciarJogador();
        inimigo.iniciarInimigo();

        /*
        Instanciando um novo objeto do tipo Main e chamando o m�todo instanceMain2()
         */
        new Main().instanceMain2();
        /*
        Instanciando um novo objeto do tipo Main e chamando o m�todo chamarMetodoBastract()
         */
       //new Main().chamarMetodoAbstract();

        /*
        Isso daqui s� ir� funcionar se tirar o abstract da classe TesteAbstract
         */
        // new TesteAbstract();

        new Main().iniciar();
    }

    /*
    Quando se cria um m�todo que j� foi criado na classe abstrata, isso se
    chama reescrever o m�todo, sobrecarregar m�todo
     */
    @Override
    public void iniciarJogo() {

    }

    /*
     M�todo criado para chamar m�todo da classe Abstrata
   */
    public void chamarMetodoAbstract(){
        /*
        O this referencia atributos e m�todos que tem na pr�pria classe
         */
       this.chamarMetodoAbstract();
    }

    /*
    Criando um m�todo para que possa chamar a nova classe criada
     */
    public void instanceMain2()
    {
        new Main2().print1();
    }

    /*
    M�todo implementado da interface criada, e agora pode criar as instru��es para ela
     */
    @Override
    public void iniciar() {
        System.out.println("M�todo da Interface");
    }

    @Override
    public void morrer() {

    }

    @Override
    public void perderVida() {

    }
    /*************************************************************************************/
    /*
    Fazer uma classe dentro da outra se chama Inner Class
     */
    private class Main2{
        public void print1()
        {
            System.out.println("Chamando meu m�todo na classe Main2");
        }
    }

}