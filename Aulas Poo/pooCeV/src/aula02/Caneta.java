package aula02;
public class Caneta {
	String modelo;//atributos
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
		void status() {
			System.out.println("Uma caneta "+ this.cor);
			System.out.println("esta tampada? "+ this.tampada);
			System.out.println("Qual a ponta: "+ this.ponta);
			System.out.println("Qual modelo: "+ this.modelo);
			System.out.println("Qual a carga "+ this.carga);
		}
		
	
		void rabiscar() {//metodos
			//void sem retorno
			if (this.tampada == true) {
				System.out.println("ERRO !! Nao posso rabiscar");
			}else {
				System.out.println("Estou Rabiscando");
			}
			
			
		}
		void tampar() {
			this.tampada = true; //this faz referencia ao atributo que esta chamando o metodo
		}
		void destampar() {
			this.tampada = false;
		}
		
	
	}



