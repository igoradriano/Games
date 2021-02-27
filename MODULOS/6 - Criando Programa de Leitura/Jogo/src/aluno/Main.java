/*
Package aluno � o package que foi criado dentro do src, e alunos � o nome dele
se importa ele para dizer onde essa pasta est� localizada, j� que o projeto pode
ter v�rias pastas com v�rios c�digos.
 */
package aluno;

/*
Aqui fica os imports, que s�o bibliotecas que s�o importadas para serem
usadas fun��es dentro do programa
 */
import java.util.Random;
import java.util.Scanner;

/*
Main � o nome da classe ( nome do arquivo criado ), ele n�o pode ser main com letra minuscula
porque ir� dar conflito com o m�todo main, sempre iniciar nome de classe com letra mai�sucla
 */
public class Main {
    /*
    M�todo main, o m�todo que inicia todo o programa a ser executado
    Ele nunca mudar� de nome, pois o main n�o � o nome da sua classe, e sim o nome do m�todo
     */
    public static void main(String[] args) {
        /*
        Aqui est� o Scanner, que � uma classe que ser� usada
        onde cont�m os m�todos para entrada de dados do usu�rio

        O Scanner � uma classe, o nome entrada � o nome da vari�vel, importante
        n�o usar a vari�vel in pois ela pode dar erro porque o System.in j� � com esse nome.
        O system.in � um argumento passado para o construtor da classe
        N�o se preocupe com essa nomenclatura por agora, pois ser� ensinada nos pr�ximos m�dulos

        Para utilizar o Scanner, tu ir� ter que importar ele, para fazer isso
        � s� ir com o mouse em cima do Scanner ou clicar com o bot�o direito em cima do Scanner, e ir em
        import "Scanner.java.util"
         */
        Scanner entrada = new Scanner(System.in);

        /*
        Random � outro objeto que ser� usado, para gerar n�meros
        aleat�rio, n�o se preocupem com isso por enquanto, pois no pr�ximo
        m�dulo ser� explicado o que � um objeto e como utilizar e criar.
         */
        Random rand = new Random();

        /*
        Podemos declarar mais vari�veis juntas, se forem do mesmo tipo
        s� precisa ser separada por virgula
         */
        String nome;

        System.out.println("Seja bem-vindo ao jogo! Insira o seu nome: ");
        /*
         Vari�vel do tipo String que ir� pedir para o usu�rio
         digitar algo e ir� guardar esse dado na vari�vel nome.
         A fun��o nextLine() � uma fun��o que ir� deixar o usu�rio digitar algo.

         Veja que a fun��o nextLine() est� sendo acessado pela vari�vel entrada, que foi criada
         ali em cima.
         */
        nome = entrada.nextLine();
        System.out.println("Seja muito bem-vindoo(a) " + nome);
        System.out.println("Voc� deseja avan�ar para qual dire��o ? (w, s, a, d) ");
        String comando = entrada.nextLine();
        if(comando.equals("w")){
            System.out.println("Voc� est� indo para frente!");
            System.out.println("Um inimigo surgiu, o que deseja fazer ? (a = atacar, c = correr) ");

            comando = entrada.nextLine();
            if(comando.equals("a")){

                /*
                Aqui ser� usado a vari�vel rand criada a cima, usando o m�todo nextInt que ir� gerar
                um n�mero aleat�rio entre 0 a 99, como � dito ali dentro, onde coloca o 100, e ai feito a express�o
                SE o rand(n�mero rand�mico) for < 75 dai ir� entrar no if, SENAO ele ir� ir para o ELSE,
                dando assim 75% do personagem ganhar, j� que � de 0 a 75.
                 */
                if(rand.nextInt(100) < 75){
                    System.out.println("Voc� ganhou o JOGO!");
                }else{
                    System.out.println("Voc� PERDEU o JOGO!");
                }
            }else{
                System.out.println("Voc� correu! O jogo terminou!");
            }
        }else if(comando.equals("s")){
            System.out.println("Voc� est� entrando em outro mapa...");
            /*
            Deem continuidade
             */
        }
    }
}
