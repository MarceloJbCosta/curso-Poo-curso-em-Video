package aula02;

import java.util.Locale;

public class aula02b {
	public static void main(String[] args) {
		// TODO Auto-generated method 
		Locale.setDefault(Locale.US);
		
		Caneta c1 = new Caneta();// criação da caneta
		c1.cor = "Azul";//chamada ao atributo
		c1.modelo = "Cristal";
		c1.ponta = 0.7f;
		c1.tampar();
		//c1.destampar();
		c1.status();//chama o metodo
		c1.rabiscar();
		System.out.println("");
		
		Caneta c2 = new Caneta();
		c2.cor = "Preta";
		c2.modelo = "14 Bis";
		c2.ponta = 0.5f;		
		c2.status();
		c2.destampar();
		c2.rabiscar();
		
	}

}
