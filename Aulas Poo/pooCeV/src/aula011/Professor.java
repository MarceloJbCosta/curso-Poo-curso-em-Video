package aula011;

public class Professor extends Pessoa {
	private String especialidade;
	private float Salario;
	
	public void receberAumento() {
		System.out.println("Professor vai receber aumento: ");
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public float getSalario() {
		return Salario;
	}

	public void setSalario(float salario) {
		Salario = salario;
	}
}
