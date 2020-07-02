package aula012;

public class Peixe extends Animal {
	private String corEscama;
	
	public void soltarBolha() {
		System.out.println("soltou uma Bolha");
	}

	@Override
	public void locomover() {
		System.out.println("Nadando");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo substancia");
	}

	@Override
	public void emitirSom() {
		System.out.println("Peixe noa faz som  ");
		
	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

}
