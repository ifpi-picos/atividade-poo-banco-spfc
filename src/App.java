import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente Lucas = new Cliente("Fulano Ciclano de Beltrano", "123.456.789-00", LocalDate.of(2012, 12, 12), "Av Pedro Marques de Medeiros, s/n - Parque Industrial, Picos - PI, 64605-500");
        System.out.println(Lucas);
        Conta corrente = new Conta(2.0);
        Conta poupança = new Conta(0.0);
        corrente.transferencia(2.0, poupança);
        System.out.println(corrente);
        System.out.println(poupança);
    }
}
