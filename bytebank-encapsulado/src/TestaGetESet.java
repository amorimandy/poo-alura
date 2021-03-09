public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(3254, 12352);
		
		Cliente paulo = new Cliente();
		
		/*paulo.setNome("Paulo Silveira");
		paulo.setCpf("222.222.222-22");
		paulo.setProfissao("ADS");*/
		
		conta.setTitular(paulo); //referenciando conta a paulo que referencia o objeto
		
//		System.out.println(conta.getTitular()); //pegando a referência da conta
//		System.out.println(paulo.getNome()); //pegando atributo nome do objeto
//		System.out.println(conta.getTitular().getNome()); //andando entre as referências para pegar a Conta do Cliente paulo

		conta.getTitular().setProfissao("ADS");
		
		System.out.println(paulo.getProfissao());
	}

}
