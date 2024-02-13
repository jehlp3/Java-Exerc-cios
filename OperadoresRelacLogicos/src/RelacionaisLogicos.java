
public class RelacionaisLogicos {

	public static void main(String[] args) {
		int num1 = 10, num2=10;
		if (num1 == num2) {
			System.out.println(num1+" e o número "+num2+ " são iguais");
		}
		int num3 = 10, num4 = 30;
		if (num3 != num4) {
			System.out.println(num3+" e o número "+num4+ " são diferentes");
		}
		
		int num5 = 31, num6 = 30;
		if (num5 > num6) {
			System.out.println(num5+" é maior que o número "+num6);
		}else {
			System.out.println(num6+" é maior que o número "+num5);
		}
		
		int num7 = 1, num8 = 30, num9 = 22, num10 = 30	;
		if ((num7 > num9) && (num8 == num10)){
			System.out.println( "Primeira opção satisfeita");
		}else {
			System.out.println( "Segunda opção satisfeita");
		}		
	
		if ((num7 > num9) || (num8 == num10)){
			System.out.println( "Primeira opção satisfeita");
		}else {
			System.out.println( "Segunda opção satisfeita");
		}	
	}
}
