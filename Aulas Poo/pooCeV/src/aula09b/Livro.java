package aula09b;

public class Livro implements Publicacao{
	
	private String titulo;
	private String autor;
	private int totPagina;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;//instancia da classe pessoa
	

	public Livro(String titulo, String autor, int totPagina, Pessoa leitor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.totPagina = totPagina;
		this.pagAtual = 0;
		this.aberto = false;
		this.leitor = leitor;
	}


	public String detalhes() {
		return "Livro [titulo=" + titulo + "\n, autor="
				+ autor + "\n, totPagina=" + totPagina + "\n, pagAtual="+ pagAtual
				+ ", aberto=" + aberto + "\n, leitor=" + leitor.getNome() + ", idade =" + leitor.getIdade() +", sexo=" + leitor.getSexo();
	}



	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotPagina() {
		return totPagina;
	}

	public void setTotPagina(int totPagina) {
		this.totPagina = totPagina;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public boolean isAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}


	@Override
	public void abrir() {
		this.aberto = true;
		
	}

	@Override
	public void fechar() {
		this.aberto = false;
		
	}


	@Override
	public void folhear(int pag) {
		if(pag > this.totPagina) {
			this.pagAtual = 0;
		}else {
		this.pagAtual = pag;
		}
	}


	@Override
	public void avancarPag() {
		this.pagAtual++;
		
	}


	@Override
	public void voltarPag() {
		this.pagAtual--;
	}


	

}
