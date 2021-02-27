package orientacao_objetos2;

public class Player2 extends Player{ //extends puxa os métodos das outras classes
	
	//public void outroMetodo() {  //criando um método da classe player2
		//this.nascer(); //porém não consigo puxar esse método da classe player, privado
	//}
	public void outroMetodo2() {  //criando um método da classe player2
		this.morrer(); //Este eu consigo chamar, pois ele é protegido e não privado
	}  //so funciona com o extend no inicio da classe principal
}

	
 