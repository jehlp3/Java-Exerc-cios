
public class Fisica extends Pessoa{

	public String cpf, identidade; //características apenas da PF

	@Override
	public String toString() {
		return "Fisica [cpf=" + cpf + ", identidade=" + identidade + ", nome=" + nome + ", situacaoPessoa="
				+ situacaoPessoa + "]";
	}

}
