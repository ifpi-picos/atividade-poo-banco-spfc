public class Sms implements Notificacao {

    @Override
    public void enviaNotificacao(String operacao, double valor){
            System.out.println("Notificação via SMS");
            System.out.println(operacao + valor);
    }
    
}