package orientacao_objetos2;

public class Main {
	public static void main(String[] args) {
		Player player = new Player();  //declaro classe Player
		//player.nascer(); //o método é privado da classe Player
		Player2 player2 = new Player2();
		player2.outroMetodo2();
		player2.morrer();
	}
	
	//public void outroMetodo2() {  //criando um método da classe Main
		//this.morrer(); // nao consigo chamar, pois nao usei o extend e esse é protegido
	//} 
}