
public class Pessoa {
	
	//encapsulamento - private -ctlr+3 encapsulate field
	private String nomePessoa; //atributos
	private int idadePessoa;
	
	//public void mostraDados(String pNome, int pIdade) { //criação do método
	//	System.out.println("Nome: "+pNome);
	//	System.out.println("Idade: "+pIdade);
		
		
	

	@Override
	public String toString() {
		return "Pessoa [nomePessoa=" + nomePessoa + ", idadePessoa=" + idadePessoa + "]";
	}

	//ctrl+3 para gerar o get e o set 
	public String getNomePessoa() { //get pega a informação
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) { //set para mandar a informação
		this.nomePessoa = nomePessoa;
	}

	public int getIdadePessoa() {
		return idadePessoa;
	}

	public void setIdadePessoa(int idadePessoa) {
		this.idadePessoa = idadePessoa;
	}
	
}
