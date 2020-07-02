package aula012;

public class Ave extends Animal {
	private String CorPena;
	
	public void fazerNinho() {
		System.out.println("construir ninho");
	}

	@Override
	public void locomover() {
		System.out.println("Voando");		
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo Frutas");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de Ave");
	}

	public String getCorPena() {
		return CorPena;
	}

	public void setCorPena(String corPena) {
		CorPena = corPena;
	}
	

}
