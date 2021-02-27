package orientacao_objetos;

public interface MinhaInterface {
	//Quando � uma interface eu n�o posso atribuir uma a��o ao m�todo criado.
	//Ex: public void metodo(){}  --> chaves indicam que haver� um bloco de a��o,
	//isso n�o pode existir em uma interface.
	//Posso somente informar que o m�todo deve existirassim: 
	//public abstract void metodo();
	//Tenho que definir o m�todo dentro da classe principal (MainInterface)
	public abstract void start();
	public abstract void die();
	public abstract void losslife();
	public abstract void uplife();	
}
