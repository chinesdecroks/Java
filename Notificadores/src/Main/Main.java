package Main;
import nt.Meios.NotificadorEmail;
import nt.Meios.NotificadorSMS;
import nt.Meios.NotioficadorPush;
import nt.ServicoAlerta.ServicoAlerta;

public class Main
{
    public static void main(String[] args)
    {
        ServicoAlerta service1 = new ServicoAlerta(new NotificadorEmail());
        service1.alertaCritico("Falha no sistema de banco de dados");

        ServicoAlerta service2 = new ServicoAlerta(new NotificadorSMS());
        service2.alertaCritico("Davy Jones NÃO zerou todos os RE");

        ServicoAlerta service3 = new ServicoAlerta(new NotioficadorPush());
        service3.alertaCritico("O sistema quebrou porque alguem codou uma SaaS muito mal feita");
    }
}
