import javax.swing.JOptionPane;


public class EntradaDados {

	public static void main(String[] args) {
		//Entrada de dados via JOptionPane
		
		int idade;
		idade = Integer.parseInt(JOptionPane.showInputDialog("Informa a idade da pessoa"));
		System.out.println("A pessoa tem " + idade+" anos de idade");	
		JOptionPane.showMessageDialog(null, "A pessoa tem "+idade+ " anos de idade");
		JOptionPane.showInternalMessageDialog(null, "Teste", "ATENÇÃO",1);
	}

}
