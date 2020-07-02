package aula011;
public class aula011 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pessoa p1 = new Pessoa(); nao posso instanciar classe abstrata
		
		/*Visitante v1 = new Visitante();
		v1.setNome("Marcos");
		v1.setIdade(21);
		v1.setSexo("M");
		System.out.println(v1.toString());
		*/
		 Aluno a1 = new Aluno(); 
		 //tem tudo que pessoa tem mais seus propios atributos //herança pra diferenca
		 //aluno e uma especialização de pessoa e pessoa uma generalização de aluno
		 //criação do aluno
		 a1.setNome("Joao");
		 a1.setIdade(18);
		 a1.setMatricula(1258);
		 a1.setSexo("M");
		 a1.setCurso("Informatica");
		 a1.pagarMensalidade();
		 //criar o bolsista
		 Bolsista b1 = new Bolsista();
		 b1.setMatricula(55589);
		 b1.setNome("Marcelo");
		 b1.setSexo("M");
		 b1.setBolsa(12.5f);
		 b1.pagarMensalidade();
		 
		 //professor
		 Professor p1 = new Professor();
		 p1.setNome("Carlos");
		 p1.setSexo("M");
		 p1.setIdade(39);
		 p1.setSalario(2578.50f);
		 p1.receberAumento();
		 System.out.println(p1.toString());
		 
		 //criar Tecnico
		 Tecnico t1 = new Tecnico();
		 t1.setSexo("F");
		 t1.setCurso("Enfermagem");
		 t1.setNome("Joana");
		 t1.setIdade(28);
		 t1.setRegistro(25794656);
		 t1.praticar();
		 
		
	}

}
