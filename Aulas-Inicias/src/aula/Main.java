package aula;

public class Main {

	public static void main(String[] args) {
		//---------------------------------------------------------------------------
		 
		 int idade = 24;
		 System.out.println("Minha idade é " +idade); 
		 idade = 25;
		 System.out.println("Minha idade é " +idade);
		 idade = 26;
		 System.out.println("Minha idade é " +idade);
		 
		//---------------------------------------------------------------------------
		//Tipos de variáveis
		int numero = 24;
		String frase = "Olá mundo!";
		boolean var = true;
		char var2 = 'a';
		double var3 = 24.9;
		long numeroGrande = 1000009899;
		
		System.out.println(numero);
		System.out.println(frase);
		System.out.println(var);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(numeroGrande);
		
		//---------------------------------------------------------------------------
		//Constantes
		final int vida_maxima = 10;
		System.out.println(vida_maxima);
		//vida_maxima = 90; Vai dar erro, pois estou tentando mudar uma constante.
		
		//---------------------------------------------------------------------------
		//ARRAYS NORMAL
		String[] nome = new String[5];
		nome[0] = "Guilherme";
		nome[1] = "João";
		System.out.println(nome[0]);
		//Podemos ainda Juntar string com texto
		System.out.println("O nome é "+nome[1]);
		
		//ARRAYS MULTIDIMENSIONAL
		String[][] nome2 = new String[5][5];
		nome2[0][0] = "Felipe Rodrigues";
		System.out.println(nome2[0][0]);
		//---------------------------------------------------------------------------
		//Condições
		int vida = 101;
		if(vida == 100) {
			vida+=100;	
			System.out.println("Minha vida é igual a 100!");
		}else {
			System.out.println("Minha vida não é igual a 100!");
		}	
		
		String nome3 = "Daniel";
		if(nome3 == "igor") {
			System.out.println("Nome igual a " + nome3);	
		}else if(nome3 =="Joao"){
			System.out.println("Nome igual a " + nome3);
		}else if(nome3 == "Felipe") {
			System.out.println("Nome igual a " + nome3);
		}else {
			System.out.println("Nome não é igual a nada que temos aqui ");
		}
		
		if (nome3 != "Joao") {
			System.out.println(" O nome é diferente de João");
		}
		
		boolean var4 = true;
		if (var4 == true) {  //quando for true, nem preciso colocar a igualdade
			System.out.println("Verdade!");
		}
		//---------------------------------------------------------------------------
		//Switch e Case
		int vida2 = 90;
		switch(vida2) {
			case 90:
				//Execute alguma coisa aqui!
				System.out.println("Quero que meu personagem corra mais rápido!");
				break;   //muito importante para não constinuar executando!
			case 30:
				//Execute esta outra coisa!
				System.out.println("Minha vida é igual a 30");
				break;
			default:
				System.out.println("Nenhua condição Bateu, eu tenho 100 de vida!");
		
		}
		//---------------------------------------------------------------------------
		//Operações Avançadas e Operações Matemáticas
		int vida_3 = 54;
		int vida_4 = 100;
		int vida_5 = 100;
		int vida_final = vida_3 + vida_4 + vida_5;
		System.out.println(vida_3 + vida_4 + vida_5);
		System.out.println(vida_final);
		
		int vida_final2 = ((vida_3 + vida_4)/2) + 2;
		System.out.println(vida_final2);
		
		//Operadores
		
		// && -> E;
		// || -> OU;
		//
		String nome_jogador = "Igor";
		int skill = 89;
		int speed = 200;
		if(((nome_jogador == "Guilherme" && skill == 100)) && (speed >150)){
			System.out.println("Guilherme é um jogador muito rápido e tem bastante skill");
		}else {
			System.out.println("Seu jogador é muito ruim!! Arg");
		}
		
		if(((nome_jogador == "Guilherme" || nome_jogador == "Igor")) && (speed >150)){
			System.out.println( nome_jogador + " é um jogador muito rápido e tem bastante skill");
		}else {
			System.out.println("Seu jogador é muito ruim!! Arg");
		}
		//-----------------------------------------------------------------------------
		//Loppings
		int cont = 0;
		//While
		while(cont <10) {
			System.out.println("Olá! agora o contador está em " + cont);
			cont ++;
		}
		//For
		for (int i = 0; i<=10;i++) {
			System.out.println("Olá! agora o contador está em " + i);
		}
		//Do While
		int contador = 0;
		do{
			System.out.println(contador);
			contador ++;			
		}while(contador < 3);
		
		//---------------------------------------------------------------------------
		
	}
	
}
