public class TesteSacaValoresNegativos {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.deposita(100);
		
		System.out.println(conta.getSaldo());
		
		
		
		/*
	
		sistema não permite realizar o saque pois o valor da conta se tornaria negativo, por não possuir o valor total a ser sacado
		System.out.println(conta.saldo);
		
		alterando o atributo diretamente, por meio do = (recebe um valor) é possível alterar o saldo da conta para um valor negativo, atribuindo um valor para 
		uma determinada característica da conta.
		
		proibido!!
		conta.saldo = conta.saldo - 200;
		System.out.println(conta.saldo);
		
		porém, é recomendado que os objetos sejam somente alterados por meio de seus métodos e não de seus atributos - encapsulamento]
		
		*/
		
	}

}
