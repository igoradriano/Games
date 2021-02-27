package orientacao_objetos;

public interface MinhaInterface {
	//Quando é uma interface eu não posso atribuir uma ação ao método criado.
	//Ex: public void metodo(){}  --> chaves indicam que haverá um bloco de ação,
	//isso não pode existir em uma interface.
	//Posso somente informar que o método deve existirassim: 
	//public abstract void metodo();
	//Tenho que definir o método dentro da classe principal (MainInterface)
	public abstract void start();
	public abstract void die();
	public abstract void losslife();
	public abstract void uplife();	
}
