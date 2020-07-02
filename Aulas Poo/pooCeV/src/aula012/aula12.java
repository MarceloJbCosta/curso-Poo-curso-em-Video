package aula012;
public class aula12 {
	public static void main(String[] args) {
		
		//Animal a1 = new Animal(); nao podemos criar bijeto da classe abstrata
		
		Mamifero m1 = new Mamifero();
		Ave a1 = new Ave();
		Reptil r1 = new Reptil();
		Peixe p1 = new Peixe();
		
		Cachorro k = new Cachorro();
		Canguru c = new Canguru();
		Cobra j = new Cobra();
		Tartaruga t = new Tartaruga();
		GoldFish g = new GoldFish();
		Arara A = new Arara();
		
		c.locomover();
		c.emitirSom();
		k.locomover();
		k.emitirSom();
		
		
		/*//mamifero		
		m1.setPeso(25.8);	
		m1.setMembros(4);
		m1.setIdade(2);
		m1.setCorPelo("marrom");
		m1.alimentar();
		m1.emitirSom();
		m1.locomover();
		System.out.println(m1.toString());
		//ave
		a1.setPeso(0.95);
		a1.alimentar();
		a1.locomover();
		//reptil
		r1.locomover();
		//peixe
		p1.locomover();*/
		
		
		

	}

}
