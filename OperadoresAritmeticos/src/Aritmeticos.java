
public class Aritmeticos {

	public static void main(String[] args) {
		int num1 = 10, num2 = 20; 
		
		int num3 = num1 + num2 ;
		System.out.println("O resultado da soma é: "+ num3);
		
		int num4 = num1-num2;
		System.out.println("O resultado da subtração é: "+ num4);	
		
		int num5 = num1*num2;
		System.out.println("O resultado da multiplicação é: "+ num5);		
		
		float num6 = (float) num1/num2;
		System.out.println("O resultado da divisão é: "+ num6);	
		
		while (num1<=100) {
			num1++;
			System.out.println(num1);
				
		while (num2>0) {
			num2--;
			System.out.println(num2);	
		}
		}
	}

}
