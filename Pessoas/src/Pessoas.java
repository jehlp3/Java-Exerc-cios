//Herança


public class Pessoas {

	public static void main(String[] args) {

		Fisica fis = new Fisica();
		
		Juridica jur = new Juridica();
		
		fis.nome = "João";
		fis.cpf = "11111111100";
		fis.identidade = "1560455";
		fis.situacaoPessoa = "A";
		
		
		jur.cnpj = "11222333000100";
		jur.nome = "Casas do Silva";
		jur.inscEstadual = "123456789";
		jur.situacaoPessoa = "I";

		System.out.println("Dados da PF: ");
		System.out.println(fis.toString());
		System.out.println("Dados da PJ: ");
		System.out.println(jur.toString());
	}

}
