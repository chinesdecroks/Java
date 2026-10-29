package nt.Meios;

import nt.Notificador.Notificador;

public class NotificadorSMS implements Notificador
{

    public void enviar (String mensagem)
    {
        System.out.println("Notificação via SMS: " + mensagem);
    }
}
