package nt.ServicoAlerta;

import nt.Notificador.*;
import nt.Meios.*;

public class ServicoAlerta
{
    Notificador notify;

    public ServicoAlerta(Notificador n)
    {
        this.notify = n;
    }

    public void alertaCritico(String mensagem)
    {
        System.out.println("**Alerta Crítico**");
        notify.enviar(mensagem);
    }
}
