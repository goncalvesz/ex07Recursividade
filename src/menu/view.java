package menu;

import javax.swing.JOptionPane;

import controller.RecursividadeController;

public class view {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecursividadeController recursividade = new RecursividadeController();
		
		int dividendo = 0;
		int divisor = 0;
		
		
		while (divisor <= 0 || dividendo <= 0) {
			try {
				dividendo = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor a ser dividido"));
				divisor = Integer.parseInt(JOptionPane.showInputDialog("Insira o divisor"));
			} catch (NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null, "Insira um numero inteiro");
			}
			
			if (divisor == 0) {
				JOptionPane.showMessageDialog(null, "Divisão por zero!!! Insira outro valor");
			}
			if (divisor < 0 || dividendo < 0) {
				JOptionPane.showMessageDialog(null, "Para essa atividade estamos apenas considerando numeros naturais");
			}
		}

		JOptionPane.showMessageDialog(null, "O resto da divisao de " + dividendo + " por " + divisor + " é " + recursividade.divisaoMostraResto(divisor, dividendo));
	}

}
