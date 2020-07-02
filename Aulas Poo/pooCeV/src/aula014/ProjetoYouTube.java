package aula014;

public class ProjetoYouTube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Video v[] = new Video[3];
		v[0] = new Video("Aula 1 de Poo");//chama o construtor
		v[1] = new Video("Aula de java");
		v[2] = new Video("Aula de Php");
		
		System.out.println(v[0].toString());

	}

}
