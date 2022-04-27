package Exercicio;

public class Reserva implements Pagamento{

    private boolean pagamentoAVista;
    private Cliente cliente;
    
    public Reserva(Cliente cliente, boolean pagamentoAVista) {
      this.cliente = cliente;
      this.pagamentoAVista = pagamentoAVista;
    }
  
    public boolean isPagamentoAVista() {
      return pagamentoAVista;
    }
  
    public void setPagamentoAVista(boolean pagamentoAVista) {
      this.pagamentoAVista = pagamentoAVista;
    }
  
    public Cliente getCliente() {
      return cliente;
    }
  
    public void setCliente(Cliente cliente) {
      this.cliente = cliente;
    }
  
    @Override
    public double calcularPagmento() {    
      if(pagamentoAVista) return 3200.0*0.9;
      else return 3200.0;
    }
  
    @Override
    public String toString() {
      String aux =  "#### RESERVA ####\n";
      
      if( cliente instanceof PessoaFisica ){
        aux += ((PessoaFisica)cliente).toString();
      }else{
        aux += ((PessoaJuridica)cliente).toString();
      }
  
      aux += "\n---------------\n";
  
      if(pagamentoAVista) aux += "Pagamento à vista!\n";
      else aux += "Pagamento parcelado!";
      
      aux += String.format("Total = R$%.2f", calcularPagmento() );
      aux += "\n---------------\n";
  
      return aux;
    }
    
}
