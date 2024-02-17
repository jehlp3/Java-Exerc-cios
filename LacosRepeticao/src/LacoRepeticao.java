
public class LacoRepeticao {

	public static void main(String[] args) {
		int qtdVezes = 1;
		
		//While - se a condição for satisfeita ele entra no laço de repeticao - Pré-testado (testa antes de entrar)
		//tem q ter condição caso contrário fica em loop infinitamente
		while (qtdVezes <= 10) {
			System.out.println("Estou fazendo a "+ qtdVezes +"ª vez");
			qtdVezes++;
		}
		System.out.println("Saí do laço e executei " + (qtdVezes - 1)+" vezes");
		

		//Do While - Pós-testado
		int qtdVezes2 = 8;
		do {
			System.out.println("Estou fazendo a "+qtdVezes2+"ª vez");
			qtdVezes2++;
		}while (qtdVezes2 <= 10);
		System.out.println("Saí do laço e executei " + (qtdVezes - 1)+" vezes");
		
		
		//FOR
		qtdVezes = 0;
		for (int qtdVezes3 = 1; qtdVezes3 <= 8; qtdVezes3++) {
			System.out.println("Estou fazendo a "+ qtdVezes3 +"ª vez");	
			qtdVezes = qtdVezes3;
		}
		System.out.println("Saí do laço e executei "+ qtdVezes +" vezes");	
		
		
		for (int qtdVezes4 = 1; qtdVezes4 <= 10; qtdVezes4++) {
			System.out.println("Estou fazendo a "+ qtdVezes4 +"ª vez");	
			if (qtdVezes4 == 5) {
				System.out.println("Parei na "+ qtdVezes4 +"ª vez");
				break;
			}
		}
		
	}

}