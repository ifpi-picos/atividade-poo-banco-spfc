public class Email implements Notificacao {

    @Override
    public void enviaNotificacao(String operacao, double valor){
            System.out.println("Notificação via E-mail");
            System.out.println(operacao + valor);
    }
    
}