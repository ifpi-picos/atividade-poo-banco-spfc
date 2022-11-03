public class CPoupanca extends Conta{

    public double rendimento;

    public CPoupanca(int numAgencia, int numConta, double saldo, Cliente vinCliente) {
        super(numAgencia, numConta, saldo, vinCliente);
    }
    
    @Override
    public void transferencia(double value, Conta conta) {
        super.transferencia(value, conta);
        //Falta colocar 5% pra cada transferencia realizada
    }
}
