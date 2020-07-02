package aula012;

public class Canguru extends Mamifero{
	
	@Override
	public void locomover() {
		System.out.println("Saltando");		
		//sobrescrever o metodo Locomover da classe animal, herdada pela classe mamifero.
	}
	public void usarBolsa() {
		System.out.println("Usando Bolsa");
	}

}
