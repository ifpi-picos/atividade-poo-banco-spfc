public class ContaPoupanca extends Conta{

    public double rendimento = 0.1;

    public ContaPoupanca(int numAgencia, int numConta, double saldo, Cliente vinCliente) {
        super(numAgencia, numConta, saldo, vinCliente);
    }
    
    @Override
    public void transferencia(double value, Conta conta) {
        super.transferencia(value, conta);
        double taxa = (value / 100) * 5;
        saldo -= (value + taxa);
        conta.deposito(value);
    }

    @Override
    public Boolean deposito(double value) {
        return super.deposito(value + (value * rendimento));
    }
}
