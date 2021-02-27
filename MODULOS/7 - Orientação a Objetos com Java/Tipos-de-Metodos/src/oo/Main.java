/*
Package oo � o package que foi criado dentro do src, e alunos � o nome dele
se importa ele para dizer onde essa pasta est� localizada, j� que o projeto pode
ter v�rias pastas com v�rios c�digos.
 */
package oo;

/*
Player � o nome da classe ( nome do arquivo criado ), ele n�o pode ser main com letra minuscula
porque ir� dar conflito com o m�todo main, sempre iniciar nome de classe com letra mai�sucla

 */
public class Main{
    /*
    M�todo main, o m�todo que inicia todo o programa a ser executado
    Ele nunca mudar� de nome, pois o main n�o � o nome da sua classe, e sim o nome do m�todo

    O static significa que o m�todo ser� independente, ou seja, ele pode ser chamado
    tanto na mesma classe ( n�o precisando colocar o nome da classe Antes), e em outras classes , sem precisar instanciar a classe,
    s� chamando pelo nome da classe e o m�todo. Por exemplo: Player2().reviver();

    Void = � o retorno do m�todo, que no caso void significa que n�o ir� retornar nada, s� ir� executar um procedimento.
    Se disser que � int, String, char, boolean, float, double, etc a fun��o � OBRIGADA a ter a palavra reservada RETURN

    O que est� entre par�nteses s�o os par�metros/atributos por exemplo: public static int metodo(int n1, int n2)
     */
    public static void outroExemplo(int[] n1, String[] nome){
        /*
        Chamando o primeiri indice do array de n1
         */
        System.out.println(n1[0]);
        System.out.println(nome[0]);
    }

    public static int novoExemplo(){
        /*
        Como a fun��o � int, ent�o o return precisar� retornar um INTEIRO
         */
        return 1;
    }

    public static String novoExemplo2(){
        return "Guilherme";
    }

    public static void exemplo(){
        System.out.println("Exemplo");
    }

    private static void OutroExemplo(){
        exemplo();
    }

    /*
    O String[] args � usado para quando for executar o programa pelo terminal,
    dai poder� ser passado par�metros para ele.
     */
    public static void main(String[] args) {
        new Player2().nascer();
        new Player2().reviver();

        /*
        Como o m�todo exemplo � est�tico, pode ser chamado sem instanciar
        e sem colocar o nome da classe antes
         */
        exemplo();

        /*
        Ser� printado o n�mero que a fun��o retornou
         */
        System.out.println(novoExemplo());

        /*
        Retornar� a string que foi colocado no return
         */
        System.out.println(novoExemplo2());

        /*
        Como no m�todo j� foi implementado a fun��o de printar, aqui pode ser passado s� o m�todo mesmo.
        Mas veja que dentro do m�todo tem os par�metros que foi requerido la, o primeiro era um n�mero
        e o segundo uma string. Se n�o passar, dar� erro.
         */
        int[] n1 = new int[10];
        n1[0] = 10;
        String[] nomes = new String[2];
        nomes[0] = "Jo�o";
        outroExemplo(n1, nomes);
    }

}