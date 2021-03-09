public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente andressa = new Cliente();
		
		andressa.nome = "Andressa Amorim";
		andressa.cpf = "111.111.111-11";
		andressa.profissao = "ADS";
		
		Conta contaDaAndressa = new Conta();
		
		contaDaAndressa.deposita(500);
		
		
		contaDaAndressa.titular = andressa; //associação entre a cliente Andressa e a contaDaAndressa, a conta pertence a Andressa 
		System.out.println(contaDaAndressa.titular.nome);
		System.out.println(contaDaAndressa.titular); //
		System.out.println(andressa);
	}

}
