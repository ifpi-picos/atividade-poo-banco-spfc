abstract public class Conta {
    private int numAgencia;
    private int numConta;
    public double saldo;
    public Cliente cliente;
    
    public Conta (){
    }
  
    public Conta( int numAgencia, int numConta, double saldo, Cliente cliente){
    this.numAgencia = numAgencia;
    this.numConta = numConta;
    this.saldo = saldo;
    this.cliente = cliente;
  }

    public Boolean deposito(double value){
      saldo += value;
      enviaNotificacao("deposito", value);
      return true;
    }
    public double saque(double value){
      if(value < saldo){
        saldo -= value; 
        System.out.println("Depósito realizado com sucesso!");
        return saldo;
      }
      else{
        System.out.println("Saldo insuficiente!");
        return 0.0;
      }
    }
    public void transferencia(double value, Conta conta){
      saldo -= value;
      conta.deposito(value);
      enviaNotificacao("transf", value);
    }

    public void enviaNotificacao (String operacao, double value){
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

    public int getNumAgencia() {
      return numAgencia;
    }

    public void setNumAgencia(int numAgencia) {
      this.numAgencia = numAgencia;
    }

    public int getNumConta() {
      return numConta;
    }

    public void setNumConta(int numConta) {
      this.numConta = numConta;
    }

    public void setSaldo(double saldo) {
      this.saldo = saldo;
    }

    public void setCliente(Cliente cliente) {
      this.cliente = cliente;
    }
}
