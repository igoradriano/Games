package orientacao_objetos2;

public class Main {
	public static void main(String[] args) {
		Player player = new Player();  //declaro classe Player
		//player.nascer(); //o m�todo � privado da classe Player
		Player2 player2 = new Player2();
		player2.outroMetodo2();
		player2.morrer();
	}
	
	//public void outroMetodo2() {  //criando um m�todo da classe Main
		//this.morrer(); // nao consigo chamar, pois nao usei o extend e esse � protegido
	//} 
}