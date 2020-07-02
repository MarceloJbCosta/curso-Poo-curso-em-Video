package aula013;

public class aula13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sobrecarga usar o mesmo metodo dentro da mesma classe
		//Mamifero m1 = new Mamifero();
		//m1.emitirSom();
		//Lobo l1 = new Lobo();
		//l1.emitirSom();
		Cachorro c1 = new Cachorro();
		//c1.emitirSom();
		c1.reagir("ola");
		c1.reagir("Vai Apanhar");
		c1.reagir(11, 45);
		c1.reagir(21, 00);
		c1.reagir(true);
		c1.reagir(false);
		c1.reagir(2, 12.5f);
		c1.reagir(17, 4.5f);

	}

}
