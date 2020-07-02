package aula05;
public class ContaBanco {
	public int numConta;//atributos
	protected String tipo;//cc e cp
	private String dono;
	private float saldo;
	private boolean status = false;
	
	public void estadoAtual() {
		System.out.println("-----------------------------");
		System.out.println("Conta: "+ this.getNumConta());
		System.out.println("Tipo: "+ this.getTipo());
		System.out.println("Propietario: "+ this.getDono());
		System.out.println("Saldo: "+ this.getSaldo());
		System.out.println("Status: "+ this.getStatus());
	}
	
	public ContaBanco() {//construtor
		this.setStatus(false);
		this.setSaldo(0);
	}
	
	public int getNumConta() {
		return this.numConta;
	}
	public String getTipo(){
		return this.tipo;
	}
	public String getDono() {
		return this.dono;
	}
	public Float getSaldo() {
		return this.saldo;
	}
	public boolean getStatus() {
		return this.status;
	}
	
	public void setNumConta(int c) {
		//int s = 0;
		//for(int i = 1; 1 <= 4; i++) {
			//int num = (int) (Math.random() * 10);
			//s += num;			
		//}
		this.numConta = c;
		
	}
	public void setTipo(String t) {//cc e cp
		this.tipo = t;
	}
	public void setDono(String d) {
		this.dono = d;
	}
	public void setSaldo(float s) {
		this.saldo = s;
	}
	public void setStatus(boolean st) {
		this.status = st;
	}
	
	//metodos aquilo o que eu posso fazer com a conta
	
	public void abrirConta(String t){ 
		this.setTipo(t);
		this.setStatus(true);
		if (t == "CC") {
			this.setSaldo(50);
		}else if(t == "CP"){
			this.setSaldo(150);
		}
		System.out.println("Conta Aberta com Sucesso!");
	}
	public void fecharConta(){
		if(this.getSaldo() > 0) {
			System.out.println("Saldo com Dinheiro");//cuuuidado nao escrever dentro do metodo
		}else if(this.getSaldo() < 0) {
			System.out.println("Conta com saldo negativo");
		}else {
			this.setStatus(false);
			System.out.println("Conta Fechada");
		}
		
	}
	public void depositar(float v){
		if(this.getStatus()) {			
			this.setSaldo(getSaldo() + v);
			System.out.println("Deposito Realizado na conta de "+ this.getDono());
		}else {
			System.out.println("Inpossivel depositar");
		}		
	}
	public void sacar(float v){
		if(this.getStatus()) {
			if(this.getSaldo() >= v) {			
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque realizado na conta de "+ this.getDono());
			}else {
				System.out.println("Saldo Insuficiente");
			}
		}else {
			System.out.println("Impossivel Sacar de uma conta fechada");
		}
		
	}
	public void pagarMensal(){
		int v = 0;
		if(this.getTipo() == "CC") {
			v = 12;
		}else if(this.getTipo() == "CP"){
			v = 20;
		}
		if(this.getStatus()) {
			this.setSaldo(getSaldo() - v);
			System.out.println("Memsalidade paga por" + this.getDono());					
		}else {
			System.out.println("Impossivel Pagar");
		}
	}
}
