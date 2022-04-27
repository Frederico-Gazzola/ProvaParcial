package Exercicio;

public class App {
    public static void main(String[] args) throws Exception { 
        
        Reserva reserva = new Reserva( new PessoaFisica("joao", "1212-81-12") , true );

        System.out.println(reserva);
        
    }
}
