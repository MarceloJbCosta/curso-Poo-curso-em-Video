package aula07;

public class Lutador {
	//Atributos
	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura;
	private double peso;
	private String categoria;
	private int vitoria;
	private int derrotas;
	private int empates;	
	
	
	//construtor
	public Lutador(String no, String na, int id, double al, double pe,
			int vit, int de, int em) {		
		this.nome = no;
		this.nacionalidade = na;
		this.idade = id;
		this.altura = al;
		this.setPeso(pe);
		this.vitoria = vit;
		this.derrotas = de;
		this.empates = em;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String no) {
		this.nome = no;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String naci) {
		this.nacionalidade = naci;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int id) {
		this.idade = id;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double al) {
		this.altura = al;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double pe) {
		this.peso = pe;
		this.setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		if (this.peso < 52.2) {
			this.categoria = "Inválido";
		} else if(this.peso <= 70.3) {
			this.categoria = "Leve";
		}else if (this.peso <= 83.9) {
			this.categoria = "Medio";
		}else if(this.peso <= 120.2) {
			this.categoria = "Pesado";			
		}else {
			this.categoria = "Inválido";
		}
	}

	public int getVitoria() {
		return vitoria;
	}

	public void setVitoria(int vit) {
		this.vitoria = vit;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int de) {
		this.derrotas = de;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int emp) {
		this.empates = emp;
	}

	
	//metodos publicos
	public void apresentar() {
		System.out.println("Chegou a hora! Apresentanmos o Lutador "+ this.getNome());
		System.out.println("Lutador natural de: "+ this.getNacionalidade());
		System.out.println(this.getIdade() + "Anos");
		System.out.println(this.getAltura() + "de altura");
		System.out.println(this.getPeso() + "kg");
		System.out.println("Ganhou "+ this.getVitoria()+ " vezes");
		System.out.println("Derrotas " + this.getDerrotas()+ " vezes");
		System.out.println("Empates " + this.getEmpates() + " vezes");
	}
	public void status() {
		System.out.println(this.getNome());
		System.out.println("Lutador é peso " + this.getCategoria());
		System.out.println("Cartel do lutador: "+ this.getVitoria()+"V "+ this.getDerrotas()+"D "+this.getEmpates()+ "E ");		
		
	}
	public void ganharLuta() {
		this.setVitoria(this.getVitoria() + 1);
	}
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}
	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);		
	}
	
}
