

public class Conta {
	private double saldo; 
	private int agencia; //atributo imutável, nunca mais será alterado
	private int numero; //atributo imutável, nunca mais será alterado
	private Cliente titular;
	private static int totalDeContas; //atributo geral da classe Conta. DA CLASSE, compartilhado entre as instâncias
	
	//construor padrão
//	public Conta() {
//		
//	}
		
	//construtor criado para definir agencia e conta.
	public Conta(int agencia, int numero) {
		Conta.totalDeContas++;
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estou criando a conta " + getNumero() + " na agência " + getAgencia());		
	}	
	
	public void deposita(double valor) {
		this.saldo += valor;
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
			return true;
		} 
			return false;
	}
	
	//não há necessidade de SETTAR o saldo, no presente caso.
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return numero;
	}

//	public void setNumero(int numero) { //métodos SET geralmente não retornam nada, fazem apenas a sua função, que é alterar algum valor.
//		if(numero <= 0) {
//			System.out.println("Valores negativos são inválidos, verifique se os números estão corretos.");
//			return;
//		}
//		this.numero = numero; //variável temporária, normalmente, tem o mesmo nome do atributo.
//	}

	public int getAgencia() {
		return agencia;
	}

//	public void setAgencia(int agencia) {
//		if(agencia <= 0) {
//			System.out.println("Agência não aceita valores negativos, verifique, por favor.");
//			return;
//		}
//		this.agencia = agencia;
//	}

	public Cliente getTitular() {
		return titular; //atributo do objeto
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	//método utilizado para revelar o total de contas cadastradas no sistema, por meio de um atributo comum/compartilhado a todos os objetos - static - da classe
	public static int getTotalDeContas() {
		return Conta.totalDeContas;
	}
	
}
