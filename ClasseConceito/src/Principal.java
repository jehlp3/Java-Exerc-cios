
public class Principal {

	public static void main(String[] args) {
		
		Pessoa pes = new Pessoa(); //instanciamento
		
		//Declaro a classe 'Pessoa' + Dá um nome para o objeto 'pes' + utiliza um construtor 'new' + Atribuição da classe Pessoa à ele
		//pes.nomePessoa = "João do Nascimento";
		//pes.idadePessoa = 15;
		//pes.mostraDados(pes.nomePessoa, pes.idadePessoa);
		
		pes.setNomePessoa("João do Nascimento Pires");
		pes.setIdadePessoa(25);
		System.out.println(pes.toString() );
	}

}
