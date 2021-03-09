package bytebank;

public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta contaDaAndressa = new Conta();
		
		contaDaAndressa.saldo = 250;
		
		contaDaAndressa.deposita(300);
		
		System.out.println(contaDaAndressa.saldo);
		
		contaDaAndressa.saca(500);
		System.out.println(contaDaAndressa.saldo);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		contaDaMarcela.transfere(200, contaDaAndressa);
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDaAndressa.saldo);
		
		
		boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDaAndressa);
		if(sucessoTransferencia) {
			System.out.println("Transferência realizada com sucesso!");
		} else {
			System.out.println("Valor indisponível");
		}
		
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDaAndressa.saldo);
	}

}
