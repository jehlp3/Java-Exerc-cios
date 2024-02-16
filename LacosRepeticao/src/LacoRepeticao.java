
public class LacoRepeticao {

	public static void main(String[] args) {
		int qtdVezes = 1;
		
		//While - se a condição for satisfeita ele entra no laço de repeticao - Pré-testado (testa antes de entrar)

		while (qtdVezes <= 10) {
			System.out.println("Estou fazendo a "+ qtdVezes +"ª vez");
			qtdVezes++;
		}
		System.out.println("Saí do laço e executei " + (qtdVezes - 1)+" vezes");
		
		int qtdVezes2 = 8;
		//Do While - Pós-testado
		do {
			System.out.println("Estou fazendo a "+qtdVezes2+"ª vez");
			qtdVezes2++;
		}while (qtdVezes2 <= 10);
		System.out.println("Saí do laço e executei " + (qtdVezes - 1)+" vezes");
	}

}