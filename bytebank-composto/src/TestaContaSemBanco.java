
public class TestaContaSemBanco {
	
	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		System.out.println(contaDoPaulo.getSaldo());
		//System.out.println(contaDoPaulo.saldo); //atributo privado na classe Conta, não acessível ou lido em outros locais
		
		System.out.println(contaDoPaulo.titular); //referência nula
		
		contaDoPaulo.titular.nome = "Paulo Silveira"; //referenciando a coisa nenhuma, por isso a exception NullPointer, objeto Cliente não existe, apenas Conta
		System.out.println(contaDoPaulo.titular.nome);
		
		//Correção - criando cliente e associando a conta:		
		/*contaDoPaulo.titular = new Cliente();
		System.out.println(contaDoPaulo.titular);
		
		contaDoPaulo.titular.nome = "Paulo Silveira";
		System.out.println(contaDoPaulo.titular.nome);*/
		
	}

}
