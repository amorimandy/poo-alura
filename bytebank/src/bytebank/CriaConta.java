package bytebank;

public class CriaConta {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("A primeira conta possui R$ " + primeiraConta.saldo);
		System.out.println("A segunda conta possui R$ " + segundaConta.saldo);
		
		primeiraConta.agencia = 3264;
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		System.out.println(primeiraConta.titular);
		
		segundaConta.agencia = 3264;
		System.out.println("Agora a segunda conta está na agência " + segundaConta.agencia);
		
		if(primeiraConta == segundaConta) {
			System.out.println("São a mesma conta!");
		} else {
			System.out.println("São contas diferentes!");
		}
	
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		

	}

}
