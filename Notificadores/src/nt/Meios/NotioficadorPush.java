package nt.Meios;

import nt.Notificador.Notificador;

public class NotioficadorPush implements Notificador
{
    @Override
    public void enviar (String mensagem)
    {
        System.out.println("Push Notification: " + mensagem);
    }
}
