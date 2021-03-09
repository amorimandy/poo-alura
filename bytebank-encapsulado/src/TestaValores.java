
public class TestaValores {
	
	public static void main(String[] args) {
		Conta conta1 = new Conta(3242, 74523);
		//neste ponto a conta está inconsistente com as regras do nosso negócio.
		
		System.out.println(conta1.getAgencia());
				
		/*conta.setAgencia(-300);
		conta.setNumero(-3232);*/ //teste de valores negativos, retornando a mensagem definida no setter desses atributos.
		
		Conta conta2 = new Conta(3242, 32345);
		Conta conta3 = new Conta(3242, 32245);
		Conta conta4 = new Conta(3242, 32145);
		

		System.out.println("O total de contas é " + Conta.getTotalDeContas());

	}

}
