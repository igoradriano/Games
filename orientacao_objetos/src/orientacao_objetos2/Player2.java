package orientacao_objetos2;

public class Player2 extends Player{ //extends puxa os m�todos das outras classes
	
	//public void outroMetodo() {  //criando um m�todo da classe player2
		//this.nascer(); //por�m n�o consigo puxar esse m�todo da classe player, privado
	//}
	public void outroMetodo2() {  //criando um m�todo da classe player2
		this.morrer(); //Este eu consigo chamar, pois ele � protegido e n�o privado
	}  //so funciona com o extend no inicio da classe principal
}

	
 