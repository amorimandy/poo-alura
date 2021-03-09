package bytebank;

public class TesteReferencias {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300; //referência para um objeto
		System.out.println("O saldo da primeira conta é: " + primeiraConta.saldo);

		Conta segundaConta = primeiraConta; //referência para uma referência
		System.out.println("O saldo da segunda conta é: " + segundaConta.saldo);
		
		segundaConta.saldo += 200;
		System.out.println("O saldo da segunda conta é: " + segundaConta.saldo);
		
		System.out.println("O saldo da primeira conta é: " + primeiraConta.saldo);
		
		//as duas referências são para o mesmo objeto!!
		
		if(segundaConta == primeiraConta) {
			System.out.println("São contas diferentes!");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
		
		

	}

}
