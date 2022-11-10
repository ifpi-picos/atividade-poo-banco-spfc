public class ContaCorrente extends Conta{

    public double chequeEspecial;
    private int quantidadeSaque;
    public double taxa = 0.05;

    public ContaCorrente(int numAgencia, int numConta, double saldo, Cliente vinCliente) {
        super(numAgencia, numConta, saldo, vinCliente);
        this.chequeEspecial = 100;
    }

   @Override
   public void transferencia(double value, Conta conta) {
      if(quantidadeSaque <= 2){
        saldo -= value;
        conta.deposito(value);
        enviaNotificacao("transf", value);
        quantidadeSaque++
      }
   //Else{
      saldo -= (value +(value * taxa));
      conta.deposito(value);
      enviaNotificacao("transf", value);
    //}
   }

    public void saqueCheque (double value){
        saldo -= value;
    }

    public double getChequeEspecial(){
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial){
        this.chequeEspecial = chequeEspecial;
    }

}
