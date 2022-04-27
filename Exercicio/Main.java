package Exercicio;

import javax.swing.JOptionPane;

public class Main {
	

	public static void main(String[] args) {
		int escolha;
		
		do {
			escolha = Integer.parseInt(JOptionPane.showInputDialog(Processo.screen()));
			if (escolha < 1 || escolha > 6) {
				JOptionPane.showMessageDialog(null, "Opção inválida");
			} else {
				switch (escolha) {
				case 1:
                    Processo.reservar();
					break;
				case 2:
					Processo.pesquisar();
					break;
				case 3:
					Processo.imprimirRe();
					break;
				case 4:
					Processo.imprimirLi();
					break;
				case 5:
					Processo.cancelar();
                    break;
				}
			}
			
		} while (escolha != 6);
		
    }

}
