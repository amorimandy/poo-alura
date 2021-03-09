

public class Conta {
	private double saldo; // = 100; //adiciona 100 ao saldo ao criar uma conta //private encapsula o atributo na classe, restringe o acesso
	int agencia;
	int numero;
	Cliente titular; // = new Cliente(); //cria automaticamente um novo cliente ao criar uma conta
	
	
	//método deposita, reetorna nada (void) - double valor, valor que o método recebe
	public void deposita(double valor) {
		this.saldo += valor;
		//valor = variável temporária, invocada como parâmetro apenas neste método
		//saldo = atributo presente em todo o processo - caracteristica da classe
		//este método altera o atributo saldo, adicionando o valor que foi passado como parâmetro do método
		//this = especifica a qual conta o método será invocado
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			System.out.println("Valor não disponível");
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.saldo += valor;
			//tbm pode ser: destino.deposita(valor);
			return true;
		} //else { 
			return false;
		//}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
		
}
