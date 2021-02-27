package aula;

public class Main {

	public static void main(String[] args) {
		//---------------------------------------------------------------------------
		 
		 int idade = 24;
		 System.out.println("Minha idade � " +idade); 
		 idade = 25;
		 System.out.println("Minha idade � " +idade);
		 idade = 26;
		 System.out.println("Minha idade � " +idade);
		 
		//---------------------------------------------------------------------------
		//Tipos de vari�veis
		int numero = 24;
		String frase = "Ol� mundo!";
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
		nome[1] = "Jo�o";
		System.out.println(nome[0]);
		//Podemos ainda Juntar string com texto
		System.out.println("O nome � "+nome[1]);
		
		//ARRAYS MULTIDIMENSIONAL
		String[][] nome2 = new String[5][5];
		nome2[0][0] = "Felipe Rodrigues";
		System.out.println(nome2[0][0]);
		//---------------------------------------------------------------------------
		//Condi��es
		int vida = 101;
		if(vida == 100) {
			vida+=100;	
			System.out.println("Minha vida � igual a 100!");
		}else {
			System.out.println("Minha vida n�o � igual a 100!");
		}	
		
		String nome3 = "Daniel";
		if(nome3 == "igor") {
			System.out.println("Nome igual a " + nome3);	
		}else if(nome3 =="Joao"){
			System.out.println("Nome igual a " + nome3);
		}else if(nome3 == "Felipe") {
			System.out.println("Nome igual a " + nome3);
		}else {
			System.out.println("Nome n�o � igual a nada que temos aqui ");
		}
		
		if (nome3 != "Joao") {
			System.out.println(" O nome � diferente de Jo�o");
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
				System.out.println("Quero que meu personagem corra mais r�pido!");
				break;   //muito importante para n�o constinuar executando!
			case 30:
				//Execute esta outra coisa!
				System.out.println("Minha vida � igual a 30");
				break;
			default:
				System.out.println("Nenhua condi��o Bateu, eu tenho 100 de vida!");
		
		}
		//---------------------------------------------------------------------------
		//Opera��es Avan�adas e Opera��es Matem�ticas
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
			System.out.println("Guilherme � um jogador muito r�pido e tem bastante skill");
		}else {
			System.out.println("Seu jogador � muito ruim!! Arg");
		}
		
		if(((nome_jogador == "Guilherme" || nome_jogador == "Igor")) && (speed >150)){
			System.out.println( nome_jogador + " � um jogador muito r�pido e tem bastante skill");
		}else {
			System.out.println("Seu jogador � muito ruim!! Arg");
		}
		//-----------------------------------------------------------------------------
		//Loppings
		int cont = 0;
		//While
		while(cont <10) {
			System.out.println("Ol�! agora o contador est� em " + cont);
			cont ++;
		}
		//For
		for (int i = 0; i<=10;i++) {
			System.out.println("Ol�! agora o contador est� em " + i);
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
