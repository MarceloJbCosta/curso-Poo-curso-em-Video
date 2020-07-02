package aula011;

public class Bolsista extends Aluno {
	//mais uma especialização de aluno tem tudo que aluno
	
	private float bolsa;
	
	public void renovarBolsa() {
		System.out.println("Renovamndo bolsa de "+this.nome);
		
	}
	@Override//metodo sobrescrito kja temos ele na classe aluno
	public void pagarMensalidade() {
		System.out.println(this.nome + " é Bolsista!, Pagamento facilitado.");
	}
	public float getBolsa() {
		return bolsa;
	}
	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}

}
