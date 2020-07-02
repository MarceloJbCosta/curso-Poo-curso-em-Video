package aula012;
public abstract class Animal { 
	
	@Override
	public String toString() {
		return "Animal [peso=" + peso + ", idade=" + idade + ", membros=" + membros + "]";
	}
	//atributos animal
	protected double peso;
	protected int idade;
	protected int membros;
	
	//metodos animal
	public abstract void locomover();	
	public abstract void alimentar();		
	public abstract void emitirSom();
		
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getMembros() {
		return membros;
	}
	public void setMembros(int membros) {
		this.membros = membros;
	}

}
