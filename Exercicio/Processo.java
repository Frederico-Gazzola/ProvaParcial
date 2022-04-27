package Exercicio;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Processo {
    
    Reserva reserva = new Reserva(Cliente, boolean.class);

    public static String screen() {
		String aux = "Escolha uma opção:\n";
		aux += "1. Reservar mesa\n";
		aux += "2. Pesquisar reserva\n";
		aux += "3. Imprimir reservas\n";
		aux += "4. Imprimir lista de esperas\n";
		aux += "5. Cancelar reserva\n";
		aux += "6. Finalizar\n";
		return aux;
		
	}


}
