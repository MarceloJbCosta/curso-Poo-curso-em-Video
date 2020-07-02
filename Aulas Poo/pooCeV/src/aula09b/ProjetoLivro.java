package aula09b;

public class ProjetoLivro {

	public static void main(String[] args) {
		Pessoa[] p = new Pessoa[2];
		Livro[] l = new Livro[3];
		
		p[0] = new Pessoa("Marcelo", 30, "M");
		p[1] = new Pessoa("Juliana", 35, "F");
		
		l[0] = new Livro("Aprender Frances", "Jacques", 350,p[1]);
		l[1] = new Livro("Javando", "Guanabara", 830, p[0]);
		l[2] = new Livro("Imigrando", "hiBonjour", 450, p[1]);
		
		
		l[0].abrir();
		l[0].folhear(300);
		l[0].avancarPag();
		System.out.println(l[0].detalhes());

	}

}
