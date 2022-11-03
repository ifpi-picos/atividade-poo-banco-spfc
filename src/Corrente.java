public class Corrente extends Conta{

    public double chequeEspecial;
    public Corrente(int numAgencia, int numConta, double saldo, Cliente vinCliente) {
        super(numAgencia, numConta, saldo, vinCliente);
        this.chequeEspecial = 100;
    }
    public void saqueCheque (double value){
        saldo -= value;

    }

}
