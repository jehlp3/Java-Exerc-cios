
public class Juridica extends Pessoa{

	public String cnpj, inscEstadual; //características apenas da PJ

	@Override
	public String toString() {
		return "Juridica [cnpj=" + cnpj + ", inscEstadual=" + inscEstadual + ", nome=" + nome + ", situacaoPessoa="
				+ situacaoPessoa + "]";
	}
	
	
}
