abstract public class Conta {
    private int numAgencia;
    private int numConta;
    public double saldo;
    public Cliente cliente;
    
  public Conta( int numAgencia, int numConta, double saldo, Cliente cliente){
    this.numAgencia = numAgencia;
    this.numConta = numConta;
    this.saldo = saldo;
    this.cliente = cliente;
  }

    public void deposito(double value){
      saldo += value;
    }
    public void saque(double value){
      if(value < saldo){
        saldo += value; 
        System.out.println("Depósito realizado com sucesso!");
      }
      else{
        System.out.println("Saldo insuficiente!");
      }
    }
    public void transferencia(double value, Conta conta){
      saldo -= value;
      conta.deposito(value);
    }

    public double getSaldo() {
      return saldo;
    }
    public void setSaldo(float saldo) {
      this.saldo = saldo;
    }
    public double getnumAgencia() {
      return numAgencia;
    }
    public double getnumConta() {
      return numConta;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public String toString(){
     return "saldo: " + this.getSaldo();   
  }
}
