package Programa_Leitura;

import java.util.Random;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Por favor digite o seu nome: ");
		String nome = in.nextLine();
		System.out.println("Olá! "+nome+" boa noite!");
		
		//--------------AULA 2-------------------------------------------------------
		String nome2,idade,peso,cidade,estado,país;
		System.out.println("Por favor digite seu nome:");
		nome2 = in.nextLine();
		System.out.println("Por favor digite sua idade:");
		idade = in.nextLine();
		System.out.println("Por favor seu peso:");
		peso = in.nextLine();
		System.out.println("Por favor digite sua cidade:");
		cidade = in.nextLine();
		if (cidade.equals("manaus")) {
			System.out.println("Show! Sou de Manaus também!");
		}else {
			System.out.println("Que pena você não é de Manaus!");
		}
		System.out.println("Por favor digite seu estado:");
		estado = in.nextLine();
		System.out.println("Por favor digite seu país:");
		país = in.nextLine();
		
		//Gerar Resultados final
		System.out.println("-------------");
		System.out.println("Aqui está o resultado do teste: ");
		System.out.println("Idade: "+idade);
		System.out.println("Peso: "+peso);
		System.out.println("Cidade: "+cidade);
		System.out.println("Estado: "+estado);
		System.out.println("País: "+país);
		
		//---------------------------------------------------------------------------
		//Números aleatórios
		Random rand = new Random();
		String nome3;
		System.out.println("Seja bem vindo ao Jogo! Insira seu nome: ");
		nome3 = in.nextLine();
		System.out.println("Seja muito bem-vindo(a)" + nome);
		System.out.println("Você deseja avançar para qual direção? (w,s,a,d)");
		String comando = in.nextLine();
		
		if (comando.equals("w")){
			System.out.println("Você está indo para frente");
			System.out.println("Um inimigo surgiu, o que deseja fazer? (a=atacar,c=correr");
			comando = in.nextLine();
			if (comando.equals("a")) {
				if(rand.nextInt(100) < 75) {
					System.out.println("Você ganhou o Jogo!");
				}else {
					System.out.println("Você perdeu o jogo!");
				}
			}else {
				System.out.println("Você correu! o Jogo terminou");
			}
		}else if(comando.equals("s")) {
			System.out.println("Você está entrando em outro mapa");
			System.out.println("Tem uma cratera em sua frente, o que deseja fazer? (p=pular,v=voltar)");
			comando = in.nextLine();
			if (comando.equals("p")) {
				if(rand.nextInt(10) < 3) {
					System.out.println("Você ganhou o jogo!");
				}else {
					System.out.println("Você perdeuo jogo!");
				}
			}else {
				System.out.println("Você voltou! O jogo acabou!");
			}
		}
		
		
		
	}
}