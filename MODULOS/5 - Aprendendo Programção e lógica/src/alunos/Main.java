/*
Package aluno � o package que foi criado dentro do src, e alunos � o nome dele
se importa ele para dizer onde essa pasta est� localizada, j� que o projeto pode
ter v�rias pastas com v�rios c�digos.
 */
package alunos;

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
        /**************************** Hello World *******************************/
        /*
        System.out.println � o m�todo para printar frases, variaveis, etc no console
        Usado para debugar programas.
        O println pular� uma linha, j� s� o print s� ir� printar tudo na mesma linha
        Ent�o cuidado com qual ir� usar
         */
        System.out.println("Hello World");

        /**********************************************************/

        /**************************** Vari�veis em Java *******************************/
        /*
        Assim se escreve uma variavel em java
        Onde primeiro ser� o tipo da vari�vel, podendo ser, int, float, double, boolean, string, arrays, etc
        Depois vem o nome da variavel que no caso est� como idade.
        E por ultimo vem o valor, que � atribuido atrav�s do sinal: = : que � o sinal que atribui o valor a vari�vel.
         */
        int idade = 24;
        /*
        Abaixo est� sendo concatenado uma frase com uma vari�vel, concatenar � juntar uma vari�vel com uma frase
        que � feito usando o operador: +
         */
        System.out.println("Minha idade � " + idade + " anos");

        /**********************************************************/

        /**************************** Tipos de Vari�veis *******************************/

        // As vari�veis podem ser alteradas em qualquer parte do seu c�digo //

        // Int � um tipo que guarda s� numeros inteiros, seja negativo ou positivo, e o valor tem que ir sem aspas
        int numero = 2400000;

        // String � um tipo que guarda frases, qualquer tamanho, e o valor precisa ir dentro de aspas duplas
        String frase = "Ol� mundo";

        // Boolean � o tipo que pode ser true ou false, serve para condicionais, e seu valor deve ser escrito sem aspas
        boolean condicao = true;

        // Char � um tipo que guarda s� um caracter, e seu valor precisa ir com aspas simples
        char caracter = 'a';

        /*
        Double � um tipo que guarda um n�mero com ponto flutuante com bastante precis�o,
        e seu valor precisa ir sem aspas e com ponto separando as casas decimais
        */
        double numeroDouble = 24.9;

        /*
        Float � um tipo que guarda um n�mero com ponto flutuante com precis�o, mas menos precis�o que Double,
        e seu valor precisa ir sem aspas e com ponto separando as casas decimais e com "f" atr�s para simbolizar o float
        */
        float numeroFloat = 3.9f;

        System.out.println(numero);
        System.out.println(frase);
        System.out.println(condicao);
        System.out.println(caracter);
        System.out.println(numeroDouble);
        System.out.println(numeroFloat);

        /**********************************************************/

        /**************************** Constantes *******************************/

        // Constantes se define o valor uma vez e n�o pode ser mais alterado em lugar algum

        /*
        Para se declarar uma constante precisa ser adicionado a palavra reservada: final
        antes do tipo da vari�vel, assim ela n�o poder� ser mais mudada durante o c�digo
         */
        final double PI = 3.1416;

        System.out.println(PI);

        /**********************************************************/

        /**************************** Arrays *******************************/

        // S�o estruturas de dados que armazena uma cole��o de elementos, podendo ser acessados atrav�s de indices
        // Lembre-se o �ndice sempre inicia em zero.

        /*
        Para se declarar um array, primeiro precisa colocar o tipo da vari�vel,
        depois um [] para que possa ser intentificado como Array, e depois o nome da
        vari�vel, e ap�s isso ela precisa ser instanciada ( ser� visto melhor esse termo no m�dulo posterior)
        Assim criando o array, e nessa instancia��o que � o: new String[5] dentro do colchetes vai o n�mero total
        de elementos que esse array ter�, iniciando do 0, ou seja: 0 1 2 3 4.. � um array com 5 elementos.
         */
        String[] nome = new String[5];

        /*
        Aqui estamos escrevendo o nome Guilherme e adicionando no primeiro indice, acessando
        ele com o nome da vari�vel e o primeiro indice do array que � zero.
        E depois adicionando Jo�o no inidice 1 do array.

        Ai temos um array simples
         */
        nome[0] = "Guilherme";
        nome[1] = "Jo�o";

        // Se acessa assim para imprimir o primeiro nome
        System.out.println("Meu nome � " + nome[0]);

        /* Array Multidimenciona
        Array multidimencional funciona como uma matriz
        Por exemplo uma tabela do excel, que tem colunas e linhas
        Tem a mesma fun��o que o array simples, s� que com muito mais espa�o e ordenada como uma matriz
         */

        /*
        Para criar um array multidimencional se faz igual ao um array simples s� que se adiciona
        String [][] pois ser� um array com duas dimens�es, poderia ser
        String [][][] e ai seria um array com 3 dimens�es
        Aqui temos um array com 5 elementos e mais 5 elementos
         */
        String[][] nome1 = new String[5][5];

        /*
        Aqui estamos acessando o primeiro �ndice, n�o esquecendo que agora � preciso
        colocar dois [][] e assim dizendo que � no �ndice 0
        E o outro no indice 1.
         */
        nome1[0][0] = "Guilherme";
        nome1[0][1] = "Jo�o";

        /*
        para imprimir no console se usa assim
         */
        System.out.println("Meu nome � " + nome1[0][1]);

        /**************************** Condi��es *******************************/

        /*
        Condicionais s�o utilizadas a todo tempo em programas, para definir o que o
        programa far� SE algo acontecer.
        S�o como rotas que ser�o tra�adas, se algo acontecer ir� para outro lado e assim
        por diante
         */

        int vida = 100;

        /*
        O if traduzindo para o portugu�s significa SE, ou seja
        SE algo acontecer ir� fazer isso
        Para entrar na condicional if a express�o dentro dele precisa ser verdadeira, pois SENAO
        ir� passar para o ELSE

        *Obs: o operador == � um operador de igualdade e o += est� somando e atribuindo 100 a vari�vel vida

        Aqui dir� SE vida for IGUAL a 100 ir� entrar ali na condi��o
        e ir� adicionar mais 100 na vari�vel vida e ir� imprimir no console a vari�vel vida
         */
        if(vida == 100){
            vida += 100;

            System.out.println("Minha vida � igual a 100!");
        /*
            O else, traduzindo para o portug�s significa SENAO,
            ou seja SE vida n�o for IGUAL a 100, ir� printar no console
            a frase definida ali embaixo
        */
        }else{
            System.out.println("Minha vida n�o � igual a 100!");
        }

        /*
        Operadores que podem ter dentro do if para compara��es de tipos de vari�veis num�ricas

        < Menor
        > Maior
        <= Menor ou igual �
        >= Maior ou igual �
        == Igual
        != Diferente
         */

        // Para vari�veis do tipo string s� pode ser usado a igualdade ou Diferente

        String novoNome = "Guilherme";

        if(novoNome == "Guilherme"){
            System.out.println("Nome igual a " + novoNome);
        /*
        O else if significa SENAO SE

        pode ter quantos else if quiser mas cuidado, pois o else if precisa ir depois do if e antes do else
        o ELSE precisa ser sempre o ultimo, ou n�o precisa ter ELSE
         */
        }else if(novoNome == "Felipe"){
            System.out.println("Nome igual a " + novoNome);
        }else{
            System.out.println("Nome diferente de " + novoNome);
        }

        boolean variavelBool = true;

        /*
        Quando se tem s� uma instru��o dentro do if, pode ser feito
        sem adicionar as chaves, para mais de uma instru��o precisa da chave
         */
        if(variavelBool)
            System.out.println("A vari�velBool � " + variavelBool);
        else
            System.out.println("A vari�velBool � " + variavelBool);

        /**********************************************************/

        /**************************** Switch e case *******************************/

        /*
        O switch case � uma condicional para testar v�rios valores com mais rapidez
        e escrevendo menos c�digo que no if
        Mais a diferen�a dele para o if � que dentro do switch n�o pode ir express�es, ele
        s� testar� vari�veis, j� o if testa express�es complexas

        Dentro do switch vai a vari�vel a ser testada, sendo booleana, do tipo num�rio, ou tipo string ou char.
        E dai no case vai testar os valores
        Usa-se o break para que o programa n�o de erro na execu��o, assim quando der break
        o programa ir� parar na condi��o que ja der correto, se n�o ele poder�
        testar cada condi��o e deixar o programa lento ou dar bug
         */

        int vida2 = 100;

        switch (vida2){
            // CASO vida2 sej� igual a 100
            case 100:
                // Far� isso daqui
                System.out.println("Vari�vel vida2 � " + vida2);
                // Break para quebrar a execu��o
                break;
            case 200:
                System.out.println("Vari�vel vida2 � " + vida2);
                break;
            case 400:
                System.out.println("Vari�vel vida2 � " + vida2);
                break;
        }

        /**********************************************************/

        /*********** Operacoes avan�adas e opera��es matem�ticas ***********************/

        /*
        Dentro de programas podemos fazer opera��es matem�ticas como
        Somar, dividir, multiplicar, subtrair e entre outras
        E tamb�m veremos operadores para compara��es, e para fazer express�es mais complexas

        + Mais
        - Menos
        * Multiplicar
        / Dividir
        % M�dulo ( Pouco usado )

        && E ( AND ) Teclas: Shift + 7 ( teclado n�merico a cima das letras )
        || OU ( OR ) Teclas: shift + \ ( Barra invertida est� do lado do shift esquerdo do seu teclado )
        == Igual
        != Diferente
         */

        int vida_1 = 100;
        int vida_2 = 200;
        int vida_3 = 300;

        // Aqui podemos guardar o resultado de uma opera��o matem�tica
        int vida_final = vida_1 + vida_2 + vida_3;
        /*
        Aqui o operador mais n�o servir� para concatenar e sim para fazer a soma
        dos valores das vari�veis, pois o computador j� percebe que s�o valores num�ricos
         */

        System.out.println(vida_1 + vida_2 + vida_3);

        // Exibindo a vari�vel vida_final contendo a soma das vidas
        System.out.println(vida_final);

        /*
        Como na matem�tica, dentro de um programa se queremos que algo seja
        calculado antes, n�s usaremos par�nteses como � mostrado abaixo
        Assim o que est� em par�nteses ser� calculado antes, e ap�s isso ser� feito o que
        est� fora dele
         */
        int vida_final2 = (vida_1 + vida_2) / 2;
        System.out.println(vida_final2);


        String nome_jogador = "Guilherme";
        int skill = 100;

        /*
        A condi��o se l� assim:
        SE (nome_jogador for IGUAL a Guilherme E skill for IGUAL a 100 ) E skill for MENOR OU IGUAL a 90
        fa�a a instru��o abaixo
         */
        if((nome_jogador == "Guilherme" && skill == 100) && skill <= 90){
            System.out.println("Verdade");
        }else{
            System.out.println("entramos no else");
        }

        /*
        Se (nome_jogador for IGUAL a Guilherme OU nome_jogador for IGUAL Jo�o) E skill for MAIOR OU IGUAL a 100
        fa�a a seguinte instru��o
         */
        if((nome_jogador == "Guilherme" || nome_jogador == "Jo�o") &&
                skill >= 100){
            System.out.println("Comece o jogo");
        }

        /*
        Imagem de resumo dos operadores est�o colocados na tabela na imagem que tem para download
         */

        /**********************************************************/

        /**************************** Looping *******************************/

        /*
        Loopings s�o utilizado para gerar uma a��o l�gica at� ou enquanto algo for de tal jeito.
        Temos os loop FOR, WHILE, DO WHILE e outros mais complexos, mas esses s�o os principais e mais
        usados.
        Com eles � poss�vel percorrer um array, e fazer outras diversas a��es.
         */

        /*
        Variavel que ir� servidor para incrementar o WHILE
        vari�vel muito importante, pois se n�o tiver ela
        o loop ir� executar infinitamente, e poder� travar o seu computador ou
        computador da outra pessoa.
        Ent�o cuidado para sempre usar uma vari�vel para incrementar dentro do while
         */
        int contador = 0;

        /*
        O WHILE traduzindo para o portug�s significa ENQUANTO
        ou seja, ENQUANTO algo for de tal jeito, ele ir� executar tal coisa
        Quanto a express�o for falsa ele sair� do loop e continuar� executando outras instru��es.
         */
        while(contador < 10){
            /* Aqui ir� exibir a Ol� 9 vezes, porque quando for 10 ele j� n�o ser� mais menor
            que 10 e por isso ir� sair do loop.
            Para executar 10 vezes, precisa colocar:  contador <= 10
            */
            System.out.println("Ol�! , agora o contador est� em: " + contador);

            /*
            Vari�vel sendo incrementada
            Quando se coloca ++ atr�s de uma vari�vel do tipo num�rica,
            ela ir� adicionar mais 1 na vari�vel o mesmo acontece com o --,
            s� que ai ir� decrementar 1 da vari�vel.
             */
            contador++;
        }

        /*
        O loop for � o mais usado para desenvolvimento, pois com ele n�o precisa
        se preocupar de n�o colocar a vari�vel incrementadora para n�o travar,
        pois em seu corpo ele j� traz ela.
        O for significa em programa��o: FA�A AT�.

        O for � constituido de 3 fases separadas por ponto e v�rgula
        A primeira: int i = 0 -> Essa fase � onde se cria a vari�vel e atribui um valor a ela
        A segunda: i <= 10 -> � a express�o que o loop ter� que fazer at� ser falso e sair do loop.
        A terceira: � a vari�vel que foi criada sendo incrementada ou se preferir, pode ser
        decrementada, assim fazendo a condi��o do for ser falsa, e saindo do loop
         */
        for(int i = 0; i <= 10; i++){
            System.out.println("Ol�! , agora o contador est� em: " + i);
        }

        /*
        O DO WHILE � um loop bem pouco usado, usado raramente, pois o while e o for
        j� consegue fazer 99% das coisas, e tamb�m por ser um loop um pouco mais complexo de se entender
        e aplicar.

        O DO ir� executar a instru��o e s� depois ir� entrar na verifica��o que � o WHILE
        por isso ele sempre ir� executar uma vez, e se n�o apssar na verifica��o ele sai do loop
        DO significa FA�A
        e o WHILE significa ENQUANTO
         */

        int contador1 = 0;
        do{
            System.out.println(contador1);
            // N�o esque�a de incrementar
            contador1++;
        }while(contador < 3);

        /**********************************************************/

    }
}
