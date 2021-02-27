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
        Podemos declarar mais vari�veis juntas, se forem do mesmo tipo
        s� precisa ser separada por virgula
         */
        String nome, idade, peso, cidade, estado, pais;

        System.out.println("Por favor digite o seu nome: ");

        /*
         Vari�vel do tipo String que ir� pedir para o usu�rio
         digitar algo e ir� guardar esse dado na vari�vel nome.
         A fun��o nextLine() � uma fun��o que ir� deixar o usu�rio digitar algo.

         Veja que a fun��o nextLine() est� sendo acessado pela vari�vel entrada, que foi criada
         ali em cima.
         */
        nome = entrada.nextLine();
        System.out.println("Por favor digite a sua idade: ");
        idade = entrada.nextLine();
        System.out.println("Por favor digite o seu peso: ");
        peso = entrada.nextLine();
        System.out.println("Por favor digite a sua cidade: ");
        cidade = entrada.nextLine();

        /*
        Condicional dizendo se ciade for IGUAL a Floripa ele far� tal coisa
        Lembre-se a palavra precisa ser digitada EXATAMENTE assim, com min�scula
        e maiuscula certa para cair dentro da condicional
         */
        if(cidade == "Floripa"){
            System.out.println("Show! Sou de Floripa");
        }
        System.out.println("Por favor digite o seu estado: ");
        estado = entrada.nextLine();
        System.out.println("Por favor digite o seu pais: ");
        pais = entrada.nextLine();

        /*
        Gerando resultados finais e imprimindo na tela
         */
        System.out.println("---------------------");
        System.out.println("Aqui est� o resultado do teste: ");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
        System.out.println("Pais: " + pais);
    }
}
