
public class ComandoCondicional {

	public static void main(String[] args) {
		//IF
		int num1 = 30, num2 = 30;
		if (num1 > num2) {
			System.out.println("O número "+num1+" é maior que o número "+num2);
		} else if (num1 > num2){
			System.out.println("O número "+num1+" é menor que o número "+num2);	
		} else {
			System.out.println("Os números "+num1+" e "+num2+" são iguais.");
		}

		//Switch
		char varOpcao = '2';
		
		switch(varOpcao) {
		case '1': {
			System.out.println("1 - Chame programa de Inclusão");
			break; //não esqueça do break!
		}
		case '2': {
			System.out.println("2 - Chame programa de Alteração");
			break;
		}
		case '3': {
			System.out.println("3 - Chame programa de Consulta");
			break;
		}
		case '4': {
			System.out.println("4 - Chame programa de Exclusão");
			break;
		}
		default:
			throw new IllegalArgumentException("ERRO! Opção inválida "+varOpcao+", Redigite!");
		
	}

}}
