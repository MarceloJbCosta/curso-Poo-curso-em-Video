package aula011;

public class Tecnico extends Aluno{
	//vai herdar tudo que aluno tem 
	private int registro;
	
	public void praticar() {
		System.out.println("Fazendo exercicio");
	}

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}

}
